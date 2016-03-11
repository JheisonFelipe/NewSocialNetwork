/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.yuxi.pacific.beans;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author jheison.cardona
 */
public class Facebook implements InterfaceRed{
    
   
    
    @Override
    public void conectar() {
         

                    try {

                        Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
                    } catch (Exception e
                            ) {
                       
                    }
        //System.out.println("Facebook");
        
        
        
  
    }
    
}
