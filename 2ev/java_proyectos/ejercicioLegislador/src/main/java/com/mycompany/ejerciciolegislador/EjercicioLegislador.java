
package com.mycompany.ejerciciolegislador;

/**
 *
 * @author Nocturno
 */
public class EjercicioLegislador {

    public static void main(String[] args) {
        Diputado d1 = new Diputado("a", "b", 5, "segovia");
        Diputado d2 = new Diputado("c", "d", 15, "madrid");
        
        Senador s1 = new Senador("e", "f", 25, "leon");
        Senador s2 = new Senador("g", "h", 35, "vigo");
                
        System.out.println(d1 + "|" + d1.getCamara());
        System.out.println(d2 + "|" + d2.getCamara());
        System.out.println(s1 + "|" + s1.getCamara());
        System.out.println(s2 + "|" + s2.getCamara());
        
        
        
        
        
        
        
    }
}
