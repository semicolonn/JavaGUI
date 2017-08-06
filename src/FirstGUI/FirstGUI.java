/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstGUI;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author User
 */
public class FirstGUI extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FirstGUI gui = new FirstGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(1000,1000);
        gui.setVisible(true);
        gui.setTitle("First GUI");
        gui.setBackground(Color.yellow);
    }
    
}
