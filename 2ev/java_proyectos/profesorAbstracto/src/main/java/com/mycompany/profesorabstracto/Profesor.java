package com.mycompany.profesorabstracto;

/**
 *
 * @author Nocturno
 */
public abstract class Profesor extends Persona{
    private String idProf;
    
    //Constructor
    public Profesor(){
        super();
        idProf = "fumada loco";
    }
    public Profesor(String nombre, String apellido, int edad, String idProf){
        super(nombre, apellido, edad);
        this.idProf = idProf;
    }

    public String getIdProf(){
        return idProf;
    }
    public void setIdProf(String idProf){
        this.idProf = idProf;
    }

    @Override
    public String toString(){
        return super.toString().concat(", ID Profesor: ").concat(idProf);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ getNombre() + " "+ getApellido() );
        System.out.println("Edad: "+ getEdad());
        System.out.println("ID Profesor: "+ getIdProf());
    }
    
    public abstract float nomina();
    
    
    
    
    
}
