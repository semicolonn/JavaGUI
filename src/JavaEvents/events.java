/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaEvents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class events extends JFrame {

    private JLabel label;
    private JButton button;

    public events() {

        setLayout(new FlowLayout());

        button = new JButton("Click for text");
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

            label.setText("Now you can see words here");
        }
    }

    public static void main(String[] args) {

        events gui = new events();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Events Program");
        gui.setVisible(true);
        gui.setSize(1000, 500);
    }
}
