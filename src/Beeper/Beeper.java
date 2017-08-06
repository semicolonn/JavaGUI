/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class Beeper extends JFrame {

    JButton button;
    JLabel label;
    int counter = 0, x = 0;
    String s;

    public Beeper() {

        setLayout(new FlowLayout());
        button = new JButton("CLICK FOR SOUND");
        button.setFont(new Font("Arial", Font.PLAIN, 50));
        add(button);

        label = new JLabel("");
        label.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Toolkit.getDefaultToolkit().beep();
            counter++;
            if (x == 0) {

                s = "time";
            } else if (x == 1) {

                s = "times";
            }
            label.setText("You have clicked " + counter + " " + s);
            x = 1;
        }
    }
    public static void main(String[] args){
    
        Beeper gui = new Beeper();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(800, 500);
        gui.setVisible(true);
        gui.setTitle("Beeper");
    }
}
