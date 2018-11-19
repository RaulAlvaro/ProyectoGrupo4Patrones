/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import entidades.Tarjeta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ABEL
 */
public class SuperTarea implements TareaTarjeta{

    private List<TareaTarjeta> lista= new ArrayList<TareaTarjeta>();
     
    public void addTarea(TareaTarjeta tarea) {
        lista.add(tarea);
    }
 
    @Override
    public void ejecutar(Tarjeta tarjeta, int monto,String estado) {
        lista.forEach((t)->t.ejecutar(tarjeta,monto,estado));
    }
    
}
