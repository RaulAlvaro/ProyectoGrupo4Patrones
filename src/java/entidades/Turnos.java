/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author RAUL
 */
public class Turnos {
    private int idturnos;
    private Date fecha;
    private String horainicio;
    private String horafin;
    private int idusuario;
    private int idvehiculo;

    public Turnos() {
    }

    public Turnos(int idturnos, Date fecha, String horainicio, String horafin, int idusuario, int idvehiculo) {
        this.idturnos = idturnos;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.idusuario = idusuario;
        this.idvehiculo = idvehiculo;
    }
    
    public int getIdturnos() {
        return idturnos;
    }

    public void setIdturnos(int idturnos) {
        this.idturnos = idturnos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }
    
    
    
    
}
