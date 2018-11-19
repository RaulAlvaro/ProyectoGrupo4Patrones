/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Idao;

/**
 *
 * @author RAUL
 */
public interface IDAOTarjeta {
    public String obtenerEstadoTarjeta(int idTarjeta);
    public int obtenerMonto(int idTarjeta);
}
