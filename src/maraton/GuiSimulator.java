/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maraton;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class GuiSimulator {
    
    public static void displayMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public static int displayMessageForIntAnswer(String message){
       return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    
    public static void displayGameStatus (Game game){
        JOptionPane.showMessageDialog(null, game.toString());
    }
         
    
    
}
