/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import static java.awt.SystemColor.info;
import javax.swing.JPanel;

/**
 *
 * @author Ashan Pro
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        sidepnel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cusbtn = new javax.swing.JButton();
        supbtn = new javax.swing.JButton();
        empbtn = new javax.swing.JButton();
        trncebtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        trncebtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepnel.setBackground(new java.awt.Color(23, 35, 51));
        sidepnel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_home_48px_1.png"))); // NOI18N
        sidepnel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_gender_neutral_user_48px.png"))); // NOI18N
        sidepnel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 52, 40));

        jButton3.setText("Payroll");
        sidepnel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 417, 90, -1));

        jButton4.setText("Home");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        sidepnel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, 20));

        cusbtn.setText("Customer");
        cusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusbtnActionPerformed(evt);
            }
        });
        sidepnel.add(cusbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 90, 20));

        supbtn.setText("Supplier");
        supbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supbtnActionPerformed(evt);
            }
        });
        sidepnel.add(supbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 20));

        empbtn.setText("Employee");
        empbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empbtnActionPerformed(evt);
            }
        });
        sidepnel.add(empbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, 20));

        trncebtn.setText("Tranceport");
        trncebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trncebtnActionPerformed(evt);
            }
        });
        sidepnel.add(trncebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 90, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_user_48px.png"))); // NOI18N
        sidepnel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 52, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_administrator_male_48px.png"))); // NOI18N
        sidepnel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 52, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_car_48px.png"))); // NOI18N
        sidepnel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_money_64px.png"))); // NOI18N
        sidepnel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 40, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_small_business_48px_1.png"))); // NOI18N
        sidepnel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 60, 40));

        trncebtn1.setText("Stock");
        trncebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trncebtn1ActionPerformed(evt);
            }
        });
        sidepnel.add(trncebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 90, 20));

        getContentPane().add(sidepnel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 140, 690));

        jPanel2.setBackground(new java.awt.Color(71, 120, 190));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/icons8_close_window_30px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(888, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 930, 50));

        jPanel5.setBackground(new java.awt.Color(0, 153, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, 80, 640));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/con1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 840, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusbtnActionPerformed
        // TODO add your handling code here:
        //page eka lord krnna cunstrutor ekk hdghda
        cus c1 = new cus();
        c1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cusbtnActionPerformed

    private void supbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supbtnActionPerformed
        // TODO add your handling code here:
        //constractor call krala tyne
        sup s1 = new sup();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_supbtnActionPerformed

    private void empbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empbtnActionPerformed
        // TODO add your handling code here:
        //page eka lord krnna cunstrutor ekk hdghda
        Emply e1 = new Emply();
        e1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_empbtnActionPerformed

    private void trncebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trncebtnActionPerformed
        // TODO add your handling code here:
        //page eka lord krnna cunstrutor ekk hdghda
        trance t1 = new trance();
        t1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_trncebtnActionPerformed

    private void trncebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trncebtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trncebtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    
    
    
     private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cusbtn;
    private javax.swing.JButton empbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel sidepnel;
    private javax.swing.JButton supbtn;
    private javax.swing.JButton trncebtn;
    private javax.swing.JButton trncebtn1;
    // End of variables declaration//GEN-END:variables
}
