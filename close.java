/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo pc
 */
public class close {
    
     close()
    {
     JPanel p=new JPanel();
     p.setBounds(10,20,500,500);
     p.setBackground(Color.yellow);
  JFrame  f=new JFrame();
        ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/best7.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/submit3.png");

   JLabel l=new JLabel("Close Accounts");
    JLabel acount=new JLabel("Account no."); 
    JLabel name=new JLabel("Name.");
    JLabel dob=new JLabel("Mobile no.");  
   JLabel balance=new JLabel("Total Balance");
    JButton btn=new JButton(icon1);
    JButton btnb=new JButton(icon);
    JTextField ta=new JTextField();
    ta.setForeground(Color.blue);
    ta.setBounds(220,50,200,40);
     JLabel tn=new JLabel();
      tn.setBounds(220,200,200,40);
      tn.setForeground(Color.blue);
      JLabel td=new JLabel();
       td.setBounds(220,250,200,40);
       td.setForeground(Color.blue);
      JLabel tr=new JLabel();
       tr.setBounds(220,300,200,60);
       tr.setForeground(Color.blue);
       
       
        balance.setBounds(100,300,200,40);
      l.setBounds(100,10,200,40);
        acount.setBounds(100,50,100,40);
          name.setBounds(100,200,100,40);
            dob.setBounds(100,250,100,40);
             
              btn.setBounds(220,130,160,50);
              btnb.setBounds(20,400,160,50);
             
      f.add(l);
        f.add(acount);
          f.add(name);
            f.add(dob);
              f.add(ta);
                f.add(tn);
                  f.add(td);
                   f.add(btn);
                    f.add(btnb);
                
                    f.add(tr);
                    
                     f.add(balance);
                     
    f.add(p);
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
     btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
         try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
        Statement st=conn.createStatement();
     String send=ta.getText();
    int r1=Integer.parseInt(send);
        
         
          PreparedStatement  ps = conn.prepareStatement("select*from mainbanking2 where account_no="+r1);
      
     ResultSet rs=ps.executeQuery();
      if(rs.next())
         {
             String s=rs.getString(1);
             tn.setText(s);
             String s1=rs.getString(7);
             td.setText(s1);
             String s2=rs.getString(18);
             tr.setText(s2);
             
         }
         
          st.executeUpdate("delete from mainbanking2 where account_no="+r1);
          
         JOptionPane.showMessageDialog(f,"Account is  deleted successfully");
         }catch(HeadlessException | ClassNotFoundException | SQLException e)
         {
                     JOptionPane.showMessageDialog(f,"Account is not found");
 
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
       new close();
    
}
    
}
