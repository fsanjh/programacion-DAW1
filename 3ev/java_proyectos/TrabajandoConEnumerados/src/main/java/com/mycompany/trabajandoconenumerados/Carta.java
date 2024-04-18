package com.mycompany.trabajandoconenumerados;

/**
 *
 * @author fsanj
 */
public class Carta{
    public enum Palo{
        OROS, COPAS, ESPADAS, BASTOS;
    }
    
    private int numCarta;
    private Palo paloCarta;

    public Carta(int _numCarta, Palo _paloCarta){
        this.numCarta = _numCarta;
        this.paloCarta = _paloCarta;
    }

    public int getNumCarta(){
        return numCarta;
    }
    public void setNumCarta(int numCarta){
        this.numCarta = numCarta;
    }
    
    public Palo getPaloCarta(){
        return paloCarta;
    }
    public void setPaloCarta(Palo paloCarta){
        this.paloCarta = paloCarta;
    }
    
    
    
    
    
    
    
}
