
package com.mycompany.ejercicioescritura;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjercicioEscritura {
    static PrintStream ps = new PrintStream(System.out);
    
    public static void cambiarMayusMinus(String cadena){
        for(int i = 0; i< cadena.length(); i++){
            char letra = cadena.charAt(i);
            if(Character.isLowerCase(letra)){
                ps.print(Character.toUpperCase(letra));
            }else if(Character.isUpperCase(letra)){
                ps.print(Character.toLowerCase(letra));
            }else{
                ps.print(letra);
            }
        }
    }
    
    public static void escribirFichero(String nombre, String cadena){
        nombre = nombre.trim();
        try{
            FileOutputStream ficheroUser = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\"+ nombre +".bin");
            ps = new PrintStream(ficheroUser);
            ps.print(cadena);
            ps.close();
            ficheroUser.close();
        
        }catch(IOException io1){
            ps = new PrintStream(System.out);
            ps.println("Error con el fichero");
        }
        
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String nombre;
        String cadena;
        
        ps.print("Cómo quiere que se llame el fichero (ejercicioEscritura): ");
        nombre = input.nextLine();
        ps.print("Escribe la cadena que quiera introducir: ");
        cadena = input.nextLine();
        
        cambiarMayusMinus(cadena);
        escribirFichero(nombre, cadena);
        
        
    }
}
