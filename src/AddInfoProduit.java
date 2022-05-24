
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Hamza
 */
public class AddInfoProduit extends javax.swing.JFrame {

    /**
     * Creates new form AddInfoProduit
     */
    public AddInfoProduit() {
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

        txtDesP = new javax.swing.JTextField();
        txtIng1 = new javax.swing.JTextField();
        txtPoidsP = new javax.swing.JTextField();
        txtValN = new javax.swing.JTextField();
        txtCout = new javax.swing.JTextField();
        txtIng3 = new javax.swing.JTextField();
        txtIng2 = new javax.swing.JTextField();
        txtIng4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDesP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesPActionPerformed(evt);
            }
        });
        getContentPane().add(txtDesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 260, 39));
        getContentPane().add(txtIng1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 120, 40));

        txtPoidsP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoidsPActionPerformed(evt);
            }
        });
        getContentPane().add(txtPoidsP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 260, 39));

        txtValN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValNActionPerformed(evt);
            }
        });
        getContentPane().add(txtValN, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 260, 39));

        txtCout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoutActionPerformed(evt);
            }
        });
        getContentPane().add(txtCout, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 260, 39));
        getContentPane().add(txtIng3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 120, 40));
        getContentPane().add(txtIng2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 130, 40));
        getContentPane().add(txtIng4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 130, 40));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingredients :");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cout :");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valeur Nutritive (Kcal) :");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Poids Produit (gramme) :");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Désignation :");

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setText("Créer Nouveau Produit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 820, 490));

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

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setText("AJOUT AU CATALOGUE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDesPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesPActionPerformed

    private void txtPoidsPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoidsPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoidsPActionPerformed

    private void txtValNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValNActionPerformed

    private void txtCoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:          
        String DesP  =  txtDesP.getText();
        String Poids = txtPoidsP.getText();
        String valN = txtValN.getText();
        int Cout = Integer.parseInt( txtCout.getText());
        String Ing1  = txtIng1.getText();
        String Ing2  = txtIng2.getText();
        String Ing3  = txtIng3.getText();
        String Ing4  = txtIng4.getText();
        
        if(DesP.equals("") ){
            JOptionPane.showMessageDialog(null, "Some fields are empty");
        }
        else{
            
             
            String Query1;
            Query1="insert into ingredients(ing1,ing2,ing3,ing4) values('"+Ing1+"','"+Ing2+"','"+Ing3+"','"+Ing4+"')";
            UpdateUser.setData(Query1, "");    
           
            String Query;
            Query="insert into infoproduits(Desp,poidsP,valNutP,Cout) values('"+DesP+"','"+Poids+"','"+valN+"','"+Cout+"')";
            UpdateUser.setData(Query, "Le Produit a bien été ajouter au catalogue");
           
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        InfoProduit majproduit = new InfoProduit();
        majproduit.setVisible(true);
        majproduit.setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(AddInfoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddInfoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddInfoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddInfoProduit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddInfoProduit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCout;
    private javax.swing.JTextField txtDesP;
    private javax.swing.JTextField txtIng1;
    private javax.swing.JTextField txtIng2;
    private javax.swing.JTextField txtIng3;
    private javax.swing.JTextField txtIng4;
    private javax.swing.JTextField txtPoidsP;
    private javax.swing.JTextField txtValN;
    // End of variables declaration//GEN-END:variables
}
