/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestione.viaggi.boundary;

/**
 *
 * @author utentepc
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTurista = new javax.swing.JButton();
        btnViaggio = new javax.swing.JButton();
        btnPartecipanti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Frame");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Main Frame");

        btnTurista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTurista.setText("Turista");
        btnTurista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTuristaActionPerformed(evt);
            }
        });

        btnViaggio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnViaggio.setText("Viaggio");
        btnViaggio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViaggioActionPerformed(evt);
            }
        });

        btnPartecipanti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPartecipanti.setText("Partecipanti");
        btnPartecipanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartecipantiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnViaggio)
                .addGap(18, 18, 18)
                .addComponent(btnTurista)
                .addGap(18, 18, 18)
                .addComponent(btnPartecipanti)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTurista)
                    .addComponent(btnViaggio)
                    .addComponent(btnPartecipanti))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTuristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTuristaActionPerformed
        // TODO add your handling code here:
        
         new Turista().setVisible(true);
        
    }//GEN-LAST:event_btnTuristaActionPerformed

    private void btnViaggioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViaggioActionPerformed
        // TODO add your handling code here:
        
        new Viaggio().setVisible(true);
        
    }//GEN-LAST:event_btnViaggioActionPerformed

    private void btnPartecipantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartecipantiActionPerformed
        // TODO add your handling code here:
        
         new Partecipante().setVisible(true);
         
    }//GEN-LAST:event_btnPartecipantiActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPartecipanti;
    private javax.swing.JButton btnTurista;
    private javax.swing.JButton btnViaggio;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}