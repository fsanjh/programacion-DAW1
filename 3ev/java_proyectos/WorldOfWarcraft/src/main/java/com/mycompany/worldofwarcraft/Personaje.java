package com.mycompany.worldofwarcraft;

import java.util.Random;

/**
 * @author fsanj
 */

/**
 * Clase abstracta que representa un personaje en el juego World of Warcraft.
 * Define los atributos y métodos comunes para todos los personajes.
 */
public abstract class Personaje {

    /**
     * Nombre del personaje
     */
    protected String nombre;

    /**
     * Puntos de ataque del personaje
     */
    protected int atk;

    /**
     * Puntos de defensa del personaje
     */
    protected int def;

    /**
     * Puntos de vida del personaje
     */
    protected int hp;

    /**
     * Salud inicial de los personajes
     */
    protected static final int SALUD_INICIAL = 100;
    Random azar = new Random(); // Objeto Random para generar números aleatorios
    
    /**
     * Constructor de la clase Personaje.
     * @param nombre Nombre del personaje.
     * @param atk Puntos de ataque del personaje.
     * @param def Puntos de defensa del personaje.
     */
    public Personaje(String nombre, int atk, int def) {
        this.nombre = nombre;
        this.atk = atk;
        this.def = def;
        this.hp = SALUD_INICIAL;
    }
    
    /**
     * Método para realizar un ataque.
     * @return Valor del ataque realizado por el personaje.
     */
    public int atacar() {
        return azar.nextInt((this.atk - this.atk / 2) + 1) + (this.atk / 2);
    }
    
    /**
     * Método para realizar una acción defensiva.
     * @return Valor de la defensa realizada por el personaje.
     */
    public int defender() {
        return azar.nextInt((this.def - this.def / 2) + 1) + (this.def / 2);
    }
    
    /**
     * Método abstracto para la habilidad especial del personaje.
     * @return Valor de la habilidad especial del personaje.
     */
    public abstract int habilidad();
        
    // Getters y setters para los atributos del personaje
    /**
     * 
     * @return nombre Devuelve el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * 
     * @param nombre Establece el nombre del personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return atk Devuelve el ataque del personaje
     */
    public int getAtk() {
        return atk;
    }
    
    /**
     * 
     * @param atk Establece el ataque del personaje
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    /**
     * 
     * @return def Devuelve la defensa del personaje
     */
    public int getDef() {
        return def;
    }
    
    /**
     * 
     * @param def Establece la defensa del personaje
     */
    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 
     * @return hp Devuelve la vida del personaje
     */
    public int getHp() {
        return hp;
    }
    
    /**
     * 
     * @param hp Establece la vida del personaje
     */
    public void setHp(int hp) {
        this.hp = hp;
    }
}
