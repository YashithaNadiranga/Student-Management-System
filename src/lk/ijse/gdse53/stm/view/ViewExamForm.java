/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.view;

import cambodia.raven.DateChooser;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse53.stm.controller.ExamFormController;
import lk.ijse.gdse53.stm.model.ExamDetail;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ViewExamForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     *
     */
    public ViewExamForm() {
        initComponents();
        loadUI();
        loadTable();
        setCsid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new cambodia.raven.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        btndateselect = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExam = new javax.swing.JTable();
        txtRidSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSerchsid = new keeptoo.KButton();
        jLabel4 = new javax.swing.JLabel();
        txtNameSearch = new javax.swing.JTextField();
        btnNameSearch = new keeptoo.KButton();
        jLabel5 = new javax.swing.JLabel();
        txtdatesearch = new javax.swing.JTextField();
        btndateserch = new keeptoo.KButton();
        cmbCSID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSerchcsid = new keeptoo.KButton();

        dateChooser.setButton(btndateselect);
        dateChooser.setTextRefernce(txtdatesearch);

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(53, 63, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndateselect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_age_30px.png"))); // NOI18N
        btndateselect.setDoubleBuffered(true);
        btndateselect.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndateselect.setIconTextGap(15);
        btndateselect.setkAllowGradient(false);
        btndateselect.setkBackGroundColor(new java.awt.Color(53, 63, 89));
        btndateselect.setkHoverColor(new java.awt.Color(53, 63, 89));
        btndateselect.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btndateselect.setkPressedColor(new java.awt.Color(53, 63, 89));
        btndateselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndateselectActionPerformed(evt);
            }
        });
        jPanel1.add(btndateselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 140, 50, 40));

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Exam Details");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        tblExam.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Reg ID", "Exam Date", "Exam Name", "Marks", "Course Name", "Semester", "Subject Name"
            }
        ));
        tblExam.setGridColor(new java.awt.Color(204, 204, 204));
        tblExam.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblExam.setRowHeight(25);
        tblExam.setSelectionBackground(new java.awt.Color(101, 52, 172));
        tblExam.setShowVerticalLines(false);
        tblExam.getTableHeader().setReorderingAllowed(false);
        tblExam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExam);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 1090, 520));

        txtRidSearch.setBackground(new java.awt.Color(53, 63, 89));
        txtRidSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRidSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtRidSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtRidSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRidSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtRidSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RID : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnSerchsid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_search_20px.png"))); // NOI18N
        btnSerchsid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSerchsid.setIconTextGap(15);
        btnSerchsid.setkAllowGradient(false);
        btnSerchsid.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnSerchsid.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnSerchsid.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSerchsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerchsidActionPerformed(evt);
            }
        });
        jPanel1.add(btnSerchsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 50, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Exam Name : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 160, -1, -1));

        txtNameSearch.setBackground(new java.awt.Color(53, 63, 89));
        txtNameSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNameSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtNameSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNameSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 30));

        btnNameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_search_20px.png"))); // NOI18N
        btnNameSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNameSearch.setIconTextGap(15);
        btnNameSearch.setkAllowGradient(false);
        btnNameSearch.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnNameSearch.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnNameSearch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 50, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, 40));

        txtdatesearch.setBackground(new java.awt.Color(53, 63, 89));
        txtdatesearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtdatesearch.setForeground(new java.awt.Color(255, 255, 255));
        txtdatesearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtdatesearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdatesearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtdatesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 190, 30));

        btndateserch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_search_20px.png"))); // NOI18N
        btndateserch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndateserch.setIconTextGap(15);
        btndateserch.setkAllowGradient(false);
        btndateserch.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btndateserch.setkHoverColor(new java.awt.Color(9, 135, 62));
        btndateserch.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btndateserch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndateserchActionPerformed(evt);
            }
        });
        jPanel1.add(btndateserch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, 50, 40));

        cmbCSID.setBackground(new java.awt.Color(53, 63, 89));
        cmbCSID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCSID.setForeground(new java.awt.Color(255, 255, 255));
        cmbCSID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbCSID.setDoubleBuffered(true);
        cmbCSID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCSIDItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbCSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 38, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select CSID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 110, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_refresh_30px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        btnSerchcsid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_search_20px.png"))); // NOI18N
        btnSerchcsid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSerchcsid.setIconTextGap(15);
        btnSerchcsid.setkAllowGradient(false);
        btnSerchcsid.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnSerchcsid.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnSerchcsid.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSerchcsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerchcsidActionPerformed(evt);
            }
        });
        jPanel1.add(btnSerchcsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 50, 40));

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

    private void tblExamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExamMouseClicked

    }//GEN-LAST:event_tblExamMouseClicked

    private void txtRidSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRidSearchKeyReleased
        ridSearch();
    }//GEN-LAST:event_txtRidSearchKeyReleased

    private void btnSerchsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerchsidActionPerformed

    }//GEN-LAST:event_btnSerchsidActionPerformed

    private void txtNameSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameSearchKeyReleased
        nameSearch();
    }//GEN-LAST:event_txtNameSearchKeyReleased

    private void btnNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameSearchActionPerformed

    }//GEN-LAST:event_btnNameSearchActionPerformed

    private void txtdatesearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatesearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatesearchKeyReleased

    private void btndateserchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndateserchActionPerformed
        dateSearch();
    }//GEN-LAST:event_btndateserchActionPerformed

    private void btndateselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndateselectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndateselectActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        loadTable();
        txtNameSearch.setText("");
        txtRidSearch.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void cmbCSIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCSIDItemStateChanged

    }//GEN-LAST:event_cmbCSIDItemStateChanged

    private void btnSerchcsidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerchcsidActionPerformed
        csidSearch();
    }//GEN-LAST:event_btnSerchcsidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnNameSearch;
    private keeptoo.KButton btnSerchcsid;
    private keeptoo.KButton btnSerchsid;
    private keeptoo.KButton btndateselect;
    private keeptoo.KButton btndateserch;
    private javax.swing.JComboBox<String> cmbCSID;
    private cambodia.raven.DateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblExam;
    private javax.swing.JTextField txtNameSearch;
    private javax.swing.JTextField txtRidSearch;
    private javax.swing.JTextField txtdatesearch;
    // End of variables declaration//GEN-END:variables

    private void loadUI() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        tblExam.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblExam.getTableHeader().setOpaque(false);
        tblExam.getTableHeader().setBackground(new Color(32, 136, 203));
        tblExam.getTableHeader().setForeground(new Color(255,255,255));
        tblExam.getTableHeader().setBorder(new LineBorder(Color.white));
        tblExam.setRowHeight(30);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        cmbCSID.setUI(ColorArrowUI.createUI(cmbCSID));

    }

    private void ridSearch() {
        try {
            String rid = txtRidSearch.getText();
            List<ExamDetail> list = new ExamFormController().loadTableSerchRid(rid);
            DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
            model.setRowCount(0);
            list.forEach((examDetail) -> {
                model.addRow(new Object[]{examDetail.getName(), examDetail.getRid(), examDetail.getEdate(),
                    examDetail.getEname(), examDetail.getMarks(), examDetail.getCname(), examDetail.getSemester(),
                    examDetail.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void nameSearch() {
        try {
            String name = txtNameSearch.getText();
            List<ExamDetail> list = new ExamFormController().loadTableSerchName(name);
            DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
            model.setRowCount(0);
            list.forEach((examDetail) -> {
                model.addRow(new Object[]{examDetail.getName(), examDetail.getRid(), examDetail.getEdate(),
                    examDetail.getEname(), examDetail.getMarks(), examDetail.getCname(), examDetail.getSemester(),
                    examDetail.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dateSearch() {
        try {
            String date = dateChooser.getSelectedDate(DateChooser.GET_YEAR) + "-"
                    + dateChooser.getSelectedDate(DateChooser.GET_MONTH)
                    + "-" + dateChooser.getSelectedDate(DateChooser.GET_DAY);

            List<ExamDetail> list = new ExamFormController().dateSearch(date);
            DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
            model.setRowCount(0);
            list.forEach((examDetail) -> {
                model.addRow(new Object[]{examDetail.getName(), examDetail.getRid(), examDetail.getEdate(),
                    examDetail.getEname(), examDetail.getMarks(), examDetail.getCname(), examDetail.getSemester(),
                    examDetail.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void csidSearch() {
        try {
            String csid = cmbCSID.getSelectedItem().toString();
            List<ExamDetail> list = new ExamFormController().loadTableSerchCsid(csid);
            DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
            model.setRowCount(0);
            list.forEach((examDetail) -> {
                model.addRow(new Object[]{examDetail.getName(), examDetail.getRid(), examDetail.getEdate(),
                    examDetail.getEname(), examDetail.getMarks(), examDetail.getCname(), examDetail.getSemester(),
                    examDetail.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTable() {
        try {
            List<ExamDetail> list = new ExamFormController().loadTable();
            DefaultTableModel model = (DefaultTableModel) tblExam.getModel();
            model.setRowCount(0);
            list.forEach((examDetail) -> {
                model.addRow(new Object[]{examDetail.getName(), examDetail.getRid(), examDetail.getEdate(),
                    examDetail.getEname(), examDetail.getMarks(), examDetail.getCname(), examDetail.getSemester(),
                    examDetail.getSname()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setCsid() {
        try {
            ResultSet rs = new ExamFormController().setCsid();
            while(rs.next()){
                cmbCSID.addItem(rs.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ViewExamForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
