package com.mycompany.profesorabstracto;

import java.util.Calendar;

/**
 *
 * @author Nocturno
 */
public class ProfesorInterino extends Profesor{ 
    private Calendar fechaInicio;
    
    //constructor
    public ProfesorInterino(Calendar fecha){
        super();
        fechaInicio = fecha;
    }
    public ProfesorInterino(String _nombre, String _apellido, int _edad, String id, Calendar fecha){
        super(_nombre, _apellido, _edad, id);
        fechaInicio = fecha;
    }

    public Calendar getFechaInicio(){
        return fechaInicio;
    }
    public void setFechaInicio(Calendar fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    
    public float nomina(){
        return 40 * 20;
    }

    @Override
    public String toString(){
        return super.toString().concat(", Fecha Inicio: ").concat(fechaInicio.getTime().toString());
    }
    
    
    
    
    
}
