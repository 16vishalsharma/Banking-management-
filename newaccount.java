package registration;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///////

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class newaccount {
    int  getValue;
    String get;
    Connection conn;
     private Pattern regexpattern;
    private Matcher regmatcher;
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    String v;
   newaccount() 
   {
                                       JFrame f2=new JFrame();
                                       JPanel p=new JPanel();
                                       p.setSize(2000,1500);
                                       p.setBackground(Color.yellow);
                                       p.setLayout(null);
                                       f2.setLayout(null);
    JLabel label=new JLabel(" Select");                 
    JLabel online=new JLabel(" REQUEST BANKING ACCOUNT FORM ");
       ImageIcon icon5=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/btn5.jpg");
          ImageIcon icon9=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/submit3.png");

    JLabel first=new JLabel("First name");
    JLabel last=new JLabel("Last name");
    JLabel age=new JLabel("Age");
    JLabel middle=new JLabel("middle name");
    JLabel mobile=new JLabel("Mobile number");
    JLabel     Add=new JLabel("Address");
    JLabel email_id=new JLabel("Email id");
    JLabel status=new JLabel("Marital status");
    JLabel dob=new JLabel("DOB");
    JLabel mother=new JLabel("Mother name");
    JLabel fother=new JLabel("Father name");
    JLabel pan_no=new JLabel("PAN NO.");
    JLabel aadhar=new JLabel("Aadhar no.");
    JLabel account=new JLabel("Account_no");
    JLabel balance=new JLabel("Account_opening_balance");
     
                                       // String[] arr={"Mr","Mrs"};
                                       // JComboBox cbo=new JComboBox(arr);
                                        JList l=new JList();
                                        ButtonGroup b=new ButtonGroup();
                                        JLabel Category1=new JLabel("Categorys");
                                        JRadioButton cb=new JRadioButton("General"); 
                                        JRadioButton cb1=new JRadioButton("OBC"); 
                                        JRadioButton cb2=new JRadioButton("SC"); 
                                        JRadioButton cb3=new JRadioButton("ST"); 
                                        JRadioButton cb4=new JRadioButton("Other");
           b.add(cb);
           b.add(cb1);
           b.add(cb2);
           b.add(cb3);
           b.add(cb4);
           
    JCheckBox ca=new JCheckBox("atm"); 
    JCheckBox cq=new JCheckBox("cheque"); 
    JCheckBox cn=new JCheckBox("netbanking"); 
    JCheckBox gn=new JCheckBox("green card"); 
    ImageIcon icon=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/flam1.png");
    ImageIcon i=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/icon.png");
    String s="frist name";
    JTextField  t1=new JTextField();
    JTextField  t2=new JTextField();
    JTextField  t3=new JTextField();
    
    JTextField  t4=new JTextField();
     t4.setEditable(false);
    JTextField  t5=new JTextField();
    JTextField  t6=new JTextField();
    JTextField  t7=new JTextField();
    JTextField  t9=new JTextField();
    JTextField  tp=new JTextField();
    JTextField  ta=new JTextField();
    
    JTextArea   address=new JTextArea();
    JTextField  taccount=new JTextField("No overright");
    taccount.setEditable(false);
    JTextField  tbalance=new JTextField();
                                         Font  f=new Font("Arail",Font.BOLD,25);
                                         JButton btn=new JButton(icon9);
                                         JButton btn3=new JButton(icon5);
                                         JLabel wrg=new JLabel("wrong username and password");
                                         JLabel label5=new JLabel(icon,JLabel.RIGHT);
                                         JLabel gender=new JLabel("Gender");
                                         ButtonGroup b1=new ButtonGroup();
                                         JRadioButton Male=new JRadioButton("Male");
                                         JRadioButton Female=new JRadioButton("Female");
   
                                         
                                         
                    
                                             
                                       
      b1.add(Male);
      b1.add(Female);
      
      
      Integer   day_arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,28,29,30,31};
      JComboBox day=new JComboBox(day_arr); 
      String  month_arr[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
      JComboBox month=new JComboBox(month_arr);
      Integer   year_arr[]={2018,2017,2016,2015,2014,2013,2012,2011,2010,2009,2008,2007,2006,2005,2004,2003,2002,2001,2000,1999,1998,1997,1996,1995,1994,1993,1992,1991,1990,1989,1988,1987,1986,1985,1984,1983,1982,1981,1980,1979,1978,1977,1976,1975,1975,1974,1973,1972,1971,1970};
      JComboBox year=new JComboBox(year_arr); 
      String[] m_a={"Married","UnMarried","Single"};
      JComboBox m=new JComboBox(m_a);
  
       f2.setIconImage(i.getImage());
       day.setBounds(300,220,80,40);
       month.setBounds(400,220,80,40);
       year.setBounds(500,220,80,40);
       
                                       gender.setBounds(650,220,100,40);
                                       label.setBounds(520,60,200,40);
                                       first.setBounds(340,110,200,30);
                                       middle.setBounds(600,110,200,30);
                                       last.setBounds(900,110,200,30);
                                       dob.setBounds(100,230,200,40);
                                       status.setBounds(930,370,250,50);
                                       m.setBounds(940,450,160,40);
                                       mobile.setBounds(100,450,200,40);
                                       email_id.setBounds(520,450,200,40);
                                       label5.setBounds(0,0,507,99); 
                                       Category1.setBounds(100,290,200,40);
                                       age.setBounds(920,290,150,50);
                                       account.setBounds(100,110,150,40); 
                                       mother.setBounds(520,370,200,40);
                                       fother.setBounds(100,370,200,40);
                                       pan_no.setBounds(100,530,200,40);
                                       aadhar.setBounds(520,530,200,40);
                                       online.setBounds(550,0,800,40);
                                       
           t1.setBounds(340,150,200,40);
           t2.setBounds(600,150,200,40);
           t3.setBounds(900,150,200,40);                                         
           t4.setBounds(1000,290,100,40);                              
           t5.setBounds(700,370,200,40);                              
           t6.setBounds(300,370,200,40);
           t7.setBounds(300,450,200,40);
           t9.setBounds(650,450,250,40);
           tp.setBounds(300,530,200,40);                          
           ta.setBounds(660,530,200,40);
           taccount.setBounds(100,150,200,40);
           balance.setBounds(870,530,350,40);
           tbalance.setBounds(900,580,200,40);
         cb.setBounds(300,290,130,50);
         cb1.setBounds(432,290,90,50);
         cb2.setBounds(542,290,90,50);
         cb3.setBounds(642,290,90,50);
         cb4.setBounds(735,290,120,50);
         
                                  
       
       btn.setBounds(750,650,160,50);
       btn3.setBounds(950,650,160,50);
                                         Male.setBounds(780,220,100,40);
                                         Female.setBounds(900,220,150,40);
                                         cn.setBounds(630,60,200,40);
                                         gn.setBounds(1170,60,170,40); 
                                         ca.setBounds(840,60,150,40);
                                         cq.setBounds(1010,60,150,40);
                                         Add.setBounds(100,620,200,40);
                                         address.setBounds(300,600,400,80);
                                       
            label.setFont(f);
            first.setFont(f);
            middle.setFont(f);
            last.setFont(f);
            dob.setFont(f);
            status.setFont(f);
            mobile.setFont(f);
            online.setFont(f);
         
                            
                                t7.setFont(f);
                                pan_no.setFont(f);
                                aadhar.setFont(f);
                                tp.setFont(f);
                                ta.setFont(f);
                                address.setFont(f);
                                taccount.setFont(f);
            age.setFont(f);  
            gender.setFont(f);
            mother.setFont(f);
            fother.setFont(f);
            email_id.setFont(f);
            account.setFont(f);
            tbalance.setFont(f);
           
                                    t9.setFont(f);
                                    cn.setFont(f);
                                    gn.setFont(f);
                                    ca.setFont(f);
                                    cq.setFont(f);

            btn.setFont(f);
            btn3.setFont(f);
            Male.setFont(f);
            Female.setFont(f);
            balance.setFont(f);
                                 t1.setFont(f);
                                 t2.setFont(f);
                                 t3.setFont(f);
                                 t4.setFont(f);
                                 t5.setFont(f);
                                 t6.setFont(f);
                                 wrg.setFont(f);
              cb.setFont(f);
              cb1.setFont(f);
              cb2.setFont(f);
              cb3.setFont(f);
              cb4.setFont(f);
                                 Add.setFont(f);
                                 m.setFont(f);
                                 Category1.setFont(f);
                                 f2.add(label5);
                                 f2.add(online);
                                 f2.add(gender);
                                 f2.add(age);
           f2.add(mobile);
           f2.add(day);
           f2.add(month);
           f2.add(Male);
           f2.add(Female);
                               f2.add(cb);
                               f2.add(cb1);
                               f2.add(cb2);
                               f2.add(cb3);
                               f2.add(cb4);
                               f2.add(account);
                               
          f2.add(m);
          f2.add(pan_no);
          f2.add(aadhar);
          f2.add(tp);
          f2.add(ta);
          f2.add(cn);
                           f2.add(gn);
                           f2.add(cq);
                           f2.add(ca);
                           f2.add(Add);
                           f2.add(address);
                           f2.add(label);
        f2.add(first);
        f2.add(middle);
        f2.add(age);
        f2.add(last);
        f2.add(dob);
        f2.add(status);
                          f2.add(email_id);
                          f2.add(Category1);
                          f2.add(mother);
                          f2.add(fother);
                          f2.add(year);
                          f2.add(btn);
       
        f2.add(btn3);
        f2.add(t7);
        f2.add(t1);
        f2.add(t2);
        f2.add(t3);
        f2.add(t4);
        f2.add(taccount);
        f2.add(balance);
        f2.add(tbalance);
                    f2.add(t5);
                    f2.add(t6);
                    f2.add(t9);
                    f2.add(wrg);
                    f2.add(p);
                   
        f2.setBackground(Color.RED);
        f2.setSize(2000,1500);
        f2.setVisible(true);
        f2.setResizable(false);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
   btn.addActionListener(new ActionListener()
   {
  @Override
  public void  actionPerformed(ActionEvent event)
  {
     
          try{  Class.forName("oracle.jdbc.driver.OracleDriver");
        
    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","12345");
    Statement st=conn.createStatement();  
   // PreparedStatement  ps1 = conn.prepareStatement("select count(slinvoiceno)+1 from invoiceno");
            ResultSet rs=st.executeQuery("select count(account_no)+1 from mainbanking2");
        if(rs.next())
         {
              get=rs.getString(1);
             
     
           //  taccount.setText(get);
             
        // getValue=Integer.parseInt(rs.getString(20));
       System.out.println(get);
       // String s7=rs.getString(20);
          
         }
      //  JOptionPane.showMessageDialog(null, " SUCCESSFULLY VALUE  INSERT!");
 //ps1.executeUpdate();
System.out.println("print value are");
//ps1.close();
         }catch(SQLException ex)
                 {
                 System.out.println(ex);
                 } catch (ClassNotFoundException ex) {
      }
          
    
    String insertdata="insert into mainbanking2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     String inv= new SimpleDateFormat("ddMMyyyy").format(new java.util.Date())+get;
     
   try{ 
       PreparedStatement  ps = conn.prepareStatement(insertdata);
   
   //name       
             ps.setString(1,t1.getText());
             ps.setString(2,t2.getText());
             ps.setString(3,t3.getText());
             
     
    //parents name    
             ps.setString(5,t5.getText());
             ps.setString(6,t6.getText());
   //mobile number        
             double r1=Double.parseDouble(t7.getText());
             ps.setDouble(7,r1);
   //email id   
   regexpattern = Pattern.compile("^[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +

                        "\\@" +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +

                        "(" +

                        "\\." +

                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +

                        ")+");
             String email=t9.getText().toString();
                regmatcher=regexpattern.matcher(email);
                 boolean bm = regmatcher.matches();
              
                  //System.out.println(email);
                 //String str = String.valueOf(bm);
                 //String bm=
               
                 if(bm==true) {
                      ps.setString(8,email);
                       System.out.println(email);
                        System.out.println(inv);
                        ps.setString(19,inv);
                       taccount.setText(inv);
                    // int g;
                  //  g =Integer.parseInt( matcher).toString();
                 // ps.setString(7,regmatcher);
                     
                     System.out.println( "Valid Email Address");
                      JOptionPane.showMessageDialog(null, "Valid Email Address ");
                     
                 } 
                 else
                 {
                     System.out.println( "Invalid Email Address");
                  JOptionPane.showMessageDialog(null, "Invalid Email Address ");
                     
                 }
                 
                 
            //ps.setString(8,t9.getText()); 
   //pan no      
             //double r2=Double.parseDouble(tp.getText());
             ps.setString(9,tp.getText());
  //aadhar no     
             Double r3=Double.parseDouble(ta.getText());
             ps.setDouble(20,r3);
   //address
           ps.setString(10,address.getText());
   //gender
              String gender =" ";
              if(Male.isSelected())
              {
                 gender="Male"; 
              }
              if(Female.isSelected())
              {
                  gender="Female";
              }
              ps.setString(11,gender);  
  //select services
                   String select="";
              if(cn.isSelected())
              {
                select+=cn.getText()+" ";
              }
               if(ca.isSelected())
              {
                select+=ca.getText()+" ";
              }
                if(cq.isSelected())
              {
                select+=cq.getText()+" ";
              }
                 if(gn.isSelected())
              {
                select+=gn.getText()+" ";
              }
              ps.setString(12, select);
   //maritla
              String marital;
              marital=m.getSelectedItem().toString();
              ps.setString(13, marital);
   
             

   //category
               String Category =" ";
              if(cb.isSelected())
              {
                 Category="Genral"; 
              }
              if(cb1.isSelected())
              {
                  Category="OBC";
              }
              if(cb2.isSelected())
              {
                  Category="SC";
              }
              
              if(cb3.isSelected())
              {
                  Category="ST";
              }
              if(cb4.isSelected())
              {
                  Category="Other";
              }
              ps.setString(14,Category);
              
   
     
              String O;
   // DOB date od birth
              int D=Integer.parseInt(day.getSelectedItem().toString());
              ps.setInt(15,D); 
              O=month.getSelectedItem().toString();
              ps.setString(16, O);
              int B=Integer.parseInt(year.getSelectedItem().toString());
              ps.setInt(17,B);
              
              int k=2018-B;
              String ke=Integer.toString(k);
              t4.setText(ke);
              //age         
             int r=Integer.parseInt(t4.getText());
             ps.setInt(4,r);   
              
              
              //balance
           Double r6=Double.parseDouble(tbalance.getText());
             ps.setDouble(18,r6);
             
        //acount no
      // Double r5=Double.parseDouble(taccount.getText());
         //  ps.setDouble(20,r5);   
       
   
    
     
      
    try {
String apikey = "GkSSf7uPGk6l7l0cPzzTJQ";
String senderid = "TESTIN";
String channel = "2";
String DCS = "0";
String flashsms = "0";

//String mobile = "917550778220";
//String message = "hello this is testing message";
      String date= new SimpleDateFormat("ddMMyyyy").format(new java.util.Date());
String message=("Ac no:"+inv+"Account Opening Balance:"+r6+"\nDate:"+date+"\nAPNA Bank .CR.Helpline 18001802222");

    
String route = "13";
 
String requestUrl = "https://www.smsgatewayhub.com/api/mt/SendSMS?" +
"APIKey=" + URLEncoder.encode(apikey, "UTF-8") +
"&senderid=" + URLEncoder.encode(senderid, "UTF-8") +
"&channel=" + URLEncoder.encode(channel, "UTF-8") +
"&DCS=" + URLEncoder.encode(DCS, "UTF-8") +
"&flashsms=" + URLEncoder.encode(flashsms, "UTF-8") +
"&number=" + URLEncoder.encode(t7.getText(), "UTF-8") +
"&text=" + URLEncoder.encode(message, "UTF-8") +
"&route=" + URLEncoder.encode(route, "UTF-8");
 
 
 
URL url = new URL(requestUrl);
HttpURLConnection uc = (HttpURLConnection)url.openConnection();
 
System.out.println(uc.getResponseMessage());
 
uc.disconnect();
 
} catch(Exception ex) {
System.out.println(ex.getMessage());
 
}
    
String date= new SimpleDateFormat("ddMMyyyy").format(new java.util.Date());
System.out.println("Ac no:"+inv+"Account Opening Balance:"+r6+"\nDate:"+date+"\nAPNA Bank .CR.Helpline 18001802222");
      
     
     
   
    JOptionPane.showMessageDialog(null, " SUCCESSFULLY VALUE  INSERT!");
 ps.executeUpdate();
System.out.println("insert value are loaded");
conn.close();
ps.close();
   
 }catch(Exception e)
   {
       System.out.println(e);
       Exception m=e;
         JOptionPane.showMessageDialog(null, "check message:-->"+m);
   }
    
             
      
      }                                });
     btn3.addActionListener(new ActionListener(){
     public void  actionPerformed(ActionEvent event)
     {
      
      f2.setVisible(false);
      MainBank1    second=new MainBank1();
   
      }});

 }
 
    /**
     *
     * @param args
     */

    /**
     *
     * @param args
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
      {
      
      new newaccount();  
      
      }

   
}