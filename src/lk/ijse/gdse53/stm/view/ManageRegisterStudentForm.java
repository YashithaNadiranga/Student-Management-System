/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.view;

import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static jssc.SerialPort.MASK_RXCHAR;
import jssc.SerialPortException;
import lk.ijse.gdse53.stm.controller.RegisterStudentFormController;
import lk.ijse.gdse53.stm.model.Registration;
import lk.ijse.gdse53.stm.sc.SConnection;

/**
 *
 * @author Yashitha Nadiranga
 */
public class ManageRegisterStudentForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudentForm
     */
    LocalDate now = LocalDate.now();

//    public ManageRegisterStudentForm() throws SerialPortException {
//        initComponents();
//        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
//        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
//        cmbbatchid.setUI(ColorArrowUI.createUI(cmbbatchid));
//        addSid();
//        selectBid();
//        addDate();
//        serialRead();
//        
//
//    }

    public ManageRegisterStudentForm(String ssid) throws SerialPortException {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        cmbbatchid.setUI(ColorArrowUI.createUI(cmbbatchid));
        addDate();
        serialRead();
        selectBid();
        txtSid.setText(ssid);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        txtRid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnsubmit = new keeptoo.KButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        cmbbatchid = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();

        setBackground(new java.awt.Color(53, 63, 89));
        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1115, 795));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 63, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 63, 89));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Register Student");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtSid.setBackground(new java.awt.Color(53, 63, 89));
        txtSid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSid.setForeground(new java.awt.Color(255, 255, 255));
        txtSid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 880, 30));

        txtRid.setBackground(new java.awt.Color(53, 63, 89));
        txtRid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRid.setForeground(new java.awt.Color(255, 255, 255));
        txtRid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 880, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RID    :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SID     :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnsubmit.setText("Update");
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Batch ID :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Fee    :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        txtFee.setBackground(new java.awt.Color(53, 63, 89));
        txtFee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFee.setForeground(new java.awt.Color(255, 255, 255));
        txtFee.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 880, 30));

        cmbbatchid.setBackground(new java.awt.Color(53, 63, 89));
        cmbbatchid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbbatchid.setForeground(new java.awt.Color(255, 255, 255));
        cmbbatchid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cmbbatchid.setDoubleBuffered(true);
        jPanel2.add(cmbbatchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 870, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date    :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, 20));

        txtDate.setBackground(new java.awt.Color(53, 63, 89));
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 880, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 795));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1115, 795));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        Registration r1 = new Registration(
                txtRid.getText(),
                String.valueOf(cmbbatchid.getSelectedItem()),
                txtSid.getText(),
                txtFee.getText(),
                String.valueOf(now)
        );

        try {
            if (new RegisterStudentFormController().uploadRegDetail(r1)) {
                JOptionPane.showMessageDialog(this, "Saved");
                loadView();

            } else {
                JOptionPane.showMessageDialog(this, "Not Saved");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageRegisterStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
            Logger.getLogger(ManageRegisterStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnsubmit;
    private javax.swing.JComboBox<String> cmbbatchid;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtRid;
    private javax.swing.JTextField txtSid;
    // End of variables declaration//GEN-END:variables

    private void selectBid() {
        try {
            ResultSet rs = new RegisterStudentFormController().selectBid();
            while(rs.next()){
                cmbbatchid.addItem(rs.getString(1));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BatchForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void addSid() {
        try {
            String sid = new RegisterStudentFormController().getsid();
            sid = sid.replaceAll("S", "");
            int id = Integer.parseInt(sid);
            if (id < 10) {
                txtSid.setText(String.valueOf("S00" + id));

            } else if (id < 100) {
                txtSid.setText(String.valueOf("S0" + id));
            } else {
                txtSid.setText(String.valueOf("S" + id));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageRegisterStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addRid() {
        try {
            String rid = new RegisterStudentFormController().getRid();
            rid = rid.replaceAll("R", "");
            int id = Integer.parseInt(rid);
            ++id;
            if (id < 10) {
                txtRid.setText(String.valueOf("R00" + id));

            } else if (id < 100) {
                txtRid.setText(String.valueOf("R0" + id));
            } else {
                txtRid.setText(String.valueOf("R" + id));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageRegisterStudentForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addDate() {
        txtDate.setText(String.valueOf(now));
    }

    private void loadView() {
        jPanel1.setLayout(new FlowLayout());
        jPanel1.removeAll();
        jPanel1.repaint();
    //    jPanel1.add(new ViewStudentForm()).setVisible(true);

    }

    private void serialRead() throws SerialPortException {
        SConnection.getInstance().disconnectArduino();
        jssc.SerialPort sp = SConnection.getInstance().getSerialPort();
        System.out.println(sp);
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
                        txtRid.setText(readString);
                    }
                    Thread.sleep(3000);
                } catch (InterruptedException | SerialPortException | NullPointerException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            });

        } catch (SerialPortException | NullPointerException ex) {
            JOptionPane.showMessageDialog(this,"Cant Open Port");
        }
    }
    private void checkAllField(){
           
    }
    
}
