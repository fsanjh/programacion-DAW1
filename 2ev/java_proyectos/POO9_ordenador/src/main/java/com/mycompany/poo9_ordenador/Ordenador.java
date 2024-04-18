/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo9_ordenador;

/**
 *
 * @author Nocturno
 */
public class Ordenador {
    private Teclado teclado;
    private String modelo;
    
    public Ordenador(Teclado _teclado, String _modelo){
        this.teclado = _teclado;
        this.modelo = _modelo;
    }

    public Teclado getTeclado() {
        return teclado;
    }
    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
