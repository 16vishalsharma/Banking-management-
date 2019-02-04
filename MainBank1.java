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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class MainBank1 implements ActionListener {

    /**
     * @param args the command line arguments
     */

    JFrame f;
    CardLayout card;
     CardLayout card1;
      String  logininformation;
       String usernameValue;
       String passwordValue;
    MainBank1()
    {
       f=new JFrame("BANKING SYSTEM");
       
      /*  JLabel jusername = new JLabel("User Name");
        JTextField tusername=new JTextField();
        JLabel jpassword=new JLabel("password");
        JPasswordField password=new JPasswordField();
         JButton btnl=new JButton(" Login");
         
       // JButton btns=new JButton("New Sign in");
        // JButton forget = new JButton("Forget password");
        int Object;
        Object[] ob={jusername, tusername,jpassword,password,btnl};
        int result1=JOptionPane.showConfirmDialog(null,ob,"Administator form",JOptionPane.OK_CANCEL_OPTION);
      if(result1 == JOptionPane.OK_OPTION)  
      {
    String usernameValue = tusername.getText();
    // System.out.println(usernameValue);
    String passwordValue = password.getText();
    // System.out.println(passwordValue);
      }*/
          



 
        ImageIcon img=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/homepage5.png");
        ImageIcon service=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/customer1.jpg");
        JLabel lc=new JLabel("",service,JLabel.LEFT);
        JPanel p=new JPanel();
         p.setBounds(0,0,1050,282);
     p.setBackground(Color.black);
      JPanel p1=new JPanel();
         p1.setBounds(0,325,350,400);
     p1.setBackground(Color.red);
       JButton  loan = new JButton("Loan service and Insurance About information");  
   JButton  cheque = new JButton("Cheque book");  
   JButton  details= new JButton("All Database");  
   JButton  atm = new JButton("ATM");  
  JButton  kyc= new JButton("KYC"); 
  JButton  in= new JButton("Insurance");  
 
 
         
   
      
       JPanel p2=new JPanel();
     p2.setBackground(Color.white);
         p2.setBounds(700,325,345,400);
         
         
      p2.setLayout(card1);
      
      
   
     JScrollPane sp=new JScrollPane();
      JLabel label6=new JLabel("",img,JLabel.LEFT);
     sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
     f.getContentPane();
      JScrollPane sv=new JScrollPane();
     sv.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
     f.getContentPane();
        ImageIcon i=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/icon9.png");
         ImageIcon back=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/icon9.png");
          JLabel ground=new JLabel("railway",back,JLabel.LEFT);
          //
          
          //home loan
           ImageIcon second=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/home8.png");
          JLabel panel=new JLabel("",second,JLabel.LEFT);
           ImageIcon second1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/home9.png");
          JLabel panel1=new JLabel("",second1,JLabel.LEFT);
           ImageIcon s=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/here.png");
          JLabel image=new JLabel("",s,JLabel.LEFT);
          image.setBounds(440,400,200,50);
         
          
        ///gold loan  
          
          ImageIcon second2=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/gold7.png");
          JLabel panel2=new JLabel("",second2,JLabel.LEFT);
          ImageIcon second3=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/gold5.jpg");
          JLabel panel3=new JLabel("",second3,JLabel.LEFT);
          ImageIcon s1=new ImageIcon("C:\\Users\\lenovo pc\\Desktop\\Netbean/click3.png");
          JLabel image1=new JLabel("",s1,JLabel.LEFT);
          image1.setBounds(790,390,200,50);
         
      JLabel l=new JLabel("railway",i,JLabel.LEFT);
      JButton btn=new JButton("New Account");
       JButton btnb=new JButton("Balance");
        JButton btnd=new JButton("Deposit");
         JButton btnw=new JButton("Withdraw");
          JButton btnt=new JButton("Transfer");
           JButton btnc=new JButton("close A/C");
            JButton btna=new JButton("Administrator");
            JLabel bank=new JLabel("APNA BANK");
            JLabel bank1=new JLabel("APNA BANK");
             JButton lay=new JButton(second);
              JButton lay1=new JButton(service);
               JButton lay2=new JButton(second2);
         
            bank.setForeground(Color.black);
            Font f1=new Font("Arial",Font.BOLD,25);
            bank.setFont(f1);
          ground.setBounds(0,0,225,282);
      btn.setBounds(0,282,150,40);
      btn.setBackground(Color.red);
       btn.setForeground(Color.white);
       btnb.setBounds(150,282,150,40);
        btnb.setBackground(Color.red);
         btnb.setForeground(Color.white);
        btnd.setBounds(300,282,150,40);
         btnd.setForeground(Color.white);
         btnd.setBackground(Color.red);
         btnw.setBounds(450,282,150,40);
          btnw.setForeground(Color.white);
          btnw.setBackground(Color.red);
          btnt.setBounds(600,282,150,40);
           btnt.setForeground(Color.white);
           btnt.setBackground(Color.red);
           btna.setBounds(750,282,150,40);
            btna.setForeground(Color.white);
            btna.setBackground(Color.red);
            btnc.setBounds(900,282,140,40);
             btnc.setForeground(Color.white);
             btnc.setBackground(Color.red);
            bank.setBounds(30,10,300,80);
             bank1.setBounds(500,0,400,30);
             bank1.setForeground(Color.black);
             
             f.add(bank1);
      f.setIconImage(i.getImage());
      label6.setBounds(0,0,1050,282);
                 
                lay1.setBounds(0,323,300,68);
              loan.setBounds(0,390,300,50);
               loan.setBackground(Color.red);
       loan.setForeground(Color.white);
            cheque.setBounds(0,440,300,50);
             cheque.setBackground(Color.red);
       cheque.setForeground(Color.white);
        details.setBounds(0,490,300,50);
        details.setBackground(Color.red);
       details.setForeground(Color.white);
               atm.setBounds(0,540,300,50);
                atm.setBackground(Color.red);
       atm.setForeground(Color.white);
               kyc.setBounds(0,590,300,50);
                kyc.setBackground(Color.red);
       kyc.setForeground(Color.white);
                in.setBounds(0,640,300,50);
                 in.setBackground(Color.red);
       in.setForeground(Color.white);
                panel.setBounds(300,323,400,149);
                panel1.setBounds(300,472,400,249);
                
                 lay.setBounds(300,323,400,149);
                  
                 
                 panel2.setBounds(700,323,331,249);
                 
                  lay2.setBounds(700,323,335,249);
                //   lay3.setBounds(700,580,335,151);
                  
                panel3.setBounds(700,550,331,151);
                
     //  f.add(image1);       
    //  f.add(image);          
    f.add(panel);
   f.add(panel1);
    f.add(panel2);
   f.add(panel3);
  p.add(label6);
   f.add(lc); 
  
       f.add(loan);
        f.add(cheque);
         f.add(details);
          f.add(atm);
           f.add(kyc);
           f.add(in);
           f.add(lay);
           f.add(lay1);
            f.add(lay2);
          // f.add(lay3);
           
  f.add(btn);
  f.add(btnb);
  f.add(btnd);
  f.add(btnw);
  f.add(btnt);
  f.add(btna);
  f.add(bank);
  f.add(btnc);
  f.add(ground);
   
 btnd.addActionListener(this);
 
  f.add(p1);
    f.add(p);
    f.add(p2);
     f.add(sp);
     f.add(sv);
    
    
 
      //JPasswordField pass=new JPasswordField();
  
     f.setBackground(Color.black);
        f.setSize(1050,720);
       f.setVisible(true);
       f.setResizable(false);
       
         lay.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Home  second2=new Home();
   
  }});
           lay2.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      goldloan   second2=new goldloan();
   
  }});
       
       
       
       
       
       btnw.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Withdraw   second2=new Withdraw();
   
  }});
        btnt.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Transfer   second2=new Transfer();
   
  }});
         btnb.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Balance  second2=new Balance();
   
  }});
          btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      newaccount   second2=new newaccount();
   
  }});
           btna.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      new Administration().setVisible(true);
   
  }});
             btnc.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      close   second2=new close();
   
  }});
       
              loan.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      loanservice_about   second2=new loanservice_about();
   
  }});
               cheque.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Chequebook   second2=new Chequebook();
   
  }});
                in.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Insurence   second2=new Insurence();
   
  }});
     
                 atm.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      ATM  second2=new ATM();
   
  }});
                  kyc.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      KYC   second2=new KYC();
   
  }});
                   details.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      new alldatabase().setVisible(true);
   
  }});
           
        
 }
    @Override
     public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      Deposit1    second=new Deposit1();
     // f.setVisible(true);
   
  }
     

    public static void main(String[] args) {
    
  MainBank1 v= new MainBank1();
    }

    void setVisible(boolean b) {
System.out.println(b);       
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
