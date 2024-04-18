package com.mycompany.ejempresa;

import java.util.Date;

/**
 *
 * @author fsanj
 */
public class TrabajoPintura extends Servicio{
    private double superficie;
    private double precioPintura;
    
    public TrabajoPintura(String _trabajador, Date _FechaInicio, String _cliente, double _superficie, double _precioPintura){
        super(_trabajador, _FechaInicio, _cliente);
        superficie = _superficie;
        precioPintura = _precioPintura;
    }

    //GETTER & SETTER
    public double getSuperficie(){
        return superficie;
    }
    public void setSuperficie(double superficie){
        this.superficie = superficie;
    }

    public double getPrecioPintura(){
        return precioPintura;
    }
    public void setPrecioPintura(double precioPintura){
        this.precioPintura = precioPintura;
    }
    
    //MÉTODOS
    @Override
    public double costeMaterial(){
        return (this.superficie / 7.8) * this.precioPintura;
    }
    @Override
    public double costeManoObra(){
        return (this.superficie / 10) * 9.5;
    }
    public double costeAdicional(){
        if(this.superficie < 50){
            return (costeMaterial() + costeManoObra()) * 0.15;
        }else{
            return 0;
        }
    }
    @Override
    public double costeTotal(){
        return costeMaterial() + costeManoObra() + costeAdicional();
    }
    @Override
    public String detalleServicio(){
        return "TRABAJO DE PINTURA\n"
                + "Cliente: "+ super.getCliente() +"\n"
                + "Fecha Inicio: "+ super.getFechaInicio() +"\n"
                + "---------------------------------------\n"
                + "Pintor: "+ super.getTrabajador() +"\n"
                + "Coste Material..... "+ String.format("%.2f", costeMaterial()) +"€\n"
                + "Coste Mano Obra.... "+ String.format("%.2f", costeManoObra()) +"€\n"
                + "Coste Adicional.... "+ String.format("%.2f", costeAdicional()) +"€\n"
                + "TOTAL: ............ "+ String.format("%.2f", costeTotal()) +"€\n"
                + "---------------------------------------";
    }
}
