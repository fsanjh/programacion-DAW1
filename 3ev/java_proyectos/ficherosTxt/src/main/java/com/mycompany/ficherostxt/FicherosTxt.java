
package com.mycompany.ficherostxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fsanj
 */
public class FicherosTxt {

    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaFicheroTexto.txt");
            fw.write("Ejemplo con FileWriter\n");
            fw.write("Hola amegos");
            fw.close();
        }catch(IOException ioex){
            System.out.println("Error");
        }
        
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaFicheroTexto.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ejemplo con BufferedWriter");
            bw.newLine();
            bw.write("Hola amegos");
            bw.close();
            fw.close();
        }catch(IOException ioex){
            System.out.println("Error");
        }
        
        try{
            FileWriter fw = new FileWriter("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaFicheroTexto.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Ejemplo con PrintWriter\n");
            pw.printf("Hola amegos, knekro %dº del mundo", 3);
            pw = new PrintWriter(System.out);
            pw.printf("yikes, komanche %dº del mundo", 1);
            pw.close();
            fw.close();
        }catch(IOException ioex){
            System.out.println("Error");
        }
    }
}
