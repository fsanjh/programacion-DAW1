
package com.mycompany.ejelectrodomesticos;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class EjElectrodomesticos {

    public static void main(String[] args) {
        Electrodomestico e1 = new Electrodomestico("Horno", "Bosch", 1000);
        System.out.println(e1);
        System.out.println(e1.getConsumo(4));
        System.out.println(e1.getCosteConsumo(4, 1.5));
        
        Lavadora l1 = new Lavadora("Microondas", "Samsung", 500);
        System.out.println(l1);
        System.out.println(l1.getConsumo(4));
        System.out.println(l1.getCosteConsumo(4, 1.5));
        Lavadora l2 = new Lavadora("Lavadora", "Xiaomi", 600, 400, true);
        System.out.println(l2);
        System.out.println(l2.getConsumo(4));
        System.out.println(l2.getCosteConsumo(4, 1.5));
        
        Frigorifico f1 = new Frigorifico("Roomba", "Apple", 500);
        System.out.println(f1);
        System.out.println(f1.getConsumo(4));
        System.out.println(f1.getCosteConsumo(4, 1.5));
        Frigorifico f2 = new Frigorifico("Frigorifico", "Balay", 500, -2, true);
        System.out.println(f2);
        System.out.println(f2.getConsumo(4));
        System.out.println(f2.getCosteConsumo(4, 1.5));
        
        Lavadora l3 = new Lavadora("Lavadora", "Malay", 120, 600, true);
        System.out.println(l3);
        System.out.println(l3.getConsumo(2));
        System.out.println(l3.getCosteConsumo(2, 12.80));
        
        System.out.println("=================================================");
        ArrayList<Electrodomestico> lista = new ArrayList();
        Electrodomestico e2 = new Electrodomestico("Horno", "Bosch", 1000);
        lista.add(e2);
        Electrodomestico e3 = new Electrodomestico("Lavadora", "Malay", 1300);
        lista.add(e3);
        Electrodomestico e4 = new Electrodomestico("Microondas", "Xiaomi", 2000);
        lista.add(e4);
        Electrodomestico e5 = new Electrodomestico("Frigorifico", "Samsung", 900);
        lista.add(e5);
        Electrodomestico e6 = new Electrodomestico("Air fryer", "Bosch", 700);
        lista.add(e6);
        
        Electrodomestico mayorConsumo = new Electrodomestico("0", "0", 0);
        
        for(Electrodomestico list : lista){
            if(mayorConsumo.getConsumo(2) < list.getConsumo(2)){
                mayorConsumo = list;
            }
        }
        System.out.println("El electrodoméstico que más consume es el "+ mayorConsumo.getTipo() +" de la marca "+ mayorConsumo.getMarca());
        
        
        
        
        
        
        
        
    }
}
