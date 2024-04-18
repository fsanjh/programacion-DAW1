package com.mycompany.principalcilindro;

/**
 *
 * @author Nocturno
 */
public class Cilindro{
    private double altura;
    private double radio;

    public Cilindro(double _altura, double _radio){
        this.altura = _altura;
        this.radio = _radio;
    }
    
    public void mostrarDatos(){
        System.out.println("Altura del cilindro: "+ altura +"\nRadio del cilindro: "+ radio);
    }
    
    public double area(){
        return Math.floor((2*Math.PI * radio * (altura + radio))*100)/100;
    }
    
    public double volumen(){
        return Math.floor((Math.PI* Math.pow(radio, 2) * altura)*100)/100;
    }
    
    public double areaBase(){
        return Math.floor((Math.PI * Math.pow(radio, 2))*100)/100;
    }
    
    public double areaLateral(){
        return Math.floor((2 * Math.PI * radio * altura)*100)/100;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
