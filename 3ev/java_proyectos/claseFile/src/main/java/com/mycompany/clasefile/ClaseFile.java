
package com.mycompany.clasefile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author fsanj
 */
public class ClaseFile {

    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\claseFile"); //Directorio
        try{
            fichero.mkdir(); //Creo directorio
            fichero = new File("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\claseFile\\claseFile.txt"); //Fichero
            fichero.createNewFile(); //Creo el fichero
        }catch(IOException ioex){
            System.out.println("Error");
        }finally{
            if(fichero.exists()){
                System.out.println("Fichero encontrado");
                System.out.println("    - Nombre: "+ fichero.getName());
                System.out.println("    - Ruta relativa: "+ fichero.getPath());
                System.out.println("    - Ruta absoluta: "+ fichero.getAbsolutePath());
                System.out.println("    - Permisos para escribir: "+ fichero.canWrite());
                System.out.println("    - Permisos para leer: "+ fichero.canRead());
                System.out.println("    - Tamaño: "+ fichero.length());
            }
            fichero = null;
        }
        
        
        
        
        
        
        
        
    }
}
