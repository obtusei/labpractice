// WAP to demonstrate ActionEvent and KeyEvent in Java

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q9 {

          public static void main(String[] args) {
                    JFrame frame = new JFrame("ActionEvent and KeyEvent");
                    frame.setSize(300, 300);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(4, 2));

                    JLabel l1 = new JLabel("Enter your name");
                    JLabel l2 = new JLabel("Enter your password");

                    JTextField t1 = new JTextField();
                    JTextField t2 = new JTextField();

                    panel.add(l1);
                    panel.add(t1);
                    panel.add(l2);
                    panel.add(t2);

                    frame.add(panel);

                    t1.addKeyListener(new KeyAdapter() {
                              public void keyPressed(KeyEvent e) {
                                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                                  JOptionPane.showMessageDialog(null, "Welcome " + t1.getText());
                                        }
                              }
                    });

                    t2.addKeyListener(new KeyAdapter() {
                              public void keyPressed(KeyEvent e) {
                                        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                                                  JOptionPane.showMessageDialog(null, "Welcome " + t1.getText());
                                        }
                              }
                    });

                    JButton b1 = new JButton("Login");
                    b1.addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e) {
                                        JOptionPane.showMessageDialog(null, "Welcome " + t1.getText());
                              }
                    });

                    panel.add(b1);
          }
}
