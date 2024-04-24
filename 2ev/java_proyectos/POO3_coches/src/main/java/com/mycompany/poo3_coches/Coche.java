package com.mycompany.poo3_coches;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Coche {
    private String matricula;
    private String color;
    private String marca;
    private int caballos;
    private double velocidad;
    @SuppressWarnings("unused")
    private boolean fallo = false;
    
    public Coche(String matricula, String color, String marca, int caballos) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.caballos = caballos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
    
    public String getVelocidad() {
        return String.format("%.2f",velocidad);
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "El coche tiene la matrícula "+ matricula +", es de color "+ color +", marca "+ marca +" y tiene "+ caballos +" caballos.";
    }
    /*
    public boolean acelerar(double velocidad){
        this.velocidad += 10.3;
        if((int) (Math.random()*50+1) == 18){
            this.fallo = true;
        }
        return this.fallo;
    }
    
    public void frenar(double velocidad){
        this.velocidad -= 11.7;
        if (this.velocidad < 0){
            this.velocidad = 0;
        }
    }
    */
    
    
    public void conducir(double velocidadInicial){
        boolean fin = false;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String res;
        this.velocidad = velocidadInicial;
        double dist = 0;
        do{
            System.out.println("----------------------------------");
            System.out.println("Velocidad actual: "+ String.format("%.2f",this.velocidad) +"Km/h");
            System.out.print("Acelerar (W) o Frenar (S): ");
            res = input.next();   
            res = res.toLowerCase();
            double num = Math.random()*35+10;
            if(res.equals("w")){
                this.velocidad += num;
            }else if(res.equals("s")){
                this.velocidad -= num;
            }
            if(this.velocidad > 99){
                System.out.println("El motor se ha roto, no puedes avanzar más");
                fin = true;
            }else if(this.velocidad < 1){
                System.out.println("Has frenado el coche por completo");
                fin = true;
            }
            dist = dist + this.velocidad * 0.01;
        }while(!fin);
        if(dist < 0){
            dist = 0;
        }
        System.out.println("Distancia recorrida= "+ String.format("%.2f",dist) +"Km");
    }
    
    






    
}
