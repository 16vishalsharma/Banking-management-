/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author lenovo pc
 */
public class Insurence {
    
    Insurence()
    {
         JFrame f=new JFrame();
          JPanel p=new JPanel();
        p.setBounds(0,0,500,500);
        p.setBackground(Color.yellow);
         ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/sub1.png");

        JButton btnb=new JButton(icon);
         JButton btn=new JButton(icon1);
        btnb.setBounds(20,400,150,50);
        btn.setBounds(200,400,150,50);      
         JLabel ins=new JLabel("Application from for Life Insurence");
         JLabel account=new JLabel("Account_no");
          JLabel customer=new JLabel("Customer_ID");
           JLabel name=new JLabel("Name");
            JLabel mobile=new JLabel("Mobile_no");
             JLabel martial=new JLabel("Martial");
              JLabel Address=new JLabel("Address");
                JLabel policy=new JLabel("Policy_type");
                 JLabel gender=new JLabel("Gender");
                String arr[]={"100","300","400","500","800","1600","2000","4000","6000","10000","30000"};
               JComboBox ch=new JComboBox(arr);
               JTextField taccount=new JTextField();
               JTextField tcustomer=new JTextField();
               JTextField tname=new JTextField();
               JTextField tmobile=new JTextField();
               ButtonGroup b=new ButtonGroup();
               JRadioButton male=new JRadioButton("Male");
               JRadioButton female=new JRadioButton("Female");
               b.add(male);
               b.add(female);
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
    
          try{  Class.forName("oracle.jdbc.driver.OracleDriver");
        
 Connection   conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
    Statement st=conn.createStatement();  
   PreparedStatement  ps= conn.prepareStatement("insert into insurence values(?,?,?,?,?,?)");
   ps.setString(1,taccount.getText());
     ps.setString(2,tcustomer.getText());
       ps.setString(3,tname.getText());
         ps.setString(4,tmobile.getText());
          String gender =" ";
              if(male.isSelected())
              {
                 gender="Male"; 
              }
              if(female.isSelected())
              {
                  gender="Female";
              }
              ps.setString(5,gender);
              
              String marital;
              marital=ch.getSelectedItem().toString();
              ps.setString(6, marital);
   
         JOptionPane.showMessageDialog(null, " SUCCESSFULLY VALUE  INSERT!");
 ps.executeUpdate();
System.out.println("insert value are loaded");
conn.close();
ps.close();
   
   
   
          }catch(Exception e)
          {
             System.out.println(e); 
          }
            
   
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
        new Insurence();
    }
}
