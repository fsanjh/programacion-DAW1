package com.mycompany.worldofwarcraft;

/**
 * @author fsanj
 */

/**
 * Clase que representa un personaje de tipo Guerrero en el juego World of Warcraft.
 * Hereda de la clase abstracta Personaje.
 */
public class Guerrero extends Personaje {

    /**
     * Constructor de la clase Guerrero.
     * @param nombre Nombre del guerrero.
     * @param atk Puntos de ataque del guerrero.
     * @param def Puntos de defensa del guerrero.
     */
    public Guerrero(String nombre, int atk, int def) {
        super(nombre, atk, def);
    }

    /**
     * Método que representa la habilidad especial del guerrero.
     * @return Valor del daño realizado por el golpe crítico o 0 si el golpe falla.
     */
    @Override
    public int habilidad() {
        int numRand = (int) (Math.random() * 100 + 1);
        if (numRand <= 15) {
            System.out.println(super.getNombre() + " - ¡GOLPE CRÍTICO! de " + super.getAtk() * 2 + " puntos");
            return super.getAtk() * 2;
        } else {
            System.out.println(super.getNombre() + " - falla el golpe crítico");
            return 0;
        }
    }

}
