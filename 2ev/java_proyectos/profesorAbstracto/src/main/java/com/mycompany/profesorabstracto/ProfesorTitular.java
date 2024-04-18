package com.mycompany.profesorabstracto;

/**
 *
 * @author Nocturno
 */
public class ProfesorTitular extends Profesor{
    
    //constructor
    public ProfesorTitular(){
        super();
    }
    public ProfesorTitular(String _nombre, String _apellido, int _edad, String id){
        super(_nombre, _apellido, _edad, id);
    }
    
    public float nomina(){
        return 40 * 20;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
