/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImageTutorial;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class ImageTutorial extends JFrame{
    
    final private ImageIcon image1;
    final private JLabel label1;
    final private ImageIcon image2;
    final private JLabel label2;
    
    ImageTutorial(){
    
        setLayout(new FlowLayout());
        
        image1 = new ImageIcon(getClass().getResource("images.jpg"));
        
        label1 = new JLabel(image1);
        add(label1);
        
        image2 = new ImageIcon(getClass().getResource("images.jpg"));
        //Save the image in the package folder
        label2 = new JLabel(image2);
        add(label2);        
    }
    
    public static void main(String[] args){
    
        ImageTutorial gui = new ImageTutorial();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Picture Program");
    }
}
