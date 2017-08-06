/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleEvents;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class multipleevents extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private int x, y;

    public multipleevents() {

        setLayout(new FlowLayout());

        button1 = new JButton("Click for text");
        button1.setFont(new Font("Arial", Font.PLAIN, 50));
        add(button1);

        label1 = new JLabel("");
        label1.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label1);

        button2 = new JButton("Click for text");
        button2.setFont(new Font("Arial", Font.PLAIN, 50));
        add(button2);

        label2 = new JLabel("");
        label2.setFont(new Font("Arial", Font.PLAIN, 50));
        add(label2);

        event1 e = new event1();
        button1.addActionListener(e);

        event2 ev = new event2();
        button2.addActionListener(ev);
    }

    public class event1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (x == 0) {

                label1.setText("Now you can see words here");
                x = 1;

            } else if (x == 1) {

                label1.setText("");
                x = 0;
            }
        }
    }

    public class event2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (y == 0) {
                //To disappear the text by clicking second click
                label2.setText("This is the event 2's label");
                y = 1;

            } else if (y == 1) {

                label2.setText("");
                y = 0;

            }
        }
    }

    public static void main(String[] args) {

        multipleevents gui = new multipleevents();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Events Program");
        gui.setVisible(true);
        gui.setSize(1000, 500);
    }
}
