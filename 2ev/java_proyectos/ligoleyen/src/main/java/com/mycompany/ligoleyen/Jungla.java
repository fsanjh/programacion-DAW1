
package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Jungla extends Campeon{
    private String actitud;

    public Jungla(String nombre, String recurso, String combate, String actitud) {
        super(nombre, recurso, combate);
        this.actitud = actitud;
    }
    
    @Override
    public String toString() {
        return super.toString() +", se juega: "+ actitud;
    }
    
}
