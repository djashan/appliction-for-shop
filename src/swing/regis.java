/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;


import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import keeptoo.Drag;

/**
 *
 * @author Ashan Pro
 */
public class regis extends javax.swing.JFrame {

    
    
     Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public regis() {
        initComponents();
         con = DBconnect.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        uemailbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        kButton2 = new keeptoo.KButton();
        btnclz = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passbox = new javax.swing.JTextField();
        uphonebox = new javax.swing.JTextField();
        genbox = new javax.swing.JComboBox<>();
        unamebox1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 0, 102));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uemailbox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uemailbox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        uemailbox.setCaretColor(new java.awt.Color(0, 102, 204));
        uemailbox.setOpaque(false);
        kGradientPanel1.add(uemailbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 350, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Email");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ALREADY HAVE AN ACCOUNT?");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 260, 40));

        kButton1.setText("Login");
        kButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kButton1.setkBorderRadius(40);
        kButton1.setkEndColor(new java.awt.Color(0, 102, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 153, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(153, 153, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(51, 0, 102));
        kButton1.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        kButton2.setText("Submit");
        kButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(102, 204, 255));
        kButton2.setkFillButton(false);
        kButton2.setkHoverEndColor(new java.awt.Color(0, 153, 204));
        kButton2.setkHoverForeGround(new java.awt.Color(153, 153, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(51, 204, 255));
        kButton2.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        btnclz.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        btnclz.setForeground(new java.awt.Color(204, 204, 204));
        btnclz.setText("x");
        btnclz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclzMouseClicked(evt);
            }
        });
        kGradientPanel1.add(btnclz, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 30, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Gender");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("User Name");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Password");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Phone Number");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 20));

        passbox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        passbox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passbox.setCaretColor(new java.awt.Color(0, 102, 204));
        passbox.setOpaque(false);
        kGradientPanel1.add(passbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 350, 40));

        uphonebox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        uphonebox.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        uphonebox.setCaretColor(new java.awt.Color(0, 102, 204));
        uphonebox.setOpaque(false);
        kGradientPanel1.add(uphonebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 350, 40));

        genbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        kGradientPanel1.add(genbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        unamebox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        unamebox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        unamebox1.setCaretColor(new java.awt.Color(0, 102, 204));
        unamebox1.setOpaque(false);
        kGradientPanel1.add(unamebox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 350, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 498));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
         new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void btnclzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclzMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnclzMouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        login l1 = new login();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        String name = unamebox1.getText();
        String pass = passbox.getText();
        String phone = uphonebox.getText();
        String email = uemailbox.getText();
        String gend = genbox.getSelectedItem().toString();
        try {
             String q = "INSERT INTO regis (uname,pass,phone,email,gen) values('"+ name +"','"+ pass +"','"+ phone +"','"+ email +"','"+ gend +"')";
             pst = con.prepareStatement(q);
             pst.execute();//exicute krnwa database ekaata
        } catch (Exception e) {
        }
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnclz;
    private javax.swing.JComboBox<String> genbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField passbox;
    private javax.swing.JTextField uemailbox;
    private javax.swing.JTextField unamebox1;
    private javax.swing.JTextField uphonebox;
    // End of variables declaration//GEN-END:variables
}
