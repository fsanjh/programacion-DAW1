/**
 *
 * @author Nocturno
 */
package com.mycompany.poo6_cuenta;


public class Cuenta {    
    private String titular; //Nombre del titular de la cuenta
    private double cantidad; //Cantidad de la cuenta
    
    public Cuenta(String _titular, double _cantidad){ //Si se ingresa el nombre y la cantidad
        this.titular = _titular;
        this.cantidad = _cantidad;
    }
    
    public Cuenta(String _titular){ //Si solo se ingresa el nombre
        this.titular = _titular;
        this.cantidad = 0; //Al no introducirse nada se le asigna 0 automáticamente
    }
    
    //GETTER & SETTER
     //titular
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
     //cantidad
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    //toString
    @Override
    public String toString() {
        return "La cuenta del titular "+ titular +" tiene una cantidad de: "+ cantidad +"€";
    }
    
    //METODO ingresar
    public void ingresar (double cantidad){
        if(cantidad <= 0){ //Si la cantidad es menor o igual a 0 muestra error
            System.out.println("ERROR: no se puede ingresar una cantidad menor o igual a 0");
        }else{
            this.cantidad += cantidad; //Cambio la cantidad de la cuenta
            System.out.println("Acaba de ingresar "+ cantidad +"€ a la cuenta de "+ this.titular);
            System.out.println(toString()); //Muestro los datos actualizados
        }
        System.out.println();
    }
    //METODO retirar
    public void retirar (double cantidad){
        cantidad = Math.abs(cantidad); //Para quitar los signos introducidos
        if((this.cantidad - cantidad) < 0){ //Si da menos que 0 se quita todo de la cuenta
            cantidad = this.cantidad; //Guardo la cantidad que habia para mostrarla
            this.cantidad = 0; //Asigno a 0 la cantidad de la cuenta
            System.out.println("Acaba de retirar "+ cantidad +"€ a la cuenta de "+ this.titular);
        }else{
            this.cantidad -= cantidad; //Actualizo la cantidad
            System.out.println("Acaba de retirar "+ cantidad +"€ a la cuenta de "+ this.titular);
        }
        System.out.println(toString());
        System.out.println();
    }
    
    
}
