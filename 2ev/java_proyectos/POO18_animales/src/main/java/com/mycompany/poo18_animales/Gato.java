/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_animales;

public class Gato extends Mamifero{
    private String pedigree;

    public Gato(String _nombre, String _dieta, int _edad, int _gestacion, String _pedigree) {
        super(_nombre, _dieta, _edad, _gestacion);
        this.pedigree = _pedigree;
    }

    @Override
    public String toString() {
        return super.toString() + ", es un gato de pedigree: "+ pedigree;
    }

    public String getPedigree() {
        return pedigree;
    }
    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }
    
}
