/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Idao.IDAOTurnos;
import entidades.Turnos;
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
public class DAOTurnos implements IDAOTurnos{
    
    private Connection connection;
    
    public DAOTurnos(){
        FactoryConexion factory = new FactoryConexion();
        connection = factory.getConexion("mysql");
    }
    
    @Override
    public List<Turnos> obtenerTurnosporDNI(int idUsuario) {
        List<Turnos> listaturnos = new ArrayList<Turnos>();
        try {
            Statement statement = null;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select *from turnos where idusuario='" + idUsuario + "';");

            while (resultSet.next()) {
                Turnos turno = new Turnos();
                turno.setIdturnos(resultSet.getInt("idturnos"));
                turno.setFecha(resultSet.getDate("fecha"));
                turno.setHorainicio(resultSet.getString("horainicio"));
                turno.setHorafin(resultSet.getString("horafin"));
                turno.setIdusuario(resultSet.getInt("idusuario"));
                turno.setIdvehiculo(resultSet.getInt("idvehiculo"));
                listaturnos.add(turno);
            }
        } catch (SQLException e) {
            System.out.println("Error crear la sentencia " + e.getMessage());
        }
        return listaturnos;
    }
    
}
