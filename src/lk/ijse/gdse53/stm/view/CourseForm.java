/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.view;

import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse53.stm.controller.CourseFormController;
import lk.ijse.gdse53.stm.model.Course;

/**
 *
 * @author Yashitha Nadiranga
 */
public class CourseForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     */
    String privilege;

    public CourseForm(String Privilege) {
        initComponents();
        setUI();
        getCourseCount();
        loadTable();
        this.privilege = Privilege;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalCourse = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCname = new javax.swing.JTextField();
        txtCid = new javax.swing.JTextField();
        btnsubmit = new keeptoo.KButton();
        btndelete = new keeptoo.KButton();
        btnupdate = new keeptoo.KButton();
        txtfee = new javax.swing.JTextField();

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(53, 63, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setBackground(new java.awt.Color(53, 63, 89));
        kGradientPanel1.setkBorderRadius(20);
        kGradientPanel1.setkEndColor(new java.awt.Color(11, 182, 83));
        kGradientPanel1.setkStartColor(new java.awt.Color(11, 182, 83));

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Courses");

        lblTotalCourse.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblTotalCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCourse.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTotalCourse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblTotalCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 150, 91));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        tblCourse.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course Name", "Course Fee"
            }
        ));
        tblCourse.setGridColor(new java.awt.Color(204, 204, 204));
        tblCourse.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblCourse.setRowHeight(25);
        tblCourse.setSelectionBackground(new java.awt.Color(101, 52, 172));
        tblCourse.setShowVerticalLines(false);
        tblCourse.getTableHeader().setReorderingAllowed(false);
        tblCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCourseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 1050, 130));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course Fee    :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Course ID     :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Course Name :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        txtCname.setBackground(new java.awt.Color(53, 63, 89));
        txtCname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCname.setForeground(new java.awt.Color(255, 255, 255));
        txtCname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtCname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 880, 30));

        txtCid.setBackground(new java.awt.Color(53, 63, 89));
        txtCid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCid.setForeground(new java.awt.Color(255, 255, 255));
        txtCid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtCid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 880, 30));

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
        jPanel1.add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 1020, -1));

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
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 690, 180, 40));

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
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 690, 180, 40));

        txtfee.setBackground(new java.awt.Color(53, 63, 89));
        txtfee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtfee.setForeground(new java.awt.Color(255, 255, 255));
        txtfee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 880, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1115, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        uploadCourse();

    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteCourse();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateCourse();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        int selectedRow = tblCourse.getSelectedRow();
        txtCid.setText(tblCourse.getValueAt(selectedRow, 0).toString());
        txtCname.setText(tblCourse.getValueAt(selectedRow, 1).toString());
        String x = tblCourse.getValueAt(selectedRow, 2).toString();
        double d = Double.parseDouble(x);
        int c = (int) d;
        txtfee.setText(String.valueOf(c));
        txtCid.setEditable(false);
    }//GEN-LAST:event_tblCourseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btndelete;
    private keeptoo.KButton btnsubmit;
    private keeptoo.KButton btnupdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTotalCourse;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCname;
    private javax.swing.JTextField txtfee;
    // End of variables declaration//GEN-END:variables

    private void getCourseCount() {
        try {
            int count = new CourseFormController().getCount();
            lblTotalCourse.setText(String.valueOf(count));

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTable() {
        try {
            List<Course> list = new CourseFormController().loadTable();
            DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
            model.setRowCount(0);
            list.forEach((course) -> {
                model.addRow(new Object[]{course.getCid(), course.getCname(), course.getCfee()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void uploadCourse() {
        if (checkCID()) {
            if (checkValidation()) {
                try {
                    Course c1 = new Course(
                            txtCid.getText(),
                            txtCname.getText(),
                            txtfee.getText()
                    );

                    if (new CourseFormController().uploadCourse(c1)) {
                        JOptionPane.showMessageDialog(null, "Course Saved");
                        loadTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Course error");
                    }

                } catch (ClassNotFoundException | NullPointerException | SQLException ex) {
                    Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void setUI() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        tblCourse.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblCourse.getTableHeader().setOpaque(false);
        tblCourse.getTableHeader().setBackground(new Color(32, 136, 203));
        tblCourse.getTableHeader().setForeground(new Color(255, 255, 255));
        tblCourse.getTableHeader().setBorder(new LineBorder(Color.white));
        tblCourse.setRowHeight(30);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
    }

    private boolean checkValidation() {
        if (!"".equals(txtCid.getText())) {
            if (!"".equals(txtCname.getText())) {
                if (!"".equals(txtfee.getText())) {
                    if (txtfee.getText().matches("[0-9]*")) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Course fee not valid. enter like 5000");
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter Cource Fee");
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter Cource Name");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Cource ID");
            return false;
        }
    }

    private void updateCourse() {
        if (checkprivilege()) {
            if (checkValidation()) {
                int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure want to Update?");
                if (showConfirmDialog == 0) {
                    try {
                        Course c2 = new Course(
                                txtCid.getText(),
                                txtCname.getText(),
                                txtfee.getText()
                        );

                        if (new CourseFormController().updateCourse(c2)) {
                            JOptionPane.showMessageDialog(null, "Course Succesfully updated");
                            txtCid.setText("");
                            txtCname.setText("");
                            txtfee.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Something went wrong");
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private boolean checkprivilege() {
        try {
            System.out.println(privilege);
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

    private void deleteCourse() {
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Please Note That!\n\n"
                    + "if you delete batch, delete All data for student registration\n"
                    + "please consider that!\n\n"
                    + "Are you sure want to delete?");
            if (showConfirmDialog == 0) {
                try {
                    String cid = txtCid.getText();
                    if (new CourseFormController().deleteCourse(cid)) {
                        JOptionPane.showMessageDialog(null, "Course Succesfully deleted");
                        txtCid.setText("");
                        txtCname.setText("");
                        txtfee.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Something went wrong");
                    }
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private boolean checkCID() {
        try {

            ResultSet rs = new CourseFormController().checkCid();
            while (rs.next()) {
                if (rs.getString(1).equals(txtCid.getText())) {
                    JOptionPane.showMessageDialog(null, "Duplicate ID. please set another ID");
                    return false;
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
