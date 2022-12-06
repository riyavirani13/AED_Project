/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LocalHealthDepartment;
import Business.NationalEnterprise.CDC;
import Business.NationalEnterprise.Distributor;
import Business.NationalEnterprise.Manufacturer;
import Business.Organization.CDCOrganization;
import Business.Organization.DistributorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.ManufactureOrganization;
import Business.Organization.Organization;
import Business.Organization.LHDImmuneOrganization;
import Business.Organization.PatientOrganization;
import Business.Organization.ClinicOrganization;
import Business.Organization.medicalOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author darsh
 */
public class ManageDepartmentJPanel extends javax.swing.JPanel {

    private JPanel workContainer;
    private Enterprise enterprise;
    /**
     * Creates new form ManageDepartmentJPanel
     */
    public ManageDepartmentJPanel(JPanel workContainer, Enterprise enterprise ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
        txt1.setVisible(false);
            lbl4.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            txt1.setVisible(true);
            lbl4.setVisible(true);
                
        }
        
    }
    
    private void populateCombo(){
        cborglist.removeAllItems();
        if(enterprise instanceof CDC)
        {   
            cborglist.addItem(Organization.OrganizationType.CDCOrg);
            cborglist.addItem(Organization.OrganizationType.MedicalOrganization);
        }
        if(enterprise instanceof Manufacturer)
        {
            cborglist.addItem(Organization.OrganizationType.ManufactureOrg);
        }
        if(enterprise instanceof Distributor)
        {
            cborglist.addItem(Organization.OrganizationType.DistributorOrg);
            
        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            cborglist.addItem(Organization.OrganizationType.LocalHealthDepartmentOrg);
        }
        
        if( enterprise instanceof HospitalEnterprise)
        {
            cborglist.addItem(Organization.OrganizationType.HospitalOrg);
            cborglist.addItem(Organization.OrganizationType.PatientOrganization);
            cborglist.addItem(Organization.OrganizationType.ClinicOrganization);
        }
        
       
    }
    
    private void populateTable(){
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblorg.getModel();
        
        defaulttabelmodel.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            if(organization instanceof ClinicOrganization)
            {
                ClinicOrganization satOrg =(ClinicOrganization)organization;
                row[1] = satOrg.getClincName()+"Clinic";
            }
            else
            row[1] = organization.getName();
            
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

        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorg = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        cborglist = new javax.swing.JComboBox();
        btn2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();

        lbl1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 102));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Manage Organization");

        tblorg.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblorg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorg.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorg);

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn1.setText("<");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 102));
        lbl2.setText("Organization Type ");

        cborglist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cborglist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Add Organization");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 51, 102));

        lbl3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 102));
        lbl3.setText("Add Organization:");

        lbl4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 102));
        lbl4.setText(" Clinic Name:");

        txt1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(btn1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl4)
                            .addComponent(lbl2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cborglist, 0, 160, Short.MAX_VALUE)
                            .addComponent(txt1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl3)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(cborglist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn2)
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        Organization.OrganizationType type = (Organization.OrganizationType) cborglist.getSelectedItem();
        //check if organization exists

        //
        boolean corg =false;
        boolean morg =false;

        if( enterprise instanceof CDC)
        {

            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof CDCOrganization)
                {
                    corg=true;
                }
                if(org instanceof medicalOrganization)
                {
                    morg=true;
                }

            }
            if(corg==true && type.equals(Organization.OrganizationType.CDCOrg))
            {
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(morg==true && type.equals(Organization.OrganizationType.MedicalOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }

        }
        //

        if(enterprise instanceof Manufacturer)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof ManufactureOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }
        }
        if(enterprise instanceof Distributor)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }

        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof LHDImmuneOrganization)
                {
                    JOptionPane.showMessageDialog(null, "Department Exists!");
                    return;
                }
            }
        }
        boolean hospOrg=false;
        boolean patientOrg=false;
        if( enterprise instanceof HospitalEnterprise)
        {
            String satClinicName = txt1.getText();

            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof HospitalOrganization)
                {
                    hospOrg=true;
                }
                if(org instanceof PatientOrganization)
                {
                    patientOrg=true;
                }

            }
            if(hospOrg==true && type.equals(Organization.OrganizationType.HospitalOrg))
            {
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(patientOrg==true && type.equals(Organization.OrganizationType.PatientOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
                return;
            }
            else if(type.equals(Organization.OrganizationType.ClinicOrganization))
            {
                ClinicOrganization satOrg = (ClinicOrganization)enterprise.getOrganizationDirectory().createOrganization(type);
                satOrg.setClincName(satClinicName);
                populateTable();
                return;
            }

        }

        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();

    }//GEN-LAST:event_btn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox cborglist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTable tblorg;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
