/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelas;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.sql.Connection;
import conexaoBanco.ConexaoBanco;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author Sir
 */
public class Diagnostico extends javax.swing.JFrame {

    private JCheckBox jav, php, csharp, c;
    private String pesq;
    private JCheckBox check;
    private JCheckBox[] doenca;
    private JTextArea diagnostico;
    private JPanel painel, painel2;
    private JScrollPane JPScroll;
    private JTable Tabela;
    private String texto = "", aux = "";
    int indice = 0, indiceDeletado = 0, maximoIndiceDeletado = 0, CheckBoxNumber, qtdSelec = 0, PanelX, PanelY;
    //private JLabel jLabel1;
    String[] jCheckboxArray;
    int[] selecionados;
    public String VarPesq = "", inicializousql = "nao";
    public int coordY = 10, coordX = 10;
    public static int tamanhoX = 800, tamanhoY = 700;

    /**
     * Creates new form asd
     */
    public Diagnostico() {
        initComponents();
        this.setLocationRelativeTo(this);

    }
    private Connection Conexao;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 934));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 640, 220));

        jTArea.setColumns(20);
        jTArea.setRows(5);
        jPanel1.add(jTArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 640, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public void JCheck() {

    }

    public void Gerador() {
        int qtd = 1;
        ConexaoBanco nova = new ConexaoBanco();
        indiceDeletado = 0;
        maximoIndiceDeletado = 0;
        PanelX = 2400;
        PanelY = 2400;
        coordY = 10;
        coordX = 10;
        //painel2 = new JPanel();
        painel2 = new javax.swing.JPanel();
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painel2.setSize(666, 2400);
        //<editor-fold> comandos sql
        try {
            String usuario = "teste";
            String senha = "";
            String url = "jdbc:mysql://192.168.1.254/saude_publica";
            Connection con = DriverManager.getConnection(url, usuario, senha);
            //prepara o comando sql
            String sql = "SELECT cod_sintoma FROM sintomas";
            //prepara para executar o comando sql
            PreparedStatement comando = nova.getConexao().prepareStatement(sql);
            //armazena o resultado da consulta
            ResultSet resultado = comando.executeQuery();
            //enquanto existirem dados executa o while

            while (resultado.next()) {
                indice = Integer.parseInt(resultado.getString("cod_sintoma"));
                if (indice != (indiceDeletado + 1)) {
                    maximoIndiceDeletado++;
                } else {
                    CheckBoxNumber = indice;
                }
                indiceDeletado = indice;
                //aqui vc tem que tentar gerar o checkbox
            }
            Conexao.close();
            comando.isClosed();
            resultado.close();
            con.close();
        } catch (Exception e) {
        }

        //================apartir daqui o codigo gera o combobox ============
        CheckBoxNumber = CheckBoxNumber - maximoIndiceDeletado;
        jCheckboxArray = new String[CheckBoxNumber];

        try {
            String sql = "SELECT nome_sintoma FROM sintomas";
            //prepara para executar o comando sql
            PreparedStatement comando = nova.getConexao().prepareStatement(sql);
            //armazena o resultado da consulta
            ResultSet resultado = comando.executeQuery();
            //enquanto existirem dados executa o while

            while (resultado.next()) {

                jCheckboxArray[qtd] = (resultado.getString("nome_sintoma"));
                System.out.println("codigo: " + qtd + " doença: " + jCheckboxArray[qtd]);
                qtd++;

                //aqui vc tem que tentar gerar o checkbox
            }

        } catch (Exception e) {
        }
        //</editor-fold>
        qtd = 1;
        doenca = new JCheckBox[CheckBoxNumber];
        Diagnostico.CheckBoxHandler trator = new Diagnostico.CheckBoxHandler();
        //=====================================

        //=====================================
        for (int x = 1; x < CheckBoxNumber; x++) {
            doenca[x] = new JCheckBox(jCheckboxArray[x]);
            doenca[x].addItemListener(trator);
            //jPanel1.add(doenca[x], new org.netbeans.lib.awtextra.AbsoluteConstraints(coordY, coordX, -1, -1));
            painel2.add(doenca[x], new org.netbeans.lib.awtextra.AbsoluteConstraints(coordX, coordY));
            coordX = coordX + 300;
            if (coordX >= 300) {
                coordX = 10;
                coordY = coordY + 20;
            }
        }
        add(painel2);
        //=================

        jScrollPane1.add(painel2);
        jScrollPane1.enable();
        jScrollPane1.setViewportView(painel2);
        setVisible(true);
        selecionados = new int[CheckBoxNumber];
    }

    private class CheckBoxHandler implements ItemListener {

        //essa classe verifica se for selecionado o check box
        @Override
        public void itemStateChanged(ItemEvent evento) {
            //<editor-fold> sql
            jTArea.setText("");

            for (int x = 1; x < CheckBoxNumber; x++) { // roda para poder checar
                if (doenca[x].isSelected()) {// se selecionado faz
                    preence(x);
                }
            }

        }

    }

    public void preence(int x) {
        ConexaoBanco nova = new ConexaoBanco();
        try {
            String usuario = "teste";
            String senha = "";
            String url = "jdbc:mysql://192.168.1.254/saude_publica";
            Connection con = DriverManager.getConnection(url, usuario, senha);
            //prepara o comando sql
            String sql = "SELECT cod_doenca, nome_doenca FROM doencas";
            //prepara para executar o comando sql
            PreparedStatement comando = nova.getConexao().prepareStatement(sql);
            //armazena o resultado da consulta
            ResultSet doencas = comando.executeQuery();

            while (doencas.next()) {
                indice = Integer.parseInt(doencas.getString("cod_doenca"));
                if (x == indice) {
                    System.out.println(doencas.getString("nome_doenca"));
                    texto = doencas.getString("nome_doenca") + ", " + texto;
                    jTArea.setText(texto);
                }
            }
            Conexao.close();
            comando.isClosed();
            doencas.close();
            con.close();

        } catch (Exception e) {

        }
    }

    static Diagnostico novo = new Diagnostico();

    public static void Diagnostico(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diagnostico.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                novo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                novo.setSize(tamanhoX, tamanhoY);
                novo.Gerador();
                novo.setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTArea;
    // End of variables declaration                   
}
