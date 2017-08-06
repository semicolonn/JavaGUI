package JavaGUIObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class JavaGUIObject extends JFrame{
    
    private JLabel label;
    private JButton button;
    private JTextField textfield;
    
    public JavaGUIObject(){
    
        setLayout(new FlowLayout());
        
        label = new JLabel("Hi, I am a label");
        add(label);
        
        textfield = new JTextField(15);
        add(textfield);
        
        button = new JButton("Click me");
        add(button);
    }
    
    public static void main(String[] args){
    
        JavaGUIObject gui = new JavaGUIObject();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setSize(500,500);
        gui.setVisible(true);
        gui.setTitle("Title");
    }
}
