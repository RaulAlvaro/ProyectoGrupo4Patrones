/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IDAOVehiculo;
import entidades.Vehiculo;
import factorymethod.FactoryConexion;
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
public class DAOVehiculo implements IDAOVehiculo{

    private Connection connection;
    
    public DAOVehiculo(){
        FactoryConexion factory = new FactoryConexion();
        connection = factory.getConexion("mysql");
    }
    
    @Override
    public List<Vehiculo> obtenerVehiculosporIdLinea(int idLinea) {
        List<Vehiculo> listavehiculos = new ArrayList<Vehiculo>();
        try {
            Statement statement = null;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from vehiculo where idlinea='" + idLinea + "';");

            while (resultSet.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setIdvehiculo(resultSet.getInt("idvehiculo"));
                vehiculo.setPlaca(resultSet.getString("placa"));
                vehiculo.setCapacidad(resultSet.getString("capacidad"));
                vehiculo.setIdtipovehiculo(resultSet.getInt("idtipovehiculo"));
                vehiculo.setEstado(resultSet.getString("estado"));
                vehiculo.setIdlinea(resultSet.getInt("idlinea"));
                listavehiculos.add(vehiculo);
            }
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia " + e.getMessage());
        }
        return listavehiculos;
    }
    
}
