package dao;

import conexaoBanco.ConexaoBanco;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tabelas.sintomas;

/**
 *
 * @author Douglas
 */
public class GenericDao {

    private Connection conexao;

    public GenericDao() throws SQLException, ClassNotFoundException {
        this.conexao = ConexaoBanco.getConexao();
    }

    public void adicionar(Object obj) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException, SQLException {
        String campos = "";
        String dados = "";
        String classe = obj.getClass().getName();
        Class cls = Class.forName(classe);
        Field listaAtributos[] = cls.getDeclaredFields();
        String valorIncluir = "";
        String tipoDado;
        for (int i = 1; i < listaAtributos.length; i++) {
            Field fld = listaAtributos[i];
            fld.setAccessible(true);
            campos = campos + fld.getName() + ", ";
            dados = dados + "'" + fld.get(obj) + "'" + ",";
        }
        campos = campos.substring(0, campos.length() - 2);
        String tabela = cls.getSimpleName();
        dados = dados.substring(0, dados.length() - 1);
        String sql = "INSERT INTO " + tabela
                + " (" + campos + ") VALUES ("
                + dados + ")";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.execute();
        }
        System.out.println("Registro ADICIONADO ao banco!");
        if (classe == "tabelas.Humanos") {
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso !");
        }
    }

    public List<Object> listar(Class c)
            // public void listar(Class c)
            throws SQLException, IllegalAccessException, NoSuchMethodException,
            IllegalArgumentException, InvocationTargetException,
            InstantiationException, ClassNotFoundException {

        List<Object> list = new ArrayList<Object>();
        String tabela = c.getSimpleName(); //Retorna o nome da classe
        String sql = "SELECT * FROM " + tabela;

        PreparedStatement stmt
                = this.conexao.prepareStatement(sql);
        ResultSet rset = stmt.executeQuery();

        while (rset.next()) {
            Object obj = c.newInstance();
            for (Method m : c.getMethods()) {
                // System.out.println("if 0: "+m);
                if (m.getName().substring(0, 3).equals("set")) {
                    Class[] args1 = new Class[1];
                    Class pvec[] = m.getParameterTypes();
                    String s = m.getName().substring(3, m.getName().length());
                    //    System.out.println("if 1: "+m.getName());
                    if (pvec[0].getName().equals("java.lang.String")) {
                        args1[0] = String.class;
                        obj.getClass().getMethod(m.getName(),
                                args1).invoke(obj, rset.getString(s));
                    }

                    if (pvec[0].getName().equals("int")) {
                        args1[0] = int.class;
                        obj.getClass().getMethod(m.getName(),
                                args1).invoke(obj, rset.getInt(s));
                    }
                    if (pvec[0].getName().equals("double")) {
                        args1[0] = double.class;
                        obj.getClass().getMethod(m.getName(),
                                args1).invoke(obj, rset.getDouble(s));
                    }
                }
            }
            list.add(obj);
        }

        rset.close();
        stmt.close();

        return list;

    }

    public void alterar(Object obj) throws ClassNotFoundException,
            SQLException, IllegalArgumentException,
            IllegalAccessException {

        String classe = obj.getClass().getName();
        Class cls = Class.forName(classe);
        String pK = "";
        String campos = "";
        String lugar = "";
        String tabela = cls.getSimpleName();
        String baseDados = conexao.getCatalog();

        Field listaAtributos[] = cls.getDeclaredFields();

        String sql3 = "SELECT information_schema.KEY_COLUMN_USAGE.COLUMN_NAME as \"chave\" \n"
                + "FROM information_schema.KEY_COLUMN_USAGE \n"
                + "WHERE information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME LIKE \"PRIMARY\" \n"
                + "AND information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA LIKE \"" + baseDados + "\""
                + " AND information_schema.KEY_COLUMN_USAGE.TABLE_NAME LIKE \"" + tabela + "\"";
        // System.out.println("sql3: " + sql3);

        for (int i = 0; i < listaAtributos.length; i++) {
            Field fld = listaAtributos[i];
            fld.setAccessible(true);
            campos += fld.getName() + " = '" + fld.get(obj) + "'";
            if (i != (listaAtributos.length - 1)) {
                campos += ", ";
            }
            PreparedStatement stmt = conexao.prepareCall(sql3);
            ResultSet RS = stmt.executeQuery();

            while (RS.next()) {
                // Object nextElement = en.nextElement();
                pK = RS.getString("chave");
            }
            if (fld.getType().toString().equals("int")) {
                if (fld.getName().equalsIgnoreCase(pK)) {
                    lugar = fld.getName() + " = '" + fld.get(obj) + "'";
                }
            }
        }
        String sql = "UPDATE " + tabela + " SET " + campos + " WHERE " + lugar + "";
          PreparedStatement stmt = conexao.prepareCall(sql);
        //System.out.println(sql);
         stmt.execute();
          stmt.close();
          System.out.println("Registro Alterado!!!");
    if (classe == "tabelas.Humanos") {
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso !");
        }
    }

    public void excluir(Object obj) throws ClassNotFoundException,
            NoSuchFieldException, SQLException {

        String campoTeste = null;
        String campo = null;
        int valorExcluir = 0;
        String classe = obj.getClass().getName();//Nome da classe
        Class cls = Class.forName(classe); //Nome da classe (tabela)
        Field listaAtributos[] = cls.getDeclaredFields(); //array de campos

        for (int i = 0; i < listaAtributos.length; i++) {
            Field fld = listaAtributos[i];
            fld.setAccessible(true);

            try {
                System.out.println("Valor...........: " + fld.get(obj));
                campoTeste = fld.get(obj).toString();
                if (!campoTeste.equals("0")) {
                    System.out.println("OK");
                    campo = fld.getName();
                    valorExcluir = (int) fld.get(obj);
                    break;
                }
            } catch (IllegalAccessException ex) {
                System.out.println("erro: " + ex);
            } catch (NullPointerException ex) {
                campoTeste = null;
            }
        }

        String tabela = cls.getSimpleName();
        String sql = "DELETE FROM " + tabela + " WHERE " + campo + " =?";
        System.out.println("SQL: " + sql);

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, valorExcluir);
        stmt.execute();
        stmt.close();
        System.out.println("Registro EXCLUÍDO no banco!");
    }

    public void criaTabela() {
        ArrayList nomesColunas = new ArrayList();
        ArrayList dados = new ArrayList();

        nomesColunas.add("Código");
        nomesColunas.add("Nome");
        nomesColunas.add("Cidade");

        dados.add(1);
        dados.add("Graziela Teçari");
        dados.add(1);

        dados.add(2);
        dados.add("Douglas Ropelato");
        dados.add(2);

        //  Create table with database data    
        /* JTable table;
        table = new JTable(dados, nomesColunas) {
        @Override
        public Class getColumnClass(int column) {
        for (int row = 0; row < getRowCount(); row++) {
        Object o = getValueAt(row, column);
        
        if (o != null) {
        return o.getClass();
        }
        }
        
        return Object.class;
        }
        };
        
        JScrollPane scrollPane = new JScrollPane(table);
        //getContentPane().add(scrollPane);
        
        JPanel buttonPanel = new JPanel();
        //getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        }*/
    }

    public List<sintomas> getLista() throws SQLException {
        String sql = "SELECT * FROM sintomas";
        List<sintomas> lista;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        lista = new ArrayList<sintomas>();
        while (rs.next()) {
            sintomas p = new sintomas();
            p.setCod_sintoma(rs.getInt("cod_sintoma"));
            p.setNome_sintoma(rs.getString("nome_sintoma"));
            lista.add(p);
        }
        rs.close();
        return lista;
    }
}
