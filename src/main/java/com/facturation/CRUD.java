package com.facturation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CRUD {
    public void select(){
        System.out.println("select");
        Connection conn = DB.DBConnection();
        // try with resources
        try(Statement stmt = conn.createStatement()){
            String sql = "SELECT * FROM product";
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.next()){
                String message = "Aucun produit dans la base de données";
                System.out.println(message);
                JOptionPane.showMessageDialog(null, message);
            }else{
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void creationTable(){
        System.out.println("creationTable");
        Connection conn = DB.DBConnection();
        // try with resources
        try(Statement stmt = conn.createStatement()){
            String sql = "CREATE TABLE product (id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR(255), details TEXT, company VARCHAR(255), quantity INTEGER, PRICE DOUBLE)";
            stmt.executeUpdate(sql);
            System.out.println("Table product created");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
