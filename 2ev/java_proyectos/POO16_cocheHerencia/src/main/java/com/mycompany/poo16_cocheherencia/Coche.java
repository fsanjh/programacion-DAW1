
package com.mycompany.poo16_cocheherencia;

/**
 *
 * @author Nocturno
 */
public class Coche {
    private int numPuertas;
    private int numRuedas;
    private String color;
    private String marca;
    private String modelo;
    private String matricula;
    
    public Coche(String _matricula, String _marca, String _modelo, String _color, int _ruedas, int _puertas){
        this.matricula = _matricula;
        this.modelo = _modelo;
        this.marca = _marca;
        this.color = _color;
        this.numRuedas = _ruedas;
        this.numPuertas = _puertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }
    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void info(){
        System.out.print("Coche "+ this.marca + " " + this.modelo +" con la matricula "+ this.matricula +" de color "
                + this.color +", tiene "+ this.numRuedas +" ruedas y "+ this.numPuertas +" puertas");
    }
    
    

    
    
    
    
    
}
