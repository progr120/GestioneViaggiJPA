/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestione.viaggi.boundary;

import com.gestione.viaggi.control.ViaggiService;
import com.gestione.viaggi.entity.Viaggi;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author utentepc
 */
public class Viaggio extends javax.swing.JFrame {

    /**
     * Creates new form Viaggio
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Viaggio() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tblViaggi.getModel();
        tblViaggi.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }

    private void readJTable() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();

        DefaultTableModel modelo = (DefaultTableModel) tblViaggi.getModel();
        modelo.setNumRows(0);

        ViaggiService vServ = new ViaggiService(em);

        for (Viaggi v : vServ.read()) {
            modelo.addRow(new Object[] {
                    v.getIdViaggio(),
                    v.getDestinazione(),
                    v.getDataPartenza(),
                    v.getDataRitorno(),
                    v.getPostiDisponibili()
            });
        }
    }

    private void clearFields() {
        txtIdViaggio.setText(null);
        txtDestinazione.setText(null);
        txtDataPartenza.setText(null);
        txtDataRitorno.setText(null);
        txtPostiDisponibili.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDataPartenza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDestinazione = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPostiDisponibili = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDataRitorno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViaggi = new javax.swing.JTable();
        txtIdViaggio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestione Viaggi");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID Viaggio: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Data Partenza");

        txtDataPartenza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Destinazione");

        txtDestinazione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Posti Disponibili");

        txtPostiDisponibili.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Data Ritorno");

        txtDataRitorno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tblViaggi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id Viaggio", "Data Partenza", "Data Ritorno", "Destinazione", "PostiDisponibili"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblViaggi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViaggiMouseClicked(evt);
            }
        });
        tblViaggi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblViaggiKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblViaggi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        txtIdViaggio.setEditable(false);
        txtIdViaggio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Gestione Viaggi");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(txtIdViaggio,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(16, 16, 16))
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtDataPartenza)
                                                        .addComponent(txtDestinazione))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel5)
                                                                .addComponent(txtDataRitorno)
                                                                .addComponent(txtPostiDisponibili,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 220,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20,
                                                        Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(btnUpdate)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDelete)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnCreate)
                                                                .addGap(26, 26, 26))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                        .addComponent(btnClear)
                                                                        .addContainerGap()))))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtIdViaggio,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDataPartenza,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDataRitorno,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDestinazione,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtPostiDisponibili,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(btnClear))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        133, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnUpdate)
                                                        .addComponent(btnDelete)
                                                        .addComponent(btnCreate))))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        ViaggiService viaggioService = new ViaggiService(em);

        Viaggi viaggio = new Viaggi(txtDestinazione.getText(), txtDataPartenza.getText(), txtDataRitorno.getText(),
                Integer.parseInt(txtPostiDisponibili.getText()));

        viaggioService.createViaggi(viaggio);

        readJTable();

        clearFields();

        em.close();
        emf.close();
    }// GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        ViaggiService viaggioService = new ViaggiService(em);

        Viaggi viaggio = new Viaggi(txtDestinazione.getText(), txtDataPartenza.getText(), txtDataRitorno.getText(),
                Integer.parseInt(txtPostiDisponibili.getText()));

        if (tblViaggi.getSelectedRow() != -1) {
            viaggioService.updateViaggi(viaggio, Integer.parseInt(txtIdViaggio.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "I campi non devono essere null");
        }

        clearFields();

        em.close();
        emf.close();
    }// GEN-LAST:event_btnUpdateActionPerformed

    private void tblViaggiKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tblViaggiKeyReleased
        // TODO add your handling code here:

        if (tblViaggi.getSelectedRow() != -1) {

            txtIdViaggio.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 0).toString());
            txtDestinazione.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 1).toString());
            txtDataPartenza.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 2).toString());
            txtDataRitorno.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 3).toString());
            txtPostiDisponibili.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 4).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblViaggiKeyReleased

    private void tblViaggiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblViaggiMouseClicked
        // TODO add your handling code here:

        if (tblViaggi.getSelectedRow() != -1) {

            txtIdViaggio.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 0).toString());
            txtDestinazione.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 1).toString());
            txtDataPartenza.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 2).toString());
            txtDataRitorno.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 3).toString());
            txtPostiDisponibili.setText(tblViaggi.getValueAt(tblViaggi.getSelectedRow(), 4).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblViaggiMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();

        if (tblViaggi.getSelectedRow() != -1) {
            ViaggiService viaggioService = new ViaggiService(em);

            viaggioService.deleteViaggi(Integer.parseInt(txtIdViaggio.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per rimuovere.");
        }

        clearFields();

        em.close();
        emf.close();
    }// GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        clearFields();

    }// GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Viaggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viaggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viaggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viaggio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viaggio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViaggi;
    private javax.swing.JTextField txtDataPartenza;
    private javax.swing.JTextField txtDataRitorno;
    private javax.swing.JTextField txtDestinazione;
    private javax.swing.JTextField txtIdViaggio;
    private javax.swing.JTextField txtPostiDisponibili;
    // End of variables declaration//GEN-END:variables
}
