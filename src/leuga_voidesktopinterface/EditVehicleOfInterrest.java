/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leuga_voidesktopinterface;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;

/**
 *
 * @author MacbookPro
 */
public class EditVehicleOfInterrest extends javax.swing.JFrame {

    /**
     * Creates new form EditVehicleOfInterrest
     */
    public EditVehicleOfInterrest() {
        initComponents();
        deleteVehicle = new DeleteVehicle(parent, modal, jTfLicensePlate.getText());
    }
    public EditVehicleOfInterrest(String reason, String licensePlate,String make, String model, String color, String year, String fullName,
                                    String phone) {
        initComponents();
        onWindowsOpen();
        jCbReasonOfInterest.setSelectedItem(reason);
        jCbModel.setSelectedItem(model);
        jCbMake.setSelectedItem(make);
        jTColor.setText(color);
        jTfYear.setText(year);
        jTfOwnerName.setText(fullName);
        jTfPhone.setText(phone);
        jTfLicensePlate.setText(licensePlate);
        deleteVehicle = new DeleteVehicle(parent, modal, jTfLicensePlate.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLaReason = new javax.swing.JLabel();
        jLaDescription = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLaTitle = new javax.swing.JLabel();
        jTfDescription = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTfLicensePlate = new javax.swing.JTextField();
        jTColor = new javax.swing.JTextField();
        jLaColor = new javax.swing.JLabel();
        jLaMake = new javax.swing.JLabel();
        jLaYear = new javax.swing.JLabel();
        jLaLicensePlate = new javax.swing.JLabel();
        jLaModel = new javax.swing.JLabel();
        jTfYear = new javax.swing.JTextField();
        jCbMake = new javax.swing.JComboBox<>();
        jCbModel = new javax.swing.JComboBox<>();
        jPaOwnerInfo = new javax.swing.JPanel();
        jTfOwnerName = new javax.swing.JTextField();
        jLaFullName = new javax.swing.JLabel();
        jLaPhone = new javax.swing.JLabel();
        jTfPhone = new javax.swing.JTextField();
        jCbReasonOfInterest = new javax.swing.JComboBox<>();
        jBtUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jBtSave1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                OnWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(21, 21, 21))
        );

        jLaReason.setText("Reason");

        jLaDescription.setText("Description");

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        jLaTitle.setText("Edit Vehicle Of Interest");

