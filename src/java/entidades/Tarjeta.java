/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author ABEL
 */
public class Tarjeta {
    
    private int idTarjeta;
    private int montoTotal;
    private String estado;
    private int idUsuario;
    private String idTipoPasajero;

    public Tarjeta(int idTarjeta, int montoTotal, String estado, int idUsuario, String idTipoPasajero) {
        this.idTarjeta = idTarjeta;
        this.montoTotal = montoTotal;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.idTipoPasajero = idTipoPasajero;
    }
    
    @Override
    public String toString() {
        return "Tarjeta{" + "idTarjeta=" + idTarjeta + ", montoTotal=" + montoTotal + ", estado=" + estado + ", idUsuario=" + idUsuario + ", idTipoPasajero=" + idTipoPasajero + '}';
    }
    
    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdTipoPasajero() {
        return idTipoPasajero;
    }

    public void setIdTipoPasajero(String idTipoPasajero) {
        this.idTipoPasajero = idTipoPasajero;
    }

    
    

}
