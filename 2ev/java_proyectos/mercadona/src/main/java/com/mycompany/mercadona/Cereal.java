package com.mycompany.mercadona;

import java.time.LocalDate;

/**
 *
 * @author Nocturno
 */
public class Cereal  extends Producto implements esAlimento{
    private String tipo;
    private LocalDate caducidad;

    public Cereal(String marca, double precio, String tipo){
        super(marca, precio);
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "Cereales\n" + super.toString()
                + "Tipo: "+ tipo +"\n"
                + "Caducidad: "+ caducidad +"\n"
                + "Calorias: "+ getCalorias();
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
        if(tipo == "espelta"){
            return 5;
        }else if(tipo == "maiz"){
            return 8;
        }else if(tipo == "trigo"){
            return 12;
        }else{
            return 15;
        }
    }
}
