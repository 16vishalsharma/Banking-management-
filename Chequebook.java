/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author lenovo pc
 */
public class Chequebook {
    Chequebook()
    {
         JFrame f=new JFrame();
        f.setSize(400,400);
        f.setVisible(true);
        JButton btn=new JButton("Home");
        btn.setBounds(100,200,100,40);
        f.add(btn);
         btn.addActionListener(new ActionListener() {
    
   @Override
   public void  actionPerformed(ActionEvent event)
  {
      
             f.setVisible(false);
      MainBank1   second2=new MainBank1();
   
  }});
    }
    public static void main(String args[])
    {
        new Chequebook();
    }
    
}
