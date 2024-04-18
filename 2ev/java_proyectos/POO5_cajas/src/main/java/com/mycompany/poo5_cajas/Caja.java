/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo5_cajas;

/**
 *
 * @author Nocturno
 */
public class Caja {
    /*VARIABLES*/
    private double ancho; //eje x
    private double alto; //eje y
    private double largo; //eje z
    /*CONSTRUCTORES*/
     //Constructor para todas las dimensiones
    public Caja(double _ancho, double _alto, double _largo){
        this.ancho = _ancho;
        this.alto = _alto;
        this.largo = _largo;
    }
     //Constructor solo para dos dimensiones
    public Caja(double _ancho, double _alto){
        this.ancho = _ancho;
        this.alto = _alto;
        
        this.largo = _ancho;
    }
     //Constructor solo para una dimensión
    public Caja(double _largo){
        this.largo = _largo;
        
        this.ancho = _largo;
        this.alto = _largo;
    }
    /*MÉTODOS*/
     //Ancho
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
     //Alto
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
     //Largo
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    
     //Verifica que sea una caja
    public boolean esCubo(){
        double x = this.ancho;
        double y = this.alto;
        double z = this.largo;
        boolean caja = false;
        
        if(x == y){
            if( x == z){
                caja = true;
            }
        }
        if(caja){
            System.out.println("Efectivamente, es una caja");
        }else{
            System.out.println("Eso no es una caja manin");
        }
        return caja;
    }
     //Calcula el volumen
    public void volumen(){
        double x = this.ancho;
        double y = this.alto;
        double z = this.largo;
        
        
        if(esCubo()){
            System.out.println("El volumen de esa caja es: "+ String.format("%.2f", x*y*z) +"cm3");
        }else{
            System.out.println("No se puede calcular el volumen");
        }
        
    }
     //Muestra las dimensiones de la caja
    @Override
    public String toString() {
        return "La caja tiene las dimensiones "+ alto +" de alto, "+ ancho +" de ancho y "+ largo +" de largo.";
    }
    
    
    
    
    
    
}
