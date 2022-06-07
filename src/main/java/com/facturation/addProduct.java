package com.facturation;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class addProduct extends JPanel{
    addProduct(){
        setLayout(null);
        setBounds(0,0,840,600);

        JLabel lblAddProduct = new JLabel("Add Product");
        lblAddProduct.setBounds(328,45,115,21);
        lblAddProduct.setFont(new Font("Consolas", Font.PLAIN, 17));
        add(lblAddProduct);

        JLabel lblProductName = new JLabel("Product Name");
        lblProductName.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblProductName.setBounds(246,136,124,21);
        add(lblProductName);

        JTextField nameField = new JTextField();
        nameField.setBounds(449,137,136,20);
        add(nameField);
        nameField.setColumns(10);

        JLabel lblProductDescription = new JLabel("Product Details");
        lblProductDescription.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblProductDescription.setBounds(246,168,139,21);
        add(lblProductDescription);

        JTextArea descField = new JTextArea();
        descField.setBounds(449,168,136,58);
        add(descField);

        JScrollPane scroll = new JScrollPane(descField);
        scroll.setBounds(449,168,136,58);
        add(scroll);

        JLabel lblCompany = new JLabel("Company");
        lblCompany.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblCompany.setBounds(246,241,124,21);
        add(lblCompany);

        JComboBox<String> company = new JComboBox<String>();
        company.setBounds(449,243,136,20);
        add(company);

        company.addItem("Socrapec");
        company.addItem("Turjet");
        company.addItem("Paclasauf");

        JLabel lblQuantity = new JLabel("Items in Stock");
        lblQuantity.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblQuantity.setBounds(246,273,124,21);
        add(lblQuantity);

        JTextField quanField = new JTextField();
        quanField.setColumns(10);
        quanField.setBounds(449,274,136,20);
        add(quanField);

        JLabel lblPrice = new JLabel("Price Items");
        lblPrice.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblPrice.setBounds(246,300,124,21);
        add(lblPrice);

        JTextField priceField = new JTextField();
        priceField.setColumns(10);
        priceField.setBounds(449,301,136,20);
        add(priceField);

        JLabel error = new JLabel("");
        error.setForeground(Color.RED);
        error.setBounds(339,92,256,14);
        add(error);

        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(449,334,136,23);
        add(btnAddProduct);

    }
}
