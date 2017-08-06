/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MouseMover;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class mousemover extends JFrame {

    JLabel label1, label2, label3, label4, errorLabel;
    JTextField tf1, tf2, tf3, tf4;
    JButton button;

    public mousemover() {
        setLayout(new GridLayout(5, 2, 5, 5));

        label1 = new JLabel("Enter number of movement:");
        label1.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label1);

        tf1 = new JTextField();
        tf1.setFont(new Font("Arial", Font.PLAIN, 50));        
        add(tf1);

        label2 = new JLabel("Enter delay between movemens");
        label2.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label2);

        tf2 = new JTextField();
        tf2.setFont(new Font("Arial", Font.PLAIN, 50));        
        add(tf2);

        label3 = new JLabel("Enter screen width in pixels");
        label3.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label3);

        tf3 = new JTextField();
        tf3.setFont(new Font("Arial", Font.PLAIN, 50));        
        add(tf3);

        label4 = new JLabel("Enter screen height in pixels");
        label4.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label4);

        tf4 = new JTextField();
        tf4.setFont(new Font("Arial", Font.PLAIN, 50));        
        add(tf4);

        button = new JButton("Start");
        button.setFont(new Font("Arial", Font.PLAIN, 50));
        add(button);

        errorLabel = new JLabel("");
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        add(errorLabel);

        event e = new event();           
        button.addActionListener(e);
    }

    public class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {

                int num = (int) (Double.parseDouble(tf1.getText()));
                int delay = (int) (Double.parseDouble(tf2.getText()));
                int width = (int) (Double.parseDouble(tf3.getText()));
                int height = (int) (Double.parseDouble(tf4.getText()));

                if (num <= 0 || delay <= 0 || width <= 0 || height <= 0) {

                    errorLabel.setText("Please enter positive values");
                } else {

                    errorLabel.setText("");

                    try {

                        Robot rob = new Robot();
                        for (int x = 0; x <= num; x++) {

                            rob.mouseMove((int) (Math.random() * width), (int) (Math.random() * height));

                            rob.delay(delay);
                        }
                    } catch (AWTException ex) {

                        System.exit(0);
                    }
                }

            } catch (Exception exx) {

                errorLabel.setText("Number only!");
            }
        }        
    }

    public static void main(String[] args) {

        mousemover gui = new mousemover();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Nice Game");
    }
}
