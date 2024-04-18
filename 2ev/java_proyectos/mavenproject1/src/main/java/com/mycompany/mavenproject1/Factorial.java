/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Nocturno
 */
public class Factorial {
    private int num1;

    public Factorial(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int calcular(){
        for(int i = num1 - 1; i > 1; i--){
            num1 = num1 * i;
        }
        return num1;
    }
    
    

   

   
    
    
    
    
    
    
}
