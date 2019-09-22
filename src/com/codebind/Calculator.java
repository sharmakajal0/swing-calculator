package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public JTextField resultTxt; //1
    public JButton clearButton; //2
    public JButton signButton; //3
    public JButton percentButton; //4
    public JButton divideButton; //5
    public JButton minusButton; //9
    public JButton a0Button; //17
    public JButton a1Button; //14
    public JButton a2Button; //15
    public JButton a3Button;
    public JButton a4Button; //10
    public JButton a5Button; //11
    public JButton a6Button; //12
    public JButton a7Button; // 6
    public JButton a8Button; // 7
    public JButton a9Button; //8
    public JButton multiplyButton; //13
    public JButton addButton; //16
    public JButton decimalButton; //18
    public JButton equalButton; //19
    public JPanel panel;

    public Calculator() {
        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String result = resultTxt.getText();
                Long resultNum = Long.parseLong(result);
                resultNum = -1 * resultNum;
                resultTxt.setText(resultNum.toString());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a0Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + a9Button.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}