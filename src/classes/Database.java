package classes;

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
    private static final String PASSWORD = "Secretnoclue01";
    private static final String CONNECTION = "jdbc:mysql://localhost:3306/laes";
    public static Connection sqlConnection = null;
    
    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            sqlConnection = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.print(e);
        }
    }
    
    public Connection getConnection() {
        return sqlConnection;
    }
}
