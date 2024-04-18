
package com.mycompany.digitosrecursividad;

/**
 *
 * @author fsanj
 */
public class DigitosRecursividad {
    
    public static int digitos(int n){
        return (Math.floor(n) != 0)? 1 + digitos(n/10) : 0;
    }
    
    public static void main(String[] args) {
        int num = -4567;
        System.out.println(digitos(num));
    }
}
