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

/**
 *
 * @author lenovo pc
 */
public class About {
     About()
    {
     JPanel p=new JPanel();
     p.setBounds(10,20,200,200);
     p.setBackground(Color.red);
  JFrame  f1=new JFrame();
     
    JButton btn=new JButton("HOME");
    btn.setBounds(100,100,100,40);
    f1.add(btn);
    f1.add(p);
    f1.setSize(400,400);
    f1.setVisible(true);
    f1.setLayout(null);
     btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f1.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
   }
   
   
    public static void main(String[] args) {
       new About();
    
}
}
