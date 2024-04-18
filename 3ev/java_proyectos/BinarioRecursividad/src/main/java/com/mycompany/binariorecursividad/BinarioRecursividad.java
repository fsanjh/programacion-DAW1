
package com.mycompany.binariorecursividad;

/**
 *
 * @author fsanj
 */
public class BinarioRecursividad {
    
    public static void binario(int num){
         if (num < 2) {
            System.out.print(num);
        } else {
            System.out.print(num % 2);
            binario(num / 2);
        }
    }

    public static void main(String[] args) {
        int num = 27;
        binario(num);
        
    }
}
