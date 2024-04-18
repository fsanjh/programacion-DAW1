
package com.mycompany.diaslluvia;

/**
 *
 * @author Nocturno
 */
public class Diaslluvia {

    public static void main(String[] args) {
        DiasLluviosos d = new DiasLluviosos();
        for(int i = 1; i < 367; i++){
            d.registarQueLlovioElDia(i, (boolean)(Math.random() < 0.5));
        }
        d.mostrarDias();
        System.out.println("Llovió el dia 366: "+d.consultarSiLlovioElDia(366));
        System.out.println("Total dias lluvia: "+d.contarDiasLluviosos());
        System.out.println("Cuatri con mas lluvia: "+d.consultarCuatrimestreMasLluvioso());
        System.out.println("Primer dia de lluvia: "+d.consultarPrimerDiaConLluvia());
        
        
        
        
    }
}
