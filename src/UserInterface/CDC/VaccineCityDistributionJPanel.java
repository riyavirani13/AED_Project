/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CDC;

import Business.EcoSystem;
import Business.NationalEnterprise.CDC;
import Business.Network.CityNetwork;
import Business.Network.StateNetwork;
import Business.Organization.CDCOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author darsh
 */
public class VaccineCityDistributionJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final UserAccount userAccount;
    private final EcoSystem business;
    private final CDC cdcEnterprise;
    private final CDCOrganization cdcOrg;
    private final StateNetwork state;
    /**
     * Creates new form VaccineCityDistributionJPanel
     */
    public VaccineCityDistributionJPanel(JPanel workContainer, UserAccount userAccount,EcoSystem business,CDC cdcEnterprise,CDCOrganization cdcOrg,StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        this.state = state;
        txt1.setText(state.getStateName());
        populateTable();
       
    }
    
    
    private void populateTable(){
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tbldetails.getModel();
        defaulttabelmodel.setRowCount(0);
        if(business.getStateList() != null)
        {
            for(CityNetwork city: state.getCityList())
            {
                Object[] row = new Object[2];
               row[0] = city;
               row[1] = city.getTotalVaccinesDistributedInCity();
               
               
               defaulttabelmodel.addRow(row);
            }
            
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

        lbll1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        btn1 = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lbll1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lbll1.setForeground(new java.awt.Color(0, 0, 102));
        lbll1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbll1.setText("Vaccine Distribution in State");

        tbldetails.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "Total Vaccines Distibuted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldetails.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbldetails);

        btn1.setBackground(new java.awt.Color(0, 0, 102));
        btn1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("View Details");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 102));
        lbl2.setText("State:");

        txt1.setEnabled(false);

        btn2.setBackground(new java.awt.Color(0, 0, 102));
        btn2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("View Chart");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 102));
        btn3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("<");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbll1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl2)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbll1)
                .addGap(20, 20, 20)
                .addComponent(btn3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn2)
                    .addComponent(btn1))
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldetails.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a City");
            return;
        }
        CityNetwork city = (CityNetwork)tbldetails.getValueAt(selectedRow, 0);

        VaccineProviderJPanel panel = new VaccineProviderJPanel(workContainer,userAccount, business, cdcEnterprise, cdcOrg, city);
        workContainer.add("VaccineProviderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(CityNetwork city: state.getCityList())
        {
            pieDataset.setValue(city.getName(), city.getTotalVaccinesDistributedInCity());

        }
        JFreeChart chart = ChartFactory.createPieChart3D("Distribution of all vaccines", pieDataset,true, true, true);
        PiePlot3D p = (PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Distribution of all vaccines",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbll1;
    private javax.swing.JTable tbldetails;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
