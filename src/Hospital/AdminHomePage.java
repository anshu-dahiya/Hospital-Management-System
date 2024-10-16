package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AdminHomePage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f, f1, f2;

    AdminHomePage()
    {
        super("Admin Home Page");
        setLocation(0,0);
        setSize(1500, 730);

        // Initialize l1
        l1 = new JLabel();
        
        // Adding image on Label(l1)
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Hospital/HMS icons/12.jpg"));
        Image i1 = img.getImage().getScaledInstance(1500,900, Image.SCALE_SMOOTH);
        ImageIcon img1 = new ImageIcon(i1);
        l1.setIcon(img1);

        f = new Font("Lucida Fax", Font.BOLD, 20);
        f2 = new Font("Gadugi", Font.BOLD, 35);
        f1 = new Font("MA UI Gothic", Font.BOLD, 18);

        JMenuBar m1 = new JMenuBar();
        JMenu men1 = new JMenu("Doctor");
        JMenuItem ment1 = new JMenuItem("Add Doctor");
        JMenuItem ment2 = new JMenuItem("View Doctor");  // Corrected from JMenu to JMenuItem

        JMenu men2 = new JMenu("Patient");
        JMenuItem ment3 = new JMenuItem("Add Patient");
        JMenuItem ment4 = new JMenuItem("View Patient");

        JMenu men3 = new JMenu("Receptionist");
        JMenuItem ment5 = new JMenuItem("Add Receptionist");
        JMenuItem ment6 = new JMenuItem("View Receptionist");  // Corrected from JMenu to JMenuItem

        JMenu men4 = new JMenu("Appointment");
        JMenuItem ment7 = new JMenuItem("Add Appointment");
        JMenuItem ment8 = new JMenuItem("View Appointment");

        JMenu men5 = new JMenu("Admin");
        JMenuItem ment9 = new JMenuItem("My Profile");
        JMenuItem ment10 = new JMenuItem("Change Password");  // Corrected from JMenu to JMenuItem

        JMenu men6 = new JMenu("Exit");
        JMenuItem ment11 = new JMenuItem("Exit");

        men1.add(ment1);
        men1.add(ment2);
        men2.add(ment3);
        men2.add(ment4);
        men3.add(ment5);
        men3.add(ment6);
        men4.add(ment7);
        men4.add(ment8);
        men5.add(ment9);
        men5.add(ment10);
        men6.add(ment11);

        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
        m1.add(men6);

        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
        men6.setFont(f);

        ment1.setFont(f1);
        ment2.setFont(f1);
        ment3.setFont(f1);
        ment4.setFont(f1);
        ment5.setFont(f1);
        ment6.setFont(f1);
        ment7.setFont(f1);
        ment8.setFont(f1);
        ment9.setFont(f1);
        ment10.setFont(f1);
        ment11.setFont(f1);

        m1.setBackground(Color.BLACK);

        men1.setForeground(Color.GRAY);
        men2.setForeground(Color.GRAY);
        men3.setForeground(Color.GRAY);
        men4.setForeground(Color.GRAY);
        men5.setForeground(Color.GRAY);
        men6.setForeground(Color.RED);

        ment1.setForeground(Color.YELLOW);
        ment2.setForeground(Color.YELLOW);
        ment3.setForeground(Color.YELLOW);
        ment4.setForeground(Color.YELLOW);
        ment5.setForeground(Color.YELLOW);
        ment6.setForeground(Color.YELLOW);
        ment7.setForeground(Color.YELLOW);
        ment8.setForeground(Color.YELLOW);
        ment9.setForeground(Color.YELLOW);
        ment10.setForeground(Color.YELLOW);
        ment11.setForeground(Color.RED);

        ment1.setBackground(Color.BLACK);
        ment2.setBackground(Color.BLACK);
        ment3.setBackground(Color.BLACK);
        ment4.setBackground(Color.BLACK);
        ment5.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment7.setBackground(Color.BLACK);
        ment8.setBackground(Color.BLACK);
        ment9.setBackground(Color.BLACK);
        ment10.setBackground(Color.BLACK);
        ment11.setBackground(Color.BLACK);

        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment4.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment10.addActionListener(this);
        ment11.addActionListener(this);

        setJMenuBar(m1);
        add(l1);
    }

    public void actionPerformed(ActionEvent e)
    {
        
        String cmd=e.getActionCommand();
        if(cmd.equals("Add Doctor"))
        {
            new Add_Doctor();
        }
        else if(cmd.equals("View Doctor"))
        {
            new View_Doctor().setVisible(true);
        }
        else if(cmd.equals("Add Patient"))
        {
            new Add_Patient().setVisible(true);
        }
        else if(cmd.equals("View Patient"))
        {
            new View_Patient().setVisible(true);
        }
        else if(cmd.equals("Add Receptionist"))
        {
            new Add_Receptionist().setVisible(true);
        }
        else if(cmd.equals("View Receptionist"))
        {
            new View_Receptionist();
        }
        else if(cmd.equals("Add Appointment"))
        {
            new Add_Appointment().setVisible(true);
        }
        else if(cmd.equals("View Appointment"))
        {
            new View_Appointment().setVisible(true);
        }
        
        else if(cmd.equals("Exit"))
        {
            System.exit(0);
        }  
     
    }

    public static void main(String[] args)
    {
        new AdminHomePage().setVisible(true);
    }
}
