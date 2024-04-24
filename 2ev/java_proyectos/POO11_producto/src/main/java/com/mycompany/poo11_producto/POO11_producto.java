/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo11_producto;

/**
 *
 * @author Nocturno
 */
public class POO11_producto {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        // creando 2 productos
        Producto p1 = new Producto(10);
        Producto p2 = new Producto(30);
        p1.infoRebajaActual();
        System.out.println("Precio p1: "+ p1.getPrecioFinal());
        System.out.println("Precio p2: "+ p2.getPrecioFinal());
        // primeras rebajas y se decide bajar todos los precios un 10%
        p2.rebaja = 25;
        p2.infoRebajaActual();
        System.out.println("Precio p1 primeras rebajas: "+ p1.getPrecioFinal());
        System.out.println("Precio p2 primeras rebajas: "+ p2.getPrecioFinal());
        // segundas rebajas y se decide bajar todos los precios a la mitad (50%)
        Producto.rebaja = 50;
        p2.infoRebajaActual();
        System.out.println("Precio p1 segundas rebajas: "+ p1.getPrecioFinal());
        System.out.println("Precio p2 segundas rebajas: "+ p2.getPrecioFinal());
    }
}
