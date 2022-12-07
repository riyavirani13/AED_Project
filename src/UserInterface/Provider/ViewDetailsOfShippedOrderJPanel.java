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
        txtOrderNumber.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        populateOrderTable();

    }

    private void populateOrderTable() {

        int rowCount = tblDrugShippingDetails.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblDrugShippingDetails.getModel();

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

        lblTitle = new javax.swing.JLabel();
        lblOrderNumber = new javax.swing.JLabel();
        txtOrderNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugShippingDetails = new javax.swing.JTable();
        btnStoreVaccine = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Store Shipped Orders");

        lblOrderNumber.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblOrderNumber.setForeground(new java.awt.Color(0, 0, 102));
        lblOrderNumber.setText("Order Number: ");

        txtOrderNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOrderNumber.setEnabled(false);

        tblDrugShippingDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblDrugShippingDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Code", "Drug Name", "Brand", "Drug ID", "Batch ID", "Quantity", "Manufacture Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDrugShippingDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDrugShippingDetails);

        btnStoreVaccine.setBackground(new java.awt.Color(0, 0, 102));
        btnStoreVaccine.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnStoreVaccine.setForeground(new java.awt.Color(255, 255, 255));
        btnStoreVaccine.setText("Store Vaccines");
        btnStoreVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreVaccineActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 102));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStoreVaccine))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOrderNumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOrderNumber)
                    .addComponent(txtOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStoreVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreVaccineActionPerformed
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


    }//GEN-LAST:event_btnStoreVaccineActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStoreVaccine;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblDrugShippingDetails;
    private javax.swing.JTextField txtOrderNumber;
    // End of variables declaration//GEN-END:variables
}
