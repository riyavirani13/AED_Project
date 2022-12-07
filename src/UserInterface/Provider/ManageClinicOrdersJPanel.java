/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Provider;

import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.StateNetwork;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProviderVaccineOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author darsh
 */
public class ManageClinicOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    private final JPanel workContainer;

    private final HospitalEnterprise hospital;
    private final UserAccount userAccount;
    private HospitalOrganization hospitalOrg;
    private final EcoSystem business;
    private final StateNetwork state;
    
    public ManageClinicOrdersJPanel(JPanel workContainer, HospitalEnterprise hospital,HospitalOrganization hospitalOrg,UserAccount userAccount , EcoSystem business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.state = state;
        populateOrderTable();
  
        
        
    }
    
    private void populateOrderTable(){
        
        int rowCount = tblOrderDetails.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblOrderDetails.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospitalOrg = (HospitalOrganization)org;
        
        for(WorkRequest wr: hospitalOrg.getWorkQueue().getWorkRequestList())
        {   
            if( wr instanceof ProviderVaccineOrderWorkRequest)
            {
              ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)wr  ;
              if(request.isClinicOrder())
              {
               Object[] row = new Object[5];
               row[0] = request;
               row[1] = getContractDetails(request);
               row[2] = request.getSender();
               row[3] = request.getStatus();
               row[4] = request.getResolveDate();
               defaulttabelmodel.addRow(row);
              }
            }
        }
        
            } 
    }
    }
    
    private String getContractDetails(ProviderVaccineOrderWorkRequest request){
        
        if(request.ishalfmonthContract())
            return "Half Monthly";
        else if(request.isfullMonthContract())
            return "Monthly";
        else
           return "Ad-hoc";
        
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
        lblOrderStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetails = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage orders from Clinics");

        lblOrderStatus.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblOrderStatus.setForeground(new java.awt.Color(0, 0, 102));
        lblOrderStatus.setText("Order Status:");

        tblOrderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Contract?", "Sender", "Status", "Last Shipping date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblOrderDetails);

        btnViewDetails.setBackground(new java.awt.Color(0, 0, 102));
        btnViewDetails.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setText("View details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 0, 102));
        btnRefresh.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrderStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewDetails)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderStatus)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewDetails)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblOrderDetails.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblOrderDetails.getValueAt(selectedRow, 0);
        
        ClinicOrderDetailsJPanel panel = new ClinicOrderDetailsJPanel(workContainer, request, state);
        workContainer.add("ViewDetailsOfPlacedOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrderDetails;
    // End of variables declaration//GEN-END:variables
}
