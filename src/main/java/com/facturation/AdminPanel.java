package com.facturation;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.util.ArrayList;

public class AdminPanel extends JFrame {

    AdminPanel() {
        setTitle("Admin Panel");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(0,0,840,640);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnProduct = new JMenu("Product");
        menuBar.add(mnProduct);

        JMenuItem itmAddProduct = new JMenuItem("Add Product");
        mnProduct.add(itmAddProduct);

        JMenuItem itmUpdateProduct = new JMenuItem("Update Product");
        mnProduct.add(itmUpdateProduct);

        JMenuItem itmDeleteProduct = new JMenuItem("Delete Product");
        mnProduct.add(itmDeleteProduct);

        JMenu mnCashier = new JMenu("Cashier");
        menuBar.add(mnCashier);

        JMenuItem itmAddCashier = new JMenuItem("Add Cashier");
        mnCashier.add(itmAddCashier);

        JMenuItem itmDeleteCashier = new JMenuItem("Delete Cashier");
        mnCashier.add(itmDeleteCashier);

        JMenu mnStock = new JMenu("Stock");
        menuBar.add(mnStock);

        JMenuItem itmShowStock = new JMenuItem("Show Stock");
        mnStock.add(itmShowStock);

        JMenu mnSearch = new JMenu("Search");
        menuBar.add(mnSearch);

        JMenuItem itmSearchProduct = new JMenuItem("Search Product");
        mnSearch.add(itmSearchProduct);

        JMenuItem itmSearchCashier = new JMenuItem("Search Cashier");
        mnSearch.add(itmSearchCashier);

        JMenu mnSales = new JMenu("Sales");
        menuBar.add(mnSales);

        JMenuItem itmPrintSale = new JMenuItem("Print Sale");
        mnSales.add(itmPrintSale);

        JMenu mnAccount = new JMenu("Account");
        menuBar.add(mnAccount);

        JMenuItem logout = new JMenuItem("Logout");
        mnAccount.add(logout);

        getContentPane().setLayout(new BorderLayout(0,0));
        
        ArrayList<JPanel> panels = new ArrayList<JPanel>();
        panels.add(new addProduct());

        getContentPane().add(panels.get(0));
    }
}
