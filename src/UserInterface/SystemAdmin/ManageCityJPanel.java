/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdmin;

import Business.EcoSystem;
import Business.Network.CityNetwork;
import Business.Network.StateNetwork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author riyavirani
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final EcoSystem business;
    /**
     * Creates new form ManageCityJPanel
     */
    public ManageCityJPanel(JPanel workContainer, EcoSystem business) {
        initComponents();
        this.workContainer = workContainer;
        this.business = business;
        cbstatelist.removeAllItems();
        populateStateCombobox();
        populateTable();
    }
    
    private void populateStateCombobox(){
        
        for(StateNetwork state : business.getStateList())
        {
            cbstatelist.addItem(state);
        }
        
        
    }
    
    
    private void populateTable(){
        int rowCount = tbcityname.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tbcityname.getModel();
        
        //delete rows
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
         //get State from combo box
        StateNetwork state = (StateNetwork)cbstatelist.getSelectedItem();
        if(state == null){
            return;
        }
        
        //populate the table
        for (CityNetwork city: state.getCityList()){
            Object[] row = new Object[1];
            row[0]=city;
            
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
        cbstatelist = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcityname = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        btnaddcity = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage City");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("State: ");

        cbstatelist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbstatelist.setForeground(new java.awt.Color(0, 0, 102));
        cbstatelist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbstatelist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbstatelistActionPerformed(evt);
            }
        });

        tbcityname.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbcityname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbcityname.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbcityname);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("City Name:");

        txtcname.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        btnaddcity.setBackground(new java.awt.Color(0, 0, 102));
        btnaddcity.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnaddcity.setForeground(new java.awt.Color(255, 255, 255));
        btnaddcity.setText("Add City");
        btnaddcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcityActionPerformed(evt);
            }
        });

        btnremove.setBackground(new java.awt.Color(0, 0, 102));
        btnremove.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnremove.setForeground(new java.awt.Color(255, 255, 255));
        btnremove.setText("Remove City");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnaddcity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnremove))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbstatelist, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbstatelist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnremove)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnaddcity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbstatelistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbstatelistActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_cbstatelistActionPerformed

    private void btnaddcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcityActionPerformed
        // TODO add your handling code here:
        String city = txtcname.getText();
        if(city.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter a city Name!");
            return;

        }

        StateNetwork state = (StateNetwork)cbstatelist.getSelectedItem();

        for(CityNetwork c: state.getCityList())
        {
            if(c.getName().equalsIgnoreCase(city))
            {
                JOptionPane.showMessageDialog(null, "City exists!");
                return;
            }
        }

        state.addNewCity(city);
        populateTable();

    }//GEN-LAST:event_btnaddcityActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        // TODO add your handling code here:
        int row = tbcityname.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a City from table");
            return;
        }

        CityNetwork city = (CityNetwork)tbcityname.getValueAt(row, 0);
        StateNetwork state = (StateNetwork)cbstatelist.getSelectedItem();
        state.removeCity(city);
        populateTable();

    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddcity;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnremove;
    private javax.swing.JComboBox cbstatelist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbcityname;
    private javax.swing.JTextField txtcname;
    // End of variables declaration//GEN-END:variables
}
