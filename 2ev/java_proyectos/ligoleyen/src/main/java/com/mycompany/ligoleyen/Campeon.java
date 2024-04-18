package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Campeon {
    private String nombre;
    private String recurso;
    private String combate;

    public Campeon(String nombre, String recurso, String combate) {
        this.nombre = nombre;
        this.recurso = recurso;
        this.combate = combate;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre +", utiliza: "+ recurso +", combate: "+ combate;
    }
    
    
    
}
