/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.*;

/**
 *
 * @author lenovo pc
 */
public class createAccount {
    createAccount()
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
         JLabel ins=new JLabel("Application form for CreateAccount ");
         JLabel password=new JLabel("Password");
          JLabel customer=new JLabel("DOB");
           JLabel name=new JLabel("Name");
            JLabel mobile=new JLabel("Mobile_no");
             JLabel martial=new JLabel("Martial");
          
                JLabel email=new JLabel("Email_ID");
                 JLabel gender=new JLabel("Gender");
               // String arr[]={"100","300","400","500","800","1600","2000","4000","6000","10000","30000"};
               JTextField temail=new JTextField();
               JTextField tpassword=new JTextField();
               JTextField tcustomer=new JTextField();
               JTextField tname=new JTextField();
               JTextField tmobile=new JTextField();
               JRadioButton male=new JRadioButton("Male");
               JRadioButton female=new JRadioButton("Female");
               ButtonGroup gb=new ButtonGroup();
               gb.add(male);
               gb.add(female);
               ins.setBounds(100,20,300,50);
               password.setBounds(100,70,150,40);
               tpassword.setBounds(200,70,200,40);
               customer.setBounds(100,130,80,40);
               tcustomer.setBounds(200,130,200,40);
               name.setBounds(100,180,80,40);
               tname.setBounds(200,180,200,40);
               mobile.setBounds(100,230,80,40);
               tmobile.setBounds(200,230,200,40);
               gender.setBounds(100,280,80,40);
                male.setBounds(200,280,85,40);
               female.setBounds(310,280,85,40);
               email.setBounds(100,330,80,40);
               temail.setBounds(200,330,200,40);
               
               
               
         f.add(ins);
         f.add(password);
         f.add(tpassword);
         f.add(mobile);
         f.add(tmobile);
         f.add(male);
         f.add(female);
         f.add(email);
         f.add(temail);
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
        
       Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
    
    
    String insertdata="insert into administrator values(?,?,?,?,?,?)";
       PreparedStatement  ps = conn.prepareStatement(insertdata);      
             ps.setString(1,tname.getText());                   
             int r=Integer.parseInt(tpassword.getText());
             ps.setInt(2,r);   
            
             Double r3=Double.parseDouble(tmobile.getText());
             ps.setDouble(3,r3);
           ps.setString(4,temail.getText());
           
              String gender ="Female";
              if(male.isSelected())
              {
                 gender="Male"; 
              }
             /* if(female.isSelected())
              {
                  gender="Female";
              }*/
              ps.setString(5,gender); 
              
             ps.setString(6,tcustomer.getText());    
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
      new Administration().setVisible(true);
   
  }});
    }
    public static void main(String args[])
    {
        new createAccount();
    }

    void setVisible(boolean b) {
        System.out.println(b);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
                
    }
    


