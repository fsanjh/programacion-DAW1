
package com.mycompany.escrituraxml;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EscrituraXML {
    static PrintStream ps = new PrintStream(System.out);
    static Scanner input = new Scanner(System.in);
    
    public static void biblioteca(){
        String libro;
        try{
            FileOutputStream ficheroUser = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\biblioteca.bin");
            PrintStream psFichero = new PrintStream(ficheroUser);
            psFichero.println("<libros>");
            do{
                ps.print("Escribe el nombre de un libro, para parar escriba -1: ");
                libro = input.nextLine();
                if(!libro.equals("-1")){
                    psFichero.println("     <libro>"+ libro +"</libro>");
                }
            }while(!libro.equals("-1"));
            psFichero.print("</libros>");
            psFichero.close();
            ficheroUser.close();
        }catch(IOException io1){
            ps.println("Error con el fichero");
        }
    }

    public static void main(String[] args) {
        biblioteca();
    }
}
