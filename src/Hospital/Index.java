package Hospital;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener
{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JButton b1,b2,b3,b4;
    
    Index()
    {    
        //counstructing the Frame and adding its Parameters
        f=new JFrame("Index Page");
        f.setBackground(Color.WHITE);
        f.setSize(800,570);
        f.setLocation( 300, 100);
        f.setVisible(true);
        f.setResizable(false);
        
        //counstructing Labels 
        l1=new JLabel();
        l1.setBounds(0,0,800,570);
        l1.setLayout(null);
        
        //adding image on Label(l1) 
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Hospital/HMS icons/5.jpg"));
        Image i1=img.getImage().getScaledInstance(800, 570, Image.SCALE_SMOOTH);
        ImageIcon img1=new ImageIcon(i1);
        l1.setIcon(img1);
        f.add(l1); //adding Label(l1) in Frame
       
        
        l2=new JLabel("Anshu Medical Group");
        l2.setBounds(70,315,500,30);
        l2.setFont(new Font("Airal",Font.BOLD,30));
        l2.setForeground(Color.BLACK);
        l1.add(l2);  //adding Label(l2) on Label(l1)
          
        l3=new JLabel("Provide best quality healthcare for you");
        l3.setBounds(86,340,500,30);
        l3.setFont(new Font("Airal",Font.BOLD,13));
        l3.setForeground(Color.BLACK);
        l1.add(l3);  //adding Label(l3) on Label(l1)
        
       
        //counstructing Buttons
        b1=new JButton("Doctor");
        b1.setBounds(50,390,150,40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        l1.add(b1); //adding Button(b1) on Label(l1)
        
        b2=new JButton("Patient");
        b2.setBounds(220,390,150,40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        l1.add(b2); //adding Button(b2) on Label(l1)
        
        b3=new JButton("Receptionist");
        b3.setBounds(50,450,150,40);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        l1.add(b3); //adding Button(b3) on Label(l1)
        
        b4=new JButton("Admin");
        b4.setBounds(220,450,150,40);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        l1.add(b4); //adding Button(b4) on Label(l1)
        
        //adding ActionListner to every button, so Buttons can perform their Actions 
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        
        f.setVisible(true);  //this should be written after all things added other wise added things will not visible on Frame 
         
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        //if any of the Button is Clicked Then the Index Frame will close and New Login page will be get Open 
        if(ae.getSource()==b1)
        {  
           String cmd=ae.getActionCommand();
           new Add_Doctor();          
        }
        
        if(ae.getSource()==b2)
        {
           String cmd=ae.getActionCommand();
           new Add_Patient();    
        }
        
        
        if(ae.getSource()==b3)
        {
           String cmd=ae.getActionCommand();
           new Add_Receptionist();    
        }
        
        if(ae.getSource()==b4)
        {
            f.setVisible(false);
            new LoginPage();
        }
        
        
        
        
    }
    
    public static void main(String args[])
    {
        new Index();
    }
    
    
}
