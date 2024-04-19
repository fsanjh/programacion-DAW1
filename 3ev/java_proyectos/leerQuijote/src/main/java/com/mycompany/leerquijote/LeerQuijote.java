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
        int contDulcinea = 0;
        String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\";

        try{

            FileReader fr = new FileReader(path + "quijote.txt");
            BufferedReader br = new BufferedReader(fr);
            int letra;
            String palabra = "";
            while((letra = br.read()) != -1){
                if(!(Character.isWhitespace(letra)) || Character.isAlphabetic(letra) ){
                    palabra = palabra + (char)letra;
                }else{
                    if(palabra.equals("Dulcinea")){
                        System.out.println(palabra);
                        contDulcinea++;
                    }
                    palabra = "";
                }
            }
            System.out.println(contDulcinea);

        }catch(IOException ioex){
            System.out.println(ioex.getMessage());
        }

    }
}
