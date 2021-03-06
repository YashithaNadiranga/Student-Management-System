/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import lk.ijse.gdse53.stm.controller.ManageStudentFormController;
import lk.ijse.gdse53.stm.model.Student;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ManageStudentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     */
    String ssid;
    String privilege;

    public ManageStudentForm(String privilege) {
        initComponents();
        setBorder();
        setSid();
        loadAllDetail();
        this.privilege = privilege;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addstudentpnl = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btnupdate = new keeptoo.KButton();
        btndelete = new keeptoo.KButton();
        btnback = new keeptoo.KButton();

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);

        addstudentpnl.setBackground(new java.awt.Color(53, 63, 89));
        addstudentpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 63, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manage Student");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtSid.setEditable(false);
        txtSid.setBackground(new java.awt.Color(53, 63, 89));
        txtSid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSid.setForeground(new java.awt.Color(255, 255, 255));
        txtSid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 880, 30));

        txtdob.setBackground(new java.awt.Color(53, 63, 89));
        txtdob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdob.setForeground(new java.awt.Color(255, 255, 255));
        txtdob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 880, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name   :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        txtAddress.setBackground(new java.awt.Color(53, 63, 89));
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setRows(5);
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(txtAddress);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 880, 120));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SID     :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("D.O.B   :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Age      :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        txtAge.setBackground(new java.awt.Color(53, 63, 89));
        txtAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAge.setForeground(new java.awt.Color(255, 255, 255));
        txtAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 880, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC      :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 20));

        txtNic.setBackground(new java.awt.Color(53, 63, 89));
        txtNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNic.setForeground(new java.awt.Color(255, 255, 255));
        txtNic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 880, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        txtContact2.setBackground(new java.awt.Color(53, 63, 89));
        txtContact2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact2.setForeground(new java.awt.Color(255, 255, 255));
        txtContact2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 390, 30));

        txtContact1.setBackground(new java.awt.Color(53, 63, 89));
        txtContact1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContact1.setForeground(new java.awt.Color(255, 255, 255));
        txtContact1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 390, 30));

        txtname.setBackground(new java.awt.Color(53, 63, 89));
        txtname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        txtname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 880, 30));

        btnupdate.setText("Update");
        btnupdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnupdate.setkAllowGradient(false);
        btnupdate.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnupdate.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnupdate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 680, 170, -1));

        btndelete.setText("Delete");
        btndelete.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndelete.setkAllowGradient(false);
        btndelete.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btndelete.setkHoverColor(new java.awt.Color(9, 135, 62));
        btndelete.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 680, 170, -1));

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_back_to_40px.png"))); // NOI18N
        btnback.setIconTextGap(20);
        btnback.setkAllowGradient(false);
        btnback.setkBackGroundColor(new java.awt.Color(53, 63, 89));
        btnback.setkHoverColor(new java.awt.Color(53, 63, 89));
        btnback.setkPressedColor(new java.awt.Color(53, 63, 89));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 35, 80, 60));

        addstudentpnl.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 795));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addstudentpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addstudentpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Please Note That!\n\n"
                + "if you update student, change this student details\n"
                + "please consider that!\n\n"
                + "Are you sure want to update?");
        if (showConfirmDialog == 0) {
            if (checkValidation()) {
                Student s1 = new Student(
                        txtSid.getText(),
                        txtname.getText(),
                        txtdob.getText(),
                        Integer.parseInt(txtAge.getText()),
                        txtNic.getText(),
                        txtContact1.getText(),
                        txtContact2.getText(),
                        txtAddress.getText()
                );

                try {
                    boolean b1 = new ManageStudentFormController().updateStudent(s1);
                    if (b1) {
                        JOptionPane.showMessageDialog(this, "Successfuly updated ");
                    } else {
                        JOptionPane.showMessageDialog(this, "oops ! something went wrong");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ManageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Please Note That!\n\n"
                    + "if you delete student, delete all this student data\n"
                    + "please consider that!\n\n"
                    + "Are you sure want to delete?");
            if (showConfirmDialog == 0) {
                try {

                    if (new ManageStudentFormController().deleteStudent(ssid)) {
                        JOptionPane.showMessageDialog(this, "Successfuly deleted");
                        txtSid.setText("");
                        txtname.setText("");
                        txtdob.setText("");
                        txtAge.setText("");
                        txtNic.setText("");
                        txtContact1.setText("");
                        txtContact2.setText("");
                        txtAddress.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "oops ! something went wrong");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(ManageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
//        addstudentpnl.removeAll();
//        addstudentpnl.repaint();
//        addstudentpnl.setLayout(new FlowLayout());
//        addstudentpnl.add(new ViewStudentForm()).setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addstudentpnl;
    private keeptoo.KButton btnback;
    private keeptoo.KButton btndelete;
    private keeptoo.KButton btnupdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact1;
    private javax.swing.JTextField txtContact2;
    private javax.swing.JTextField txtNic;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables

    private void setSid() {
        this.ssid = ViewStudentForm.ssid;
    }

    private void loadAllDetail() {
        try {
            Student list = new ManageStudentFormController().loadAll(ssid);
            txtSid.setText(list.getSid());
            txtname.setText(list.getName());
            txtdob.setText(list.getDob());
            txtAge.setText(String.valueOf(list.getAge()));
            txtNic.setText(list.getNic());
            txtContact1.setText(list.getTel1());
            txtContact2.setText(list.getTel2());
            txtAddress.setText(list.getAddress());

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setBorder() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    private boolean checkValidation() {
        if (!"".equals(txtSid.getText())) {
            if (!"".equals(txtname.getText())) {
                if (!"".equals(txtAge.getText())) {
                    if (!"".equals(txtNic.getText())) {
                        if (!"".equals(txtContact1.getText())) {
                            if (!"".equals(txtAddress.getText())) {
                                if (txtContact1.getText().matches("[0-9]*")) {
                                    if (txtAge.getText().matches("[0-9]*")) {
                                        if (txtContact1.getText().length() == 10) {
                                            if (Integer.parseInt(txtAge.getText()) > 10 & Integer.parseInt(txtAge.getText()) < 50) {
                                                if (!Pattern.matches("[0-9]*", txtname.getText())) {
                                                    return true;
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "This name is not valid");
                                                    return false;
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "This age is not valid");
                                                return false;
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "This phone number is not valid");
                                            return false;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "This age is not valid");
                                        return false;
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "This phone number is not valid");
                                    return false;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Please add student address");
                                return false;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please add student contact number");
                            return false;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Please add student NIC");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please add student age");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please add student name");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please add student ID");
            return false;
        }
    }

    private boolean checkprivilege() {
        try {
            switch (privilege) {
                case "SC":
                    JOptionPane.showMessageDialog(null, "Access Denied - You don't have permission to access");
                    return false;
                case "EC":
                    JOptionPane.showMessageDialog(null, "Access Denied - You don't have permission to access");
                    return false;
                default:
                    return true;
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Access Denied - You don't have permission to access");
            return false;
        }
    }

}
