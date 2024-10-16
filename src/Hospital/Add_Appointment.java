package Hospital;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Add_Appointment extends JFrame implements ActionListener, ItemListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    Choice c1, c2, c3, c4;
    JButton bt1, bt2;
    Font f1, f2;

    Add_Appointment() {
        super("Add Appointment");
        setSize(900, 700);
        setLocation(200, 100);
        setLayout(new BorderLayout());

        f1 = new Font("Arial", Font.BOLD, 20);
        f2 = new Font("Arial", Font.BOLD, 18);

        // Top panel for heading
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.WHITE);
        JLabel heading = new JLabel("Add Appointment");
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        topPanel.add(heading);

        // Left panel for image
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout( 1, 1, 10, 10));
        leftPanel.setBackground(Color.WHITE);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/HMS icons/Index.jpg"));
        Image i1 = img.getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        JLabel lImg = new JLabel(img1);
        lImg.setBounds(0, 0, 400, 700);
        leftPanel.add(lImg);

        // Right panel for user inputs and buttons
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(Color.WHITE);

        l1 = new JLabel("Username");
        l1.setBounds(50, 30, 150, 30);
        l1.setFont(f1);
        rightPanel.add(l1);

        c1 = new Choice();
        c1.setBounds(220, 30, 150, 30);
        rightPanel.add(c1);
        c1.addItemListener(this);

        l2 = new JLabel("Name");
        l2.setBounds(50, 70, 150, 30);
        l2.setFont(f1);
        rightPanel.add(l2);

        t1 = new JTextField();
        t1.setBounds(220, 70, 150, 30);
        rightPanel.add(t1);

        l3 = new JLabel("Email");
        l3.setBounds(50, 110, 150, 30);
        l3.setFont(f1);
        rightPanel.add(l3);

        t2 = new JTextField();
        t2.setBounds(220, 110, 150, 30);
        rightPanel.add(t2);

        l4 = new JLabel("Father's Name");
        l4.setBounds(50, 150, 150, 30);
        l4.setFont(f1);
        rightPanel.add(l4);

        t3 = new JTextField();
        t3.setBounds(220, 150, 150, 30);
        rightPanel.add(t3);

        l5 = new JLabel("Phone");
        l5.setBounds(50, 190, 150, 30);
        l5.setFont(f1);
        rightPanel.add(l5);

        t4 = new JTextField();
        t4.setBounds(220, 190, 150, 30);
        rightPanel.add(t4);

        l6 = new JLabel("Marital Status");
        l6.setBounds(50, 230, 150, 30);
        l6.setFont(f1);
        rightPanel.add(l6);

        t5 = new JTextField();
        t5.setBounds(220, 230, 150, 30);
        rightPanel.add(t5);

        l7 = new JLabel("City");
        l7.setBounds(50, 270, 150, 30);
        l7.setFont(f1);
        rightPanel.add(l7);

        t6 = new JTextField();
        t6.setBounds(220, 270, 150, 30);
        rightPanel.add(t6);

        l8 = new JLabel("Gender");
        l8.setBounds(50, 310, 150, 30);
        l8.setFont(f1);
        rightPanel.add(l8);

        t7 = new JTextField();
        t7.setBounds(220, 310, 150, 30);
        rightPanel.add(t7);

        l9 = new JLabel("Blood Group");
        l9.setBounds(50, 350, 150, 30);
        l9.setFont(f1);
        rightPanel.add(l9);

        t8 = new JTextField();
        t8.setBounds(220, 350, 150, 30);
        rightPanel.add(t8);

        l10 = new JLabel("Age");
        l10.setBounds(50, 390, 150, 30);
        l10.setFont(f1);
        rightPanel.add(l10);

        t9 = new JTextField();
        t9.setBounds(220, 390, 150, 30);
        rightPanel.add(t9);

        l11 = new JLabel("DOB");
        l11.setBounds(50, 430, 150, 30);
        l11.setFont(f1);
        rightPanel.add(l11);

        t10 = new JTextField();
        t10.setBounds(220, 430, 150, 30);
        rightPanel.add(t10);

        l12 = new JLabel("Symptoms");
        l12.setBounds(50, 470, 150, 30);
        l12.setFont(f1);
        rightPanel.add(l12);

        c2 = new Choice();
        c2.setBounds(220, 470, 150, 30);
        rightPanel.add(c2);
        populateSymptoms();

        l13 = new JLabel("Select Doctor");
        l13.setBounds(50, 510, 150, 30);
        l13.setFont(f1);
        rightPanel.add(l13);

        c3 = new Choice();
        c3.setBounds(220, 510, 150, 30);
        rightPanel.add(c3);
        populateDoctors();

        l14 = new JLabel("Appointment Date");
        l14.setBounds(50, 550, 200, 30);
        l14.setFont(f1);
        rightPanel.add(l14);

        t11 = new JTextField();
        t11.setBounds(220, 550, 150, 30);
        rightPanel.add(t11);

        l15 = new JLabel("Appointment Time");
        l15.setBounds(50, 590, 200, 30);
        l15.setFont(f1);
        rightPanel.add(l15);

        c4 = new Choice();
        c4.setBounds(220, 590, 150, 30);
        c4.add("10:00 AM");
        c4.add("11:00 AM");
        c4.add("12:00 PM");
        c4.add("1:00 PM");
        c4.add("2:00 PM");
        c4.add("3:00 PM");
        c4.add("4:00 PM");
        rightPanel.add(c4);

        bt1 = new JButton("Submit");
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt1.setBounds(50, 630, 150, 40);
        bt1.setFont(f2);
        rightPanel.add(bt1);

        bt2 = new JButton("Cancel");
        bt2.setBackground(Color.RED);
        bt2.setForeground(Color.WHITE);
        bt2.setBounds(220, 630, 150, 40);
        bt2.setFont(f2);
        rightPanel.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        add(topPanel, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        populateUsernames();

        setVisible(true);
    }

    public void populateUsernames() {
        try {
            ConnectionClassHMS obj = new ConnectionClassHMS();
            String q = "select username from patient";
            ResultSet rs = obj.stm.executeQuery(q);
            while (rs.next()) {
                c1.add(rs.getString("username"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void populateSymptoms() {
        c2.add("Cough");
        c2.add("Fever");
        c2.add("Headache");
        c2.add("Body Pain");
        c2.add("Fatigue");
        // Add more symptoms if needed
    }

    public void populateDoctors() {
        try {
            ConnectionClassHMS obj = new ConnectionClassHMS();
            String q = "select name from doctor";
            ResultSet rs = obj.stm.executeQuery(q);
            while (rs.next()) {
                c3.add(rs.getString("name"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            String username = c1.getSelectedItem();
            String name = t1.getText();
            String email = t2.getText();
            String fname = t3.getText();
            String phone = t4.getText();
            String mstatus = t5.getText();
            String city = t6.getText();
            String gender = t7.getText();
            String bgroup = t8.getText();
            String age = t9.getText();
            String dob = t10.getText();
            String symptoms = c2.getSelectedItem();
            String doctor = c3.getSelectedItem();
            String appt_date = t11.getText();
            String appt_time = c4.getSelectedItem();

            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                String q = "insert into appointment(username, name, email, father_name, phone, mstatus, city, gender, blood, age, dob, symptoms, doctor, appointment_date, appointment_time) values('" + username + "','" + name + "','" + email + "','" + fname + "','" + phone + "','" + mstatus + "','" + city + "','" + gender + "','" + bgroup + "','" + age + "','" + dob + "','" + symptoms + "','" + doctor + "','" + appt_date + "','" + appt_time + "')";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Appointment Booked Successfully");
                setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (e.getSource() == bt2) {
            setVisible(false);
        }
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                String username = c1.getSelectedItem();
                String q = "select * from patient where username='" + username + "'";
                ResultSet rs = obj.stm.executeQuery(q);
                while (rs.next()) {
                    t1.setText(rs.getString("name"));
                    t2.setText(rs.getString("email"));
                    t3.setText(rs.getString("fname"));
                    t4.setText(rs.getString("phone"));
                    t5.setText(rs.getString("mstatus"));
                    t6.setText(rs.getString("city"));
                    t7.setText(rs.getString("gender"));
                    t8.setText(rs.getString("bgroup"));
                    t9.setText(rs.getString("age"));
                    t10.setText(rs.getString("dob"));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Add_Appointment().setVisible(true);
    }
}
