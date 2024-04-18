
package com.mycompany.pasoreferencia_valor;

/**
 *
 * @author Nocturno
 */
public class PasoReferencia_Valor {
    //PASO POR VALOR
    public static void metodo (int a, boolean navidad, String cadena, int [] nums){
        a = 3;
        navidad = false;
        cadena = "pistacho";
        nums[0] = 4; nums[1] = 5; nums[2] = 6; nums[3] = 7;
        System.out.println("Dentro del método, valor es: "+ a);
        System.out.println("Dentro del método, navidades es:"+ navidad);
        System.out.println("Dentro del método, palabra es: "+ cadena);
        System.out.println("Dentro del método, array es: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //PASO POR VALOR
        int valor = 2;
        boolean navidades = true;
        String palabra = "cacahuete";
        int [] array = {0, 1, 2, 3};
        
        metodo(valor, navidades, palabra, array);
        System.out.println("----------------------------");
        System.out.println("valor fuera: "+ valor);
        System.out.println("navidades fuera: "+ navidades);
        System.out.println("palabra fuera: "+ palabra);
        System.out.println("array fuera: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        //UNICAMENTE LOS ARRAYS Y OBJETOS AL CAMBIAR EN EL MÉTODO CAMBIAN EN EL MAIN
    }
}
