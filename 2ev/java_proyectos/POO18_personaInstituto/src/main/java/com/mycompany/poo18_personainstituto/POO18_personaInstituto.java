/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_personainstituto;

public class POO18_personaInstituto {

    public static void main(String[] args) {
        Persona P1 = new Persona("Paco", "89754362L");
        Alumno A1 = new Alumno("Federico", "45613278N", 75643216);
        Trabajador T1 = new Trabajador("José", "54689513H", 65431298);
        Profesor Pr1 = new Profesor("Ermenegildo", "90875632H", 46179080, "Informática");
        
        System.out.println(P1);
        System.out.println(A1);
        System.out.println(T1);
        System.out.println(Pr1);
        
    }
}