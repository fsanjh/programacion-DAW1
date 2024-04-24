package com.mycompany.profesorabstracto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nocturno
 */
public class ListaProfesores{
    private ArrayList<Profesor> lista;
    
    public ListaProfesores (){
        lista = new ArrayList<Profesor>();
    }
    
    public void addProf(Profesor prof){
        lista.add(prof);
    }
    public void deleteProf(Profesor prof){
        lista.remove(prof);
    }
    public void mostrarProfs(){
        for(Profesor p : lista){
            System.out.print(p);
            if(p instanceof ProfesorInterino){
                System.out.print(", es profesor interino");
            }else{
                System.out.print(", es profesor titular");
            }
            System.out.print(", Nómina: "+ p.nomina());
            System.out.println();
        }
    }
    
    public float nominaTotal(){
        float nomina = 0;
        /*for(Profesor p : lista){
            nomina += p.nomina();
        } */
        
        @SuppressWarnings("unused")
        Iterator<Profesor> it = lista.iterator();
        
        return nomina;
    };
    
    
    
    
}
