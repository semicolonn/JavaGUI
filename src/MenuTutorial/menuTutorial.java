/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuTutorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author User
 */
public class menuTutorial extends JFrame {

    JMenuBar menubar;
    JMenu file;
    JMenuItem exit;

    public menuTutorial() {

        setLayout(new FlowLayout());

        menubar = new JMenuBar();
        menubar.setFont(new Font("Arial", Font.PLAIN, 50));
        setJMenuBar(menubar);

        file = new JMenu("File");
        file.setFont(new Font("Arial", Font.PLAIN, 50));
        menubar.add(file);

        exit = new JMenuItem("Exit");
        exit.setFont(new Font("Arial", Font.PLAIN, 50));
        file.add(exit);

        event e = new event();
        exit.addActionListener(e);
    }

    public class event implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }

    public static void main(String[] args) {

        menuTutorial gui = new menuTutorial();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(800, 500);
    }
}
