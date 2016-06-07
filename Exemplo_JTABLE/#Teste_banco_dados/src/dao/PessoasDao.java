package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import tabelas.Pessoas;
import conexaoBanco.ConexaoBanco;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Douglas
 */
public class PessoasDao {

    private final Connection conexao;

    public PessoasDao() throws SQLException, ClassNotFoundException {
        this.conexao = ConexaoBanco.getConexao();
    }

    public void adiciona(Pessoas p) {
        try {
            String sql = "INSERT INTO pessoas (nome_pessoa) VALUES(?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getNome_pessoa());
            stmt.execute();
            System.out.println("Pessoa adicionado ao banco!");
        } catch (SQLException e) {
            System.out.println("Erro - Método Adiciona: " + e);
        }
    }

    public List<Pessoas> getLista() throws SQLException {
        String sql = "SELECT * FROM pessoas";
        List<Pessoas> lista;
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        lista = new ArrayList<Pessoas>();
        while (rs.next()) {
            Pessoas p = new Pessoas();
            p.setCodigo_pessoa(rs.getInt("codigo_pessoa"));
            p.setNome_pessoa(rs.getString("nome_pessoa"));
            lista.add(p);
        }
        rs.close();
        return lista;
    }

    public void altera(Pessoas p) throws SQLException {
        String sql = "UPDATE pessoas set nome_pessoa=? WHERE codigo_pessoa=?";
        PreparedStatement stmt;
        stmt = conexao.prepareStatement(sql);
        stmt.setString(1, p.getNome_pessoa());
        stmt.setInt(2, p.getCodigo_pessoa());
        stmt.execute();
        stmt.close();
        System.out.println("Registro alterado no banco!!");
    }

    public void exclui(Pessoas p) throws SQLException {
        String sql = "DELETE FROM pessoas WHERE codigo_pessoa=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, p.getCodigo_pessoa());
        stmt.execute();
        stmt.close();
        System.out.println("Registro excluído no banco!");
    }
}