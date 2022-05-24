

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class ConnectionDB {
    public static Connection getConnection()
    {
        Connection c = null;
        try {
            String user = "root";
            String password = "gta5online";
            String url="jdbc:mysql://localhost:3306/entreprise";
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(url, user, password);
            if(c==null){
                 System.out.print("fail");
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, ex);
        } 
      return c;
       
    }
}
