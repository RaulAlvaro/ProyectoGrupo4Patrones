/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author RAUL
 */
public class Linea {
    private int idlinea;
    private String nombrelinea;
    private String horariolinea;
    private String inicio;
    private String fin;
    private String idtipotransporte;
    private int idempresa;

    public Linea() {
    }

    public Linea(int idlinea, String nombrelinea, String horariolinea, String inicio, String fin, String idtipotransporte, int idempresa) {
        this.idlinea = idlinea;
        this.nombrelinea = nombrelinea;
        this.horariolinea = horariolinea;
        this.inicio = inicio;
        this.fin = fin;
        this.idtipotransporte = idtipotransporte;
        this.idempresa = idempresa;
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public String getNombrelinea() {
        return nombrelinea;
    }

    public void setNombrelinea(String nombrelinea) {
        this.nombrelinea = nombrelinea;
    }

    public String getHorariolinea() {
        return horariolinea;
    }

    public void setHorariolinea(String horariolinea) {
        this.horariolinea = horariolinea;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getIdtipotransporte() {
        return idtipotransporte;
    }

    public void setIdtipotransporte(String idtipotransporte) {
        this.idtipotransporte = idtipotransporte;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    
    
    
}
