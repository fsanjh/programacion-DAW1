package com.mycompany.leerquijote;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fsanj
 */
public class LeerQuijote{

    public static void main(String[] args){
        //Contadores de palabras
        int contDulcinea = 0;
        int contQuijote = 0;
        int contSancho = 0;
        int contRocinante = 0;
        String palabra = ""; //Cada palabra completa
        //Ubicación del fichero
        String path = "D:\\Escritorio\\f\\daw\\prog_ficheros\\";

        try{
            //Declaro el FileReader añadiendo en el constructor el path y el nobre del fichero
            FileReader fr = new FileReader(path + "quijote.txt");
            BufferedReader br = new BufferedReader(fr); //Declaro el BufferedReader
            int caracter; //caracter que se guardara
            
            while((caracter = br.read()) != -1){ //Bucle que leera el fichero
                //Si el caracter actual es una letra
                if(!Character.isWhitespace(caracter) && Character.isAlphabetic(caracter)){ 
                    palabra = palabra + (char)caracter; //Concateno el caracter con la palabra
                }else{ //Cuando el caracter es un espacio, coma, punto...
                    palabra = palabra.toLowerCase(); //para que todas coincidan
                    //Si la palabra empieza por "dulcinea" y termina con cualquier cosa (dulcineaS, dulcineaE...)
                    if(palabra.startsWith("dulcinea")){ 
                        contDulcinea++; //Sumo el contador
                    }else if(palabra.startsWith("quijote")){
                        contQuijote++;
                    }else if(palabra.startsWith("sancho")){
                        contSancho++;
                    }else if(palabra.startsWith("rocinante")){
                        contRocinante++;
                    }
                    palabra = ""; //limpio la palabra para volver a buscar
                }
            }
            br.close();
            fr.close();
            //Muestro pot pantalla la cantidad
            System.out.println("Dulcinea: "+ contDulcinea); 
            System.out.println("Quijote: "+ contQuijote);
            System.out.println("Sancho: "+ contSancho);
            System.out.println("Rocinante: "+ contRocinante);

        }catch(IOException ioex){
            System.out.println(ioex.getMessage());
        }

    }
}
