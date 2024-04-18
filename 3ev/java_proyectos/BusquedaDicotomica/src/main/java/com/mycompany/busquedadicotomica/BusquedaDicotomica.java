package com.mycompany.busquedadicotomica;


/**
 *
 * @author fsanj
 */
public class BusquedaDicotomica{
    
    public static int buscar(int num, int[] array, int a, int b){
        if(b < 1){
            return -1;
        }
        int pos = a + (b - a)/2;
        if(array[pos] == num){
            return pos;
        }else if(array[pos] > num){
            return buscar(num, array, a, pos-1);
        }else{
            return buscar(num, array, pos+1, b);
        }
    }

    public static void main(String[] args){
        int n = 7;
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int res = buscar(n, array, 0, array.length - 1);
        
        if(res == -1){
            System.out.println("No encontrado");
        }else{
            System.out.println("Encontrado en la posicion "+ res);
        }
        
        
        
        
    }
}
