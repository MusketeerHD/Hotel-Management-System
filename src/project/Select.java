/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Razor
 */
public class Select {
    public static ResultSet getData(String query){ // passing query
        Connection con=null;
        ResultSet rs=null;
        Statement st=null;
        try {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            rs=st.executeQuery(query);
            return rs;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
