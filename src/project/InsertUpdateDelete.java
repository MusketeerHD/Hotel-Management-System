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
public class InsertUpdateDelete {
    // ini untuk class CRUD ke database
    public static void setData(String Query,String msg){
        Connection con = null;
        Statement st = null;
        try {
            con=ConnectionProvider.getcon();
            st=con.createStatement();
            st.executeUpdate(Query);
            if (!msg.equals("")) { // validasi
                // menampilkan message updating something in database
                JOptionPane.showMessageDialog(null, msg);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try {
                
            } catch (Exception e) {
                
            }
        }
    }
    
}
