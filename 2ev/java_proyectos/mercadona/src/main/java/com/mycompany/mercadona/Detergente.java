package com.mycompany.mercadona;

/**
 *
 * @author Nocturno
 */
public class Detergente extends Producto implements esLiquido, conDescuento{
    
    private double volumen;
    private String envase;
    private double descuento;
    
    public Detergente(String marca, double precio){
        super(marca, precio);
    }

    @Override
    public String toString(){
        return "Detergente\n"+ super.toString()
                + "Volumen: "+ volumen +"l\n"
                + "Envase: "+ envase +"\n"
                + "Descuento: "+ descuento +"%\n"
                + "Precio final: "+ getPrecioDescuento() +"€";
    }
    
    @Override
    public void setVolumen(double v){
        volumen = v;
    }
    @Override
    public double getVolumen(){
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env){
        envase = env;
    }
    @Override
    public String getTipoEnvase(){
        return envase;
    }

    @Override
    public void setDescuento(double des){
        descuento = des;
    }
    @Override
    public double getDescuento(){
        return descuento;
    }
    
    @Override
    public double getPrecioDescuento(){
        return super.getPrecio() - (super.getPrecio() * (descuento/100));
    }

    @Override
    public int getCalorias(){
        return 0;
    }
    
    
    
    
    
    
    
}
