/**
 *
 * @author fsanj
 */

package com.mycompany.poo7_persona;

import java.util.Random;

public class Persona {
    Random random = new Random(); //Para el DNI
    private String nombre = ""; //Nombre
    private int edad = 0; //Edad
    private String DNI; //DNI
    private final char SEXO_DEF = 'H'; //Constante de sexo
    private char sexo = SEXO_DEF; //Sexo = constante
    private double peso = 0; //Peso
    private double altura = 0; //Altura
    /*CONSTRUCTORES*/
    //Si no se introducen datos
    public Persona() {
        generaDNI();
    }
    //Si solo se introducen nombre, edad y sexo
    public Persona(String _nombre, int _edad, char _sexo) {
        this.nombre = _nombre;
        this.edad = _edad;
        generaDNI();
        this.sexo = _sexo;
        comprobarSexo(_sexo);
    }
    //Si se introducen todos los datos
    public Persona(String _nombre, int _edad, String _DNI, char _sexo, double _peso, double _altura) {
        this.nombre = _nombre;
        this.edad = _edad;
        this.DNI = _DNI;
        this.sexo = _sexo;
        comprobarSexo(_sexo);
        this.peso = _peso;
        this.altura = _altura;
    }
    /*GETTER & SETTER*/
    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //SEXO
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    //PESO
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //ALTURA
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    /*MÉTODOS*/
    //Calcular IMC
    public int calcularIMC(){
        final int inf = -1; //Peso inferior a lo recomendado
        final int ideal = 0; //Peso ideal
        final int sup = 1; //Peso superior a lo recomendado
        double imc; //Valor del IMC
        
        imc = (this.peso/(Math.pow(this.altura, 2))); //Calculo el IMC
        if(imc < 20){ //Asigno a la respuesta final el valor que toque
            return inf;
        }else if(imc > 25){
            return sup;
        }else{
            return ideal;
        }
    }
    //Comprobar mayoria de edad
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(this.edad > 17){ //Si es mayor de edad
            mayor = true;
        }
        return mayor;
    }
    //Comprobar sexo
    public void comprobarSexo(char _sexo){
        if(_sexo == 'H' || _sexo == 'M'){ //Si se introduce H o M, es válido y lo asigna
            this.sexo = _sexo;
        }else{
            this.sexo = this.SEXO_DEF; //En caso de escribir algo incorrecto se iguala a la constante de sexo
        }
    }
    //Generar un DNI
    private void generaDNI(){
        String _DNI = ""; //Cadena donde se guardara el DNI completo
        int numeros; //Numeros del DNI
        String letras="TRWAGMYFPDXBNJZSQVHLCKE"; //Cadena de la cual se escogera la letra del DNI
        
        for (int i = 0; i < 8; i++){ //Genera 8 numeros del 0 al 9 que conformaran el DNI
            _DNI = _DNI + (random.nextInt(9 - 0 + 1));
        }
        numeros = Integer.parseInt(_DNI); //Paso la cadena a INT, al ser todo numeros no hay problemas
        int resto = numeros%23; //Saco en que posicion se encuentra la letra de esta combinación de numeros del DNI
        _DNI = _DNI + letras.charAt(resto); //Concateno los numeros generados con la letra
        this.DNI = _DNI;
    }
    
    /*ToString*/
    @Override
    public String toString() {
        return "Nombre: "+ nombre +" || Edad: "+ edad +" || DNI: "+ DNI +" || Sexo: "+ sexo +" || peso: "+ peso +" || Altura: "+ altura;
    }
    
    
    
    
    
}
