
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hamza
 */
public class Archives extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    public Archives() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 153, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Désignation", "ventes", "Chiffre d'affaire", "Bénéfice", "Dépences"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1230, 460));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 120, 114, 40));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "en %", "en chiffre", " ", " " }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 120, 110, 40));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 50));

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.jpg"))); // NOI18N
        jButton2.setText("RETURN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/archive.png"))); // NOI18N
        jLabel1.setText(" Archivages");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       String Year = (String) jComboBox1.getSelectedItem();
        String methode = (String) jComboBox2.getSelectedItem();
        jLabel6.setText(Year);
       
        ResultSet rs2 = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP "); 
       
        float chiffreAffaire = 0;
        float benefice = 0;
        float depences,depencesTotal,beneficeTotal;
        float VenteTotal = 0;
        
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (methode.equals("en chiffre")) {
                    try{
                        ResultSet rs3 = Select.getData("select DesP,Prix,Cout from infoproduits where stockP>0; ");  
                        while(rs2.next()){
                            String Desp = rs2.getString(1);
                           
                            if(rs3.next()){
                               
                                int Vente = rs2.getInt(2);                                
                                int Cout = rs3.getInt(3);

                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                

                             model.addRow(new Object[]{rs2.getString(1),Vente,rs2.getString(3),benefice,depences});                    
                            }

                        }
                        rs2.close();
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        else if (methode.equals("en %")) {
              try{  float chiffreAffaireTotal=0;
                  ResultSet rs3 = Select.getData("select DesP,Prix,Cout,sum(Cout) from infoproduits where stockP>0;");
                  ResultSet rs4 = Select.getData("select sum(Cout) from entreprise.infoproduits where stockP>0;");
                  ResultSet rs5 = Select.getData("select sum(nbVente) from entreprise.plan");
                  ResultSet rs6 = Select.getData("select sum(Somme) from entreprise.commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP");
                    while(rs2.next() ){
                            String Desp = rs2.getString(1);
                            ResultSet rs = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP ");
                            if(rs3.next() && rs4.next() && rs5.next() && rs6.next()){
                                
                                VenteTotal = rs5.getInt(1);
                                
                                
                                                        
                                int Vente = rs2.getInt(2);
                                float Prix = rs3.getFloat(2);
                                int Cout = rs3.getInt(3);
                                
                                int Couttotal = rs4.getInt(1);
                                
                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                beneficeTotal = rs6.getFloat(1) -  Couttotal;
                                depencesTotal = rs6.getFloat(1) - beneficeTotal;
                                
                          
                                float beneficepourcent = (benefice * 100 ) /beneficeTotal;
                                float depencespourcent = (depences * 100) / depencesTotal;
                                if (depencespourcent <=0 || beneficepourcent <= 0){                                    
                                    depencespourcent=0;
                                    beneficepourcent=0;
                                }
                                float ventepourcent = (Vente * 100)/VenteTotal;

                             model.addRow(new Object[]{rs2.getString(1),ventepourcent,rs2.getString(3),beneficepourcent,depencespourcent});
                             rs3.previous();
                                rs4.previous();
                                rs5.previous();
                                rs6.previous();
                            }

                        }
                        rs2.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        
    }//GEN-LAST:event_formComponentShown

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:        
       String Year = (String) jComboBox1.getSelectedItem();
        String methode = (String) jComboBox2.getSelectedItem();
        jLabel6.setText(Year);
       
        ResultSet rs2 = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP "); 
       
        float chiffreAffaire = 0;
        float benefice = 0;
        float depences,depencesTotal,beneficeTotal;
        float VenteTotal = 0;
        
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (methode.equals("en chiffre")) {
                    try{
                        ResultSet rs3 = Select.getData("select DesP,Prix,Cout from infoproduits where stockP>0; ");  
                        while(rs2.next()){
                            String Desp = rs2.getString(1);
                           
                            if(rs3.next()){
                               
                                int Vente = rs2.getInt(2);                                
                                int Cout = rs3.getInt(3);

                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                

                             model.addRow(new Object[]{rs2.getString(1),Vente,rs2.getString(3),benefice,depences});                    
                            }

                        }
                        rs2.close();
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        else if (methode.equals("en %")) {
              try{  float chiffreAffaireTotal=0;
                  ResultSet rs3 = Select.getData("select DesP,Prix,Cout,sum(Cout) from infoproduits where stockP>0;");
                  ResultSet rs4 = Select.getData("select sum(Cout) from entreprise.infoproduits where stockP>0;");
                  ResultSet rs5 = Select.getData("select sum(nbVente) from entreprise.plan");
                  ResultSet rs6 = Select.getData("select sum(Somme) from entreprise.commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP");
                    while(rs2.next() ){
                            String Desp = rs2.getString(1);
                            ResultSet rs = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP ");
                            if(rs3.next() && rs4.next() && rs5.next() && rs6.next()){
                                
                                VenteTotal = rs5.getInt(1);
                                
                               
                                                        
                                int Vente = rs2.getInt(2);
                                float Prix = rs3.getFloat(2);
                                int Cout = rs3.getInt(3);
                                
                                int Couttotal = rs4.getInt(1);
                                
                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                beneficeTotal = rs6.getFloat(1) -  Couttotal;
                                depencesTotal = rs6.getFloat(1) - beneficeTotal;
                                
                              
                                
                                float beneficepourcent = (benefice * 100 ) /beneficeTotal;
                                float depencespourcent = (depences * 100) / depencesTotal;
                                if (depencespourcent <=0 || beneficepourcent <= 0){                                    
                                    depencespourcent=0;
                                    beneficepourcent=0;
                                }
                                float ventepourcent = (Vente * 100)/VenteTotal;

                             model.addRow(new Object[]{rs2.getString(1),ventepourcent,rs2.getString(3),beneficepourcent,depencespourcent});
                             rs3.previous();
                                rs4.previous();
                                rs5.previous();
                                rs6.previous();
                            }

                        }
                        rs2.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        String Year = (String) jComboBox1.getSelectedItem();
        String methode = (String) jComboBox2.getSelectedItem();
        jLabel6.setText(Year);
       
        ResultSet rs2 = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP "); 
       
        float chiffreAffaire = 0;
        float benefice = 0;
        float depences,depencesTotal,beneficeTotal;
        float VenteTotal = 0;
        
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        if (methode.equals("en chiffre")) {
                    try{
                        ResultSet rs3 = Select.getData("select DesP,Prix,Cout from infoproduits where stockP>0; ");  
                        while(rs2.next()){
                            String Desp = rs2.getString(1);
                           
                            if(rs3.next()){
                               
                                int Vente = rs2.getInt(2);                                
                                int Cout = rs3.getInt(3);

                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                

                             model.addRow(new Object[]{rs2.getString(1),Vente,rs2.getString(3),benefice,depences});                    
                            }

                        }
                        rs2.close();
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        else if (methode.equals("en %")) {
              try{  float chiffreAffaireTotal=0;
                  ResultSet rs3 = Select.getData("select DesP,Prix,Cout,sum(Cout) from infoproduits where stockP>0;");
                  ResultSet rs4 = Select.getData("select sum(Cout) from entreprise.infoproduits where stockP>0;");
                  ResultSet rs5 = Select.getData("select sum(nbVente) from entreprise.plan");
                  ResultSet rs6 = Select.getData("select sum(Somme) from entreprise.commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP");
                    while(rs2.next() ){
                            String Desp = rs2.getString(1);
                            ResultSet rs = Select.getData("select DesP,sum(Qte),sum(Somme) from commande where facturation='vrai' and YEAR(DateC) = "+Year+" group by DesP ");
                            if(rs3.next() && rs4.next() && rs5.next() && rs6.next()){
                                
                                VenteTotal = rs5.getInt(1);
                                
                                
                                                        
                                int Vente = rs2.getInt(2);
                                float Prix = rs3.getFloat(2);
                                int Cout = rs3.getInt(3);
                                
                                int Couttotal = rs4.getInt(1);
                                
                                chiffreAffaire = rs2.getFloat(3);                     
                                benefice = chiffreAffaire - (Cout * Vente);
                                depences = chiffreAffaire - benefice;
                                beneficeTotal = rs6.getFloat(1) -  Couttotal;
                                depencesTotal = rs6.getFloat(1) - beneficeTotal;
                                
                                
                                
                                float beneficepourcent = (benefice * 100 ) /beneficeTotal;
                                float depencespourcent = (depences * 100) / depencesTotal;
                                if (depencespourcent <=0 || beneficepourcent <= 0){                                    
                                    depencespourcent=0;
                                    beneficepourcent=0;
                                }
                                float ventepourcent = (Vente * 100)/VenteTotal;

                             model.addRow(new Object[]{rs2.getString(1),ventepourcent,rs2.getString(3),beneficepourcent,depencespourcent});
                             rs3.previous();
                                rs4.previous();
                                rs5.previous();
                                rs6.previous();
                            }

                        }
                        rs2.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }       
        }
        
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Directeur directeur = new Directeur();
        directeur.setVisible(true);
        directeur.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistiques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archives().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
