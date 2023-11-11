/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;

/**
 *
 * @author William
 */
public class Customer {
    public String name;
    public String contactNumber;
    public int services;
    public String customerId;
    
    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.services = 1;
        this.customerId = UUID.randomUUID().toString();
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
}
