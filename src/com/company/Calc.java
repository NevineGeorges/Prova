package com.company;

import javax.swing.*;
import java.awt.*;
public class Calc extends JPanel {


        private JTextField num1 = new JTextField();
        private JTextField num2= new JTextField();
        private JTextField result= new JTextField();
        private JButton btnPlus = new JButton("+");
        private JButton btnMinus = new JButton("-");
        private JButton btnMulty = new JButton("*");
        private JButton btnDiv = new JButton("/");


        private  void dimTextField(JTextField textField)  {
            textField.setMinimumSize(new Dimension(50, 20));
            textField.setPreferredSize(new Dimension(50, 20));
            textField.setMaximumSize(new Dimension(50, 20));
        }

        public Calc(){
            this.setLayout(new BorderLayout());
            dimTextField(num1);
            dimTextField(num2);
            dimTextField(result);
            JPanel west = new JPanel();
            west.add(new JLabel("numero 1"));
            west.add(num1);
            this.add(west, BorderLayout.WEST);

            JPanel center = new JPanel();
            center.add(new JLabel("numero 2"));
            center.add(num2);
            this.add(center, BorderLayout.CENTER);


            JPanel east = new JPanel();
            center.add(new JLabel("risultato"));
            center.add(result);
            this.add(east, BorderLayout.EAST);

            JPanel end = new JPanel();

            end.add(btnPlus);
            btnPlus.addActionListener(e -> plus());
            end.add(btnMinus);
            btnMinus.addActionListener(e -> Minus ());
            end.add(btnMulty);
            btnMulty.addActionListener(e -> Multy());
            end.add(btnDiv);
            btnDiv.addActionListener(e -> Div());
            this.add(end, BorderLayout.SOUTH);
        }



        public void plus() {
            int numero1 = Integer.parseInt( num1.getText());
            int numero2 = Integer.parseInt( num2.getText());
            int res = numero1 + numero2;
            result.setText(Integer.toString(res));


        }

        public void Minus() {
            int numero1 = Integer.parseInt( num1.getText());
            int numero2 = Integer.parseInt( num2.getText());
            int res = numero1 - numero2;
            result.setText(Integer.toString(res));


        }

        public void Multy() {
            int numero1 = Integer.parseInt( num1.getText());
            int numero2 = Integer.parseInt( num2.getText());
            int res = numero1 * numero2;
            result.setText(Integer.toString(res));


        }

        public void Div() {
            int numero1 = Integer.parseInt(num1.getText());
            int numero2 = Integer.parseInt(num2.getText());
            int res = numero1 / numero2;
            result.setText(Integer.toString(res));


        }
        public static void main(String[] args) {

            JFrame frame=new JFrame("App");
            frame.setContentPane(new Calc());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }

