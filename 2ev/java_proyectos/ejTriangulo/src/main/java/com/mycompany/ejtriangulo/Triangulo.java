package com.mycompany.ejtriangulo;

/**
 *
 * @author fsanj
 */
public class Triangulo{

    private int altura;
    private int rotacion;
    public static final int CERO = 1;
    public static final int NOVENTA = 2;
    public static final int CIENTO_OCHENTA = 3;
    public static final int DOSCIENTOS_SETENTA = 4;

    public Triangulo(int altura){
        this.altura = altura;
        this.rotacion = CERO;
    }

    public void mostrarDatos(){
        System.out.println("Base y altura del triangulo: " + altura);
    }

    public void visualizar(){
        if(rotacion == CERO){
            for(int i = 1; i <= (int) altura; i ++){
                for(int j = 0; j < i; j ++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(rotacion == NOVENTA){
            for(int i = (int) altura - 1; i >= 0; i --){
                for(int j = i; j >= 0; j --){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(rotacion == CIENTO_OCHENTA){
            for(int i = (int) altura - 1; i >= 0; i --){
                for(int k = 1; k < (int) altura - i; k ++){
                    System.out.print(" ");
                }
                for(int j = i; j >= 0; j --){
                    System.out.print("*");
                }
                System.out.println();
            }
        }else if(rotacion == DOSCIENTOS_SETENTA){
            for(int i = 1; i <= (int) altura; i ++){
                for(int k = (int) altura - i; k > 0; k --){
                    System.out.print(" ");
                }
                for(int j = 0; j < i; j ++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public void rotar(){
        if(rotacion != DOSCIENTOS_SETENTA){
            rotacion ++;
        }else{
            rotacion = CERO;
        }
    }

    public void establecerRotacion(int estado){
        @SuppressWarnings("unused")
        int vueltas = 0;
        Math.abs(estado);
        while(estado > 4){
            estado = (int)Math.floor(estado/4);
            vueltas++;
        }
        this.rotacion = estado;
    }
    
    

}
