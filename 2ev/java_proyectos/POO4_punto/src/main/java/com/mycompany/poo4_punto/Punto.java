/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo4_punto;

/**
 *
 * @author Nocturno
 */
public class Punto {
    //Variables
    private double x;
    private double y;
    
    //Constructores
    public Punto(){}
    public Punto (double _x, double _y){
        x = _x;
        y = _y;
    }

    //Métodos
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public String distancia(Punto otroPunto){
        double x1 = this.x;
        double y1 = this.y;
        double x2 = otroPunto.x;
        double y2 = otroPunto.y;
        
        String distancia = "La distancia entre los dos puntos es: "+ String.format("%.2f", Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) ) );
        return distancia;
    }
    
    
    
    
     
}
