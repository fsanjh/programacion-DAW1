package com.mycompany.ejahorcado;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */


//TODOS LOS MÉTODOS EXCEPTO JUEGO ESTABAN EN PRIVATE
public class Ahorcado{
    Scanner input = new Scanner(System.in);
    private final int VIDAS = 6;
    private final String[] PALABRAS = {
        "informatica", "programacion", "encapsulacion", "codigo",
        "programa", "software", "moliner", "abstraccion", 
        "polimorfismo", "herencia", "sobrecarga", "interfaces"
    };

    //Menú del programa

    /**
     *
     * @return
     */
    public String menu(){
        System.out.println("¿Quiere jugar al Ahorcado?");
        System.out.println("(1): Jugar");
        System.out.println("(2): Salir");
        System.out.print("Respuesta: ");
        return input.nextLine(); //Devuelve el input donde se escribe el string
    }

    //Devuelve una palabra aleatoria del array
    public String obtenerPalabraSecreta(){
        return this.PALABRAS[(int) (Math.random() * this.PALABRAS.length)];
    }
    
    //Genera el array con los espacios dependiendo de la palara aleatoria
    public String[] generarEspacios(String palabraSecreta){
        String[] espacios = new String[palabraSecreta.length()];
        for(int i = 0; i < palabraSecreta.length(); i ++){
            espacios[i] = "_";
        }
        return espacios;
    }

    //Verifica que aun queden espacios vacios
    public boolean verificarEspacios(String[] espacios){
        for(String espacio : espacios){
            if(espacio.equals("_")){
                return true;
            }
        }
        return false;
    }

    //Empezar el juego

    /**
     * Parte principal
     */
    public void juego(){
        int vidasRestantes = this.VIDAS;
        String respuesta;
        boolean ganar = false;
        //Se genera y se guarda la palabra aleatoria
        String palabraSecreta = obtenerPalabraSecreta();
        //Se genera el array con los espacios en blanco
        String[] espacios = generarEspacios(palabraSecreta); 
        
        do{
            System.out.println("Trate de adivinar la palabra. Tiene " + vidasRestantes + " vidas.");
            System.out.println("Ingrese una letra o la palabra completa.");
            System.out.println("Ingrese el numero cero (0) en cualquier momento para salir");
            //Imprime el array de espacios
            for(int i = 0; i < espacios.length; i ++){ 
                System.out.print(espacios[i] + " ");
            }
            System.out.println();
            System.out.print("Respuesta: ");
            respuesta = input.nextLine().toLowerCase();
            //Si se introduce un 0 se finaliza el bucle del juego
            if(respuesta.equals("0")){ 
                break;
            //Si la respuesta es superior a un caracter
            }else if(respuesta.length() > 1){ 
                //Si se acierta la palabra completa gana el juego
                if(respuesta.equals(palabraSecreta)){
                    ganar = true;
                //Si falla, pierde vida y se muestra en pantalla
                }else{ 
                    vidasRestantes --;
                    System.out.println("'" + respuesta + "' no es la palabra secreta. Siga intentándolo");
                }
            //Si la respuesta es una letra
            }else{ 
                boolean letraEncontrada = false;
                int contLetras = 0;
                //Busca si la letra se encuentra dentro de la palabra
                for(int i = 0; i < palabraSecreta.length(); i ++){
                    //En caso de aparecer, se reemplaza en su posicion
                    if(respuesta.charAt(0) == palabraSecreta.charAt(i)){
                        espacios[i] = Character.toString(palabraSecreta.charAt(i));
                        letraEncontrada = true;
                        contLetras ++;
                    }
                }
                //Si se acertó
                if(letraEncontrada){ 
                    System.out.println("¡Letra encontrada " + contLetras + " veces!");
                //En caso de fallar
                }else{ 
                    vidasRestantes --;
                    System.out.println("Sigue intentándolo. '" + respuesta + "' no esta dentro de la palabra secreta");
                }
                //Si no quedan espacios vacios, el jugador gana
                if(!verificarEspacios(espacios)){ 
                    ganar = true;
                }
            }
            System.out.println();
        }while(vidasRestantes > 0 && !ganar);

        if(ganar){
            resultados("Victoria", palabraSecreta);
        }else{
            resultados("Derrota", palabraSecreta);
        }
    }
    //Muestra resultados de la partida
    public void resultados(String resultado, String palabra){
        System.out.println("¡" + resultado + "! La palabra era: " + palabra);
    }

    
}
