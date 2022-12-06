/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CDC;

import Business.EcoSystem;
import Business.NationalEnterprise.CDC;
import Business.Organization.CDCOrganization;
import Business.Organization.medicalOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author darsh
 */
public class MedicalOfficerNewJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    private CDC cdcEnterprise;
    private medicalOrganization mo;
    private CDC cdc;
    private CDCOrganization cdcOrg; 
    
    /**
     * Creates new form MedicalOfficerNewJPanel
     */
    public MedicalOfficerNewJPanel(JPanel userProcessContainer, UserAccount userAccount,EcoSystem business,CDC cdcEnterprise,medicalOrganization mo ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.mo = mo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workContainer = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        btnviewdistribtn = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBackground(new java.awt.Color(204, 204, 255));
        jSplitPane1.setDividerLocation(180);

        workContainer.setBackground(new java.awt.Color(204, 204, 255));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(255, 255, 204));

        btnviewdistribtn.setBackground(new java.awt.Color(0, 0, 102));
        btnviewdistribtn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnviewdistribtn.setForeground(new java.awt.Color(255, 255, 255));
        btnviewdistribtn.setText("View Vaccine Data");
        btnviewdistribtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnviewdistribtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewdistribtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnviewdistribtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnviewdistribtn)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewdistribtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewdistribtnActionPerformed
        // TODO add your handling code here:
        VaccineStateDistributionJPanel panel = new VaccineStateDistributionJPanel(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("VaccineStateDistributionJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnviewdistribtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnviewdistribtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}
