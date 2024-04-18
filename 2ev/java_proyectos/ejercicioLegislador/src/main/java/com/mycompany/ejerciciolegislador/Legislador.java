package com.mycompany.ejerciciolegislador;

/**
 *
 * @author Nocturno
 */
public abstract class Legislador extends Persona{
    private String provincia;
    
    public Legislador(){
        super();
        provincia = "";
    }
    
    public Legislador(String nombre, String apellido, int Edad, String provincia){
        super( nombre,  apellido,  Edad);
        this.provincia = provincia;
    }
    
    public abstract String getCamara();

    @Override
    public String toString(){
        return super.toString() + ", provincia: "+ provincia;
    }

    
    
    
}
