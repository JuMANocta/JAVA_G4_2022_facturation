package com.facturation;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class addCashier extends JPanel{
    addCashier(){
        setLayout(null);
        setBounds(100,100,840,600);

        JLabel lblAddCashier = new JLabel("Add Cashier");
        lblAddCashier.setBounds(328,45,115,21);
        lblAddCashier.setFont(new Font("Consolas", Font.PLAIN, 17));
        add(lblAddCashier);

        JLabel lblCashierLogin = new JLabel("Login");
        lblCashierLogin.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblCashierLogin.setBounds(246,104,124,21);
        add(lblCashierLogin);

        JLabel lblCashierPassword = new JLabel("Password");
        lblCashierPassword.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblCashierPassword.setBounds(246,136,124,21);
        add(lblCashierPassword);

        JTextField loginField = new JTextField();
        loginField.setBounds(436,106,147,20);
        loginField.setColumns(10);
        add(loginField);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(436,138,147,20);
        add(passwordField);

        JButton btnAddCashier = new JButton("Add Cashier");
        btnAddCashier.setBounds(436,194,147,23);
        add(btnAddCashier);

        JLabel error = new JLabel("");
        error.setForeground(Color.RED);
        error.setBounds(339,92,256,14);
        add(error);
    }
}
