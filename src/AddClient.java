
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hamza
 */
public class AddClient extends javax.swing.JFrame {

    /**
     * Creates new form AddClient
     */
    public AddClient() {
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

        jLabel1 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtSoc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ajouter Un Client");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        txtAdresse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresseActionPerformed(evt);
            }
        });
        getContentPane().add(txtAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 220, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 220, 30));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 316, 220, 30));

        txtPrenom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 220, 30));

        txtNom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 220, 30));

        txtSoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSocActionPerformed(evt);
            }
        });
        getContentPane().add(txtSoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 220, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel8.setText("Societé");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 80, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel3.setText("Nom");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 118, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel5.setText("Prénom");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 117, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 117, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel9.setText("Adresse");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 105, -1));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Creer un Client");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 220, 66));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.jpg"))); // NOI18N
        jButton1.setText("RETURN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresseActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSocActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String nom = txtNom.getText();
        String prenom = txtPrenom.getText();
        String societe = txtSoc.getText();
        String adresse = txtAdresse.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        
        if(nom.equals("")  || email.equals("") || password.equals("") ){
            JOptionPane.showMessageDialog(null, "Some important fields are empty");
        }
        else{
            String Query;
            Query="insert into personne(nom,prenom,societe,email,password,adresse,role) values('"+nom+"','"+prenom+"','"+societe+"','"+email+"','"+password+"','"+adresse+"','Client')";
            UpdateUser.setData(Query, "Le client a bien été ajouter");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        ClientTable clientTable = new ClientTable();
        clientTable.setVisible(true);
        clientTable.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtSoc;
    // End of variables declaration//GEN-END:variables
}