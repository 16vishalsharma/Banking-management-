/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lenovo pc
 */
public class ATM {
    ATM()
    {
        JFrame f=new JFrame();
          JPanel p=new JPanel();
        p.setBounds(0,0,500,500);
        p.setBackground(Color.gray);
        ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/sub1.png");

        JButton btnb=new JButton(icon);
         JButton btn=new JButton(icon1);
        btnb.setBounds(20,400,160,50);
        btn.setBounds(200,400,160,50);      
         JLabel ins=new JLabel("Application form for ATM ");
         JLabel account=new JLabel("Account_no");
          JLabel customer=new JLabel("DOB");
           JLabel name=new JLabel("Name");
            JLabel mobile=new JLabel("Mobile_no");
             JLabel martial=new JLabel("Martial");
              JLabel Address=new JLabel("Address");
                JLabel policy=new JLabel("Aadhar_no");
                 JLabel gender=new JLabel("Gender");
               // String arr[]={"100","300","400","500","800","1600","2000","4000","6000","10000","30000"};
               JTextField ch=new JTextField();
               JTextField taccount=new JTextField();
               JTextField tcustomer=new JTextField();
               JTextField tname=new JTextField();
               JTextField tmobile=new JTextField();
               JRadioButton male=new JRadioButton("Male");
               JRadioButton female=new JRadioButton("Female");
               ins.setBounds(100,20,300,50);
               account.setBounds(100,70,150,40);
               taccount.setBounds(200,70,200,40);
               customer.setBounds(100,130,80,40);
               tcustomer.setBounds(200,130,200,40);
               name.setBounds(100,180,80,40);
               tname.setBounds(200,180,200,40);
               mobile.setBounds(100,230,80,40);
               tmobile.setBounds(200,230,200,40);
               gender.setBounds(100,280,80,40);
                male.setBounds(200,280,85,40);
               female.setBounds(310,280,85,40);
               policy.setBounds(100,330,80,40);
               ch.setBounds(200,330,200,40);
               
               
               
         f.add(ins);
         f.add(account);
         f.add(taccount);
         f.add(mobile);
         f.add(tmobile);
         f.add(male);
         f.add(female);
         f.add(policy);
         f.add(ch);
         f.add(customer);
         f.add(tcustomer);
         f.add(name);
         f.add(tname);
         f.add(gender);
       
         
        f.add(btn);
        f.add(btnb);
        f.add(p);
        f.setSize(500,500);
         f.setVisible(true);
         f.setLayout(null);
         btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      JFrame f1=new JFrame();
       JPanel p=new JPanel();
        p.setBounds(0,0,400,400);
        p.setBackground(Color.gray);
        JButton b=new JButton(" ");
        
     CardLayout   c=new CardLayout(20,50);
        
       p.setLayout(c);
       p.add(b);
       f1.add(p);
       
       f1.setSize(400,400);
       f1.setVisible(true);
       f.setVisible(false);
      
            
   
  }});
         btnb.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
    }
    public static void main(String args[])
    {
        new ATM();
    }
    
                
    }
    

