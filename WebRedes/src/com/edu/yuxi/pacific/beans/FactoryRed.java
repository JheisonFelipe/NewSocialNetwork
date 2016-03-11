/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.yuxi.pacific.beans;

import java.awt.Desktop;
import static java.lang.reflect.Array.set;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author jheison.cardona
 */
public class FactoryRed {

    public static InterfaceRed getCreator(String saveItem) {
        // VRed r = new VRed();
      
        
        switch (saveItem) {

            case "Facebook":
//               
              return new Facebook();
             
                 
            case "Google":
//                 
//                    
                return new Google();

            case "Twitter":
//                 
                return new Twitter();

            
        }

        return null;
    }
}
