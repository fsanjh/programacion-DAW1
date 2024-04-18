package com.mycompany.ejempresa;

import java.util.Date;

/**
 *
 * @author fsanj
 */
public abstract class Servicio{
    private String trabajador;
    private Date FechaInicio;
    private String cliente;

    public Servicio(String _trabajador, Date _FechaInicio, String _cliente){
        this.trabajador = _trabajador;
        this.FechaInicio = _FechaInicio;
        this.cliente = _cliente;
    }
    

    public String getTrabajador(){
        return trabajador;
    }
    public void setTrabajador(String trabajador){
        this.trabajador = trabajador;
    }

    public Date getFechaInicio(){
        return FechaInicio;
    }
    public void setFechaInicio(Date FechaInicio){
        this.FechaInicio = FechaInicio;
    }

    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();
    
    
    
    
    
    
    
    
}
