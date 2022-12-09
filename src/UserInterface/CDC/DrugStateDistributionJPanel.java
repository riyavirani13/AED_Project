/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CDC;

import Business.EcoSystem;
import Business.NationalEnterprise.CDC;
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
public class DrugStateDistributionJPanel extends javax.swing.JPanel {

    private final JPanel workContainer;
    private final UserAccount userAccount;
    private final EcoSystem business;
    private final CDC cdcEnterprise;
    private final CDCOrganization cdcOrg;
    /**
     * Creates new form VaccineStateDistributionJPanel
     * @param workContainer
     * @param userAccount
     * @param business
     * @param cdcEnterprise
     * @param cdcOrg
     */
    public DrugStateDistributionJPanel(JPanel workContainer, UserAccount userAccount,EcoSystem business,CDC cdcEnterprise,CDCOrganization cdcOrg) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        populateTable();
  
    }
    
    
    private void populateTable(){
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tbldetails.getModel();
        defaulttabelmodel.setRowCount(0);
        if(business.getStateList() != null)
        {
            for(StateNetwork state: business.getStateList())
            {
                Object[] row = new Object[2];
               row[0] = state;
               row[1] = state.getTotalVaccinesDistributedInState();            
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldetails = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        btnViewChart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 102));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Statewise Drug Distribution");

        tbldetails.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tbldetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "State", "Total Drugs Distributed"
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

        btnDetails.setBackground(new java.awt.Color(0, 0, 102));
        btnDetails.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnDetails.setText("View Details");
        btnDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });

        btnViewChart.setBackground(new java.awt.Color(0, 0, 102));
        btnViewChart.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnViewChart.setForeground(new java.awt.Color(255, 255, 255));
        btnViewChart.setText("View Chart");
        btnViewChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewChartActionPerformed(evt);
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
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewChart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetails)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewChart)
                    .addComponent(btnDetails))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbldetails.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select a State");
            return;
        }
        StateNetwork state = (StateNetwork)tbldetails.getValueAt(selectedRow, 0);
        DrugCityDistributionJPanel panel = new DrugCityDistributionJPanel(workContainer,userAccount, business, cdcEnterprise, cdcOrg, state);
        workContainer.add("VaccineCityDistributionJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);

    }//GEN-LAST:event_btnDetailsActionPerformed

    private void btnViewChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewChartActionPerformed
        // TODO add your handling code here:

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for(StateNetwork state: business.getStateList())
        {
            pieDataset.setValue(state.getStateName(), state.getTotalVaccinesDistributedInState());

        }
        JFreeChart chart = ChartFactory.createPieChart3D("Total Vaccines Distributed", pieDataset,true, true, true);
        PiePlot3D p = (PiePlot3D)chart.getPlot();
        ChartFrame frame = new ChartFrame("Total Vaccines Distributed",chart);
        frame.setVisible(true);
        frame.setSize(450,500);

    }//GEN-LAST:event_btnViewChartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnViewChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tbldetails;
    // End of variables declaration//GEN-END:variables
}