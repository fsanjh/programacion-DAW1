package com.mycompany.ejelectrodomesticos;

/**
 *
 * @author Nocturno
 */
public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora(String _tipo, String _marca, double _potencia){
        super(_tipo, _marca, _potencia);
        super.setTipo(this.getClass().getSimpleName());
        this.aguaCaliente = false;
    }
    
    public Lavadora(String _tipo, String _marca, double _precio, double _potencia, boolean _aguaCaliente){
        super(_tipo, _marca, _potencia);
        super.setTipo(this.getClass().getSimpleName());
        this.precio = _precio;
        this.aguaCaliente = _aguaCaliente;
    }
    
    @Override
    public String toString(){
        String agua;
        if (aguaCaliente){
            agua = "caliente";
        }else{
            agua = "fría";
        }
        return super.toString() +"    -Precio: "+ this.precio +"€\n"
                                +"    -Funcionando con agua: "+ agua;
    }
    
    @Override
    public double getConsumo(int horas){
        if (this.aguaCaliente){
            return horas *(super.getPotencia() + super.getPotencia() * 0.20);
        }else{
            return super.getConsumo(horas);
        }
    }
    
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public boolean isAguaCaliente(){
        return aguaCaliente;
    }
    public void setAguaCaliente(boolean aguaCaliente){
        this.aguaCaliente = aguaCaliente;
    }
    
    @Override
    public String getTipo(){
        return super.getTipo();
    }
    @Override
    public void setTipo(String tipo){
        super.setTipo(tipo);
    }
    
    @Override
    public String getMarca(){
        return super.getMarca();
    }
    @Override
    public void setMarca(String marca){
        super.setMarca(marca);
    }
    
    @Override
    public double getPotencia(){
        return super.getPotencia();
    }
    @Override
    public void setPotencia(double potencia){
        super.setPotencia(potencia);
    }

    
    

    
    
    
    
    
    
}
