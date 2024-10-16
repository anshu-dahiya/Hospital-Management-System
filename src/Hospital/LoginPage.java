package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener
{
    JFrame f;
    JPanel p;
    JLabel l1,l2,l3,l4;
    JTextField tf;
    JPasswordField pf;
    JButton bt1,bt2;
    
    LoginPage()
    {
        //Cretaing a Frame
        f=new JFrame("Login Page");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        //Creating Labels
        l1=new JLabel();
        l1.setBounds(0,0,700,350);
        l1.setLayout(null);
        
        //adding image on Label(l1) 
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Hospital/HMS icons/36.jpg"));
        Image i1=img.getImage().getScaledInstance(700,400, Image.SCALE_SMOOTH);
        ImageIcon img1=new ImageIcon(i1);
        l1.setIcon(img1);
        f.add(l1); //adding Label(l1) in Frame
        
        l2=new JLabel("Login Page");
        l2.setBounds(190,30,500,50);
        l2.setFont(new Font("Airal",Font.BOLD,30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);  //adding Label(l2) on Label(l1)
          
        l3=new JLabel("Username : ");
        l3.setBounds(130,120,150,30);
        l3.setFont(new Font("Airal",Font.BOLD,20));
        l3.setForeground(Color.BLACK);
        l1.add(l3);  //adding Label(l3) on Label(l1)
        
        l4=new JLabel("Password : ");
        l4.setBounds(130,170,150,30);
        l4.setFont(new Font("Airal",Font.BOLD,20));
        l4.setForeground(Color.BLACK);
        l1.add(l4);  //adding Label(l4) on Label(l1)
       
        //creating TextField
        tf=new JTextField();
        tf.setBounds(310,120,150,30);
        l1.add(tf);  //adding TextField(tf) on Label(l1)
                
        //creating PasswordField
        pf=new JPasswordField();
        pf.setBounds(310,170,150,30);
        l1.add(pf);  //adding PasswordField(tf) on Label(l1)
        
        
        //creating Buttons        
        bt1=new JButton("Login");
        bt1.setBounds(130,220,150,40);
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        l1.add(bt1); //adding Button(bt1) on Label(l1)
        
        bt2=new JButton("Back");
        bt2.setBounds(310,220,150,40);
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.WHITE);
        l1.add(bt2); //adding Button(bt2) on Label(l1)

        
        //adding ActionListner to every button, so Buttons can perform their Actions 
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        f.setSize(580, 380);  //Frame Size
        f.setLocation(500, 200);
        f.setVisible(true); //this should be written after all things added other wise added things will not visible on Frame 
        f.setResizable(false);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            
            try
            {
                //Creating Connection with database 
                ConnectionClassHMS obj=new ConnectionClassHMS();
                String name=tf.getText(); 
                String pass=pf.getText();
                String q="select * from admin where username ='"+name+"' and password= '"+pass+"'";
                ResultSet rs=obj.stm.executeQuery(q);
                
                if(rs.next())
                   {
                       
                       new AdminHomePage().setVisible(true);
                       f.setVisible(false);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"You have entered Wrong Username or Password");
                       f.setVisible(false);
                       f.setVisible(true);
                   }
                
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        
        }
        
        if(ae.getSource()==bt2)
        {
            //if bt2(Back) Button is Clicked Then the LoginPage Frame will close and Index page will be get Open 
            this.f.setVisible(false);
            new Index();
        
        }
    }
    
    public static void main(String args[])
    {
          new LoginPage();   
    }
    
}
