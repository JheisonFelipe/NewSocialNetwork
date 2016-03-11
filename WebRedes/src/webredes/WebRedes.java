/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webredes;

import com.edu.yuxi.pacific.beans.FactoryRed;
import com.edu.yuxi.pacific.beans.InterfaceRed;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jheison.cardona
 */
public class WebRedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            
          String saveItem = JOptionPane.showInputDialog(null, "Ingrese la red");
        
        
        
        FactoryRed red = new FactoryRed();
        InterfaceRed r=FactoryRed.getCreator(saveItem);
        r.conectar();
       
        //System.out.println(r);
        //JOptionPane.showMessageDialog(null, r);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se a encontrado", "Alerta",JOptionPane.ERROR_MESSAGE );
        }
       
        
    }
    }
    

