/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

/**
 *
 * @author Razor
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://154.16.171.78:38528/hotel","admin","s3Fingn0");
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
}
