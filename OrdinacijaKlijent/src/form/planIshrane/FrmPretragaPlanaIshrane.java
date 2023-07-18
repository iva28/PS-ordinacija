/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form.planIshrane;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Iva
 */
public class FrmPretragaPlanaIshrane extends javax.swing.JFrame {

    /**
     * Creates new form FrmPretragaPlanaIshrane
     */
    public FrmPretragaPlanaIshrane() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlan = new javax.swing.JTable();
        btnPrikaziSve = new javax.swing.JButton();
        btnResetuj = new javax.swing.JButton();
        lblNutricionista = new javax.swing.JLabel();
        cmbNutricionista = new javax.swing.JComboBox<>();
        lblPacijent = new javax.swing.JLabel();
        cmbPacijenti = new javax.swing.JComboBox<>();
        btnPretraga = new javax.swing.JButton();
        btnUcitaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pretraga plana");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, null, null), "Plan ishrane:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        tblPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPlan);

        btnPrikaziSve.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrikaziSve.setForeground(new java.awt.Color(51, 0, 255));
        btnPrikaziSve.setText("Prikazi sve");
        btnPrikaziSve.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPrikaziSve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrikaziSveActionPerformed(evt);
            }
        });

        btnResetuj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetuj.setText("Resetuj");
        btnResetuj.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnResetuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetujActionPerformed(evt);
            }
        });

        lblNutricionista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNutricionista.setText("Nutricionista:");

        cmbNutricionista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPacijent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPacijent.setText("Pacijent:");

        cmbPacijenti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnPretraga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPretraga.setText("Pretraga");
        btnPretraga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPretraga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaActionPerformed(evt);
            }
        });

        btnUcitaj.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUcitaj.setForeground(new java.awt.Color(255, 51, 0));
        btnUcitaj.setText(" Učitaj plan");
        btnUcitaj.setToolTipText("");
        btnUcitaj.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        btnUcitaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcitajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrikaziSve, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblPacijent, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPacijenti, 0, 528, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbNutricionista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(btnUcitaj, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(btnPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnResetuj, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbNutricionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPacijent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPacijenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUcitaj, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnResetuj, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrikaziSve, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrikaziSveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrikaziSveActionPerformed

    }//GEN-LAST:event_btnPrikaziSveActionPerformed

    private void btnResetujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetujActionPerformed
    }//GEN-LAST:event_btnResetujActionPerformed

    private void btnPretragaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPretragaActionPerformed

    private void btnUcitajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcitajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUcitajActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPretraga;
    private javax.swing.JButton btnPrikaziSve;
    private javax.swing.JButton btnResetuj;
    private javax.swing.JButton btnUcitaj;
    private javax.swing.JComboBox<Object> cmbNutricionista;
    private javax.swing.JComboBox<Object> cmbPacijenti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNutricionista;
    private javax.swing.JLabel lblPacijent;
    private javax.swing.JTable tblPlan;
    // End of variables declaration//GEN-END:variables


    public JButton getBtnResetuj() {
        return btnResetuj;
    }

    public JComboBox<Object> getCmbNutricionista() {
        return cmbNutricionista;
    }

    public JComboBox<Object> getCmbPacijenti() {
        return cmbPacijenti;
    }

    public JButton getjButton1() {
        return btnPrikaziSve;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }


    public JLabel getLblNutricionista() {
        return lblNutricionista;
    }

    public JLabel getLblPacijent() {
        return lblPacijent;
    }

    public JTable getTblPlan() {
        return tblPlan;
    }

   
    public void setBtnResetuj(JButton btnResetuj) {
        this.btnResetuj = btnResetuj;
    }

    public void setCmbNutricionista(JComboBox<Object> cmbNutricionista) {
        this.cmbNutricionista = cmbNutricionista;
    }

    public void setCmbPacijenti(JComboBox<Object> cmbPacijenti) {
        this.cmbPacijenti = cmbPacijenti;
    }

    public void setjButton1(JButton jButton1) {
        this.btnPrikaziSve = jButton1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

   

    public void setLblNutricionista(JLabel lblNutricionista) {
        this.lblNutricionista = lblNutricionista;
    }

    public void setLblPacijent(JLabel lblPacijent) {
        this.lblPacijent = lblPacijent;
    }

    public void setTblPlan(JTable tblPlan) {
        this.tblPlan = tblPlan;
    }

   

    public void addbtnPretragaActionListener(ActionListener actionListener) {
        btnPretraga.addActionListener(actionListener);
    }

    public void addbtnResetujActionListener(ActionListener actionListener) {
        btnResetuj.addActionListener(actionListener);
    }
    public void addbtnPrikaziSveActionListener(ActionListener actionListener) {
        btnPrikaziSve.addActionListener(actionListener);
    }
    public void addbtnUcitajActionListener(ActionListener actionListener) {
        btnUcitaj.addActionListener(actionListener);
    }
    
}
