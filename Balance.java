/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;


import java.awt.*;
import registration.ATM;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import registration.MainBank1;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author lenovo pc
 */
public class Balance {
    
   Balance()
   {
   JFrame f=new JFrame();
     JPanel p=new JPanel();
     p.setBounds(0,0,500,600);
     p.setBackground(Color.yellow);
   // card =new CardLayout(30,40);
   f.setLayout(null);
   ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
         ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/submit3.png");

   JLabel l=new JLabel("Balance enquire  your balance in accounts");
    JLabel acount=new JLabel("Account no."); 
    JLabel name=new JLabel("Name.");
    JLabel mobile=new JLabel("Mobile no."); 
    JLabel Birth=new JLabel("Date_of_Birth"); 
    JLabel balance=new JLabel("Total Balance"); 
    JLabel total=new JLabel("");
    JButton btn=new JButton(icon1);
    JButton btnb=new JButton(icon);
    JTextField ta=new JTextField();
    ta.setBounds(220,50,200,40);
     JLabel tn=new JLabel();
      tn.setBounds(220,200,200,40);
      tn.setForeground(Color.red);
      JLabel tmobile=new JLabel();
       tmobile.setBounds(220,250,200,40);
       tmobile.setForeground(Color.red);
      JLabel td=new JLabel();
       td.setBounds(220,300,50,40);
       td.setForeground(Color.red);
       JLabel tm=new JLabel();
       tm.setBounds(290,300,50,40);
       tm.setForeground(Color.red);
       JLabel ty=new JLabel();
       ty.setBounds(370,300,50,40);
       ty.setForeground(Color.red);
      JLabel tr=new JLabel();
       tr.setBounds(220,350,200,60);
       tr.setForeground(Color.red);
      l.setBounds(100,10,300,40);
        acount.setBounds(100,50,100,40);
        ta.setForeground(Color.red);
          name.setBounds(100,200,100,40);
            mobile.setBounds(100,250,100,40);
              Birth.setBounds(100,300,200,40);
              btn.setBounds(200,130,160,50);
              btnb.setBounds(20,450,160,50);
              balance.setBounds(100,370,200,40);
              total.setBounds(100,370,200,40);
      f.add(l);
        f.add(acount);
          f.add(name);
            f.add(mobile);
              f.add(ta);
                f.add(tn);
                  f.add(tmobile);
                   f.add(btn);
                    f.add(btnb);
                    f.add(td);
                     f.add(tm);
                      f.add(ty);
                    f.add(tr);
                     f.add(Birth);
                      f.add(balance);
                      f.add(total);
                      f.add(btn);
                       f.add(p);
          
   
    f.setSize(500,600);
    f.setVisible(true);
   // f.setLayout(null);
   
    btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
 try{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
      // Statement st=conn.createStatement();
       String send=ta.getText();
      int r1=Integer.parseInt(send);
      
      
  PreparedStatement  ps = conn.prepareStatement("select*from mainbanking2 where account_no="+r1);
      
         ResultSet rs=ps.executeQuery();
        if(rs.next())
         {
              String s1=rs.getString(1);
              String s3=rs.getString(7);
              String s4=rs.getString(15);
              String s5=rs.getString(16);
              String s6=rs.getString(17);
              
             String s7=rs.getString(18);
              tn.setText(s1);
               tmobile.setText(s3);
                td.setText(s4);
                 tm.setText(s5);
                 ty.setText(s6);
                  tr.setText(s7);
             
         }
          else {

                JOptionPane.showMessageDialog(null, "Name not Found");

            }
     /* while(rs.next())
        {
          System.out.println(rs.getString(1)+" "+rs.getInt(20));
        }*/
         JOptionPane.showMessageDialog(f, "values is insert");
         ps.executeUpdate();
         conn.close();
         rs.close();
 }catch(Exception e)
 {
   JOptionPane.showMessageDialog(f, "Account is not found");  
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
       new Balance();
    }
    
    
}
