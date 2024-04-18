package com.mycompany.ejelectrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Frigorifico extends Electrodomestico{
    private double temp;
    private boolean conCongelador;
    
    public Frigorifico(String _tipo, String _marca, double _potencia){
        super(_tipo, _marca, _potencia);
        super.setTipo(this.getClass().getSimpleName());
        this.conCongelador = false;
    }
    
    public Frigorifico(String _tipo, String _marca, double _potencia, double _temp, boolean _conCongelador){
        super(_tipo, _marca, _potencia);
        super.setTipo(this.getClass().getSimpleName());
        this.temp = _temp;
        this.conCongelador = _conCongelador;
    }
    
    @Override
    public String toString(){
        String cong;
        if (conCongelador){
            cong = "Sí";
        }else{
            cong = "No";
        }
        return super.toString() +"    -Temperatura: "+ this.temp +"ºC\n"
                                +"    -Congelador incluido: "+ cong;
    }
    
    @Override
    public double getConsumo(int horas){
        if (this.conCongelador){
            horas *= 1.5;
            return super.getConsumo(horas);
        }else{
            return super.getConsumo(horas);
        }
    }
    
    
    
}
