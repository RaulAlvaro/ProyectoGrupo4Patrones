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
public class Sesion {
    
    private String usuario;
    private String contraseña;
    private static Sesion accesoUnico;
    
    private Sesion(String usuario,String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public static Sesion getSingletonInstancia(String usuario,String contraseña){
        if(accesoUnico==null){
            accesoUnico = new Sesion(usuario,contraseña);
        }else{
            
        }
        return accesoUnico;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Sesion{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
   
    
    
}
