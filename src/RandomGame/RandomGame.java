/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class RandomGame extends JFrame {

    int randomNum, guess;
    private JButton button;
    private JTextField textfield;
    private JLabel promptlabel;
    private JLabel resultlabel;
    private JLabel randomlabel;

    public RandomGame() {

        setLayout(new FlowLayout());
        promptlabel = new JLabel("Enter a random 1 - 10");
        promptlabel.setFont(new Font("Arial", Font.PLAIN, 50));
        add(promptlabel);

        textfield = new JTextField(5);
        textfield.setFont(new Font("Arial", Font.PLAIN, 50));
        add(textfield);

        button = new JButton("Guess!!");
        button.setFont(new Font("Arial", Font.PLAIN, 50));
        add(button);

        resultlabel = new JLabel("");
        resultlabel.setFont(new Font("Arial", Font.PLAIN, 50));
        add(resultlabel);

        randomlabel = new JLabel("");
        randomlabel.setFont(new Font("Arial", Font.PLAIN, 50));
        add(randomlabel);

        event e = new event();
        button.addActionListener(e);
    }

    public class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            randomNum = (int)(Math.random()*10+1);

            try {

                guess = (int) (Double.parseDouble(textfield.getText()));
                
                if (guess == randomNum) {

                    resultlabel.setText("You won the game!");

                } else if (guess != randomNum) {

                    resultlabel.setText("You lost the game!");
                }
            } catch (Exception ex) {

                randomlabel.setText("Please enter numbers only!");
            }
        }
    }

    public static void main(String[] args) {

        RandomGame gui = new RandomGame();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(800, 500);
        gui.setTitle("Random Number Guessing Game");        
    }
}
