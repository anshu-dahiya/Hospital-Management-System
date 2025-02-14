package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Edit_Doctor extends JFrame implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16;
    JTextField t1, t2, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
    JPasswordField t3;
    JButton bt1, bt2;
    String username;

    Edit_Doctor(String username) {
        this.username = username;
        f = new JFrame("Edit Doctor");
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 900, 600);
        l1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/HMS icons/14.jpg"));
        Image i1 = img.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1.setIcon(img1);

        l2 = new JLabel("Edit Doctor Details");
        l2.setBounds(280, 30, 500, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);
        f.add(l1);

        l3 = new JLabel("Name");
        l3.setBounds(50, 150, 150, 25);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setForeground(Color.BLACK);
        l1.add(l3);

        t1 = new JTextField();
        t1.setBounds(200, 150, 150, 25);
        l1.add(t1);

        l4 = new JLabel("Username");
        l4.setBounds(450, 150, 200, 25);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l4.setForeground(Color.BLACK);
        l1.add(l4);

        t2 = new JTextField();
        t2.setBounds(600, 150, 150, 25);
        l1.add(t2);
        t2.setText(username);
        t2.setEditable(false);

        l5 = new JLabel("Password");
        l5.setBounds(50, 200, 100, 25);
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setForeground(Color.BLACK);
        l1.add(l5);

        t3 = new JPasswordField();
        t3.setBounds(200, 200, 150, 25);
        l1.add(t3);

        l6 = new JLabel("Date of Birth");
        l6.setBounds(450, 200, 200, 25);
        l6.setFont(new Font("Arial", Font.BOLD, 20));
        l6.setForeground(Color.BLACK);
        l1.add(l6);

        t4 = new JTextField();
        t4.setBounds(600, 200, 150, 25);
        l1.add(t4);

        l7 = new JLabel("Address");
        l7.setBounds(50, 250, 100, 25);
        l7.setFont(new Font("Arial", Font.BOLD, 20));
        l7.setForeground(Color.BLACK);
        l1.add(l7);

        t5 = new JTextField();
        t5.setBounds(200, 250, 150, 25);
        l1.add(t5);

        l8 = new JLabel("Phone");
        l8.setBounds(450, 250, 100, 25);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setForeground(Color.BLACK);
        l1.add(l8);

        t6 = new JTextField();
        t6.setBounds(600, 250, 150, 25);
        l1.add(t6);

        l9 = new JLabel("Email ID");
        l9.setBounds(50, 300, 150, 25);
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setForeground(Color.BLACK);
        l1.add(l9);

        t7 = new JTextField();
        t7.setBounds(200, 300, 150, 25);
        l1.add(t7);

        l10 = new JLabel("City");
        l10.setBounds(450, 300, 150, 25);
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setForeground(Color.BLACK);
        l1.add(l10);

        t8 = new JTextField();
        t8.setBounds(600, 300, 150, 25);
        l1.add(t8);

        l11 = new JLabel("Gender");
        l11.setBounds(50, 350, 100, 25);
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setForeground(Color.BLACK);
        l1.add(l11);

        t9 = new JTextField();
        t9.setBounds(200, 350, 150, 25);
        l1.add(t9);

        l12 = new JLabel("Blood Group");
        l12.setBounds(450, 350, 140, 25);
        l12.setFont(new Font("Arial", Font.BOLD, 20));
        l12.setForeground(Color.BLACK);
        l1.add(l12);

        t10 = new JTextField();
        t10.setBounds(600, 350, 150, 25);
        l1.add(t10);

        l13 = new JLabel("Age");
        l13.setBounds(450, 400, 100, 25);
        l13.setFont(new Font("Arial", Font.BOLD, 20));
        l13.setForeground(Color.BLACK);
        l1.add(l13);

        t11 = new JTextField();
        t11.setBounds(600, 400, 150, 25);
        l1.add(t11);

        l14 = new JLabel("Clinic Number");
        l14.setBounds(450, 450, 150, 25);
        l14.setFont(new Font("Arial", Font.BOLD, 20));
        l14.setForeground(Color.BLACK);
        l1.add(l14);

        t12 = new JTextField();
        t12.setBounds(600, 450, 150, 25);
        l1.add(t12);

        l15 = new JLabel("Joining Date");
        l15.setBounds(50, 400, 120, 25);
        l15.setFont(new Font("Arial", Font.BOLD, 20));
        l15.setForeground(Color.BLACK);
        l1.add(l15);

        t13 = new JTextField();
        t13.setBounds(200, 400, 150, 25);
        l1.add(t13);

        l16 = new JLabel("Specialization");
        l16.setBounds(50, 450, 140, 25);
        l16.setFont(new Font("Arial", Font.BOLD, 20));
        l16.setForeground(Color.BLACK);
        l1.add(l16);

        t14 = new JTextField();
        t14.setBounds(200, 450, 150, 25);
        l1.add(t14);

        bt1 = new JButton("Submit");
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt1.setBounds(250, 500, 150, 40);
        l1.add(bt1);

        bt2 = new JButton("Cancel");
        bt2.setBackground(Color.RED);
        bt2.setForeground(Color.WHITE);
        bt2.setBounds(450, 500, 150, 40);
        l1.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        f.setVisible(true);
        f.setSize(900, 600);
        f.setLocation(300, 100);

        loadDoctorDetails();
    }

    private void loadDoctorDetails() {
        try {
            ConnectionClassHMS obj = new ConnectionClassHMS();
            String q = "select * from doctor where username='" + username + "'";
            ResultSet rs = obj.stm.executeQuery(q);
            if (rs.next()) {
                t1.setText(rs.getString("name"));
                t3.setText(rs.getString("password"));
                t4.setText(rs.getString("dob"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t7.setText(rs.getString("email"));
                t8.setText(rs.getString("city"));
                t9.setText(rs.getString("gender"));
                t10.setText(rs.getString("blood"));
                t11.setText(rs.getString("age"));
                t12.setText(rs.getString("clinic_no"));
                t13.setText(rs.getString("joining_date"));
                t14.setText(rs.getString("specialization"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            String name = t1.getText();
            String password = new String(t3.getPassword());
            String dob = t4.getText();
            String address = t5.getText();
            String phone = t6.getText();
            String email = t7.getText();
            String city = t8.getText();
            String gender = t9.getText();
            String blood = t10.getText();
            String age = t11.getText();
            String clinic_no = t12.getText();
            String joining_date = t13.getText();
            String specialization = t14.getText();

            try {
                ConnectionClassHMS obj = new ConnectionClassHMS();
                String q = "update doctor set name='" + name + "', password='" + password + "', dob='" + dob + "', address='" + address + "', phone='" + phone + "', email='" + email + "', city='" + city + "', gender='" + gender + "', blood='" + blood + "', age='" + age + "', clinic_no='" + clinic_no + "', joining_date='" + joining_date + "', specialization='" + specialization + "' where username='" + username + "'";
                obj.stm.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Doctor Details Updated Successfully");
                f.setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == bt2) {
            f.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Edit_Doctor("username_to_edit");
    }
}
