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
            if(e.getSQLState().equals("42S02")){
                int retour = JOptionPane.showOptionDialog(null, "La table n'existe pas ... Voulez vous créer la table ?", "Créer table", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
                if(retour == JOptionPane.OK_OPTION){
                        creationTable();
                }else{
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            }else{
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur SQL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void creationTable(){
        System.out.println("creationTable");
        Connection conn = DB.DBConnection();
        // try with resources
        try(Statement stmt = conn.createStatement()){
            String sql = "CREATE TABLE product (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), details TEXT, company VARCHAR(255), quantity INT, PRICE DOUBLE)";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Table créée");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
