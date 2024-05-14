/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gestione.viaggi.boundary;

import com.gestione.viaggi.entity.Turisti;
import com.gestione.viaggi.control.TuristiService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author utentepc
 */
public class Turista extends javax.swing.JFrame {

    /**
     * Creates new form Turista
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public Turista() {
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) tblTuristi.getModel();
        tblTuristi.setRowSorter(new TableRowSorter(modelo));

        readJTable();
    }

    public void readJTable() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();

        DefaultTableModel modelo = (DefaultTableModel) tblTuristi.getModel();
        modelo.setNumRows(0);

        TuristiService tServ = new TuristiService(em);

        for (Turisti t : tServ.read()) {
            modelo.addRow(new Object[] {
                    t.getIdTurista(),
                    t.getCognome(),
                    t.getDataNascita(),
                    t.getDocumento(),
                    t.getEmail(),
                    t.getNazionalita(),
                    t.getNome()
            });
        }
    }

    private void clearFields() {
        txtIdTurista.setText(null);
        txtCognome.setText(null);
        txtDataNascita.setText(null);
        txtDocumento.setText(null);
        txtEmail.setText(null);
        txtNazionalita.setText(null);
        txtNome.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTuristi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNazionalita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDataNascita = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCognome = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdTurista = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestione Turista");

        tblTuristi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id Turista", "Cognome", "Data Nascita", "Documento", "Email", "Nazionalita", "Nome"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblTuristi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTuristiMouseClicked(evt);
            }
        });
        tblTuristi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblTuristiKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblTuristi);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Documento");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Nazionalita");

        txtNazionalita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Cognome");

        txtDataNascita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Data Nascita");

        txtDocumento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Email");

        txtCognome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtNazionalita,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtCognome,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        217, Short.MAX_VALUE)
                                                                .addComponent(btnUpdate)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDelete)
                                                                .addGap(5, 5, 5)
                                                                .addComponent(btnCreate))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDataNascita,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDocumento,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))))
                                .addGap(32, 32, 32)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtDataNascita, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel8)
                                                        .addComponent(btnUpdate)
                                                        .addComponent(btnDelete)
                                                        .addComponent(btnCreate)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNazionalita, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtCognome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addContainerGap()));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestione Turista");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Id Turista: ");

        txtIdTurista.setEditable(false);
        txtIdTurista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdTurista, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(248, 248, 248)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnClear)
                                                .addGap(16, 16, 16)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(btnClear))
                                        .addComponent(txtIdTurista, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        TuristiService turistaService = new TuristiService(em);
        Turisti turista = new Turisti(txtNome.getText(), txtCognome.getText(), txtDataNascita.getText(),
                txtNazionalita.getText(), txtEmail.getText(), txtDocumento.getText());

        if (tblTuristi.getSelectedRow() != -1) {
            turistaService.updateTuristi(turista, Integer.parseInt(txtIdTurista.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

        clearFields();

        em.close();
        emf.close();

    }// GEN-LAST:event_btnUpdateActionPerformed

    private void tblTuristiKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tblTuristiKeyReleased
        // TODO add your handling code here:

        if (tblTuristi.getSelectedRow() != -1) {

            txtIdTurista.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 0).toString());
            txtCognome.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 1).toString());
            txtDataNascita.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 2).toString());
            txtDocumento.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 3).toString());
            txtEmail.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 4).toString());
            txtNazionalita.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 5).toString());
            txtNome.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 6).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblTuristiKeyReleased

    private void tblTuristiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblTuristiMouseClicked
        // TODO add your handling code here:

        if (tblTuristi.getSelectedRow() != -1) {

            txtIdTurista.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 0).toString());
            txtCognome.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 1).toString());
            txtDataNascita.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 2).toString());
            txtDocumento.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 3).toString());
            txtEmail.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 4).toString());
            txtNazionalita.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 5).toString());
            txtNome.setText(tblTuristi.getValueAt(tblTuristi.getSelectedRow(), 6).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblTuristiMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        TuristiService turistaService = new TuristiService(em);

        Turisti turista = new Turisti(txtNome.getText(), txtCognome.getText(), txtDataNascita.getText(),
                txtNazionalita.getText(), txtEmail.getText(), txtDocumento.getText());

        turistaService.createTuristi(turista);
        readJTable();

        clearFields();

        em.close();
        emf.close();

    }// GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        TuristiService turistaService = new TuristiService(em);

        if (tblTuristi.getSelectedRow() != -1) {
            turistaService.deleteTuristi(Integer.parseInt(txtIdTurista.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
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
            java.util.logging.Logger.getLogger(Turista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turista().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTuristi;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtDataNascita;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdTurista;
    private javax.swing.JTextField txtNazionalita;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
