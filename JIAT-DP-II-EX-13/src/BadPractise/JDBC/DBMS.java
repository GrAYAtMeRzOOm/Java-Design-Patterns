        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadPractise.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author grays
 */
public class DBMS {
        public static Connection c;
    

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/carstore", "root", "0789052002");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void iud(String s) {
        try {
            Statement statement = c.createStatement();
            statement.execute(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet search(String s) throws Exception {
        Statement statement = c.createStatement();
        ResultSet rs = statement.executeQuery(s);
        return rs;
    }
}
