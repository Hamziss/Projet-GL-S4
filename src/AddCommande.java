
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class AddCommande extends javax.swing.JFrame {

    /**
     * Creates new form AddCommande
     */
    public AddCommande() {
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

        jButton1 = new javax.swing.JButton();
        txtDesP = new javax.swing.JComboBox<>();
        txtQte = new javax.swing.JSpinner();
        txtFacMail = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        setPreferredSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Commander");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 270, 60));

        txtDesP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lait Cru", "Lait Pasteurisé", "Lait Stérilisé", "Lait UHT", "Lait Concentrée", "Fromage", "Yaourt", "Créme fraiche", "beurre", " " }));
        getContentPane().add(txtDesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 190, 40));
        getContentPane().add(txtQte, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 70, 40));

        txtFacMail.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtFacMail.setText("Recevoir votre facture par email");
        txtFacMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacMailActionPerformed(evt);
            }
        });
        getContentPane().add(txtFacMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 290, 40));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setText("Passer votre Commande");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 330, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int numC;float somme;float Prix;
        String email = Login.getemail();
        String DesP  = (String) txtDesP.getSelectedItem();
        int Qte = (Integer) txtQte.getValue();
        boolean FacMailBox = txtFacMail.isSelected();
        String FacMail;
        if(FacMailBox){
            FacMail = "vrai";
             } else {
              FacMail="faux";
              }
        
        
        try {
             ResultSet rs = Select.getData("select * from personne where email like '%"+email+"%'");
            ResultSet rs3 = Select.getData("select * from infoproduits where desP='"+DesP+"'");
            if(rs.next() && rs3.next()){ 
                  System.out.print("works");
            numC = rs.getInt(1);
            Prix = rs3.getInt(2);
            String societe = rs.getString(4);
               if(societe==null || societe.equals("")){                         
                   somme = Prix * Qte;
               }else {
                                     
                   somme = ( Prix * 81 /100 ) * Qte ; 
               }
               
            
            String Query;
            Query="insert into commande (NumC,DesP,Facturation,Validation,Qte,FacMail,Somme) values('"+numC+"','"+DesP+"','faux','faux','"+Qte+"','"+FacMail+"','"+somme+"')";
            UpdateUser.setData(Query, "La Commande a été bien ajouter");
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCommande.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       //-----------------------------------------------------------------------------------
         // calcul somme
         
         
     
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFacMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacMailActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        Client client = new Client();
        client.setVisible(true);
        client.setLocationRelativeTo(null);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCommande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCommande().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> txtDesP;
    private javax.swing.JCheckBox txtFacMail;
    private javax.swing.JSpinner txtQte;
    // End of variables declaration//GEN-END:variables
}