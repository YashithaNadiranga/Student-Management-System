/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import static jssc.SerialPort.MASK_RXCHAR;
import jssc.SerialPortException;
import lk.ijse.gdse53.stm.controller.AttendanceFormController;
import lk.ijse.gdse53.stm.model.ADetails;
import lk.ijse.gdse53.stm.model.Attendance;
import lk.ijse.gdse53.stm.sc.SConnection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class AttendanceForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     */
    String s;
    String time;
    String date;
    int count;
    public AttendanceForm() throws SerialPortException {
        initComponents();
        loadUI();
        serialRead();
        addAid();
        loadCSID();
        dateTime();
        loadTodayAttendanceCount();
        loadTable();

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
        jLabel2 = new javax.swing.JLabel();
        txtrid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        kButton2 = new keeptoo.KButton();
        btnsend = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        lblTotalAttendance = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAttendance = new javax.swing.JTable();
        cmbCSID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtaid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(53, 63, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attendance");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtrid.setBackground(new java.awt.Color(53, 63, 89));
        txtrid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtrid.setForeground(new java.awt.Color(255, 255, 255));
        txtrid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RID : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name : ");
        jLabel4.setEnabled(false);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 160, 70, -1));

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(53, 63, 89));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 200, 30));

        kButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_eye_20px_1.png"))); // NOI18N
        kButton2.setText("View All Attendance");
        kButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kButton2.setIconTextGap(15);
        kButton2.setkAllowGradient(false);
        kButton2.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        kButton2.setkHoverColor(new java.awt.Color(9, 135, 62));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 700, 260, 40));

        btnsend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_play_20px.png"))); // NOI18N
        btnsend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsend.setIconTextGap(15);
        btnsend.setkAllowGradient(false);
        btnsend.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        btnsend.setkHoverColor(new java.awt.Color(9, 135, 62));
        btnsend.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        jPanel1.add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 50, 40));

        kButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/gdse53/stm/view/images/icons8_play_20px.png"))); // NOI18N
        kButton4.setEnabled(false);
        kButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kButton4.setIconTextGap(15);
        kButton4.setkAllowGradient(false);
        kButton4.setkBackGroundColor(new java.awt.Color(11, 182, 83));
        kButton4.setkHoverColor(new java.awt.Color(9, 135, 62));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 50, 40));

        kGradientPanel1.setBackground(new java.awt.Color(53, 63, 89));
        kGradientPanel1.setkBorderRadius(20);
        kGradientPanel1.setkEndColor(new java.awt.Color(11, 182, 83));
        kGradientPanel1.setkStartColor(new java.awt.Color(11, 182, 83));

        jLabel5.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Today Attendence");

        lblTotalAttendance.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        lblTotalAttendance.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAttendance.setText("0");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
                .addComponent(lblTotalAttendance)
                .addGap(53, 53, 53))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 40, 880, 40));

        tblAttendance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblAttendance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblAttendance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "Name", "Batch", "Course", "Subject", "Date"
            }
        ));
        tblAttendance.setGridColor(new java.awt.Color(204, 204, 204));
        tblAttendance.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblAttendance.setRowHeight(25);
        tblAttendance.setSelectionBackground(new java.awt.Color(101, 52, 172));
        tblAttendance.setShowVerticalLines(false);
        tblAttendance.getTableHeader().setReorderingAllowed(false);
        tblAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAttendanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAttendance);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1050, 420));

        cmbCSID.setBackground(new java.awt.Color(53, 63, 89));
        cmbCSID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCSID.setForeground(new java.awt.Color(255, 255, 255));
        cmbCSID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbCSID.setDoubleBuffered(true);
        jPanel1.add(cmbCSID, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, 180, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select CSID :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 110, 70));

        txtaid.setEditable(false);
        txtaid.setBackground(new java.awt.Color(53, 63, 89));
        txtaid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtaid.setForeground(new java.awt.Color(255, 255, 255));
        txtaid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 710, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ATTENDANCE ID : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, 30));

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

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        try {
            SConnection.getInstance().disconnectArduino();
        } catch (SerialPortException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPanel1.setLayout(new FlowLayout());
        jPanel1.removeAll();
        jPanel1.repaint();
        jPanel1.add(new ViewAttendanceForm()).setVisible(true);
    }//GEN-LAST:event_kButton2ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        dateTime();
        uploadAttendance();
    }//GEN-LAST:event_btnsendActionPerformed

    private void tblAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAttendanceMouseClicked

    }//GEN-LAST:event_tblAttendanceMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnsend;
    private javax.swing.JComboBox<String> cmbCSID;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblTotalAttendance;
    private javax.swing.JTable tblAttendance;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtaid;
    private javax.swing.JTextField txtrid;
    // End of variables declaration//GEN-END:variables

    private void serialRead() throws SerialPortException {

        jssc.SerialPort sp = SConnection.getInstance().getSerialPort();
        SConnection.getInstance().disconnectArduino();
        try {
            sp.openPort();
            System.out.println("Open Serial Port");
            sp.setParams(
                    jssc.SerialPort.BAUDRATE_9600,
                    jssc.SerialPort.DATABITS_8,
                    jssc.SerialPort.STOPBITS_1,
                    jssc.SerialPort.PARITY_NONE);
            sp.setEventsMask(MASK_RXCHAR);
            sp.addEventListener((serialPortEvent) -> {
                try {
                    String readString = sp.readString();
                    if (readString != null) {
                        dateTime();
                        txtrid.setText(readString);
                        btnsend.doClick();
                    }
                    Thread.sleep(3000);
                } catch (InterruptedException | SerialPortException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            });

        } catch (SerialPortException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Reader Not Found");
        }
    }

    private void loadUI() {
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        tblAttendance.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblAttendance.getTableHeader().setOpaque(false);
        tblAttendance.getTableHeader().setBackground(new Color(32, 136, 203));
        tblAttendance.getTableHeader().setForeground(new Color(255, 255, 255));
        tblAttendance.getTableHeader().setBorder(new LineBorder(Color.white));
        tblAttendance.setRowHeight(30);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        cmbCSID.setUI(ColorArrowUI.createUI(cmbCSID));
    }

    private void addAid() {
        try {
            String aid = new AttendanceFormController().addAid();
            aid = aid.replaceAll("A", "");
            int id = Integer.parseInt(aid);
            id = ++id;
            if (id < 10) {
                txtaid.setText(String.valueOf("A00" + id));

            } else if (id < 100) {
                txtaid.setText(String.valueOf("A0" + id));
            } else {
                txtaid.setText(String.valueOf("A" + id));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadCSID() {
        try {
            ResultSet rst = new AttendanceFormController().loadCSID();
            while (rst.next()) {
                cmbCSID.addItem(rst.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dateTime() {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("HH:mm:ss");
        time = t.format(obj);
        date = d.toString();
    }

    private void uploadAttendance() {
        if (checkrid()) {
            if (checkAttendanceField()) {
                try {
                    Attendance a1 = new Attendance(
                            txtaid.getText(),
                            txtrid.getText(),
                            cmbCSID.getSelectedItem().toString(),
                            date,
                            time
                    );
                    if (new AttendanceFormController().uploadAttendance(a1)) {
                        //JOptionPane.showMessageDialog(null, txtrid.getText()+" Saved");
                        addAid();
                        loadTable();
                        loadTodayAttendanceCount();
                    } else {
                        JOptionPane.showMessageDialog(null, txtrid.getText() + "Something went Wrong");
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void loadTodayAttendanceCount() {
        try {
            count = new AttendanceFormController().getCount(date);
            lblTotalAttendance.setText(String.valueOf(count));
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTable() {
        try {
            List<ADetails> list = new AttendanceFormController().loadTable();
            DefaultTableModel model = (DefaultTableModel) tblAttendance.getModel();
            model.setRowCount(0);
            list.forEach((aDetails) -> {
                model.addRow(new Object[]{aDetails.getRid(), aDetails.getName(), aDetails.getBatch(), aDetails.getCourse(), aDetails.getSubject(), aDetails.getDate()});
            });
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean checkAttendanceField() {
        try {
            ResultSet rst = new AttendanceFormController().checkAttendanceField();
            while (rst.next()) {
                dateTime();
                if (rst.getString(1).equals(txtrid.getText()) & rst.getString(2).equals(date)) {
                    JOptionPane.showMessageDialog(null, "This Student Already Exist!");
                    return false;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private boolean checkrid() {
        try {
            ResultSet rs = new AttendanceFormController().checkrid();
            while (rs.next()) {
                if (rs.getString(1).equals(txtrid.getText())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AttendanceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "This Student Not Registerd");
        return false;
    }

}