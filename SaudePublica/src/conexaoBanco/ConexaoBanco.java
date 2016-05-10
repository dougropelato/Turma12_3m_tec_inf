package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Douglas
 */
public class ConexaoBanco {

    public  static Connection getConexao() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://192.168.1.254/saudepublica", "teste", "");
    }
}