/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ganesh_pradhan
 */
public class Add_customer1 extends javax.swing.JFrame {

    /**
     * Creates new form Add_customer1
     */
    public Add_customer1() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Close_bb = new javax.swing.JPanel();
        Close_b = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 68, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close_bb.setBackground(new java.awt.Color(47, 68, 187));
        Close_bb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Close_b.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        Close_b.setForeground(new java.awt.Color(255, 51, 0));
        Close_b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close_b.setText("×");
        Close_b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close_b.setPreferredSize(new java.awt.Dimension(40, 40));
        Close_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Close_bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Close_bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Close_bMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Close_bbLayout = new javax.swing.GroupLayout(Close_bb);
        Close_bb.setLayout(Close_bbLayout);
        Close_bbLayout.setHorizontalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Close_bbLayout.createSequentialGroup()
                .addComponent(Close_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Close_bbLayout.setVerticalGroup(
            Close_bbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(Close_bb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        setSize(new java.awt.Dimension(1199, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Close_bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseExited
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 255, 255));
        Close_b.setForeground(new Color(255,0,0));
    }//GEN-LAST:event_Close_bMouseExited

    private void Close_bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseEntered
        // TODO add your handling code here:
        Close_bb.setBackground(new Color(255, 0, 0));
        Close_b.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_Close_bMouseEntered

    private void Close_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Close_bMouseClicked
        // TODO add your handling code here:
        int Yes = JOptionPane.showConfirmDialog(null, "Are Your Sure Want to Close This Application ?");
        if(Yes == 0){

            this.dispose();
        }else{
            int No=0;
            if (No == 0){
            }
        }
    }//GEN-LAST:event_Close_bMouseClicked

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
            java.util.logging.Logger.getLogger(Add_customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_customer1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_customer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close_b;
    private javax.swing.JPanel Close_bb;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
