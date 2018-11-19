/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import conexion.Conexion;
import entidades.Tarjeta;
import java.sql.PreparedStatement;

/**
 *
 * @author ABEL
 */

public class TareaActualizarEstado implements TareaTarjeta {

    PreparedStatement ps = null;
    Conexion conexion = new Conexion();
    
    @Override
    public void ejecutar(Tarjeta tarjeta,int monto,String estado) {
       try{
            ps = conexion.initialize().prepareStatement("update tarjeta set estado='"+estado+"' where idtarjeta="+tarjeta.getIdTarjeta()+";");
            ps.executeUpdate();
           
        }catch(Exception e){
            System.out.println("ERROR ESTADO"+e.getMessage());
        }
    }
    
    
}
