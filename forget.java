/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo pc
 */
public class forget {
    String    s1;
    String    s3;
    forget()
    {
         JFrame f=new JFrame();
         JLabel l=new JLabel("username");
          JLabel l1=new JLabel("mobile_no");
          JTextField t1=new JTextField();
           JTextField t2=new JTextField();
           JButton b=new JButton("OK");
           l.setBounds(20,50,80,40);
              t1.setBounds(120,50,150,40);
            l1.setBounds(20,100,80,40);
              t2.setBounds(120,100,150,40);
               b.setBounds(100,200,80,40);
         f.add(l);
         f.add(l1);
         f.add(t1);
         f.add(t2);
         f.add(b);
         f.setSize(400,350);
         f.setLayout(null);
         f.setVisible(true);
        
       b.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
              
        try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
 // Statement  st=conn.createStatement();
   String send=t2.getText();
      Double rc=Double.parseDouble(send);
  PreparedStatement  ps = conn.prepareStatement("select*from administrator where mobile="+rc);
      
         ResultSet rs=ps.executeQuery();
        if(rs.next())
         {
          String    s1=rs.getString(1);
           String    s3=rs.getString(2);
         
         

     String date= new SimpleDateFormat("ddMMyyyy").format(new java.util.Date());
System.out.println("\nAdministrator username:"+s1+"\n Password:"+s3+"Do not inform own password\nDate:"+date+"\nAPNA Bank .CR.Helpline 18001802222");
      
         
   
        
       
try{String apikey = "GkSSf7uPGk6l7l0cPzzTJQ";
String senderid = "TESTIN";
String channel = "2";
String DCS = "0";
String flashsms = "0";
String route = "13";
// String date= new SimpleDateFormat("ddMMyyyy").format(new java.util.Date());
String message=("\nAdministrator username:"+s1+"\n Password:"+s3+"Do not inform oun password\nDate:"+date+"\nAPNA Bank .CR.Helpline 18001802222");
      
String requestUrl = "https://www.smsgatewayhub.com/api/mt/SendSMS?" +
"APIKey=" + URLEncoder.encode(apikey, "UTF-8") +
"&senderid=" + URLEncoder.encode(senderid, "UTF-8") +
"&channel=" + URLEncoder.encode(channel, "UTF-8") +
"&DCS=" + URLEncoder.encode(DCS, "UTF-8") +
"&flashsms=" + URLEncoder.encode(flashsms, "UTF-8") +
"&number=" + URLEncoder.encode(t2.getText(), "UTF-8") +
"&text=" + URLEncoder.encode(message, "UTF-8") +
"&route=" + URLEncoder.encode(route, "UTF-8");
 
 
 
URL url = new URL(requestUrl);
HttpURLConnection uc = (HttpURLConnection)url.openConnection();
 
System.out.println(uc.getResponseMessage());
 ps.executeUpdate();
System.out.println("insert value are loaded");
conn.close();
ps.close();
   
 
uc.disconnect();

         }catch(Exception ex)
         {
             System.out.println(ex);
         } }

       
     }catch(Exception e)
     {
         System.out.println(e);
     }
     f.setVisible(false);
     new Administration().setVisible(true);
   
    
        
        
    }});
    }

    //To change body of generated methods, choose Tools | Templates.

   

   public static void main(String arg[])
    {

    forget f=new forget();

     }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
    

