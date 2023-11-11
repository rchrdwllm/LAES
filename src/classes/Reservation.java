/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        this.reservationId = UUID.randomUUID().toString();
    }
    
    public void add() {
        try {
            String st = "INSERT INTO reservations (name, contactNumber, date, typeOfService, modeOfPayment, reservationId) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = Database.sqlConnection.prepareStatement(st);
            
            pstmt.setString(1, this.name);
            pstmt.setString(2, this.contactNumber);
            pstmt.setString(3, this.date);
            pstmt.setString(4, this.typeOfService);
            pstmt.setString(5, this.modeOfPayment);
            pstmt.setString(6, this.reservationId);
            
            pstmt.executeUpdate();
            
            System.out.println("Reservation with reservationId " + reservationId + " added successfully");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
