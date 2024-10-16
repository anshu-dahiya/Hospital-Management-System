package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class View_Patient extends JFrame implements ActionListener {
    JFrame f;
    JTable t;
    JButton bt, bt1;
    String x[] = {"Name", "Username", "DOB", "Address", "Phone", "Email", "City", "Gender", "Blood Group", "Age", "Father's Name", "Marital Status", "Symptoms"};
    String y[][] = new String[20][14];
    int i = 0, j = 0;
    JTextField tfl;
    JPanel p1, p2, p3;
    Font f1, f2;

    View_Patient() {
        super("Patient Information");
        setSize(1200, 700);
        setLocation(100, 100);
        setLayout(null);

        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Arial", Font.BOLD, 18);

        try {
            ConnectionClassHMS obj = new ConnectionClassHMS();
            String q = "select * from patient";
            ResultSet rs = obj.stm.executeQuery(q);
            while (rs.next()) {
                y[i][j++] = rs.getString("name");
                y[i][j++] = rs.getString("username");
                y[i][j++] = rs.getString("dob");
                y[i][j++] = rs.getString("address");
                y[i][j++] = rs.getString("phone");
                y[i][j++] = rs.getString("email");
                y[i][j++] = rs.getString("city");
                y[i][j++] = rs.getString("gender");
                y[i][j++] = rs.getString("blood");
                y[i][j++] = rs.getString("age");
                y[i][j++] = rs.getString("father_name");
                y[i][j++] = rs.getString("marital_status");
                y[i][j++] = rs.getString("symptoms");
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

        JLabel l1 = new JLabel("Patient Username");
        l1.setBounds(50, 450, 200, 30);
        l1.setFont(f1);
        add(l1);

        tfl = new JTextField();
        tfl.setBounds(270, 450, 200, 30);
        add(tfl);

        bt = new JButton("Delete Patient");
        bt.setBounds(50, 500, 200, 50);
        bt.setFont(f2);
        bt.setBackground(Color.RED);
        bt.setForeground(Color.WHITE);
        add(bt);

        bt1 = new JButton("Edit Patient Record");
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
            String username = tfl.getText();
            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                String q = "delete from patient where username = '" + username + "'";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Patient Deleted Successfully");
                this.setVisible(false);
                new View_Patient().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (ae.getSource() == bt1) {
            String username = tfl.getText();
            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                // Assuming Edit_Patient is another frame to edit patient details
                new Edit_Patient(username).setVisible(true);
                this.setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new View_Patient().setVisible(true);
    }
}
