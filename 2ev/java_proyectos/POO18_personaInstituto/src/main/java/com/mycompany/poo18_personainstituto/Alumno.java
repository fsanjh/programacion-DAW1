/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_personainstituto;

public class Alumno extends Persona {
    private int nia;

    public Alumno(String nombre, String dni, int nia) {
        super(nombre, dni);
        this.nia = nia;
    }
    
    @Override
    public String toString() {
        return super.toString() +", alumno con el NIA: "+ nia;
    }

    public int getNia() {
        return nia;
    }
    public void setNia(int nia) {
        this.nia = nia;
    }
    
}
