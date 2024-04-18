/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo11_producto;

/**
 *
 * @author Nocturno
 */
public class Producto {
    private double precio;
    public static double rebaja = 0;
    
    public Producto(double _precio){
        this.precio = _precio;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void infoRebajaActual(){
        System.out.println();
        System.out.println("Rebaja actual: "+Producto.rebaja +"%.");
    }
    public double getPrecioFinal(){
            return this.precio - (this.precio * (Producto.rebaja/100));
    }
    
    
    
    
    
    
}
