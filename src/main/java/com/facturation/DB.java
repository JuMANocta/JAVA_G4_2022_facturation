package com.facturation;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DB {
    Connection DBConnection(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturation", "root", "");
            System.out.println("Connected to database");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Pas de connexion à la BDD " + e.getMessage(), "Erreur Connexion", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
}