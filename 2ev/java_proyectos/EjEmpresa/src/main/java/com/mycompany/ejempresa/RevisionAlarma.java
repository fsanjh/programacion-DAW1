package com.mycompany.ejempresa;

import java.util.Date;

/**
 *
 * @author fsanj
 */
public class RevisionAlarma extends Servicio{
    private int numAlarmas;
    
    public RevisionAlarma(Date _FechaRevision, String _cliente, int _numAlarmas){
        super("Revisor Especialista Contraincendios", _FechaRevision, _cliente);
        numAlarmas = _numAlarmas;
    }

    public int getNumAlarmas(){
        return numAlarmas;
    }
    public void setNumAlarmas(int numAlarmas){
        this.numAlarmas = numAlarmas;
    }
    
    @Override
    public double costeMaterial(){
        return 0;
    }
    @Override
    public double costeManoObra(){
        return (numAlarmas / 3) * 40;
    }
    @Override
    public double costeTotal(){
        return costeManoObra();
    }
    @Override
    public String detalleServicio(){
        return "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n"
                + "Cliente: "+ super.getCliente() +"\n"
                + "Fecha Inicio: "+ super.getFechaInicio() +"\n"
                + "---------------------------------------\n"
                + "TOTAL: ....... "+ String.format("%.2f", costeTotal()) +"€\n"
                + "---------------------------------------";
    }
    
}
