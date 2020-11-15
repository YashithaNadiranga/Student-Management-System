/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse53.stm.sc;

import com.fazecast.jSerialComm.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author Yashitha Nadiranga
 */
public class SConnection {

    private static SConnection sConnection;
    private String devicePortName = "USB-SERIAL CH340";
    public jssc.SerialPort sp;

    private SConnection() throws SerialPortException {
        int len = SerialPort.getCommPorts().length;
        SerialPort[] port = SerialPort.getCommPorts();

        for (int i = 0; i < len; i++) {
            String x = port[i].getSystemPortName();

            if (port[i].getDescriptivePortName().contains(devicePortName)) {
                sp = new jssc.SerialPort(port[i].getSystemPortName());
                break;
            }
        }

    }

    public static SConnection getInstance() throws SerialPortException {
        return (sConnection == null) ? (sConnection = new SConnection()) : sConnection;
    }

    public jssc.SerialPort getSerialPort() {
        return sp;
    }

    public void disconnectArduino() {

        if (sp != null) {
            try {
                sp.removeEventListener();

                if (sp.isOpened()) {
                    sp.closePort();
                }

            } catch (SerialPortException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
