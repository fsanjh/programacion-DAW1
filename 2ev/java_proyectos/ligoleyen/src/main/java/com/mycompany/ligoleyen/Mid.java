
package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Mid extends Campeon{
    private String tipo;
    @SuppressWarnings("unused")
    private String tipoJuego;

    public Mid(String nombre, String recurso, String combate, String tipo, String tipoJuego) {
        super(nombre, recurso, combate);
        this.tipo = tipo;
        this.tipoJuego = tipoJuego;
    }
    
    @Override
    public String toString() {
        return super.toString() +", es del tipo: "+ tipo +", y se juega: ";
    }
}
