/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IDAOUsuario;
import entidades.Usuario;
import factorymethod.FactoryConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RAUL
 */
public class DAOUsuario implements IDAOUsuario{

    private Connection connection;
    
    public DAOUsuario(){
        FactoryConexion factory = new FactoryConexion();
        connection = factory.getConexion("mysql");
    }

    @Override
    public int obtenerIdUsuarioByDni(String dni) {
        int idUsuario=0;
        try {
            Statement statement = null;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select idusuario from usuario where dni='" + dni + "';");

            while (resultSet.next()) {
                idUsuario = resultSet.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia " + e.getMessage());
        }
        return idUsuario;
    }
    
    
    
}
