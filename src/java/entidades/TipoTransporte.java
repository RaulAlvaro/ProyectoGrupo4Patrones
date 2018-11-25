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
public class TipoTransporte {
    private int idTransporte;
    private String tipotransporte;

    public TipoTransporte() {
    }

    public TipoTransporte(int idTransporte, String tipotransporte) {
        this.idTransporte = idTransporte;
        this.tipotransporte = tipotransporte;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getTipotransporte() {
        return tipotransporte;
    }

    public void setTipotransporte(String tipotransporte) {
        this.tipotransporte = tipotransporte;
    }
    
    
}
