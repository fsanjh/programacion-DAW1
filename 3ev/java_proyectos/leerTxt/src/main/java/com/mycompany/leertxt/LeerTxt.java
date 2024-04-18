
package com.mycompany.leertxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author fsanj
 */
public class LeerTxt {

    public static void main(String[] args) {
        /*try{
            FileReader fr = new FileReader("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaFicheroTexto.txt");
            int i;
            
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
            fr.close();
        }catch(IOException ioex){
            System.out.println("ERROR");
        }*/
        
        try{
            FileReader fr = new FileReader("C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaFicheroTexto.txt");
            BufferedReader br = new BufferedReader(fr);
            int i;
            
            System.out.println(br.readLine());
            while((i = br.read()) != -1){
                System.out.print((char) i);
            }
            br.close();
            fr.close();
        }catch(IOException ioex){
            System.out.println("ERROR");
        }
        
        
    }
}
