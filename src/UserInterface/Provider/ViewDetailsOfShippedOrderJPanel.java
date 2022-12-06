/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Provider;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Order.OrderItem;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.Vaccine.VaccineDetails;
import Business.WorkQueue.ShippingOrderWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darsh
 */
public class ViewDetailsOfShippedOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDetailsOfShippedOrderJPanel
     */
    private final JPanel workContainer;
    private final EcoSystem business;
    private final HospitalEnterprise hospitalEnterprise;
    private final HospitalOrganization hospitalOrganization;
    private final ShippingOrderWorkRequest request;

    public ViewDetailsOfShippedOrderJPanel(JPanel workContainer, EcoSystem business, HospitalEnterprise hospitalEnterprise, HospitalOrganization hospitalOrganization, ShippingOrderWorkRequest request) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        this.hospitalEnterprise = hospitalEnterprise;
        this.hospitalOrganization = hospitalOrganization;
        this.request = request;
        txtornum.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        populateOrderTable();

    }

    private void populateOrderTable() {

        int rowCount = tbldetails.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tbldetails.getModel();

        for (int i = rowCount - 1; i >= 0; i--) {
            defaulttabelmodel.removeRow(i);
        }

        for (OrderItem oi : request.getShipOrder().getItemList()) {
            Object[] row = new Object[7];

            row[0] = oi.getVaccineDetails();
            row[1] = oi;
            row[2] = oi.getVaccineDetails().getManufacturerName();
            row[3] = oi.getVaccineDetails().getVaccineId();
            row[4] = oi.getVaccineDetails().getBatchId();
            row[5] = oi.getQuantity();
            row[6] = oi.getVaccineDetails().getManufactureDate();

            defaulttabelmodel.addRow(row);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtornum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        btnstore = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Store Shipped Orders");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Order Number: ");

        txtornum.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtornum.setEnabled(false);

        tbldetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Vaccine ID", "Batch ID", "Quantity", "Manufacture Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldetails);

        btnstore.setBackground(new java.awt.Color(0, 0, 102));
        btnstore.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnstore.setForeground(new java.awt.Color(255, 255, 255));
        btnstore.setText("Store Vaccines");
        btnstore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstoreActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(0, 0, 102));
        btnback.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("<");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/store.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnstore)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtornum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnstore, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnstoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstoreActionPerformed
        // TODO add your handling code here:
        if (request.getStatus().equalsIgnoreCase("Stored")) {
            JOptionPane.showMessageDialog(null, "Vaccine already stored!");
            return;
        }

        boolean flag1 = false;
        boolean flag2 = false;
        
        VaccineDetails orderedVaccine = null;
        for (OrderItem oi : request.getShipOrder().getItemList()) {
            
                orderedVaccine = oi.getVaccineDetails();
                for (Organization org : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
                    
                        if (org instanceof HospitalOrganization) {
                            HospitalOrganization hospOrg = (HospitalOrganization) org;
                            for (VaccineDetails prod : hospOrg.getClinic().getVaccineInventoryClinic()) {

                                if (orderedVaccine.getBatchId().equals(prod.getBatchId()) && orderedVaccine.getVaccineDefinition().getVaccineName().equals(prod.getVaccineDefinition().getVaccineName()) && orderedVaccine.getManufacturerName().equalsIgnoreCase(prod.getManufacturerName())) {
                                    flag1 = true;
                                    flag2 = true;
                                    prod.setAvailablity(prod.getAvailablity() + oi.getQuantity());
                                    
                                }
                            }
                            
                        }
                    }
                
            }
        

      
        if (flag1 == false && flag2 == false) {
            for (OrderItem oi : request.getShipOrder().getItemList()) {
                for (Organization org : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof HospitalOrganization) {
                        HospitalOrganization hospOrg = (HospitalOrganization) org;
                        VaccineDetails prod = hospOrg.getClinic().addNewVaccineDetails();
                        prod.setAvailablity(oi.getQuantity());
                        prod.setBatchId(oi.getVaccineDetails().getBatchId());
                        prod.setManufactureDate(oi.getVaccineDetails().getManufactureDate());
                        prod.setManufacturerName(oi.getVaccineDetails().getManufacturerName());
                        prod.setVaccineDefinition(oi.getVaccineDetails().getVaccineDefinition());
                        prod.setVaccineId(oi.getVaccineDetails().getVaccineId());
                        prod.setVaccinePrice(oi.getVaccineDetails().getVaccinePrice());

                    }
                }

            }

        }
        request.setStatus("Stored");

        JOptionPane.showMessageDialog(null, "Vaccine Stored in the Clinic!");


    }//GEN-LAST:event_btnstoreActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnstore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextField txtornum;
    // End of variables declaration//GEN-END:variables
}
