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
 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class loanservice_about {
    loanservice_about()
    {
        JFrame f=new JFrame();
        JButton btn=new JButton("Home");
        btn.setBounds(100,300,100,50);
        f.add(btn);
        f.setVisible(true);
        f.setSize(500,500);
      //  f.setLayout(null);
        
        btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
    }
    public static void main(String arg[])
    {
        new loanservice_about();
    }
    
}
