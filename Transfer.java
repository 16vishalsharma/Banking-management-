/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo pc
 */
public class Transfer 
{
        Transfer()
{
     JPanel p=new JPanel();
     p.setBounds(10,20,500,600);
     p.setBackground(Color.blue);
  JFrame  f=new JFrame();
   f.setLayout(null);
    JLabel l=new JLabel("Transfer balance in accounts");
       ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
        ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/sub1.png");

    JLabel account=new JLabel("Customer_Account no."); 
    JLabel transferaccount=new JLabel("transfer Acc_no.");
    JLabel mobile=new JLabel("Mobile no."); 
    JLabel name=new JLabel("Name"); 
      JLabel amount=new JLabel("Amounts"); 
    JLabel balance=new JLabel("Total Balance"); 
    JLabel total=new JLabel("");
    JButton btn=new JButton(icon1);
    JButton btnb=new JButton(icon);
    JTextField ta=new JTextField();
    ta.setBounds(220,50,200,40);
     ta.setForeground(Color.red);
     JTextField transfer=new JTextField();
      JLabel tn=new JLabel();
       tn.setBounds(220,300,200,40);
        tn.setForeground(Color.red);
      transfer.setBounds(220,100,200,40);
       transfer.setForeground(Color.red);
      JLabel tmobile=new JLabel();
       tmobile.setBounds(220,350,200,40);
        tmobile.setForeground(Color.red);
      JTextField tm=new JTextField();
       tm.setBounds(220,150,200,40);
        tm.setForeground(Color.red);
   JLabel tr=new JLabel();
       tr.setBounds(220,400,200,40);
       tr.setForeground(Color.red);
      l.setBounds(100,10,300,40);
        account.setBounds(60,50,250,40);
         transferaccount.setBounds(100,100,100,40);
          name.setBounds(100,300,100,40);
            mobile.setBounds(100,350,100,40);
              amount.setBounds(100,150,200,40);
              btn.setBounds(220,220,160,50);
              btnb.setBounds(20,500,160,50);
              balance.setBounds(100,400,200,40);
              total.setBounds(100,400,200,40);
      f.add(l);
        f.add(account);
          f.add(transferaccount);
            f.add(mobile);
            f.add(name);
              f.add(ta);
              f.add(tn);
                f.add(transfer);
                  f.add(tmobile);
                   f.add(btn);
                    f.add(btnb);
                    f.add(tm);
                    f.add(tr);
                     f.add(amount);
                      f.add(balance);
                                  
                      f.add(btn);
                      f.add(total);
                       f.add(p);
          
     //acount no
  
       
    f.setSize(500,600);
    f.setVisible(true);
   btn.addActionListener(new ActionListener() {
   
       public void actionPerformed(ActionEvent event)
       {
           try {
               Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
        Statement st=conn.createStatement();
        
     
      String total;
               total = tm.getText();
      int r=Integer.parseInt(total); 
             
      String send=ta.getText();
      int r1=Integer.parseInt(send);
      
      String recever=transfer.getText();
      int r2=Integer.parseInt(recever);
       conn.setAutoCommit(false);
       //addBath
        // st.addBatch("Update banking set balance=balance-" +r+ "where account=" +r1); 
          st.executeUpdate("Update mainbanking2 set balance=balance-" +r+ "where account_no=" +r1); 
          st.executeUpdate("Update mainbanking2 set balance=balance+"+r+"where account_no="+r2);
          
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
         PreparedStatement  ps = conn.prepareStatement("select*from mainbanking2 where account_no="+r2);
      
     ResultSet rs=ps.executeQuery();
      if(rs.next())
         {
             String s=rs.getString(18);
             tr.setText(s);
             String s1=rs.getString(1);
             tn.setText(s1);
             String s2=rs.getString(7);
             tmobile.setText(s2);
             
         }
          else {

                JOptionPane.showMessageDialog(null, "Name not Found");

            }
     
       
     
     ps.executeUpdate();
     conn.close();
     rs.close();

   JOptionPane.showMessageDialog(null, " SUCCESSFULLY VALUE  INSERT!");
   
           } catch (Exception ex) {
   JOptionPane.showMessageDialog(null, " Driver load but values is not insert!");
           }
       }
   
   } );
  
      btnb.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
   }
   
   
    public static void main(String[] args) {
       new Transfer();
    
}
}
