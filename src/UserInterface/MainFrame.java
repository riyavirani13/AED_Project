/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;


import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.NationalEnterprise.Manufacturer;
import Business.Network.CityNetwork;
import Business.Network.StateNetwork;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author darsh
 */
public class MainFrame extends javax.swing.JFrame {

    
    private final EcoSystem business;
    private final DB4OUtil dB40Util = DB4OUtil.getInstance();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        business = dB40Util.retrieveSystem();
        btnLogoutUser.setEnabled(false);
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
        loginPanel = new javax.swing.JPanel();
        lblWelcomePage = new javax.swing.JLabel();
        lblUsernameField = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPasswordField = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLoginUser = new javax.swing.JButton();
        btnLogoutUser = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl5100 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(210);

        loginPanel.setBackground(new java.awt.Color(255, 255, 204));

        lblWelcomePage.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        lblWelcomePage.setForeground(new java.awt.Color(0, 51, 102));
        lblWelcomePage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomePage.setText("WELCOME");

        lblUsernameField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblUsernameField.setForeground(new java.awt.Color(0, 0, 102));
        lblUsernameField.setText("USERNAME:");

        lblPasswordField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblPasswordField.setForeground(new java.awt.Color(0, 0, 102));
        lblPasswordField.setText("PASSWORD:");

        btnLoginUser.setBackground(new java.awt.Color(0, 0, 102));
        btnLoginUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnLoginUser.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginUser.setText("LOGIN");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });

        btnLogoutUser.setBackground(new java.awt.Color(0, 0, 102));
        btnLogoutUser.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnLogoutUser.setForeground(new java.awt.Color(255, 255, 255));
        btnLogoutUser.setText("LOGOUT");
        btnLogoutUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcomePage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(lblPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword)
                    .addComponent(btnLoginUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogoutUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblWelcomePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(lblUsernameField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPasswordField)
                .addGap(16, 16, 16)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnLoginUser)
                .addGap(18, 18, 18)
                .addComponent(btnLogoutUser)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(loginPanel);

        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DRUG SUPPLY CHAIN SYSTEM");

        lbl5100.setText("INFO 5100 FINAL PROJECT");

        jLabel3.setText("-By");

        jLabel4.setText("DARSHIT SHAH");

        jLabel5.setText("RIYA VIRANI");

        jLabel6.setText("SWINI RODRIGUES");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ceiv.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl5100)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5100)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(61, 61, 61))
        );

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
        // TODO add your handling code here:

        
        String username = txtUsername.getText();
        if(username.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Username can't be blank..!!");
            return;
            
        }
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        if(password.trim().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Password can't be blank..!!");
            return;
            
        }

        Enterprise isEnterprise = null;
        Organization organization = null;
        StateNetwork stateNetwork = null;

        UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(username, password);
        
        if (userAccount == null) {
           
            userAccount = business.getCdc().getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount == null)
            { for(Organization org: business.getCdc().getOrganizationDirectory().getOrganizationList())
            {
                userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount != null)
            {organization = org;
            break;
            }
            }
            }
            if(userAccount != null)
            {isEnterprise = business.getCdc();
                
            }
        }
        if (userAccount == null) {
            for(Manufacturer manufacturer : business.getManufacturerDirectory().getManufacturerDirectory())
            { 
                userAccount = manufacturer.getUserAccountDirectory().authenticateUser(username, password);
                
                if(userAccount == null)
                {
                    for(Organization org: manufacturer.getOrganizationDirectory().getOrganizationList())
                {
                    userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                    if(userAccount != null)
                        break;
                }
                }
                if(userAccount != null)
                { isEnterprise = manufacturer;
                    break;
                }
            }
 
        }if (userAccount == null) {
              
            userAccount = business.getDistributor().getUserAccountDirectory().authenticateUser(username, password);
            if(userAccount == null)
            { for(Organization org: business.getDistributor().getOrganizationDirectory().getOrganizationList())
            { userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                if(userAccount != null)
                {
                    organization = org;
                    break;
                }
            }
            }
            if(userAccount != null)
                isEnterprise = business.getDistributor();

        }if (userAccount == null) {
            for (StateNetwork state : business.getStateList()) {
                if(userAccount==null)
                { userAccount = state.getLocalHealthDepartment().getUserAccountDirectory().authenticateUser(username, password);
                if(userAccount == null)
                {for(Organization org: state.getLocalHealthDepartment().getOrganizationDirectory().getOrganizationList())
                {userAccount = org.getUserAccountDirectory().authenticateUser(username, password);
                    if(userAccount != null)
                    {   stateNetwork = state;
                        organization =org;
                        break;
                    }
                }
                }
                if(userAccount != null)
                {
                    isEnterprise = state.getLocalHealthDepartment();
                    
                }
                if (userAccount == null) {
                    
                  for (CityNetwork city : state.getCityList()) {
                        for (Enterprise hospital : city.getEnterpriseDirectory().getEnterpriseDirectory()) {
                            userAccount = hospital.getUserAccountDirectory().authenticateUser(username, password);
                            if (userAccount == null) {
                                for (Organization o : hospital.getOrganizationDirectory().getOrganizationList()) {
                                    userAccount = o.getUserAccountDirectory().authenticateUser(username, password);

                                    if (userAccount != null) {
                                        stateNetwork = state;
                                        isEnterprise = hospital;
                                        organization = o;
                                        break;

                                    }
                                }
                            }
                            else
                            {  
                               
                                isEnterprise = hospital;
                                break;
                            }
                           
                    if(organization != null)
                    {
                        break;
                    }
                            

                        }
                        if(isEnterprise != null)
                {
                    break;
                }
                    }

                } 
                else {
                    isEnterprise = state.getLocalHealthDepartment();
                    break;
                }

            }
        }
        }
       
        if(userAccount == null)
        {
            JOptionPane.showMessageDialog(null, "Please enter correct credentials..!!");
            
        }
        
        else
        {
           
            CardLayout layout = (CardLayout)container.getLayout();
            container.add("WorkArea", userAccount.getRole().createWorkArea(container, userAccount,isEnterprise, organization, business, stateNetwork));
            layout.next(container);
            
            btnLoginUser.setEnabled(false);
            btnLogoutUser.setEnabled(true);
                    
        }
        
        
    }//GEN-LAST:event_btnLoginUserActionPerformed

    private void btnLogoutUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutUserActionPerformed
        // TODO add your handling code here:
        
        container.removeAll();
        txtUsername.setText(null);
        txtPassword.setText(null);
        
        btnLoginUser.setEnabled(true);
        btnLogoutUser.setEnabled(false);
        
        JPanel blankJP = new JPanel();
        //blankJP.setBackground(new java.awt.Color(102, 153, 255));
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        
        dB40Util.storeSystem(business);
    }//GEN-LAST:event_btnLogoutUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JButton btnLogoutUser;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl5100;
    private javax.swing.JLabel lblPasswordField;
    private javax.swing.JLabel lblUsernameField;
    private javax.swing.JLabel lblWelcomePage;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
