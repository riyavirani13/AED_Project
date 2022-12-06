/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Distributor;

import Business.EcoSystem;
import Business.NationalEnterprise.Distributor;
import Business.Organization.DistributorOrganization;
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
public class ManageProviderOrdersJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;  
    private final Distributor enterprise;
    private final UserAccount userAccount;
    private final DistributorOrganization distributorOrg;
    private final EcoSystem business;
    /**
     * Creates new form ManageProviderOrdersJPanel
     */
    public ManageProviderOrdersJPanel(JPanel workContainer,Distributor enterprise,DistributorOrganization distributorOrg, UserAccount userAccount,EcoSystem business) {
        initComponents();
         this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.distributorOrg = distributorOrg;
        this.business = business;
        this.workContainer = workContainer;
        populateContractTable();
        populateAdhocTable();
    }
    
    private void populateContractTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblcont.getModel();
        defaulttabelmodel.setRowCount(0);
        
         DistributorOrganization distOrg = null;
         
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof DistributorOrganization)
        {   distOrg = (DistributorOrganization)org;
            for(WorkRequest workRequest : distOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                if(vaccineOrderWR.isasReq()== false)
                {
                Object[] row = new Object[9];
            
                row[0] = vaccineOrderWR;
                row[1] = getContractDetails(vaccineOrderWR);
                row[2] = vaccineOrderWR.getEnterprise();
                row[3] = vaccineOrderWR.getreqState();
                row[4] = vaccineOrderWR.getSender();
                row[5] = vaccineOrderWR.getdeliDate();
                row[6] = vaccineOrderWR.getStatus();
                row[7] = vaccineOrderWR.getReceiver();
                row[8] = vaccineOrderWR.getResolveDate();               
                defaulttabelmodel.addRow(row);
                
                }
            }
            }
        }
        
        
        
        
    }
        
        
    }
    
    private void populateAdhocTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblnormal.getModel();
        defaulttabelmodel.setRowCount(0);
        
         DistributorOrganization distOrg = null;
         
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof DistributorOrganization)
        {   distOrg = (DistributorOrganization)org;
            for(WorkRequest workRequest : distOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderVaccineOrderWorkRequest)
            {ProviderVaccineOrderWorkRequest vaccineOrderWR = (ProviderVaccineOrderWorkRequest)workRequest;
                if(vaccineOrderWR.isasReq()== true)
                {
                Object[] row = new Object[7];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getEnterprise();
                row[2] = vaccineOrderWR.getreqState();
                row[3] = vaccineOrderWR.getSender();
                row[4] = vaccineOrderWR.getStatus();
                row[5] = vaccineOrderWR.getReceiver();
                row[6] = vaccineOrderWR.getResolveDate();
                
                
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
           return "As Required";
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcont = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnormal = new javax.swing.JTable();
        lbl3 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lbl1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 102));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Manage Provider Orders");

        tblcont.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tblcont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Contract Type", "Provider", "State", "Sender", "Next Delivery Date", "Status", "Shipped by", "Last Shipping Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcont.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblcont);

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Refresh");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 51, 102));
        lbl2.setText("Orders type:");

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("View Details and Ship");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        tblnormal.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tblnormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "State", "Sender", "Status", "Shipped By", "Shipping Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblnormal.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblnormal);

        lbl3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 51, 102));
        lbl3.setText("AsRequired Orders:");

        btn3.setBackground(new java.awt.Color(0, 0, 102));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Refresh");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 102));
        btn4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("View Details and Ship >>");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3)
                    .addComponent(btn3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        populateContractTable();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblcont.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select an Order from table");
            return;
        }

        ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblcont.getValueAt(selectedRow, 0);

        ViewContractDetailsAndShipJPanel panel = new ViewContractDetailsAndShipJPanel(workContainer, userAccount, business, request, enterprise);
        workContainer.add("ViewContractDetailsAndShipJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        populateContractTable();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblnormal.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select an Order from table");
            return;
        }

        ProviderVaccineOrderWorkRequest request = (ProviderVaccineOrderWorkRequest)tblnormal.getValueAt(selectedRow, 0);

        ViewAsRequestedDetailsAndShipJPanel panel = new ViewAsRequestedDetailsAndShipJPanel(workContainer, userAccount, business, request, enterprise);
        workContainer.add("ViewAdhocDetailsAndShipJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JTable tblcont;
    private javax.swing.JTable tblnormal;
    // End of variables declaration//GEN-END:variables
}
