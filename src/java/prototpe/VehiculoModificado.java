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
public class VehiculoModificado extends Vehiculo{

    @Override
    public String verVehiculo() {
        return "La nueva placa es: "+this.getPlaca();
    }
    
}
