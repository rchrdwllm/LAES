/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author rwill
 */
public class Reservation {
    public String name;
    public String contactNumber;
    public String date;
    public String typeOfService;
    public String modeOfPayment;
    public String reservationId;
    
    public Reservation(String name, String contactNumber, LocalDate date, String typeOfService, String modeOfPayment) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.date = date.toString();
        this.typeOfService = typeOfService;
        this.modeOfPayment = modeOfPayment;
        this.reservationId = UUID.randomUUID().toString().substring(0, 7);
    }
    
    public void add() {
        try {
            String st = "INSERT INTO reservations (name, contactNumber, date, typeOfService, modeOfPayment, customerId, reservationId) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            boolean customerExists = Customer.customerExists(this.name, this.contactNumber);
            
            if (customerExists) {
                String customerId = Customer.getIdByNumber(contactNumber);
                
                pstmt.setString(1, this.name);
                pstmt.setString(2, this.contactNumber);
                pstmt.setString(3, this.date);
                pstmt.setString(4, this.typeOfService);
                pstmt.setString(5, this.modeOfPayment);
                pstmt.setString(6, customerId);
                pstmt.setString(7, this.reservationId);
                
                System.out.println("Customer with customerId " + customerId + " already exists! Skipping creation of new user...");
                
                int currentServices = 1;
                
                try {
                    String servicesQuery = "SELECT * from laes.customers WHERE customerId = '" + customerId + "'";
                    PreparedStatement servicesPstmt = Database.sqlConnection.prepareStatement(servicesQuery);
                    ResultSet servicesRs = servicesPstmt.executeQuery();
                    
                    if (servicesRs.next()) {
                        currentServices = servicesRs.getInt("services");
                        
                        String customerQuery = "UPDATE laes.customers SET services = " + (currentServices + 1) + " WHERE customerId = '" + customerId + "'";
                        PreparedStatement customerPstmt = Database.sqlConnection.prepareStatement(customerQuery);
                        
                        customerPstmt.executeUpdate();
                        
                        System.out.println("Added service to customerId " + customerId);
                    }
                } catch (SQLException e) {
                    System.out.println(e);
                }
            } else {
                String customerId = UUID.randomUUID().toString().substring(0, 7);
                
                pstmt.setString(1, this.name);
                pstmt.setString(2, this.contactNumber);
                pstmt.setString(3, this.date);
                pstmt.setString(4, this.typeOfService);
                pstmt.setString(5, this.modeOfPayment);
                pstmt.setString(6, customerId);
                pstmt.setString(7, this.reservationId);
                
                Customer customer = new Customer(this.name, this.contactNumber, customerId);
                
                customer.add();
            }
            
            pstmt.executeUpdate();
            
            System.out.println("Reservation with reservationId " + reservationId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
