package com.mycompany.mercadona;

/**
 *
 * @author Nocturno
 */
public abstract class Producto{
    private String marca;
    private Double precio;

    public Producto(String marca, Double precio){
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public Double getPrecio(){
        return precio;
    }
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    
    public abstract int getCalorias();

    @Override
    public String toString(){
        return "Marca: "+ marca +"\n"
              +"Precio: "+String.format("%.2f", precio) +"€\n";
    }
    
    
    
    
    
}
