
package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Support extends Campeon{
    private String tipo;

    public Support(String nombre, String recurso, String combate, String tipo) {
        super(nombre, recurso, combate);
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return super.toString() +", es del tipo: "+ tipo;
    }
    
}
