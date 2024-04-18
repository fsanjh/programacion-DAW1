package com.mycompany.pruebapilas;

import java.util.Stack;

/**
 *
 * @author fsanj
 */
public class PruebaPilas{

    public static boolean verificarParentesis(String cadena){
        Stack<String> pilaParentesis = new Stack<>();
        for(int i = 0; i < cadena.length(); i ++){
            if(cadena.charAt(i) == '('){
                pilaParentesis.push("(");
            }else if(cadena.charAt(i) == ')'){
                if(!pilaParentesis.isEmpty()){
                    pilaParentesis.pop();
                }else{
                    return false;
                }
            }
        }
        return (pilaParentesis.isEmpty());
    }

    public static void main(String[] args){
        String cadenaNoValida = "(prueba1 ()))((())()(((((()";
        String cadenaValida = "(prueba2()()())";

        System.out.println("Verificación de equilibrio de paréntesis para cadenaNoValida => \"" + cadenaNoValida + "\"");
        System.out.println("Resultado: " + (verificarParentesis(cadenaNoValida) ? "Equilibrado" : "Desequilibrado"));
        System.out.println("-----------------------------------------");
        System.out.println("Verificación de equilibrio de paréntesis para cadenaValida => \"" + cadenaValida + "\"");
        System.out.println("Resultado: " + (verificarParentesis(cadenaValida) ? "Equilibrado" : "Desequilibrado"));
    }
}
