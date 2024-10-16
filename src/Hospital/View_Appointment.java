package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class View_Appointment extends JFrame implements ActionListener {
    JFrame f;
    JTable t;
    JButton bt, bt1;
    String x[] = {"Appointment ID", "Username", "Name", "Email", "Father's Name", "Phone", "Marital Status", "City", "Gender", "Blood Group", "Age", "DOB", "Symptoms", "Doctor", "Appointment Date", "Appointment Time"};
    String y[][] = new String[20][16];
    int i = 0, j = 0;
    JTextField tfl;
    Font f1, f2;

    View_Appointment() {
        super("Appointment Information");
        setSize(1200, 700);
        setLocation(100, 100);
        setLayout(null);

        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Arial", Font.BOLD, 18);

        try {
            ConnectionClassHMS obj = new ConnectionClassHMS();
            String q = "select * from appointment";
            ResultSet rs = obj.stm.executeQuery(q);
            while (rs.next()) {
                y[i][j++] = rs.getString("appointment_id");
                y[i][j++] = rs.getString("username");
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("father_name");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("mstatus");
                y[i][j++] = rs.getString("city");
                y[i][j++] = rs.getString("gender");
                y[i][j++] = rs.getString("blood");
                y[i][j++] = rs.getString("age");
                y[i][j++] = rs.getString("dob");
                y[i][j++] = rs.getString("symptoms");
                y[i][j++] = rs.getString("doctor");
                y[i][j++] = rs.getString("appointment_date");
                y[i][j++] = rs.getString("appointment_time");
                i++;
                j = 0;
            }
            t = new JTable(y, x);
        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(20, 20, 1150, 400);
        add(sp);

        JLabel l1 = new JLabel("Appointment ID");
        l1.setBounds(50, 450, 200, 30);
        l1.setFont(f1);
        add(l1);

        tfl = new JTextField();
        tfl.setBounds(270, 450, 200, 30);
        add(tfl);

        bt = new JButton("Delete Appointment");
        bt.setBounds(50, 500, 200, 50);
        bt.setFont(f2);
        bt.setBackground(Color.RED);
        bt.setForeground(Color.WHITE);
        add(bt);

        bt1 = new JButton("Edit Appointment");
        bt1.setBounds(300, 500, 200, 50);
        bt1.setFont(f2);
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        add(bt1);

        bt.addActionListener(this);
        bt1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bt) {
            String appointmentID = tfl.getText();
            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                String q = "delete from appointment where appointment_id = '" + appointmentID + "'";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Appointment Deleted Successfully");
                this.setVisible(false);
                new View_Appointment().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (ae.getSource() == bt1) {
            String appointmentID = tfl.getText();
            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                // Assuming Edit_Appointment is another frame to edit appointment details
                // new Edit_Appointment(appointmentID).setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new View_Appointment().setVisible(true);
    }
}
