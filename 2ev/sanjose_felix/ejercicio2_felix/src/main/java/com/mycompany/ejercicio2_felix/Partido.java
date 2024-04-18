package com.mycompany.ejercicio2_felix;

/**
 *
 * @author fsanj
 */
public class Partido{
    //Atributos de la clase Partido
    private String equipoLocal;
    private String equipoVisitante;
    private double probabilidadVictoriaLocal;
    private double probabilidadVictoriaVisitante;
    private double probabilidadGolLocal;
    private double probabilidadGolVisitante;
    private int golesLocal;
    private int golesVisitante;
    private boolean partidoJugado;

    //Constructor
    public Partido(String _equipoLocal, String _equipoVisitante, double _probabilidadVictoriaLocal, double _probabilidadVictoriaVisitante){
        this.equipoLocal = _equipoLocal;
        this.equipoVisitante = _equipoVisitante;
        this.probabilidadVictoriaLocal = _probabilidadVictoriaLocal;
        this.probabilidadVictoriaVisitante = _probabilidadVictoriaVisitante;
        
        this.probabilidadGolLocal = 0;
        this.probabilidadGolVisitante = 0;
        this.golesLocal = 0;
        this.golesVisitante = 0;
        this.partidoJugado = false;
    }

    //GETTER & SETTER de todos los atributos
    public String getEquipoLocal(){
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal){
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante(){
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante){
        this.equipoVisitante = equipoVisitante;
    }

    public double getProbabilidadVictoriaLocal(){
        return probabilidadVictoriaLocal;
    }
    public void setProbabilidadVictoriaLocal(double probabilidadVictoriaLocal){
        this.probabilidadVictoriaLocal = probabilidadVictoriaLocal;
    }

    public double getProbabilidadVictoriaVisitante(){
        return probabilidadVictoriaVisitante;
    }
    public void setProbabilidadVictoriaVisitante(double probabilidadVictoriaVisitante){
        this.probabilidadVictoriaVisitante = probabilidadVictoriaVisitante;
    }

    public double getProbabilidadGolLocal(){
        return probabilidadGolLocal;
    }
    public void setProbabilidadGolLocal(double probabilidadGolLocal){
        this.probabilidadGolLocal = probabilidadGolLocal;
    }

    public double getProbabilidadGolVisitante(){
        return probabilidadGolVisitante;
    }
    public void setProbabilidadGolVisitante(double probabilidadGolVisitante){
        this.probabilidadGolVisitante = probabilidadGolVisitante;
    }

    public int getGolesLocal(){
        return golesLocal;
    }
    public void setGolesLocal(int golesLocal){
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante(){
        return golesVisitante;
    }
    public void setGolesVisitante(int golesVisitante){
        this.golesVisitante = golesVisitante;
    }

    public boolean isPartidoJugado(){
        return partidoJugado;
    }
    public void setPartidoJugado(boolean partidoJugado){
        this.partidoJugado = partidoJugado;
    }
    
    //Método encargador de comprobar que las probabilidades son correctas, en caso de no serlo mandará una excepción personalizada al main
    public void probabilidadesVictoria() throws LimiteException{
        if(this.probabilidadVictoriaLocal + this.probabilidadVictoriaVisitante > 100){
            throw new LimiteException("ERROR- la suma de las probabilidades de victoria es superior a 100%");
        }
    }


    
    
    
    
    

    
    
    
    
    
    
    
}
