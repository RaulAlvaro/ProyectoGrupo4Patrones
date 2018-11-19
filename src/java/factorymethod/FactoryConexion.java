/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import conexion.Conexion;
import java.sql.Connection;

/**
 *
 * @author RAUL
 */
public class FactoryConexion {
    
    public Connection getConexion(String bd){
        if (bd.equals("mysql")) {
            Conexion c1 = new Conexion();
            Connection connection = c1.initialize();
            return connection;
        }
        return null;
    }
}
