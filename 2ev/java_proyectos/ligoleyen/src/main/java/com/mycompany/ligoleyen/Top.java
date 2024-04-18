
package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Top extends Campeon{
    private String tipo;

    public Top(String nombre, String recurso, String combate, String tipo) {
        super(nombre, recurso, combate);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() +" ,es del tipo: "+ tipo;
    }
    
    
    
    
    
}
