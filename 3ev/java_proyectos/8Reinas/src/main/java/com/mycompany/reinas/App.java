package com.mycompany.reinas;

/**
 *
 * @author fsanj
 */
public class App{
    static void dibujar(int[] tablero){
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++){
                if(tablero[i] == j){
                    System.out.print("|R");
                }else{
                    if(i + j % 2 == 0){
                        System.out.print("|_"); // pintamos el color de fondo  
                    }else{
                        System.out.print("|_");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean ataque(int[] tablero){
        boolean res = false;
        //Detectamos reinas en la misma columna
        for(int i = 0; i < 7; i ++){
            for(int j = i + 1; j < 8; j ++){
                if(tablero[i] == tablero[j]){
                    return true;
                }
            }
        }
        //Detectamos reinas en las diagonales
        for(int i = 0; i < 7; i ++){
            for(int j = i + 1; j < 8; j ++){
                if(tablero[i] + i == tablero[j] + j){
                    return true;
                }
                if(tablero[i] - i == tablero[j] - j){
                    return true;
                }
            }
        }
        return res;
    }

    static void buscarSoluciones(){
        int contador = 0;
        for(int a = 0; a < 8; a ++){
            for(int b = 0; b < 8; b ++){
                for(int c = 0; c < 8; c ++){
                    for(int d = 0; d < 8; d ++){
                        for(int e = 0; e < 8; e ++){
                            for(int f = 0; f < 8; f ++){
                                for(int g = 0; g < 8; g ++){
                                    for(int h = 0; h < 8; h ++){
                                        int[] tablero = {a, b, c, d, e, f, g, h};
                                        if( ! ataque(tablero)){
                                            dibujar(tablero);
                                            contador ++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Se han encontrado " + contador + " soluciones");
    }

    public static void main(String[] args){
        //int [] tablero = {0,1,2,3,4,5,6,7};
        //dibujar(tablero);
        //dibujar(new int[]{0,3,1,2,4,5,7,6});
        buscarSoluciones();
    }
}
