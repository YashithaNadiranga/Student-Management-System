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
import lk.ijse.gdse53.stm.controller.SubjectFormController;
import lk.ijse.gdse53.stm.model.SCDetail;
import lk.ijse.gdse53.stm.model.Subject;

/**
 *
 * @author Yashitha Nadiranga
 */
public class SubjectForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     */
    String privilege;

    public SubjectForm(String privilege) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        setTableUI();
        setCmbUI();
        getSubjectCount();
        loadTableSubject();
        loadTableCS();
        addSid();
        addCsid();
        addcid();
        addSubjectId();
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

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalSubject = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubject = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSname = new javax.swing.JTextField();
        txtSid = new javax.swing.JTextField();
        btnsubadd = new keeptoo.KButton();
        btndelete = new keeptoo.KButton();
        btnupdate = new keeptoo.KButton();
        jSeparator1 = new javax.swing.JSeparator();
        cmbsemester = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbCID = new javax.swing.JComboBox<>();
        cmbsid = new javax.swing.JComboBox<>();
        txtCsid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCS = new javax.swing.JTable();
        btnsubadd1 = new keeptoo.KButton();
        btnupdatesubject = new keeptoo.KButton();
        btndeletesubject = new keeptoo.KButton();

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
        jLabel2.setText("Total Subjects");

        lblTotalSubject.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblTotalSubject.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalSubject.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lblTotalSubject))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lblTotalSubject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 150, 91));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Subject Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        tblSubject.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject ID", "Subject Name"
            }
        ));
        tblSubject.setGridColor(new java.awt.Color(204, 204, 204));
        tblSubject.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblSubject.setRowHeight(25);
        tblSubject.setSelectionBackground(new java.awt.Color(101, 52, 172));
        tblSubject.setShowVerticalLines(false);
        tblSubject.getTableHeader().setReorderingAllowed(false);
        tblSubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSubject);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 560, 130));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Subject ID     :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subject Name :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtSname.setBackground(new java.awt.Color(53, 63, 89));
        txtSname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSname.setForeground(new java.awt.Color(255, 255, 255));
        txtSname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 250, 30));

        txtSid.setBackground(new java.awt.Color(53, 63, 89));
        txtSid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSid.setForeground(new java.awt.Color(255, 255, 255));
        txtSid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 250, 30));

        btnsubadd.setText("Add ");
        btnsubadd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsubadd.setkAllowGradient(false);
        btnsubadd.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnsubadd.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnsubadd.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnsubadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 100, -1));

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
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 402, 1120, 10));

        cmbsemester.setBackground(new java.awt.Color(53, 63, 89));
        cmbsemester.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbsemester.setForeground(new java.awt.Color(255, 255, 255));
        cmbsemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 st Semester", "2 nd Semester", "3 rd Semester", "4 th Semester" }));
        cmbsemester.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbsemester.setDoubleBuffered(true);
        jPanel1.add(cmbsemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 250, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CSID            :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 130, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Course ID      :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Subject ID     :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, -1, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Semester       :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, 30));

        cmbCID.setBackground(new java.awt.Color(53, 63, 89));
        cmbCID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCID.setForeground(new java.awt.Color(255, 255, 255));
        cmbCID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbCID.setDoubleBuffered(true);
        jPanel1.add(cmbCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 250, -1));

        cmbsid.setBackground(new java.awt.Color(53, 63, 89));
        cmbsid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbsid.setForeground(new java.awt.Color(255, 255, 255));
        cmbsid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbsid.setDoubleBuffered(true);
        jPanel1.add(cmbsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 250, -1));

        txtCsid.setBackground(new java.awt.Color(53, 63, 89));
        txtCsid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCsid.setForeground(new java.awt.Color(255, 255, 255));
        txtCsid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtCsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 250, 30));

        tblCS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblCS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CSID", "Course ID", "Subject ID", "Semester Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCS.setGridColor(new java.awt.Color(204, 204, 204));
        tblCS.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblCS.setRowHeight(25);
        tblCS.setSelectionBackground(new java.awt.Color(101, 52, 172));
        tblCS.setShowVerticalLines(false);
        tblCS.getTableHeader().setReorderingAllowed(false);
        tblCS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCS);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 560, 210));

        btnsubadd1.setText("Add ");
        btnsubadd1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsubadd1.setkAllowGradient(false);
        btnsubadd1.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnsubadd1.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnsubadd1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnsubadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubadd1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnsubadd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 100, 40));

        btnupdatesubject.setText("Update");
        btnupdatesubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnupdatesubject.setkAllowGradient(false);
        btnupdatesubject.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnupdatesubject.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnupdatesubject.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnupdatesubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatesubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdatesubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 180, 40));

        btndeletesubject.setText("Delete");
        btndeletesubject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndeletesubject.setkAllowGradient(false);
        btndeletesubject.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btndeletesubject.setkHoverColor(new java.awt.Color(9, 135, 62));
        btndeletesubject.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btndeletesubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletesubjectActionPerformed(evt);
            }
        });
        jPanel1.add(btndeletesubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubaddActionPerformed
        uploadSubject();

    }//GEN-LAST:event_btnsubaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteCS();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateCS();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsubadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubadd1ActionPerformed
        uploadCS();
    }//GEN-LAST:event_btnsubadd1ActionPerformed

    private void btnupdatesubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatesubjectActionPerformed
        updateSubject();

    }//GEN-LAST:event_btnupdatesubjectActionPerformed

    private void btndeletesubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletesubjectActionPerformed
        deleteSubject();
    }//GEN-LAST:event_btndeletesubjectActionPerformed

    private void tblSubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectMouseClicked
        int r = tblSubject.getSelectedRow();
        txtSid.setText(tblSubject.getValueAt(r, 0).toString());
        txtSname.setText(tblSubject.getValueAt(r, 1).toString());
        txtSid.setEditable(false);
    }//GEN-LAST:event_tblSubjectMouseClicked

    private void tblCSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCSMouseClicked
        int r = tblCS.getSelectedRow();
        txtCsid.setText(tblCS.getValueAt(r, 0).toString());
    }//GEN-LAST:event_tblCSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btndelete;
    private keeptoo.KButton btndeletesubject;
    private keeptoo.KButton btnsubadd;
    private keeptoo.KButton btnsubadd1;
    private keeptoo.KButton btnupdate;
    private keeptoo.KButton btnupdatesubject;
    private javax.swing.JComboBox<String> cmbCID;
    private javax.swing.JComboBox<String> cmbsemester;
    private javax.swing.JComboBox<String> cmbsid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTotalSubject;
    private javax.swing.JTable tblCS;
    private javax.swing.JTable tblSubject;
    private javax.swing.JTextField txtCsid;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtSname;
    // End of variables declaration//GEN-END:variables

    private void getSubjectCount() {
        try {
            int count = new SubjectFormController().getCount();
            lblTotalSubject.setText(String.valueOf(count));

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTableSubject() {
        try {
            List<Subject> list = new SubjectFormController().loadTable();
            DefaultTableModel model = (DefaultTableModel) tblSubject.getModel();
            model.setRowCount(0);
            list.forEach((subject) -> {
                model.addRow(new Object[]{subject.getSid(), subject.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void uploadSubject() {
        if (checkSID()) {
            if (checkSubjectField()) {
                try {
                    Subject s1 = new Subject(
                            txtSid.getText(),
                            txtSname.getText()
                    );

                    if (new SubjectFormController().uploadSubject(s1)) {
                        JOptionPane.showMessageDialog(null, "Subject saved Successfully");
                        addSid();
                        txtSname.setText("");
                        loadTableSubject();
                    } else {
                        JOptionPane.showMessageDialog(null, "Subject saving error");
                    }

                } catch (ClassNotFoundException | NullPointerException | SQLException ex) {
                    Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Duplicate ID. please set another ID");
        }
    }

    private void setTableUI() {

        tblSubject.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblSubject.getTableHeader().setOpaque(false);
        tblSubject.getTableHeader().setBackground(new Color(32, 136, 203));
        tblSubject.getTableHeader().setForeground(new Color(255, 255, 255));
        tblSubject.setRowHeight(30);
        tblCS.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblCS.getTableHeader().setOpaque(false);
        tblCS.getTableHeader().setBackground(new Color(32, 136, 203));
        tblCS.getTableHeader().setForeground(new Color(255, 255, 255));
        tblCS.setRowHeight(30);
        tblSubject.getTableHeader().setBorder(new LineBorder(Color.white));
        tblCS.getTableHeader().setBorder(new LineBorder(Color.white));
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        jScrollPane2.getVerticalScrollBar().setUI(new CustomScrollBarUI());

    }

    private void setCmbUI() {
        cmbsemester.setUI(ColorArrowUI.createUI(cmbsemester));
        cmbCID.setUI(ColorArrowUI.createUI(cmbCID));
        cmbsid.setUI(ColorArrowUI.createUI(cmbsid));
    }

    private void updateSubject() {
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure want to update?");
            if (showConfirmDialog == 0) {
                if (checkSubjectField()) {
                    try {
                        Subject s1 = new Subject(
                                txtSid.getText(),
                                txtSname.getText()
                        );

                        if (new SubjectFormController().updateSubject(s1)) {
                            JOptionPane.showMessageDialog(null, "Successfuly updated");
                            loadTableSubject();
                        } else {
                            JOptionPane.showMessageDialog(null, "Oops! something went wrong");
                        }
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void deleteSubject() {
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Please Note That!\n\n"
                    + "if you delete subject, delete this subjects, attendance for this subject, exam for this subject\n"
                    + "please consider that!\n\n"
                    + "Are you sure want to delete?");
            if (showConfirmDialog == 0) {
                if (checkSubjectField()) {
                    try {
                        String sid = txtSid.getText();
                        if (new SubjectFormController().deleteSubject(sid)) {
                            JOptionPane.showMessageDialog(null, "Successfully deleted");
                            loadTableSubject();
                            loadTableCS();
                            addSid();
                            txtSname.setText("");
                        } else {
                            JOptionPane.showMessageDialog(null, "Oops! something went wrong");
                        }
                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    private void addSid() {
        try {
            String sid = new SubjectFormController().getSid();
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

    private void addCsid() {
        try {
            String sid = new SubjectFormController().getCsid();
            sid = sid.replaceAll("CS", "");
            int id = Integer.parseInt(sid);
            id = ++id;
            if (id < 10) {
                txtCsid.setText(String.valueOf("CS00" + id));

            } else if (id < 100) {
                txtCsid.setText(String.valueOf("CS0" + id));
            } else {
                txtCsid.setText(String.valueOf("CS" + id));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addcid() {
        try {
            ResultSet rst = new SubjectFormController().getCid();
            while (rst.next()) {
                cmbCID.addItem(rst.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addSubjectId() {
        try {
            ResultSet rs = new SubjectFormController().getSubjectID();
            while (rs.next()) {
                cmbsid.addItem(rs.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void uploadCS() {
        if (checkCSID()) {
            if (checkcssid()) {
                try {
                    SCDetail sc = new SCDetail(
                            txtCsid.getText(),
                            cmbsemester.getSelectedItem().toString(),
                            cmbCID.getSelectedItem().toString(),
                            cmbsid.getSelectedItem().toString()
                    );

                    if (new SubjectFormController().uploadCS(sc)) {
                        JOptionPane.showMessageDialog(null, "Saved Successfully");
                        loadTableCS();
                        addCsid();
                    } else {
                        JOptionPane.showMessageDialog(null, "Oops! something went wrong");
                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void loadTableCS() {
        try {
            List<SCDetail> list = new SubjectFormController().loadCsTable();
            DefaultTableModel model = (DefaultTableModel) tblCS.getModel();
            model.setRowCount(0);
            list.forEach((sCDetail) -> {
                model.addRow(new Object[]{sCDetail.getCsid(), sCDetail.getCid(), sCDetail.getSid(), sCDetail.getSemester()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean checkSubjectField() {
        if (!"".equals(txtSid.getText())) {
            if (!"".equals(txtSname.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Please fill subject name");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill subject id");
            return false;
        }
    }

    private boolean checkSID() {
        try {

            ResultSet rs = new SubjectFormController().checkSid();
            while (rs.next()) {
                if (rs.getString(1).equals(txtSid.getText())) {
                    return false;
                }
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private boolean checkcssid() {
        try {
            ResultSet rs = new SubjectFormController().checkcssid();
            while (rs.next()) {
                if (rs.getString(1).equals(cmbCID.getSelectedItem().toString())) {
                    if (rs.getString(2).equals(cmbsid.getSelectedItem().toString())) {
                        if (rs.getString(3).equals(cmbsemester.getSelectedItem().toString())) {
                            JOptionPane.showMessageDialog(null, "Data Duplicated! please add another detail!");
                            return false;
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void updateCS() {
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you sure want to update?");
            if (showConfirmDialog == 0) {
                if (checkcssid()) {
                    try {
                        SCDetail sc = new SCDetail(
                                txtCsid.getText(),
                                cmbsemester.getSelectedItem().toString(),
                                cmbCID.getSelectedItem().toString(),
                                cmbsid.getSelectedItem().toString()
                        );

                        if (new SubjectFormController().updateCS(sc)) {
                            JOptionPane.showMessageDialog(null, "Update Successfully");
                            addCsid();
                            loadTableCS();
                        } else {
                            JOptionPane.showMessageDialog(null, "Oops! something went wrong");
                        }

                    } catch (ClassNotFoundException | SQLException ex) {
                        Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
    }

    private void deleteCS() {
        if (checkprivilege()) {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Please Note That!\n\n"
                    + "if you delete Course for subject, delete this all subjects data , attendance for this subject, exam for this subject\n"
                    + "please consider that!\n\n"
                    + "Are you sure want to delete? ");
            if (showConfirmDialog == 0) {
                try {
                    String csid = txtCsid.getText();
                    if (new SubjectFormController().deleteCS(csid)) {
                        JOptionPane.showMessageDialog(null, "Successfully deleted");
                        loadTableCS();
                        addCsid();

                    } else {
                        JOptionPane.showMessageDialog(null, "Oops! something went wrong");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(SubjectForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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

    private boolean checkCSID() {
        try {

            ResultSet rs = new SubjectFormController().checkCsid();
            while (rs.next()) {
                if (rs.getString(1).equals(txtCsid.getText())) {
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
