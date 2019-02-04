/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

/**
 *
 * @author lenovo pc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Deposit1  {
    JFrame f;
   
    Deposit1()
    {
   // new Administration().setVisible(true);  
    
    f=new JFrame("deposit form");
     f.setSize(500,600);
     JPanel p=new JPanel();
     p.setBounds(0, 0, 500, 600);
     p.setBackground(Color.gray);
    JLabel l=new JLabel("Deposit your balance in accounts");
  ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
      ImageIcon icon1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/redsubmit2.png");

    JLabel acount=new JLabel("Customer_Account no."); 
     JLabel b=new JLabel("Deposit_Balance "); 
    JLabel name=new JLabel("Name.");
    JLabel dob=new JLabel("Mobile no."); 
  
    JLabel amount=new JLabel(" Total Balance"); 
   JLabel balance=new JLabel(" "); 
    JButton btn=new JButton(icon1);
    JButton btnb=new JButton(icon);
    JTextField ta=new JTextField();
    ta.setBounds(220,50,200,40);
     JLabel tn=new JLabel();
      tn.setBounds(220,300,200,40);
      JLabel td=new JLabel();
       td.setBounds(220,350,200,40);
      JTextField tm=new JTextField();
       tm.setBounds(220,100,200,40);
      JLabel tr=new JLabel();
       tr.setBounds(220,400,200,60);
      l.setBounds(100,10,200,40);
        acount.setBounds(60,50,250,40);
         b.setBounds(60,100,250,40);
          name.setBounds(100,300,100,40);
            dob.setBounds(100,350,100,40);
              amount.setBounds(100,400,200,40);
              btn.setBounds(220,200,160,50);
              btnb.setBounds(20,500,160,50);
            balance.setBounds(100,300,200,40);
           //  balance1.setBounds(0,100,200,40);
      f.add(l);
        f.add(acount);
          f.add(b);
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
                      // f.add(balance1);
                    // f.add(send);
                 f.add(p);
                  f.setVisible(true);
                 
                  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
                  btn.addActionListener(new ActionListener()
                  {
            public void actionPerformed(ActionEvent event)
                    
   {
       
      try{
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
       Statement st=conn.createStatement();
       String total=tm.getText();
       int r=Integer.parseInt(total);
        String send=ta.getText();
      int r1=Integer.parseInt(send);
      
       conn.setAutoCommit(false);
       st.executeUpdate("Update mainbanking2 set balance=balance+"+r+"where account_no="+r1);
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
              String s1=rs.getString(7);
             td.setText(s1);
              String s2=rs.getString(1);
             tn.setText(s2);
             
         }
          else {

                JOptionPane.showMessageDialog(null, "Name not Found");

            }
       
      JOptionPane.showMessageDialog(f, "values is insert");
     ps.executeUpdate();
     conn.close();
     rs.close();

   }catch(Exception e)
           {
           JOptionPane.showMessageDialog(f, "values is not insert");
           }
      
   } });      
                  
                  
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
            
            new Deposit1();
            
    }
}
