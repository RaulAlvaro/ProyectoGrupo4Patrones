/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
/**
 *
 * @author ABEL
 */
public class Conexion {
    
    private Connection _connection = null; 
   
    public Connection initialize(){         
    try { 
        DriverManager.registerDriver( new Driver()); 
        _connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/translima","root","");
        System.out.println("Conexion exitosa");
        }
    catch (SQLException e) { 
     System.out.println( "Error" + e.getMessage()); 
        }
    
    return _connection;
    
    }
   
}
