
package com.mycompany.lecturaficheros1;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author fsanj
 */
public class LecturaFicheros1 {

    public static void main(String[] args) {
        String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\biblioteca.bin";
        System.out.println("Lectura del fichero "+ path);
        try{
            FileInputStream fichero = new FileInputStream(path);
            int i;
        
            while((i = fichero.read()) != -1){
                System.out.print((char)i);
            }
            fichero.close();
        }catch(IOException ioex){
            System.out.println("Error con el fichero");
        }
        
        try{
            FileInputStream fichero = new FileInputStream(path);
            BufferedInputStream bufferIn = new BufferedInputStream(fichero);
            int i;
        
            while((i = bufferIn.read()) != -1){
                System.out.print((char)i);
            }
            bufferIn.close();
            fichero.close();
        }catch(IOException ioex){
            System.out.println("Error con el fichero");
        }
        
        try{ //Da error
            FileInputStream fichero = new FileInputStream(path);
            DataInputStream dataIn = new DataInputStream(fichero);
            
            System.out.println(dataIn.readUTF());
            dataIn.close();
            fichero.close();
        }catch(IOException ioex){
            System.out.println("Error con el fichero");
        }
        
        try{
            byte[] array = {66, 89, 84, 69, 32, 65, 82, 82, 65, 89};
            ByteArrayInputStream byteArray = new ByteArrayInputStream(array);
            int i;
            
            while( (i = byteArray.read()) != -1){
                System.out.print((char)i);
            }
        }catch(Exception ioex){
            System.out.println("Error con el fichero");
        }
        
        
        
    }
}
