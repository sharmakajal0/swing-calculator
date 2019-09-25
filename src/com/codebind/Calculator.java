package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public JPanel panel;
    public JTextField resultTxt;
    public JButton clearButton;
    public JButton signButton;
    public JButton percentButton;
    public JButton divideButton;
    public JButton minusButton;
    public JButton a0Button;
    public JButton a1Button;
    public JButton a2Button;
    public JButton a3Button;
    public JButton a4Button;
    public JButton a5Button;
    public JButton a6Button;
    public JButton a7Button;
    public JButton a8Button;
    public JButton a9Button;
    public JButton multiplyButton;
    public JButton addButton;
    public JButton decimalButton;
    public JButton equalButton;

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
        decimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + decimalButton.getText());
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + addButton.getText());
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + divideButton.getText());
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + multiplyButton.getText());
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + minusButton.getText());
            }
        });
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + percentButton.getText());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ps = actionEvent.paramString();
                System.out.println("param string: " +  ps);
                resultTxt.setText(resultTxt.getText() + clearButton.getText());
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