
package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Bot extends Campeon{
    private String metodoDaño;

    public Bot(String nombre, String recurso, String combate, String metodoDaño) {
        super(nombre, recurso, combate);
        this.metodoDaño = metodoDaño;
    }
    
    @Override
    public String toString() {
        return super.toString() +", hace daño con: "+ metodoDaño;
    }
}
