package com.mycompany.repasorecursividad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class RepasoRecursividad{

    public static int maximo(int[] array, int indice, int max){
        if(indice != array.length){
            if(array[indice] > max){
                max = maximo(array, indice + 1, array[indice]);
            }else{
                max = maximo(array, indice + 1, max);

            }
        }
        return max;
    }

    public static int minimo(int[] array, int indice, int min){
        if(indice != array.length){
            if(array[indice] < min){
                min = minimo(array, indice + 1, array[indice]);
            }else{
                min = minimo(array, indice + 1, min);

            }
        }
        return min;
    }

    public static int maximo2(int[] array, int indice){
        int max = Integer.MIN_VALUE;
        if(indice != array.length){
            max = Math.max(array[indice], maximo2(array, indice + 1));
        }
        return max;
    }

    public static int minimo2(int[] array, int indice){
        int min = Integer.MAX_VALUE;
        if(indice != array.length){
            min = Math.min(array[indice], minimo2(array, indice + 1));
        }
        return min;
    }

    public static void tablaMult(int num, int mult){
        int res = num * mult;
        if(res < 12){
            System.out.println(num + " x " + mult + " = " + res);
            tablaMult(num, mult + 1);
        }
    }

    public static ArrayList<Integer> capturarNumeros(ArrayList<Integer> lista){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = input.nextInt();
        if(numero != -1){
            lista.add(numero);
            lista.addAll(capturarNumeros(lista));
        }else{
            for(int nums : lista){
                System.out.println(nums);
            }
        }
        return lista;
    }

    public static int resultadoSumaMayor(int m, int n){
        if(n * (n + 1) / 2 > m){
            return n;
        }else{
            return resultadoSumaMayor(m, n + 1);
        }
    }

    public static void main(String[] args){
        System.out.println("EJERCICIO 1 - Números máximos o minimos del array");
        int[] nums = {6, 5, 9, 10, 2, -10, 6};
        System.out.println("Máximo según la versión 1: " + maximo(nums, 0, nums[0]));
        System.out.println("Mínimo según la versión 1: " + minimo(nums, 0, nums[0]));
        System.out.println();
        System.out.println("Máximo según la versión 2: " + maximo2(nums, 0));
        System.out.println("Mínimo según la versión 2: " + minimo2(nums, 0));

        System.out.println("\nEJERCICIO 2 - Tabla de multiplicar de un número hasta que sea mayor a 12");
        tablaMult(5, 0);
        /*
        System.out.println("\nEJERCICIO 3 - Capturar números en un array hasta introducir -1");
        ArrayList<Integer> array = new ArrayList();
        array = capturarNumeros(array);
        System.out.println();
         */
        System.out.println("\nEJERCICIO 4 - Suma");
        System.out.println(resultadoSumaMayor(15, 1));

    }

}
