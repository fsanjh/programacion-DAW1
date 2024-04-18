
package com.mycompany.excepcionesthrow;

/**
 *
 * @author fsanj
 */
public class ExcepcionesThrow {
    public static void lanzaExcepcion() throws Exception{
        try{
            System.out.println("Lanzamos excepción");
            throw new Exception("Excepcion Buratino");
            
        }catch(Exception ex){
            System.out.println("Atrapo la excepción en el metodo");
            ex.printStackTrace();
        }finally{
            System.out.println("Finally del método");
        }
        throw new Exception("Excepcion KEK");
    }
    
    

    public static void main(String[] args) {
        try{
            lanzaExcepcion();
        }catch(Exception ex){
            System.out.println("Excepcion capturada en el main");
            ex.printStackTrace();
        
        }
    }
}
