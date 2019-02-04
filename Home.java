/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo pc
 */
public class Home {
    Home()
    {
     JPanel p=new JPanel();
     p.setBounds(10,20,500,500);
     p.setBackground(Color.yellow);
  JFrame  f=new JFrame();
     
      ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/submit3.png");

  
    JLabel l=new JLabel("HOME LOAN FROM BANK");
    JLabel acount=new JLabel("Account no."); 
    JLabel name=new JLabel("Name.");
    JLabel dob=new JLabel("Mobile no."); 
    JLabel amount=new JLabel("Amounts"); 
    JLabel balance=new JLabel("Total Balance"); 
    JLabel total=new JLabel("");
    JButton btn=new JButton(icon1);
    JButton btnb=new JButton(icon);
    JTextField ta=new JTextField();
    ta.setBounds(220,50,200,40);
     JTextField tn=new JTextField();
      tn.setBounds(220,100,200,40);
      JTextField td=new JTextField();
       td.setBounds(220,150,200,40);
      JTextField tm=new JTextField();
       tm.setBounds(220,200,200,40);
      JTextField tr=new JTextField();
       tr.setBounds(220,300,200,60);
      l.setBounds(100,10,200,40);
        acount.setBounds(100,50,100,40);
          name.setBounds(100,100,100,40);
            dob.setBounds(100,150,100,40);
              amount.setBounds(100,200,200,40);
              btn.setBounds(200,400,150,50);
              btnb.setBounds(20,400,150,50);
              balance.setBounds(100,300,200,40);
              total.setBounds(100,300,200,40);
      f.add(l);
        f.add(acount);
          f.add(name);
            f.add(dob);
              f.add(ta);
                f.add(tn);
                  f.add(td);
                   f.add(btn);
                    f.add(btnb);
                    f.add(tm);
                    f.add(tr);
                     f.add(amount);
                      f.add(balance);
                      f.add(total);
                       f.add(p);
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
    
    
    String insertdata="insert into homeloan values(?,?,?,?)";
       PreparedStatement  ps = conn.prepareStatement(insertdata);      
     ps.setString(1,ta.getText());
     ps.setString(2,tn.getText());
       ps.setString(3,td.getText());
         ps.setString(4,tm.getText());
         // ps.setString(5,tr.getText());
         
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
   
   
    public static void main(String[] args) {
       new Home();
    
}
    }
    

