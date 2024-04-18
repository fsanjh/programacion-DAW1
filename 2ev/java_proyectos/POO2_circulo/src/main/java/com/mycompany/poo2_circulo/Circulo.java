/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo2_circulo;

/**
 *
 * @author Nocturno
 */
public class Circulo {
    private int radio;
    private String color;
    
    public Circulo(int r){
        this.radio = r;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
    public int volumen(){
        int v;
        v = (int) ((4/3) * Math.PI * Math.pow(radio, 3));
        
        return v;
    
    }
    
    public int diametro(){
        int d;
        d = radio * radio;
        
        return d;
    
    }
    
    public int area(){
        int a;
        a = (int)(Math.PI * Math.pow(radio, 2));
        
        return a;
    }
    
    public int factRadio(){
        for(int i = radio - 1; i > 1; i--){
            radio = radio * i;
        }
        return radio;
        
    
    }
    
    
    @Override
    public String toString() {
        return "El círculo tiene un radio de "+ radio +" y un color "+ color;
    }
    
    
    
    
    
    
    
}
