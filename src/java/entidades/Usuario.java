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
public class Usuario {
    
    private int idusuario;
    private String nomuser;
    private String contraseña;
    private String nombres;
    private String apellpaterno;
    private String apellmaterno;
    private String dni;
    private String telefono;
    private String idtipousuario;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomuser() {
        return nomuser;
    }

    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellpaterno() {
        return apellpaterno;
    }

    public void setApellpaterno(String apellpaterno) {
        this.apellpaterno = apellpaterno;
    }

    public String getApellmaterno() {
        return apellmaterno;
    }

    public void setApellmaterno(String apellmaterno) {
        this.apellmaterno = apellmaterno;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(String idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", nomuser=" + nomuser + ", contrase\u00f1a=" + contraseña + ", nombres=" + nombres + ", apellpaterno=" + apellpaterno + ", apellmaterno=" + apellmaterno + ", dni=" + dni + ", telefono=" + telefono + ", idtipousuario=" + idtipousuario + '}';
    }
    
    
    
}
