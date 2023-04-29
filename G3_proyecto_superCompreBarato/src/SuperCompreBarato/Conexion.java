package SuperCompreBarato;

import java.sql.*;
import javax.swing.*;

public class Conexion {
    
//    private static final String URL = "jdbc:mysql://localhost:3306/super_compre_barato";
//    private static final String USER = "root";
//    private static final String PASS = "ByW1552000";
    
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
