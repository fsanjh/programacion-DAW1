package com.mycompany.ejercicioleerficheros2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fsanj
 */
public class EjercicioLeerFicheros2{

    public static void main(String[] args){
        String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\";
        try {
            // Creo el fichero que tendrá varios numeros en distintas líneas
            FileWriter fw = new FileWriter(path + "numeros.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println("1");
            pw.println("4");
            pw.println("9");
            pw.println("543");
            pw.println("42");
            pw.print("5");
            pw.close();
            fw.close();

        } catch (IOException ioex1) {
            System.out.println(ioex1.getMessage());
        }

        try {
            FileReader fr = new FileReader(path + "numeros.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fwPares = new FileWriter(path + "pares.txt");
            PrintWriter pwPares = new PrintWriter(fwPares);
            FileWriter fwImpares = new FileWriter(path + "impares.txt");
            PrintWriter pwImpares = new PrintWriter(fwImpares);

            String i;
            while ((i = br.readLine()) != null) {
                if (Integer.parseInt(i) % 2 == 0) {
                    pwPares.println(i);
                } else {
                    pwImpares.println(i);
                }
            }
            
            pwImpares.close();
            fwImpares.close();
            pwPares.close();
            fwPares.close();
            br.close();
            fr.close();
        } catch (IOException ioex2) {
            System.out.println(ioex2.getMessage());
        }
    }
}
