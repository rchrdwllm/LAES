/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.sql.Connection;
import classes.Database;
import screens.LogIn;
/**
 *
 * @author rwill
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database database = new Database();
        Connection connection = database.getConnection();
        
        System.out.println(connection);
        
        LogIn login = new LogIn();
        
        login.setVisible(true);
    }
    
}
