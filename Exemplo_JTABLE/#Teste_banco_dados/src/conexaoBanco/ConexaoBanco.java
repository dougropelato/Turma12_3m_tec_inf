/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            return DriverManager.getConnection("jdbc:mysql://192.168.1.254/pessoas_douglas", "teste", "");
          // return DriverManager.getConnection("jdbc:mysql://localhost/bancojava", "root", "");
    }
}





// return DriverManager.getConnection("jdbc:mysql://192.168.1.254:3306/projeto1_douglas", "teste", "");