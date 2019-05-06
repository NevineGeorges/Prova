package com.company;

import javax.swing.*;
import java.awt.*;

import static com.company.SwingConsole.run;

public class Button1 extends JFrame {


    private JButton
    b1=new JButton("Button 1"),
    b2=new JButton("Button 2"),
    b3=new JButton("Enter");


    public Button1(){
       setLayout(new FlowLayout());   //without writing this only one button will appear
        add(b1);
        add(b2);
       add(b3);
    }

    public static void main(String[] args) {
        run(new Button1(),200,100);
    }

}
