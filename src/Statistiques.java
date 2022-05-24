
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
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
public class Statistiques extends javax.swing.JFrame {

    /**
     * Creates new form Statistiques
     */
    public Statistiques() {
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 850, 440));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "en %", "en chiffre", " ", " " }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, 110, 40));

        jTextField1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 120, 40));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vente Total:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 100, 40));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 120, 40));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 120, 40));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 120, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("benefice Total :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 130, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C.A de l'année (DA) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setText("Statistiques de L'année ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, 80));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 130, 60));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("depences Total :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 320, 360));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       LocalDateTime myDateObj = LocalDateTime.now();    
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");     
        String formattedDate = myDateObj.format(myFormatObj); 
        
        
       String Year = formattedDate;
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
                                
                                jTextField1.setText(String.valueOf(rs6.getFloat(1)));   
                                jTextField2.setText(String.valueOf(VenteTotal));
                                jTextField3.setText(String.valueOf( Couttotal));
                                jTextField4.setText(String.valueOf( beneficeTotal));
                                
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

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
          LocalDateTime myDateObj = LocalDateTime.now();    
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");     
        String formattedDate = myDateObj.format(myFormatObj); 
        
        
       String Year = formattedDate;
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

                        jTextField1.setText(String.valueOf(rs6.getFloat(1)));
                        jTextField2.setText(String.valueOf(VenteTotal));
                        jTextField3.setText(String.valueOf( Couttotal));
                        jTextField4.setText(String.valueOf( beneficeTotal));

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
                if ("Nimbus".equals(info.getName())) {
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
                new Statistiques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
