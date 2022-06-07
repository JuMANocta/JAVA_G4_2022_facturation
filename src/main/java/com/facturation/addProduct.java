package com.facturation;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addProduct extends JPanel{

    JTextField nameField;
    JTextArea descField;
    JComboBox<String> company;
    JTextField quanField;
    JTextField priceField;
    JLabel error;

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

        nameField = new JTextField();
        nameField.setBounds(449,137,136,20);
        add(nameField);
        nameField.setColumns(10);

        JLabel lblProductDescription = new JLabel("Product Details");
        lblProductDescription.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblProductDescription.setBounds(246,168,139,21);
        add(lblProductDescription);

        descField = new JTextArea();
        descField.setBounds(449,168,136,58);
        add(descField);

        JScrollPane scroll = new JScrollPane(descField);
        scroll.setBounds(449,168,136,58);
        add(scroll);

        JLabel lblCompany = new JLabel("Company");
        lblCompany.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblCompany.setBounds(246,241,124,21);
        add(lblCompany);

        company = new JComboBox<String>();
        company.setBounds(449,243,136,20);
        add(company);

        company.addItem("Socrapec");
        company.addItem("Turjet");
        company.addItem("Paclasauf");

        JLabel lblQuantity = new JLabel("Items in Stock");
        lblQuantity.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblQuantity.setBounds(246,273,124,21);
        add(lblQuantity);

        quanField = new JTextField();
        quanField.setColumns(10);
        quanField.setBounds(449,274,136,20);
        add(quanField);

        JLabel lblPrice = new JLabel("Price Items");
        lblPrice.setFont(new Font("Consolas", Font.PLAIN, 14));
        lblPrice.setBounds(246,300,124,21);
        add(lblPrice);

        priceField = new JTextField();
        priceField.setColumns(10);
        priceField.setBounds(449,301,136,20);
        add(priceField);

        error = new JLabel("");
        error.setForeground(Color.RED);
        error.setBounds(339,92,400,14);
        add(error);

        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(449,334,256,23);
        add(btnAddProduct);

        btnAddProduct.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                error.setText("");
                JOptionPane.showMessageDialog(null, "INSERT BDD \n" 
                + nameField.getText() + "\n"
                + descField.getText() + "\n"
                + company.getSelectedItem() + "\n"
                + quanField.getText() + "\n"
                + priceField.getText());
                JtestInt(quanField, "Quantity");
                JtestDouble(priceField, "Price");
            }
        });
        
    }
    public boolean JtestInt(JTextField f, String s){
        try{
            Integer.parseInt(f.getText());
        }catch(NumberFormatException | NullPointerException e){
            error.setText(s + " must be a number");
            f.setBackground(Color.RED);
            return false;
        }
        return true;
    }
    public boolean JtestDouble(JTextField f, String s){
        try{
            Double.parseDouble(f.getText());
        }catch(NumberFormatException | NullPointerException e){
            error.setText(s + " must be a double");
            f.setBorder(new LineBorder(Color.RED, 1));
            return false;
        }
        return true;
    }

    public boolean testINT(String s){
        return (Boolean)(Integer.parseInt(s) != 0);
    }
}
