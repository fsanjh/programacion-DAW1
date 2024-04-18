/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_personainstituto;

public class Trabajador extends Persona {
    private int nrp;

    public Trabajador(String nombre, String dni, int nrp) {
        super(nombre, dni);
        this.nrp = nrp;
    }

    @Override
    public String toString() {
        return super.toString() +", trabajador con el NRP: "+ nrp;
    }

    public int getNrp() {
        return nrp;
    }
    public void setNrp(int nrp) {
        this.nrp = nrp;
    }
    
}
