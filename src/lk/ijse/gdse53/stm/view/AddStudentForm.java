package lk.ijse.gdse53.stm.view;

import cambodia.raven.DateChooser;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import jssc.SerialPortException;
import lk.ijse.gdse53.stm.controller.AddStudentFormController;
import lk.ijse.gdse53.stm.model.Student;

/**
 *
 * @author Yashitha Nadiranga
 */
public class AddStudentForm extends javax.swing.JInternalFrame {

    public AddStudentForm() {
        initComponents();
        setBorder();
        addSid();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datepicker = new cambodia.raven.DateChooser();
        addstudentpnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        btnselect = new keeptoo.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtContact2 = new javax.swing.JTextField();
        txtContact1 = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btnsubmit = new keeptoo.KButton();
        btnagegenerate = new keeptoo.KButton();

        datepicker.setButton(btnselect);
        datepicker.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        datepicker.setTextRefernce(txtdob);

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addstudentpnl.setBackground(new java.awt.Color(53, 63, 89));
        addstudentpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Student");
        addstudentpnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(53, 63, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add Student");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtSid.setBackground(new java.awt.Color(53, 63, 89));
        txtSid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSid.setForeground(new java.awt.Color(255, 255, 255));
        txtSid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 880, 30));

        txtdob.setBackground(new java.awt.Color(53, 63, 89));
        txtdob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdob.setForeground(new java.awt.Color(255, 255, 255));
        txtdob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 720, 30));

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

        btnselect.setText("Select");
        btnselect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnselect.setkAllowGradient(false);
        btnselect.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnselect.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnselect.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectActionPerformed(evt);
            }
        });
        jPanel2.add(btnselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, 140, 30));

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
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 720, 30));

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

        btnsubmit.setText("Submit");
        btnsubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsubmit.setkAllowGradient(false);
        btnsubmit.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnsubmit.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnsubmit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 990, -1));

        btnagegenerate.setText("Generate Age");
        btnagegenerate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnagegenerate.setkAllowGradient(false);
        btnagegenerate.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnagegenerate.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnagegenerate.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnagegenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagegenerateActionPerformed(evt);
            }
        });
        jPanel2.add(btnagegenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, 140, 30));

        addstudentpnl.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 795));

        getContentPane().add(addstudentpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 795));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectActionPerformed
        //This Button get select Date of birth
    }//GEN-LAST:event_btnselectActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String dob = datepicker.getSelectedDate(DateChooser.GET_YEAR) + "-"
                + datepicker.getSelectedDate(DateChooser.GET_MONTH)
                + "-" + datepicker.getSelectedDate(DateChooser.GET_DAY);
        if (checkValidation()) {
            try {
                Student s1 = new Student(
                        txtSid.getText(),
                        txtname.getText(),
                        dob,
                        Integer.parseInt(txtAge.getText()),
                        txtNic.getText(),
                        txtContact1.getText(),
                        txtContact2.getText(),
                        txtAddress.getText()
                );

                if (new AddStudentFormController().uploadStudentDetails(s1)) {
                    addstudentpnl.setLayout(new FlowLayout());
                    addstudentpnl.removeAll();
                    addstudentpnl.repaint();
                    addstudentpnl.add(new RegisterStudentForm()).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(this, "Ooops! Something went wrong");
                }

            } catch (ClassNotFoundException | SQLException | NumberFormatException | SerialPortException ex) {
                Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnagegenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagegenerateActionPerformed
        generateAge();
    }//GEN-LAST:event_btnagegenerateActionPerformed

    public void generateAge() {
        int a = Integer.parseInt(datepicker.getSelectedDate(DateChooser.GET_YEAR));
        int b = Integer.parseInt(datepicker.getSelectedDate(DateChooser.GET_MONTH));
        int c = Integer.parseInt(datepicker.getSelectedDate(DateChooser.GET_DAY));

        LocalDate pdate = LocalDate.of(a, b, c);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(pdate, now);
        txtAge.setText(String.valueOf(diff.getYears()));

    }

    private void addSid() {
        try {
            String sid = new AddStudentFormController().getSid();
            sid = sid.replaceAll("S", "");
            int id = Integer.parseInt(sid);
            id = ++id;
            if (id < 10) {
                txtSid.setText(String.valueOf("S00" + id));

            } else if (id < 100) {
                txtSid.setText(String.valueOf("S0" + id));
            } else {
                txtSid.setText(String.valueOf("S" + id));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
                                                if(Pattern.matches("[a-zA-Z ]*", txtname.getText())){
                                                    return true;
                                                }else{
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addstudentpnl;
    private keeptoo.KButton btnagegenerate;
    private keeptoo.KButton btnselect;
    private keeptoo.KButton btnsubmit;
    private cambodia.raven.DateChooser datepicker;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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

    private void setBorder() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

}
