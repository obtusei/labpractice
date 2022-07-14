// WAP using Swing to calculate Simple Interest with proper exception handling

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Q8 extends JFrame {

          Q8() {

                    setTitle("Simple Interest");
                    setSize(300, 300);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(true);

                    JPanel panel = new JPanel();
                    panel.setLayout(new GridLayout(4, 2));

                    JLabel l1 = new JLabel("Principal");
                    JLabel l2 = new JLabel("Rate");
                    JLabel l3 = new JLabel("Time");
                    JLabel l4 = new JLabel("Simple Interest");

                    JTextField t1 = new JTextField();
                    JTextField t2 = new JTextField();
                    JTextField t3 = new JTextField();
                    JTextField t4 = new JTextField();

                    panel.add(l1);
                    panel.add(t1);
                    panel.add(l2);
                    panel.add(t2);
                    panel.add(l3);
                    panel.add(t3);
                    panel.add(l4);
                    panel.add(t4);

                    add(panel);

                    JButton b1 = new JButton("Calculate");
                    b1.addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e) {

                                        try {
                                                  double p = Double.parseDouble(t1.getText());
                                                  double r = Double.parseDouble(t2.getText());
                                                  double t = Double.parseDouble(t3.getText());
                                                  double si = p * r * t / 100;
                                                  t4.setText(String.valueOf(si));
                                        } catch (NumberFormatException ex) {
                                                  JOptionPane.showMessageDialog(null, "Enter valid numbers");
                                        } catch (Exception ex) {
                                                  JOptionPane.showMessageDialog(null, "Enter valid numbers");
                                        }
                              }
                    });

                    panel.add(b1);

          }

          public static void main(String[] args) {
                    new Q8();
          }

}
