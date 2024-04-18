package com.mycompany.ejercicioleerficheros1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fsanj
 */
public class EjercicioLeerFicheros1{

    public static void main(String[] args){
        String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\ejercicioLeerFicheros1.txt";
        try{
            FileWriter fw = new FileWriter(path);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Llegaron los autistas bebé EA EA EA");
            pw.close();
            fw.close();
            
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            int i;
            while((i = br.read()) != -1){
                if(!Character.isWhitespace(i)){
                    System.out.print((char) i);
                }
            }
            br.close();
            fr.close();
        }catch(IOException ioex){
            System.out.println("ERROR");
        }

    }
}
