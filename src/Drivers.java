/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*; 
import java.text.*;
/**
 *
 * @author Hamza
 */
public class Drivers {
    public static void imprimerJtable (JTable jt,String titre){
        MessageFormat entete = new MessageFormat(titre);
        MessageFormat pied = new MessageFormat("Page{0,number,integer}");
    
    try {
        jt.print(JTable.PrintMode.FIT_WIDTH, entete,pied);
    }
    catch (Exception e) {
        JOptionPane.showMessageDialog(null, "erreur impression");
    }
    
    
    
    }
}
