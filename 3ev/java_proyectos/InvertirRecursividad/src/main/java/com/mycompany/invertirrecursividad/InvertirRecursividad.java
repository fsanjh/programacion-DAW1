
package com.mycompany.invertirrecursividad;

/**
 *
 * @author fsanj
 */
public class InvertirRecursividad {
    public static void invertir(int num){
        if(num >= 1){
            System.out.print(num%10);
            invertir(num/10);
        }
    }

    public static void main(String[] args) {
        int num = 1234;
        invertir(num);
    }
}