        jTfDescription.setEditable(false);
        jTfDescription.setText("Description");
        jTfDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfDescriptionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicule Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153, 153, 153))); // NOI18N

        jTfLicensePlate.setText("License Plate");
        jTfLicensePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfLicensePlateActionPerformed(evt);
            }
        });

        jTColor.setText("Color");

        jLaColor.setText("Color");

        jLaMake.setText("Make");

        jLaYear.setText("Year");

        jLaLicensePlate.setText("License Plate");

        jLaModel.setText("Model");

        jTfYear.setText("Year");
        jTfYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfYearActionPerformed(evt);
            }
        });

        jCbMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCbModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbModelonMakeSelected(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaLicensePlate)
                    .addComponent(jLaModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfLicensePlate, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jCbModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaMake)
                    .addComponent(jLaYear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTfYear)
                    .addComponent(jCbMake, 0, 191, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addComponent(jLaColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTColor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaColor)
                    .addComponent(jLaMake)
                    .addComponent(jLaLicensePlate)
                    .addComponent(jCbMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLaYear)
                            .addComponent(jLaModel)
                            .addComponent(jTfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCbModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPaOwnerInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Owner Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(153, 153, 153))); // NOI18N

        jTfOwnerName.setText("First Name");

        jLaFullName.setText("Full Name");

        jLaPhone.setText("Phone");

        jTfPhone.setText("Phone");
        jTfPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfPhoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaOwnerInfoLayout = new javax.swing.GroupLayout(jPaOwnerInfo);
        jPaOwnerInfo.setLayout(jPaOwnerInfoLayout);
        jPaOwnerInfoLayout.setHorizontalGroup(
            jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaOwnerInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLaFullName)
                    .addComponent(jLaPhone))
                .addGap(28, 28, 28)
                .addGroup(jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTfOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPaOwnerInfoLayout.setVerticalGroup(
            jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaOwnerInfoLayout.createSequentialGroup()
                .addGroup(jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTfOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaFullName))
                .addGap(18, 18, 18)
                .addGroup(jPaOwnerInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaPhone)
                    .addComponent(jTfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jCbReasonOfInterest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reason Of Interest", "Item 2", "Item 3", "Item 4" }));
        jCbReasonOfInterest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbReasonOfInterestActionPerformed(evt);
                jCbReasonOfInterestOnItemSelected(evt);
            }
        });

        jBtUpdate.setBackground(new java.awt.Color(102, 204, 255));
        jBtUpdate.setForeground(new java.awt.Color(0, 102, 255));
        jBtUpdate.setText("Update");
        jBtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jBtSave1.setBackground(new java.awt.Color(102, 204, 255));
        jBtSave1.setForeground(new java.awt.Color(204, 0, 0));
        jBtSave1.setText("Delete");
        jBtSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtSave1)
                .addGap(2, 2, 2)
                .addComponent(jBtUpdate)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLaReason)
                                .addGap(42, 42, 42)
                                .addComponent(jCbReasonOfInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLaDescription)
                                .addGap(18, 18, 18)
                                .addComponent(jTfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(279, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPaOwnerInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLaTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbReasonOfInterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLaReason))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaDescription)
                    .addComponent(jTfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPaOwnerInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(jBtUpdate)
                    .addComponent(jBtSave1))
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfDescriptionActionPerformed

    private void jTfLicensePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfLicensePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfLicensePlateActionPerformed

    private void jTfYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfYearActionPerformed

    private void jCbModelonMakeSelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbModelonMakeSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbModelonMakeSelected

    private void jTfPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfPhoneActionPerformed

    private void jCbReasonOfInterestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbReasonOfInterestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbReasonOfInterestActionPerformed

    private void jCbReasonOfInterestOnItemSelected(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbReasonOfInterestOnItemSelected
        // TODO add your handling code here:
        if(jCbReasonOfInterest.getSelectedItem()!=null){
            String[] description = voi.getDescriptionByReason((String)jCbReasonOfInterest.getSelectedItem());
            jTfDescription.setText(description[0]);
        }

    }//GEN-LAST:event_jCbReasonOfInterestOnItemSelected

    private void jBtUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtUpdateActionPerformed
        System.out.println("try this out"+ jTfLicensePlate.getText());
        if(jCbReasonOfInterest.getSelectedItem()==null || jTfLicensePlate.getText().isEmpty()
                || jCbMake.getSelectedItem()==null || jTColor.getText().isEmpty() || jCbModel.getSelectedItem()==null
                || jTfYear.getText().isEmpty() || jTfOwnerName.getText().isEmpty() || jTfPhone.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "All Field are required");
        //JOptionPane.showMessageDialog(this, "All Field are required");
        }
        else{
        try{
            voi.updateVehicleOfInterest(jTfLicensePlate.getText(), (String)jCbReasonOfInterest.getSelectedItem(), (String)jCbMake.getSelectedItem(), (String)jCbModel.getSelectedItem(), 
                     jTfYear.getText(), jTColor.getText(), jTfOwnerName.getText(), jTfPhone.getText());
            JOptionPane.showMessageDialog(this, "Success: Vehicule Of Interest has been updated!");
            setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error:" + e.getMessage());
        }
        
       }
    }//GEN-LAST:event_jBtUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jBtDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtDeleteActionPerformed
        // TODO add your handling code here:
        deleteVehicle.setVisible(true);
        
    }//GEN-LAST:event_jBtDeleteActionPerformed

    private void OnWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnWindowGainedFocus
        // TODO add your handling code here:
        String lcensePlate = deleteVehicle.getJLaLicensePlateData();
        if(lcensePlate==null){
            setVisible(false);
        }
    }//GEN-LAST:event_OnWindowGainedFocus
    private void onWindowsOpen(){
       jCbReasonOfInterest.removeAllItems();
        jCbMake.removeAllItems();
        jCbModel.removeAllItems();
        String[] reasonOfInterest = voi.allReasonsForInterestKey();
        for(int i = 0; i< reasonOfInterest.length; i++){
            jCbReasonOfInterest.addItem(reasonOfInterest[i]);
        }
        String [] makeList = voi.allVehicleMakeKey();
        for (int j=0; j<makeList.length; j++){
            jCbMake.addItem(makeList[j]);
        }
        String[] modelArr = voi.allVehicleModelKey();
        for (int k=0;k<modelArr.length; k++){
             jCbModel.addItem(modelArr[k]);

         } 
    }
    
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
            java.util.logging.Logger.getLogger(EditVehicleOfInterrest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVehicleOfInterrest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVehicleOfInterrest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVehicleOfInterrest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditVehicleOfInterrest().setVisible(true);
            }
        });
    }
    java.awt.Frame parent = new java.awt.Frame();
    boolean modal=true; 
    DeleteVehicle deleteVehicle = null;
    VehicleOfInterestController voi = new VehicleOfInterestController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton jBtSave1;
    private javax.swing.JButton jBtUpdate;
    private javax.swing.JComboBox<String> jCbMake;
    private javax.swing.JComboBox<String> jCbModel;
    private javax.swing.JComboBox<String> jCbReasonOfInterest;
    private javax.swing.JLabel jLaColor;
    private javax.swing.JLabel jLaDescription;
    private javax.swing.JLabel jLaFullName;
    private javax.swing.JLabel jLaLicensePlate;
    private javax.swing.JLabel jLaMake;
    private javax.swing.JLabel jLaModel;
    private javax.swing.JLabel jLaPhone;
    private javax.swing.JLabel jLaReason;
    private javax.swing.JLabel jLaTitle;
    private javax.swing.JLabel jLaYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPaOwnerInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTColor;
    private javax.swing.JTextField jTfDescription;
    private javax.swing.JTextField jTfLicensePlate;
    private javax.swing.JTextField jTfOwnerName;
    private javax.swing.JTextField jTfPhone;
    private javax.swing.JTextField jTfYear;
    // End of variables declaration//GEN-END:variables
}
