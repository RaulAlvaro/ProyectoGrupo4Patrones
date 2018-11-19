/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import entidades.Tarjeta;

/**
 *
 * @author ABEL
 */
public class GestorTareas {
    
    public void ejecutar (TareaTarjeta tarea, Tarjeta tarjeta, int monto, String estado) {
        tarea.ejecutar(tarjeta,monto,estado);
    }
    
}
