/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperCompreBarato;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class Conexion2 {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/super_compre_barato";
    private static final String USER = "root";
    private static final String PASS = "hola123";

    public static Connection getConnection(){
    
        Connection con = null;
        
        try
        {
            
            con = (Connection)DriverManager.getConnection(URL, USER, PASS);

        } catch (Exception e)
        {
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        return con;
        
    }
    
}
