package com.mycompany.ejercicio2_felix;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class Ejercicio2_felix{
    //Método para simular la cantidad de goles basada en una probabilidad
    public static int simularGoles(double probabilidadGol, double probabilidadVictoria){
        int goles = 0;
        Random random = new Random();
        //Simular cada intento de gol con la probabilidad dada
        for(int i = 0; i < 5; i ++){
            if((probabilidadGol + probabilidadVictoria) / 100 * 0.8 < random.nextDouble()){
            }else{
                goles ++;
            }
        }
        return goles;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Declaro el escaner para que el usuario pueda interactuar con el programa
        int res; //Respuestas dadas por el usuario
        int partidos = 0; //Partidos que hay introducidos
        Partido[] listaPartidos = new Partido[5]; //Array con los partidos que se vayan creando

        System.out.println("Bienvenido al simulador de partidos de fútbol");
        do{
            System.out.println("Qué acción quiere realizar:");
            System.out.println("    1) Crear partido desde consola");
            System.out.println("    2) Mostrar lista de partidos");
            System.out.println("    3) Simular partido");
            System.out.println("    4) Salir");
            System.out.print("Respuesta: ");
            try{ //Si el usuario introduce una respuesta que no coincida con el tipo de respuesta pedido, mostrara un error y volvera al inicio
                res = input.nextInt();
                switch(res){ //Switch-case que realizara las acciones que el usuario haya introducido si corresponden con una opcion dada
                    case 1 -> {
                        if(partidos == 5){ //Si ya hay 5 partidos introducidos, no se le permitira al usuario añadir más
                            System.out.println("No se puede añadir más partidos");
                        }else{
                            try{ //En caso de que las probabilidades de victoria sean superiores a 100, se recibira la excepcion y se mostrara
                                System.out.println("Ha elegido \"Crear partido desde consola\"");
                                System.out.println("------------------------------------------------");
                                Partido newPartido = new Partido("temp", "temp", 0, 0); //Un partido temporal donde se iran haciendo los set de cada atributo
                                System.out.print("Nombre del equipo local [sin espacios]: ");
                                newPartido.setEquipoLocal(input.next());
                                System.out.print("Nombre del equipo visitante [sin espacios]: ");
                                newPartido.setEquipoVisitante(input.next());
                                System.out.print("Probabilidad de victoria del equipo local [%]: ");
                                newPartido.setProbabilidadVictoriaLocal(input.nextDouble());
                                System.out.print("Probabilidad de victoria del equipo visitante [%]: ");
                                newPartido.setProbabilidadVictoriaVisitante(input.nextDouble());
                                newPartido.probabilidadesVictoria();
                                System.out.print("Probabilidad de gol del equipo local [%]: ");
                                newPartido.setProbabilidadGolLocal(input.nextDouble());
                                System.out.print("Probabilidad de gol del equipo visitante [%]: ");
                                newPartido.setProbabilidadGolVisitante(input.nextDouble());
                                listaPartidos[partidos] = newPartido; //Añado el partido a la lista
                                partidos ++; //Sumo el contador de partidos introducidos
                            }catch(LimiteException le1){
                                System.out.println(le1.getMessage());
                            }finally{
                                System.out.println("Fin de la creación del partido");
                            }
                        }
                    }
                    case 2 -> {
                        System.out.println("Ha elegido \"Mostrar lista de partidos\"");
                        System.out.println("------------------------------------------------");
                        if(partidos != 0){ //Si hay 1 o más partidos, se mostrarán
                            //Muestro los partidos
                            for(int i = 0; i < partidos; i++){
                                Partido p = listaPartidos[i];
                                System.out.println("PARTIDO " + (i + 1));
                                System.out.println("    ¿Partido jugado?: " + ((p.isPartidoJugado()) ? "Sí" : "No"));
                                System.out.println("    Equipo local: " + p.getEquipoLocal());
                                System.out.println("    Equipo visitante: " + p.getEquipoVisitante());
                                System.out.println("    Probabilidad de victoria local: " + String.format("%.2f", p.getProbabilidadVictoriaLocal()) + "%");
                                System.out.println("    Probabilidad de victoria visitante: " + String.format("%.2f", p.getProbabilidadVictoriaVisitante()) + "%");
                                System.out.println("    Probabilidad de gol local: " + String.format("%.2f", p.getProbabilidadGolLocal()) + "%");
                                System.out.println("    Probabilidad de gol visitante: " + String.format("%.2f", p.getProbabilidadGolVisitante()) + "%");
                                System.out.println("    Goles del local: " + p.getGolesLocal());
                                System.out.println("    Goles del visitante: " + p.getGolesVisitante());
                            }
                        }else{
                            System.out.println("No hay partidos que mostrar");
                        }
                    }
                    case 3 -> {
                        System.out.println("Ha elegido \"Simular partido\"");
                        if(partidos != 0){ //Para evitar simular partidos con el array vacío
                            System.out.println("¿Qué partido quiere simular?");
                            boolean hayPartidos = false;
                            for(int i = 0; i < partidos; i++){
                                Partido p = listaPartidos[i];
                                if( ! p.isPartidoJugado()){ //Si el partido ya ha sido jugado no se mostrará
                                    System.out.println((i+1) + ") " + p.getEquipoLocal() + " VS " + p.getEquipoVisitante());
                                    hayPartidos = true;
                                }
                            }
                            if(hayPartidos){ //En caso de no haber partidos sin simular, no se continuará
                                try{ //Si se introduce un valor que esté fuera de limites, no sea int o apunte a una posicion vacía, mostrara un error
                                    System.out.print("Respuesta: ");
                                    res = input.nextInt();
                                    Partido p = listaPartidos[res - 1];

                                    if(p.isPartidoJugado()){
                                        System.out.println("Ese partido ya se ha jugado");
                                    }else{
                                        //Asigno los goles de cada equipo que se generan con el método simularGoles
                                        p.setGolesLocal(simularGoles(p.getProbabilidadGolLocal(), p.getProbabilidadVictoriaLocal())); 
                                        p.setGolesVisitante(simularGoles(p.getProbabilidadGolVisitante(), p.getProbabilidadVictoriaVisitante()));
                                        p.setPartidoJugado(true); //Cambio el valor de partidoJugado a true
                                        listaPartidos[res - 1] = p; //Sustituyo el partido en la lista en la posición que se encontraba

                                        if(p.getGolesLocal() == p.getGolesVisitante()){
                                            System.out.println("EMPATE");
                                        }else if(p.getGolesLocal() > p.getGolesVisitante()){
                                            System.out.println("GANA LOCAL");
                                        }else{
                                            System.out.println("GANA VISITANTE");
                                        }
                                        System.out.println("RESUMEN:");
                                        System.out.println("    Equipo local: " + p.getEquipoLocal());
                                        System.out.println("    Equipo visitante: " + p.getEquipoVisitante());
                                        System.out.println("    Probabilidad de victoria local: " + String.format("%.2f", p.getProbabilidadVictoriaLocal()) + "%");
                                        System.out.println("    Probabilidad de victoria visitante: " + String.format("%.2f", p.getProbabilidadVictoriaVisitante()) + "%");
                                        System.out.println("    Probabilidad de gol local: " + String.format("%.2f", p.getProbabilidadGolLocal()) + "%");
                                        System.out.println("    Probabilidad de gol visitante: " + String.format("%.2f", p.getProbabilidadGolVisitante()) + "%");
                                        System.out.println("    Goles del local: " + p.getGolesLocal());
                                        System.out.println("    Goles del visitante: " + p.getGolesVisitante());
                                        res = 0; //Dejo la variable con un valor que no coincida con ninguno de los usados en el case
                                    }

                                }catch(ArrayIndexOutOfBoundsException | InputMismatchException | NullPointerException er2){
                                    System.out.println("No se ha podido encontrar el partido introducido");
                                }finally{
                                    System.out.println("Fin de la simulación");
                                }
                            }else{
                                System.out.println("No quedan partidos para simular");
                            }

                        }else{
                            System.out.println("No hay partidos que simular");
                        }

                    }
                    case 4 -> {
                        System.out.println("Gracias por utilizar el programa, hasta pronto.");
                    }
                }
            }catch(InputMismatchException er1){
                System.out.println("ERROR - Esa no es una respuesta permitida");
                input.next();
                res = 0;
            }
        }while(res != 4);

    }

}

