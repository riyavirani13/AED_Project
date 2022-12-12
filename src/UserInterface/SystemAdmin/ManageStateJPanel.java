/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author riyavirani
 */
public class ManageStateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStateJPanel
     */
    private final JPanel workContainer;
    private final EcoSystem business;
    
    DefaultTableModel tblModel;
    
    public ManageStateJPanel(JPanel workContainer, EcoSystem business ) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        populateTable();
        comboBoxAddedStateList.removeAllItems();
        populateStateComboBox();
        
    }
    
    private void populateTable(){
        
        tblModel = (DefaultTableModel) tblStateDetails.getModel();
        tblModel.setRowCount(0);
        
        for(StateNetwork stateNet : business.getStateList())
        {
            Object[] rowData = new Object[1];
            rowData[0] = stateNet;
            tblModel.addRow(rowData);
        }
        
    }
    
    private void populateStateComboBox(){
        

        comboBoxAddedStateList.addItem("California");
        comboBoxAddedStateList.addItem("Colorado");
        comboBoxAddedStateList.addItem("Illinois");
        comboBoxAddedStateList.addItem("Maine");
        comboBoxAddedStateList.addItem("Maryland"); 
        comboBoxAddedStateList.addItem("Massachusetts");
        comboBoxAddedStateList.addItem("New Jersey");        
        comboBoxAddedStateList.addItem("New York");     
        comboBoxAddedStateList.addItem("Texas");
        comboBoxAddedStateList.addItem("Utah");        
        comboBoxAddedStateList.addItem("Arizona");     
        comboBoxAddedStateList.addItem("Alaska");
        comboBoxAddedStateList.addItem("Washington");        
        comboBoxAddedStateList.addItem("Florida");     
        comboBoxAddedStateList.addItem("Georgia");
      
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStateDetails = new javax.swing.JTable();
        lblStateName = new javax.swing.JLabel();
        comboBoxAddedStateList = new javax.swing.JComboBox();
        btnAddState = new javax.swing.JButton();
        btnRemoveState = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage States");

        tblStateDetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblStateDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStateDetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblStateDetails);
        if (tblStateDetails.getColumnModel().getColumnCount() > 0) {
            tblStateDetails.getColumnModel().getColumn(0).setResizable(false);
        }

        lblStateName.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblStateName.setForeground(new java.awt.Color(0, 0, 102));
        lblStateName.setText("State Name:");

        comboBoxAddedStateList.setBackground(new java.awt.Color(0, 0, 102));
        comboBoxAddedStateList.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        comboBoxAddedStateList.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxAddedStateList.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddState.setBackground(new java.awt.Color(0, 0, 102));
        btnAddState.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnAddState.setForeground(new java.awt.Color(255, 255, 255));
        btnAddState.setText("Add State");
        btnAddState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStateActionPerformed(evt);
            }
        });

        btnRemoveState.setBackground(new java.awt.Color(0, 0, 102));
        btnRemoveState.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRemoveState.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveState.setText("Remove");
        btnRemoveState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveStateActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemoveState, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStateName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxAddedStateList, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddState)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnRemoveState)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStateName)
                    .addComponent(comboBoxAddedStateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddState))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStateActionPerformed
        // TODO add your handling code here:
        
        //check if the state exists
        for(StateNetwork stateNet: business.getStateList())
        {
            if(stateNet.getStateName().equalsIgnoreCase(String.valueOf(comboBoxAddedStateList.getSelectedItem())))
            {
                JOptionPane.showMessageDialog(null, "State already exists!");
            return;
            }
        }
        
        StateNetwork state = business.addNewState(String.valueOf(comboBoxAddedStateList.getSelectedItem()));
       
        state.getLocalHealthDepartment().setName(state.getStateName());
        state.setStatePopulation(0);
        state.setVaccinesLeftForState(state.getStatePopulation());
        populateTable();
    }//GEN-LAST:event_btnAddStateActionPerformed

    private void btnRemoveStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveStateActionPerformed
        // TODO add your handling code here:
        int row = tblStateDetails.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a State from table");
            return;
        }
        
        StateNetwork state = (StateNetwork)tblStateDetails.getValueAt(row, 0);
        business.removeState(state);
        populateTable();
    }//GEN-LAST:event_btnRemoveStateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddState;
    private javax.swing.JButton btnRemoveState;
    private javax.swing.JComboBox comboBoxAddedStateList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblStateName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblStateDetails;
    // End of variables declaration//GEN-END:variables
}
