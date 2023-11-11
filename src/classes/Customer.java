/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author William
 */
public class Customer {
    public String name;
    public String contactNumber;
    public int services;
    public String customerId;
    
    public Customer(String name, String contactNumber, String customerId) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.services = 1;
        this.customerId = customerId;
    }
    
    public void add() {
        try {
            String st = "INSERT INTO customers (name, contactNumber, services, customerId) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, this.name);
            pstmt.setString(2, this.contactNumber);
            pstmt.setInt(3, this.services);
            pstmt.setString(4, this.customerId);
            
            pstmt.executeUpdate();
            
            System.out.println("Customer with customerId " + customerId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static String getIdByNumber(String contactNumber) {
        String customerId = "";
        
        try {
            String query = "SELECT * from laes.customers WHERE contactNumber = ?";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(query);

            pstmt.setString(1, contactNumber);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                customerId = rs.getString("customerId");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return customerId;
    }
    
    public static boolean customerExists(String name, String contactNumber) {
        try {
            String query = "SELECT * from laes.customers WHERE contactNumber = ?";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(query);

            pstmt.setString(1, contactNumber);
            
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            
            return false;
        }
    }
}
