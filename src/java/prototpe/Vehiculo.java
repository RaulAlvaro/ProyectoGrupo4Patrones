/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototpe;

/**
 *
 * @author RAUL
 */
public abstract class Vehiculo implements Cloneable{
    private int idvehiculo;
    private String placa;
    private String capacidad;
    private int idtipovehiculo;
    private String estado;
    private int idlinea;
    
    public Vehiculo clone() throws CloneNotSupportedException{
        return (Vehiculo) super.clone();
    }
   
    public abstract String verVehiculo();
    
    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdtipovehiculo() {
        return idtipovehiculo;
    }

    public void setIdtipovehiculo(int idtipovehiculo) {
        this.idtipovehiculo = idtipovehiculo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }
    
    
}
