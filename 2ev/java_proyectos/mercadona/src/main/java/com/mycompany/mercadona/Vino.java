package com.mycompany.mercadona;

import java.time.LocalDate;

/**
 *
 * @author Nocturno
 */
public class Vino  extends Producto implements esLiquido, conDescuento, esAlimento{
    private String tipo;
    private double grados;
    private double volumen;
    private String envase;
    private double descuento;
    private LocalDate caducidad;

    public Vino(String marca, String tipo, double grados, double precio){
        super(marca, precio);
        this.tipo = tipo;
        this.grados = grados;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public double getGrados(){
        return grados;
    }
    public void setGrados(double grados){
        this.grados = grados;
    }

    @Override
    public String toString(){
        return "Vino\n" + super.toString()
                + "Tipo: "+ tipo +"\n"
                + "Grados: "+ grados +"º\n"
                + "Caducidad: "+ caducidad +"\n"
                + "Calorias: "+ getCalorias() +"\n"
                + "Volumen: "+ volumen +"l\n"
                + "Envase: "+ envase +"\n"
                + "Descuento: "+ descuento +"%\n"
                + "Precio total: "+ String.format("%.2f",getPrecioDescuento()) +"€";
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
    public void setCaducidad(LocalDate fc){
        caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad(){
        return caducidad;
    }

    @Override
    public int getCalorias(){
        return (int)grados * 10;
    }
    
}
