/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IDAOLinea;
import factorymethod.FactoryConexion;
import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAUL
 */
public class DAOLinea implements IDAOLinea{
    
    private Connection connection;
    
    public DAOLinea() {
        FactoryConexion factory = new FactoryConexion();
        connection = factory.getConexion("mysql");
    }

    @Override
    public List<Integer> idLineaByIdTipoTrans(String idTipoTrans) {
        
        List<Integer> listalineas = new ArrayList<>();
        
        try {
            Statement statement = null;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from linea where idtipotransporte='" + idTipoTrans + "';");

            while (resultSet.next()) {
                int linea = resultSet.getInt("idlinea");
                listalineas.add(linea);
            }
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia " + e.getMessage());
        }
        return listalineas;
    }
    
 
    
}
