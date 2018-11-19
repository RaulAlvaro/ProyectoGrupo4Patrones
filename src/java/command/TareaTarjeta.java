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

public interface TareaTarjeta {
    public abstract void ejecutar(Tarjeta tarjeta, int monto, String estado);
}
