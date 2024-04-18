
package com.mycompany.escrituraficheros1;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author fsanj
 */
public class EscrituraFicheros1 {

    public static void main(String[] args) {
        byte LF = 10; //Salto de linea
        byte CR = 13; //Retorno de carro
        try{
            FileOutputStream archivo1 = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\escrituraFicheros.bin");
            archivo1.write((byte)'f');
            archivo1.write((byte)'i');
            archivo1.write((byte)'l');
            archivo1.write((byte)'e');
            archivo1.write(LF);
            archivo1.write(CR);
            archivo1.write((byte)'o');
            archivo1.write((byte)'s');
        }catch(IOException io1){
            System.err.println("No se encontró el fichero");
        }
        
        try{
            FileOutputStream archivo2 = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\escrituraFicheros.bin");
            BufferedOutputStream buffer = new BufferedOutputStream(archivo2);
            buffer.write((byte)'b');
            buffer.write((byte)'u');
            buffer.write((byte)'f');
            buffer.write((byte)'f');
            buffer.write((byte)'e');
            buffer.write((byte)'r');
            buffer.write(LF);
            buffer.write(CR);
            buffer.write((byte)'o');
            buffer.write((byte)'s');
            buffer.close();
            archivo2.close();
        }catch(IOException io1){
            System.err.println("No se encontró el fichero");
        }
        
        try{
            FileOutputStream archivo3 = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\escrituraFicheros.bin");
            DataOutputStream data = new DataOutputStream(archivo3);
            String texto = "Data Output";
            data.writeUTF(texto);
            int num = 7;
            data.write(num);
        }catch(IOException io1){
            System.err.println("No se encontró el fichero");
        }
        
        try{
            FileOutputStream archivo4 = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\escrituraFicheros.bin");
            ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
            byte[] array = {66, 89, 84, 69, 32, 65, 82, 82, 65, 89};
            byteArray.write(array);
            byteArray.writeTo(archivo4);
            byteArray.flush();
            byteArray.close();
            archivo4.close();
        }catch(IOException io1){
            System.err.println("No se encontró el fichero");
        }
        
        try{
            FileOutputStream archivo5 = new FileOutputStream("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\escrituraFicheros.bin");
            PrintStream ps = new PrintStream(archivo5);
            ps.println("Print Stream");
            ps.printf("Escribiendo en el fichero por %dª vez", 2);
            ps.close();
            archivo5.close();
            
            ps = new PrintStream(System.out);
            ps.println("Escribiendo por consola");
            ps.printf("Escribiendo en CONSOLA por %dª vez", 2);
            ps.close();
            archivo5.close();
            
        }catch(IOException io1){
            System.err.println("No se encontró el fichero");
        }
        
        
        
        
        
        
        
        
        
    }
}
