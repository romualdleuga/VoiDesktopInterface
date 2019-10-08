/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leuga_voidesktopinterface;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;

/**
 *
 * @author MacbookPro
 */
public class HomeScreen extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
    public HomeScreen() {
        initComponents();       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VehiclesOfInterestPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("VehiclesOfInterestPU").createEntityManager();
        reasonForInterestQuery = java.beans.Beans.isDesignTime() ? null : VehiclesOfInterestPUEntityManager.createQuery("SELECT r FROM ReasonForInterest r");
        reasonForInterestList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reasonForInterestQuery.getResultList();
        reasonForInterestQuery1 = java.beans.Beans.isDesignTime() ? null : VehiclesOfInterestPUEntityManager.createQuery("SELECT r FROM ReasonForInterest r");
        reasonForInterestList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reasonForInterestQuery1.getResultList();
        jTextSearch = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLaHelp = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPtableContainer = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVOIData = new javax.swing.JTable();
        jBtAddVoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                OnWindownGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWindowOpen(evt);
            }
        });

        jTextSearch.setText("Search VOI...");
        jTextSearch.setToolTipText("Enter the License Plate and hit enter");
        jTextSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                onKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Maryland");

        jLabel2.setText("Vehicle Of Interest");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Home");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onHomePressed(evt);
            }
        });

        jLaHelp.setText("Help");
        jLaHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onHelpPressed(evt);
            }
        });

        javax.swing.GroupLayout jPtableContainerLayout = new javax.swing.GroupLayout(jPtableContainer);
        jPtableContainer.setLayout(jPtableContainerLayout);
        jPtableContainerLayout.setHorizontalGroup(
            jPtableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPtableContainerLayout.setVerticalGroup(
            jPtableContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jTableVOIData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate", "Reason", "Make", "Model", "Year", "Color", "Owner Info", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVOIData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onRowClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVOIData);

        jBtAddVoi.setText("Add VOI");
        jBtAddVoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtAddVoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel3)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLaHelp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(456, 456, 456)
                                .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPtableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtAddVoi)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLaHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPtableContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtAddVoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtAddVoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtAddVoiActionPerformed
        // TODO add your handling code here:
        AddVehicleScreen addVehicle = new AddVehicleScreen();
        addVehicle.setVisible(true);
    }//GEN-LAST:event_jBtAddVoiActionPerformed

    private void onWindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowOpen
        // TODO add your handling code here:
        String[][] voiList = voi.allVehicleOfInterest();
        this.loadTable(voiList);
    }//GEN-LAST:event_onWindowOpen
    private void loadTable(String[][] voiList){
        DefaultTableModel dModel = (DefaultTableModel)jTableVOIData.getModel();
        for(int i= dModel.getRowCount()-1; i>=0;i--){
            dModel.removeRow(i);
        }
//        System.out.println("The length is"+voiList.length);
        for(int j=0; j<voiList.length;j++){
            String[] row = new String[8];
            row[0] = voiList[j][0];
            row[1] = voiList[j][1];
            row[2] = voiList[j][2];
            row[3] = voiList[j][3];
            row[4] = voiList[j][4];
            row[5] = voiList[j][5];
            row[6] = voiList[j][6];
            row[7] = voiList[j][7];
            dModel.addRow(row);
        }
    }
    private void onRowClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onRowClicked
        // TODO add your handling code here:
        //System.out.println("Event is" + evt);
        int row = jTableVOIData.getSelectedRow();
        System.out.println(jTableVOIData.getModel().getValueAt(row, 1).toString());
        EditVehicleOfInterrest editVehicle = new EditVehicleOfInterrest(
                
        jTableVOIData.getModel().getValueAt(row, 1).toString(),
        jTableVOIData.getModel().getValueAt(row, 0).toString(),
        jTableVOIData.getModel().getValueAt(row, 2).toString(),
        jTableVOIData.getModel().getValueAt(row, 3).toString(),
        jTableVOIData.getModel().getValueAt(row, 5).toString(),
        jTableVOIData.getModel().getValueAt(row, 4).toString(),
        jTableVOIData.getModel().getValueAt(row, 6).toString(),
        jTableVOIData.getModel().getValueAt(row, 7).toString());
        editVehicle.setVisible(true);
        //editVehicle.show();
    }//GEN-LAST:event_onRowClicked

    private void OnWindownGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnWindownGainedFocus
        // TODO add your handling code here:
        this.onWindowOpen(evt);
        
    }//GEN-LAST:event_OnWindownGainedFocus

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void onKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_onKeyTyped
        // TODO add your handling code here:
        String[][] tableDate = voi.getVehicleOfInterestByLicensePlate(jTextSearch.getText());
        if(tableDate.length>0){
            this.loadTable(tableDate);
        }
    }//GEN-LAST:event_onKeyTyped

    private void onHomePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHomePressed
        // TODO add your handling code here:
        java.awt.event.WindowEvent event = null;
        this.onWindowOpen(event);
        
    }//GEN-LAST:event_onHomePressed

    private void onHelpPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onHelpPressed
        // TODO add your handling code here:
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_onHelpPressed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }
    private VehicleOfInterestController voi = new VehicleOfInterestController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager VehiclesOfInterestPUEntityManager;
    private javax.swing.JButton jBtAddVoi;
    private javax.swing.JLabel jLaHelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPtableContainer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableVOIData;
    private javax.swing.JTextField jTextSearch;
    private java.util.List<leuga_voidesktopinterface.ReasonForInterest> reasonForInterestList;
    private java.util.List<leuga_voidesktopinterface.ReasonForInterest> reasonForInterestList1;
    private javax.persistence.Query reasonForInterestQuery;
    private javax.persistence.Query reasonForInterestQuery1;
    // End of variables declaration//GEN-END:variables
}
