/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

import entidades.Vehiculo;
import java.util.List;

/**
 *
 * @author RAUL
 */
public interface IDAOVehiculo {
    
    public List<Vehiculo> obtenerVehiculosporIdLinea(int idLinea);
    
}
