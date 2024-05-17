package Modelos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author fsanj
 */
public class Fichero{
    private final String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\";
    private final String txtRegistro = "registro";
    
    public boolean escribir(Cuenta cuenta){
        boolean res = true;
        boolean existe = false;
        try{
            FileReader fr = new FileReader(path + txtRegistro + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String cuentaStr = cuenta.getNombre().trim() +" | "+ cuenta.getEmail().trim() +" | "+ cuenta.getPass().trim();
            String i;
            while((i = br.readLine()) != null){
                if(cuentaStr.equals(i)){
                    existe = true;
                    break;
                }
            }
            br.close();
            fr.close();
            if(existe){
                res = false;
            }else{
                FileWriter fw = new FileWriter(path + txtRegistro + ".txt", true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(cuentaStr);
                pw.close();
                fw.close();
            }
        }catch(IOException io1){
            System.out.println(io1.getMessage());
        }
        return res;
    }
    
    
}
