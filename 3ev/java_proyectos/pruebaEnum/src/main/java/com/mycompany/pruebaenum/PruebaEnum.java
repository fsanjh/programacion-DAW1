package com.mycompany.pruebaenum;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */

enum Mes{
    ENERO (1), FEBRERO(2), MARZO (3), ABRIL (4), MAYO (5), JUNIO (6), JULIO (7), AGOSTO (8), SEPTIEMBRE (9), OCTUBRE (10), NOVIEMBRE (11), DICIEMBRE (12);
    private final int numero;
    
    Mes(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
}

enum DiaSemana{
    LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5), SABADO(6), DOMINGO(7);
    private final int numero;
    
    DiaSemana(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return numero;
    }
}


enum Piedras {
    CALIZA(1200), MARMOL(1423.55f), PIZARRA(1325), CUARZITA(1466.22f);
    private final float pesoPiedra;
    
    Piedras(float pesoPiedra) {
        this.pesoPiedra = pesoPiedra;
    }
    public double getPesoPiedra() {
        return pesoPiedra;
    }
}


public class PruebaEnum{
    public static void main(String[] args){
        Mes mes1 = Mes.AGOSTO;
        System.out.println(mes1 +" "+ mes1.getNumero());
        
        System.out.println("-------------------------------");
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int res;

        System.out.print("Ingrese un número de día de la semana [1-7]: ");
        res = input.nextInt();
        System.out.print("El día correspondiente al número ingresado es ");
        switch (res) {
            case 1 -> 
                System.out.println(DiaSemana.LUNES);
            case 2 -> 
                System.out.println(DiaSemana.MARTES);
            case 3 -> 
                System.out.println(DiaSemana.MIERCOLES);
            case 4 -> 
                System.out.println(DiaSemana.JUEVES);
            case 5 -> 
                System.out.println(DiaSemana.VIERNES);
            case 6 -> 
                System.out.println(DiaSemana.SABADO);
            case 7 -> 
                System.out.println(DiaSemana.DOMINGO);
            default -> System.out.println("Número de día inválido.");
        }
        
        System.out.println("Valores del enum DiaSemana:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
        
        System.out.println("-------------------------------");
        
        System.out.println("A pedras:");
        for (Piedras piedra : Piedras.values()) {
            System.out.println(piedra +": "+ piedra.getPesoPiedra());
        }
                
            
        
        
    }
}
