/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysdinamicos;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class ArraysDinamicos {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        
        for(int i = 0; i < 25; i++){
            int ran;
            ran = (int) (Math.floor(Math.random()*(65-90+1)+90));
            lista.add(Character.toString((char) ran));
            System.out.print(lista.get(i));
        }
        System.out.println();
        int tamanoArray = lista.size();
        System.out.println("Tamaño del array: "+tamanoArray);
        lista.remove("B");
        tamanoArray = lista.size();
        System.out.println("Nuevo tamaño del array: "+tamanoArray);
        
        ArrayList<String> lista2 = new ArrayList();
        lista2.add("C");
        lista.removeAll(lista2);
        tamanoArray = lista.size();
        System.out.println("Nuevo tamaño del array v2: "+tamanoArray);
        for (String letras : lista){ //for each
            System.out.print(letras);
        }
        
    }
}
