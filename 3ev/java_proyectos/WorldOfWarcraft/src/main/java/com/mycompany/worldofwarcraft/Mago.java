package com.mycompany.worldofwarcraft;

/**
 * @author fsanj
 */

/**
 * Clase que representa un personaje de tipo Mago en el juego World of Warcraft.
 * Hereda de la clase abstracta Personaje.
 */
public class Mago extends Personaje {

    /**
     * Constructor de la clase Mago.
     * @param nombre Nombre del mago.
     * @param atk Puntos de ataque del mago.
     * @param def Puntos de defensa del mago.
     */
    public Mago(String nombre, int atk, int def) {
        super(nombre, atk, def);
    }

    /**
     * Método que representa la habilidad especial del mago.
     * @return Valor del daño realizado por el hechizo potenciado o 0 si el hechizo falla.
     */
    @Override
    public int habilidad() {
        int numRand = (int) (Math.random() * 100 + 1);
        if (numRand <= 25) {
            System.out.println(super.getNombre() + " - ¡HECHIZO PERFECCIONADO! de " + super.getAtk() + " puntos");
            return super.getAtk();
        } else {
            System.out.println(super.getNombre() + " - falla al intentar lanzar el hechizo");
            return 0;
        }
    }

    /**
     * Método que permite al mago curarse.
     */
    public void curar() {
        final int AUMENTO_VIDA = 10;
        int numRand = (int) (Math.random() * 100 + 1);
        if (super.getHp() == SALUD_INICIAL) {
            System.out.println(super.getNombre() + " - no puede ser curado por encima de la vida máxima");
        } else {
            if (numRand <= 30) {
                if (super.getHp() + AUMENTO_VIDA > SALUD_INICIAL) {
                    System.out.println(super.getNombre() + " - consigue sumar " + (SALUD_INICIAL - super.getHp()) + " puntos de vida");
                    super.setHp(SALUD_INICIAL);
                } else {
                    System.out.println(super.getNombre() + " - consigue sumar 10 puntos de vida");
                    super.setHp(super.getHp() + AUMENTO_VIDA);
                }
            } else {
                System.out.println(super.getNombre() + " - falla en la recuperación de vida");
            }
        }
    }

}
