/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ligoleyen;

/**
 *
 * @author Nocturno
 */
public class Ligoleyen {

    public static void main(String[] args) {
        Campeon champ1 = new Campeon("Akali", "Energía", "CaC");
        
        Top top1 = new Top("Renekton", "Ira", "CaC", "Duelista");
        Top top2 = new Top("Kennen", "Energía", "A distancia", "Mago/Duelista en equipo");
        
        Jungla jg1 = new Jungla("Warwick", "Maná", "CaC", "Agresivo");
        Jungla jg2 = new Jungla("Ivern", "Maná", "A distancia", "Pasivo");
        
        Mid mid1 = new Mid("Ryze", "Maná", "A distancia", "Mago", "Roamer");
        Mid mid2 = new Mid("Zed", "Energía", "Melee", "Asesino", "Duelista");
        
        Bot bot1 = new Bot("Samira", "Maná", "Melee y Distancia", "Combos de habilidades");
        Bot bot2 = new Bot("Jinx", "Maná", "Distancia", "Velocidad de ataque");
        
        Support sup1 = new Support("Braum", "Maná", "Melee", "Protector");
        Support sup2 = new Support("Rakan", "Maná", "Melee", "Iniciador/Protector");
        
        
        System.out.println(champ1);
        System.out.println("");
        System.out.println(top1 + " y se juega en "+top1.getClass().getSimpleName());
        System.out.println(top2 + " y se juega en "+top2.getClass().getSimpleName());
        System.out.println("");
        System.out.println(jg1 + " y se juega en "+jg1.getClass().getSimpleName());
        System.out.println(jg2 + " y se juega en "+jg2.getClass().getSimpleName());
        System.out.println("");
        System.out.println(mid1 + " y se juega en "+mid1.getClass().getSimpleName());
        System.out.println(mid2 + " y se juega en "+mid2.getClass().getSimpleName());
        System.out.println("");
        System.out.println(bot1 + " y se juega en "+bot1.getClass().getSimpleName());
        System.out.println(bot2 + " y se juega en "+bot2.getClass().getSimpleName());
        System.out.println("");
        System.out.println(sup1 + " y se juega en "+sup1.getClass().getSimpleName());
        System.out.println(sup2 + " y se juega en "+sup2.getClass().getSimpleName());
        
        
        
    }
}
