package com.gestione.viaggi.boundary;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.gestione.viaggi.entity.Partecipanti;
import com.gestione.viaggi.control.PartecipantiService;
import javax.swing.JOptionPane;
import com.gestione.viaggi.entity.Viaggi;
import com.gestione.viaggi.entity.Turisti;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author utentepc
 */
public class Partecipante extends javax.swing.JFrame {

    /**
     * Creates new form Partecipante
     */
    public Partecipante() {
        initComponents();

        readJTable();
    }

    public void readJTable() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();

        DefaultTableModel modelo = (DefaultTableModel) tblPartecipanti.getModel();
        modelo.setNumRows(0);

        PartecipantiService pServ = new PartecipantiService(em);

        for (Partecipanti p : pServ.read()) {
            modelo.addRow(new Object[] {
                    p.getIdPartecipanti(),
                    p.getStatoPrenotazione(),
                    p.getTurista().getIdTurista(),
                    p.getViaggio().getIdViaggio()
            });
        }
    }

    private void clearFields() {
        txtIdPartecipanti.setText(null);
        boxStato.setSelectedIndex(0);
        txtIdTurista.setText(null);
        txtIdViaggio.setText(null);
    }

    private Partecipanti.StatoPrenotazione getStatoPrenotazioneFromComboBox() {
        String statoSelecionado = (String) boxStato.getSelectedItem();

        // Verifica o valor selecionado e converte para a enumeração apropriada
        switch (statoSelecionado) {
            case "PENDENTE":
                return Partecipanti.StatoPrenotazione.PENDENTE;
            case "CONFIRMATO":
                return Partecipanti.StatoPrenotazione.CONFIRMATO;
            case "CANCELLATO":
                return Partecipanti.StatoPrenotazione.CANCELLATO;
            default:
                return null;
        }
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
        tblPartecipanti = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPartecipanti = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdTurista = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtIdViaggio = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        boxStato = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestione Partecipanti");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 196, Short.MAX_VALUE));

        tblPartecipanti.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID Partecipanti", "Stato Prenotazione", "ID Turista", "ID Viaggio"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblPartecipanti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPartecipantiMouseClicked(evt);
            }
        });
        tblPartecipanti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblPartecipantiKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblPartecipanti);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Gestione Partecipanti");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Stato Prenotazione");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Id Partecipanti:");

        txtIdPartecipanti.setEditable(false);
        txtIdPartecipanti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Id Turista");

        txtIdTurista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Id Viaggio");

        txtIdViaggio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

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

        boxStato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        boxStato.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "PENDENTE", "CONFIRMATO", "CANCELLATO" }));
        boxStato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxStatoActionPerformed(evt);
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
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(txtIdTurista,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                227, Short.MAX_VALUE)
                                                                        .addComponent(boxStato, 0,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(txtIdViaggio,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                227,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                                                        .addComponent(btnUpdate)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDelete)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnCreate))))
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 742,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtIdPartecipanti, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(73, 73, 73)
                                                .addComponent(btnClear)
                                                .addContainerGap()))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(txtIdPartecipanti, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel1)
                                        .addComponent(btnClear))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21,
                                                        Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(185, 185, 185))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(boxStato,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtIdTurista,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtIdViaggio,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnUpdate)
                                                                        .addComponent(btnDelete)
                                                                        .addComponent(btnCreate))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap()))));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteActionPerformed

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        PartecipantiService partecipantiService = new PartecipantiService(em);

        if (tblPartecipanti.getSelectedRow() != -1) {
            partecipantiService.deletePartecipanti(Integer.parseInt(txtIdPartecipanti.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

        clearFields();

        em.close();
        emf.close();

    }// GEN-LAST:event_btnDeleteActionPerformed

    private void boxStatoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_boxStatoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_boxStatoActionPerformed

    private void tblPartecipantiKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_tblPartecipantiKeyReleased
        // TODO add your handling code here:

        if (tblPartecipanti.getSelectedRow() != -1) {
            txtIdPartecipanti.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 0).toString());
            txtIdTurista.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 2).toString());
            txtIdViaggio.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 3).toString());

            String statoPrenotazione = tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 1).toString();

            for (int i = 0; i < boxStato.getItemCount(); i++) {
                if (boxStato.getItemAt(i).equals(statoPrenotazione)) {
                    boxStato.setSelectedIndex(i);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblPartecipantiKeyReleased

    private void tblPartecipantiMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblPartecipantiMouseClicked
        // TODO add your handling code here:

        if (tblPartecipanti.getSelectedRow() != -1) {
            txtIdPartecipanti.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 0).toString());
            txtIdTurista.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 2).toString());
            txtIdViaggio.setText(tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 3).toString());

            String statoPrenotazione = tblPartecipanti.getValueAt(tblPartecipanti.getSelectedRow(), 1).toString();

            for (int i = 0; i < boxStato.getItemCount(); i++) {
                if (boxStato.getItemAt(i).equals(statoPrenotazione)) {
                    boxStato.setSelectedIndex(i);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

    }// GEN-LAST:event_tblPartecipantiMouseClicked

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        PartecipantiService partecipantiService = new PartecipantiService(em);
        Viaggi viaggio = new Viaggi();
        viaggio.setIdViaggio(Integer.parseInt(txtIdViaggio.getText()));
        Turisti turista = new Turisti();
        turista.setIdTurista(Integer.parseInt(txtIdTurista.getText()));

        Partecipanti.StatoPrenotazione statoPrenotazione = getStatoPrenotazioneFromComboBox();

        Partecipanti partecipanti = new Partecipanti(viaggio, turista, statoPrenotazione);

        partecipantiService.createPartecipanti(partecipanti);

        readJTable();

        clearFields();

        em.close();
        emf.close();

    }// GEN-LAST:event_btnCreateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        clearFields();

    }// GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneviaggi");
        EntityManager em = emf.createEntityManager();
        PartecipantiService partecipantiService = new PartecipantiService(em);
        Viaggi viaggio = new Viaggi();
        viaggio.setIdViaggio(Integer.parseInt(txtIdViaggio.getText()));
        Turisti turista = new Turisti();
        turista.setIdTurista(Integer.parseInt(txtIdTurista.getText()));

        Partecipanti.StatoPrenotazione statoPrenotazione = getStatoPrenotazioneFromComboBox();

        Partecipanti partecipanti = new Partecipanti(viaggio, turista, statoPrenotazione);

        if (tblPartecipanti.getSelectedRow() != -1) {
            partecipantiService.updatePartecipanti(partecipanti, Integer.parseInt(txtIdPartecipanti.getText()));

            readJTable();
        } else {
            JOptionPane.showMessageDialog(null, "Seleziona una riga per aggiornare.");
        }

        clearFields();

        em.close();
        emf.close();

    }// GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Partecipante.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Partecipante.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Partecipante.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Partecipante.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Partecipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxStato;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPartecipanti;
    private javax.swing.JTextField txtIdPartecipanti;
    private javax.swing.JTextField txtIdTurista;
    private javax.swing.JTextField txtIdViaggio;
    // End of variables declaration//GEN-END:variables
}
