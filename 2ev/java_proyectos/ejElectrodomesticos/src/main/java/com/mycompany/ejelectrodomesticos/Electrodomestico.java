package com.mycompany.ejelectrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Electrodomestico{
        private String tipo;
        private String marca;
        private double potencia;

    public Electrodomestico(String _tipo, String _marca, double _potencia){
        this.tipo = _tipo;
        this.marca = _marca;
        this.potencia = _potencia;
    }
    
    @Override
    public String toString(){
        return "-------------------------------\n" 
             + "ELECTRODOMÉSTICO:\n"
             + "    -Tipo: " + this.tipo +"\n"
             + "    -Marca: "+ this.marca +"\n"
             + "    -Potencia: "+ this.potencia +"kw/h\n";
    }
    
    public double getConsumo(int horas){
        return this.potencia * horas;
    }
    
    public double getCosteConsumo(int horas, double costeHora){
        return horas * costeHora ;
    }
    
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPotencia(){
        return potencia;
    }
    public void setPotencia(double potencia){
        this.potencia = potencia;
    }
    
    
    
        
        
        
        
        
}
