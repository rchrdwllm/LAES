package classes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rwill
 */
public class Database {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "password";
    private static final String CONNECTION = "jdbc:mysql://localhost:3306/laes";
    public static Connection sqlConnection = null;
    
    public Database() { 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            sqlConnection = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
            loadTables();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.print(e);
        }
    }
    
    public void loadTables() {
        String[] tables = {
            "CREATE TABLE IF NOT EXISTS laes.users (" +
            "  id       INT PRIMARY KEY AUTO_INCREMENT," +
            "  username VARCHAR(50)," +
            "  password VARCHAR(50)" +
            ")",
            "CREATE TABLE IF NOT EXISTS laes.products (" +
            "  id       INT PRIMARY KEY AUTO_INCREMENT," +
            "  name     VARCHAR(255)," +
            "  quantity INT," +
            "  picture  BLOB" +
            ")",
            "CREATE TABLE IF NOT EXISTS laes.reservations (" +
            "  contactNumber    VARCHAR(255)," +
            "  customerId       VARCHAR(255)," +
            "  date             VARCHAR(255)," +
            "  modeOfPayment    VARCHAR(255)," +
            "  name             VARCHAR(255)," +
            "  reservationId    VARCHAR(255) PRIMARY KEY," +
            "  typeOfService    VARCHAR(255)" +
            ")",
            "CREATE TABLE IF NOT EXISTS laes.customers (" +
            "  contactNumber    VARCHAR(255)," +
            "  customerId       VARCHAR(255) PRIMARY KEY," +
            "  name             VARCHAR(255)," +
            "  services         INT" +
            ")"
        };
        
        for (String query : tables) {
            try (var statement = sqlConnection.createStatement()) {
                statement.executeUpdate(query);
            } catch (SQLException exception) {
                System.out.println("SQL Error: " + exception.getMessage());
            }
        }

    }
    
    public Connection getConnection() {
        return sqlConnection;
    }
}
