package com.facturation;

import java.awt.Font;
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

        JLabel lblProductName = new JLabel("Product ID");
        lblProductName.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblProductName.setBounds(246,136,124,21);
        add(lblProductName);

        JLabel lblProductDescription = new JLabel("Product Details");
        lblProductDescription.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblProductDescription.setBounds(246,168,139,21);
        add(lblProductDescription);

        JTextField idField = new JTextField();
        idField.setBounds(449,137,136,20);
        add(idField);
        idField.setColumns(10);

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

        
    }
}
