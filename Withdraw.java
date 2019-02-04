/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo pc
 */
public class Withdraw  {
    CardLayout card;
    Withdraw()
    {
     JPanel p=new JPanel();
     p.setBounds(0,0,500,600);
     p.setBackground(Color.red);
  JFrame  f=new JFrame();
   // card =new CardLayout(30,40);
      ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/best7.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/submit3.png");

  
    JLabel l=new JLabel("Withdraw your balance in accounts");
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
     JLabel tn=new JLabel();
      tn.setBounds(220,260,200,40);
      JLabel td=new JLabel();
       td.setBounds(220,315,200,40);
      JTextField tm=new JTextField();
       tm.setBounds(220,100,200,40);
      JLabel tr=new JLabel();
       tr.setBounds(220,390,200,40);
      l.setBounds(100,10,200,40);
        acount.setBounds(100,50,100,40);
          name.setBounds(100,260,100,40);
            dob.setBounds(100,315,100,40);
              amount.setBounds(100,100,200,40);
              btn.setBounds(220,190,160,50);
              btnb.setBounds(10,500,160,50);
              balance.setBounds(100,400,200,40);
              total.setBounds(100,390,200,40);
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
                    
               
    f.setSize(500,600);
    f.setVisible(true);
    f.setLayout(card);
     btnb.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
   
   
     btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
 try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
  Statement  st=conn.createStatement();
  
   String total;
               total = tm.getText();
      int r=Integer.parseInt(total); 
             
      String send=ta.getText();
      int r1=Integer.parseInt(send);
        conn.setAutoCommit(false);
          st.executeUpdate("Update mainbanking2 set balance=balance-" +r+ "where account_no=" +r1 ); 
          int res[]=st.executeBatch();
          boolean flag=false;
          for(int i=0;i<res.length;++i)
          {
              if(res[i]==0)
              {
                  flag=true;
                  break;
              }
          }
          if(flag==true)
          {
              conn.rollback();
              System.out.println("transaction is rollback but Amount is not transfer");
              
          }
          else
          {
              conn.commit();
              System.out.println("transaction is completed");
          } 
          PreparedStatement  ps = conn.prepareStatement("select*from mainbanking2 where account_no="+r1);
      
     ResultSet rs=ps.executeQuery();
      if(rs.next())
         {
             String s=rs.getString(18);
             tr.setText(s);
              String s1=rs.getString(1);
             tn.setText(s1);
              String s2=rs.getString(7);
             td.setText(s2);
             
         }
          else {

                JOptionPane.showMessageDialog(null, "Name not Found");

            }
     
        
    

     // JOptionPane.showMessageDialog(f,"insert values");
System.out.println("inseart values load");
 ps.executeUpdate();
 
      st.close();
      rs.close();
       
    conn.close();
           
      } catch(Exception e)
      {
           JOptionPane.showMessageDialog(f,"not insert values");
       System.out.println("load driver but value is not inseart");
      }
  }});
    }
    public static void main(String[] args) {
       new Withdraw();
    }
    
    
    
}
