/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author rwill
 */
public class Reservation {
    public String name;
    public String contactNumber;
    public String date;
    public String service;
    public String modeOfPayment;
    public String reservationId;
    
    public Reservation(String name, String contactNumber, String date, String service, String modeOfPayment, String reservationId) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.date = date;
        this.service = service;
        this.modeOfPayment = modeOfPayment;
        this.reservationId = reservationId;
    }
}
