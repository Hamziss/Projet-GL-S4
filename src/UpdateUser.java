/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Hamza
 */
public class UpdateUser {
    public static void setData (String Query,String msg){
    Connection con= null;
    Statement st = null;
    try {
        con = ConnectionDB.getConnection();
        st=con.createStatement();
        st.executeUpdate(Query);
        if(!msg.equals("")){
            JOptionPane.showMessageDialog(null, msg);
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    finally{
          try {
        
    }
    catch(Exception e){
        
    }
        
    }
    
    
    
    }
}
