
package com.mycompany.mercadona;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class Mercadona {

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2030, 5, 10);
        
        Detergente d1 = new Detergente("Dixan", 12.50);
        d1.setVolumen(5);
        d1.setTipoEnvase("plastico");
        d1.setDescuento(10);
        System.out.println(d1);
        
        System.out.println("---------------------------------------");
        Cereal c1 = new Cereal("Hacendado", 2, "trigo");
        c1.setCaducidad(fecha);
        System.out.println(c1);
        
        System.out.println("---------------------------------------");
        Vino v1 = new Vino("Rivera del Duero", "tinto", 20.5, 7.70);
        v1.setCaducidad(fecha);
        v1.setVolumen(0.5);
        v1.setTipoEnvase("Vidrio");
        v1.setDescuento(5);
        System.out.println(v1);
        
        System.out.println("---------------------------------------");
        ArrayList<Producto> lista = new ArrayList<Producto>();
        lista.add(d1);
        lista.add(c1);
        lista.add(v1);
        
        double caloriasTotales = 0;
        for(Producto p : lista){
            caloriasTotales += p.getCalorias();
        }
        System.out.println("Calorias totales: "+ (int)caloriasTotales+ " calorias");
        
        
        
        
        
        
        
        
        
        
        
    }
}
