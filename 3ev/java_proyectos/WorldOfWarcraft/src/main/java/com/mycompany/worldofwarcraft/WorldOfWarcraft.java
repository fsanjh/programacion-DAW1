package com.mycompany.worldofwarcraft;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author fsanj
 */

/**
 * Clase principal que simula el juego World of Warcraft.
 * Permite al usuario elegir un bando y luchar contra el ordenador.
 */
public class WorldOfWarcraft {

    static Scanner input = new Scanner(System.in); //Declaro el escaner fuera del main y estático para acceder desde cualquier parte

    /**
     * Imprime los detalles de los personajes de una facción.
     * @param faccion Arreglo de objetos Personaje que representan una facción.
     */
    public static void imprimirFaccion(Personaje[] faccion) {
        for (int i = 0; i < faccion.length; i++) {
            if (faccion[i].getHp() > 0) {
                System.out.println("        " + (i + 1) + ". " + faccion[i].getNombre() + "(" + faccion[i].getClass().getSimpleName() + ") \n"
                                   + "             Ataque: " + faccion[i].getAtk() + " | Defensa: " + faccion[i].getDef());
            }
        }
        System.out.println("----------------------------------------------------------------");
    }

    /**
     * Permite al usuario elegir un bando para luchar.
     * @param ali Arreglo de objetos Personaje que representan la Alianza.
     * @param horda Arreglo de objetos Personaje que representan la Horda.
     * @return El número correspondiente al bando elegido por el usuario (1 para Alianza, 2 para Horda).
     */
    public static int elegirFaccion(Personaje[] ali, Personaje[] horda) {
        int res = 0;
        do {
            try {
                System.out.println("Elija un bando para luchar:");
                System.out.println("    1) ALIANZA DE LORDAERON-> ");
                imprimirFaccion(ali);
                System.out.println("    2) HORDA DE HIERRO-> ");
                imprimirFaccion(horda);
                System.out.print("Respuesta: ");
                res = input.nextInt();
            } catch (InputMismatchException ime4) {
                res = 3;
                input.next();
            } finally {
                if (res != 1 && res != 2) {
                    System.out.println("Esa opción no está disponible. Elija 1 para Alianza o 2 para Horda.");
                }
            }
        } while (res != 1 && res != 2);
        return res;
    }

    /**
     * Permite al usuario elegir un personaje de una facción.
     * @param faccion Arreglo de objetos Personaje que representan una facción.
     * @param accion Descripción de la acción que el usuario está realizando (por ejemplo, "personaje" o "nuevo personaje").
     * @return El número correspondiente al personaje elegido por el usuario.
     */
    public static int elegirPersonaje(Personaje[] faccion, String accion) {
        int res = 0;
        do {
            try {
                System.out.println("Elija " + accion + ":");
                imprimirFaccion(faccion);
                System.out.print("Respuesta [1-4]: ");
                res = input.nextInt();
            } catch (InputMismatchException ime5) {
                res = 5;
                input.next();
            } finally {
                if (res < 1 || res > 4 || faccion[res - 1].getHp() <= 0) {
                    System.out.println("Esa opción no está disponible. Elija un número válido de personaje vivo.");
                    res = -1; // Forzar el ciclo a repetirse
                }
            }
        } while (res < 1 || res > 4);
        return res;
    }
    /**
     * Imprime el ganador de la guerra o el empate
     * @param contMuertesJugador Número de personajes del jugador muertos
     * @param contMuertesOrdenador Número de personajes del jugador muertos
     * @param ganador booleano encargado de determinar si el jugador a ganado
     * @param bandoJugador nombre del bando del jugador
     * @param bandoOrdenador nombre del bando del ordenador
     */
    public static void fin(int contMuertesJugador, int contMuertesOrdenador, boolean ganador, String bandoJugador, String bandoOrdenador){
        System.out.println("\n-----------------------------FIN DEL JUEGO------------------------------");
        if (contMuertesJugador == 4 && contMuertesOrdenador == 4) { //Si ambos contadores son 4, hay empate
                System.out.println("Ambos bandos han caído en combate");
            } else {
                if (ganador) { //Si el jugador gana
                    System.out.println("¡¡El jugador consigue la victoria a favor de la " + bandoJugador + "!!");
                } else {
                    System.out.println("Has perdido la guerra... la " + bandoOrdenador + " ha vencido...");
                }
            }
    }
    /**
     * Accion realizada por los personajes
     * @param respuesta Acción que se quiere realizar
     * @param pj Personaje que realiza la accion
     * @return Puntos de daño o de defensa que se realizan
     */
    public static int accion(int respuesta, Personaje pj){
        int puntos = 0;
        switch (respuesta) {
            case 1 -> { //Cuando elija atacar
                puntos = pj.atacar();
                System.out.println(pj.getNombre() + " - ataca con "+ puntos + " puntos de ataque");
            }
            case 2 -> { //El personaje elije defender
                puntos = pj.defender();
                System.out.println(pj.getNombre() + " - se prepara para defender con " + puntos + " puntos de defensa");
            }
            case 3 -> { //El personaje intenta realizar la habilidad
                puntos = pj.habilidad();
            }
            case 4 -> { //El personaje quiere curar su vida
                if(pj instanceof Mago mago){
                    mago.curar();
                }
            }
        }
        return puntos;
    }
        
    

    /**
     * 
     * @param args Programa principal Main
     */
    public static void main(String[] args) {
        boolean fin = false; //Variable encargada de terminar el juego
        boolean ganador = false; //Variable encargada de decir si el jugador a ganado o perdido
        boolean correcto = true;
        int res; //Respuestas dadas por el usuario
        int pjSeleccionadoJugador; //Numero de posición del array del personaje que el usuario a seleccionado
        int pjSeleccionadoOrdenador; //Numero de posición del array del personaje que el ordenador a obtenido
        int puntosJugador = 0;
        int puntosOrdenador = 0;
        int resOrdenador; //Respuestas aleatorias del ordenador
        int contMuertesJugador = 0; //Numero de muertes que el Jugador ha conseguido
        int contMuertesOrdenador = 0; //Numero de muertes que el Ordenador ha conseguido
        //Array con los personajes miembros del bando de la Alianza
        Personaje[] alianza = {
            new Mago("Khadgar, la Joven Confianza", 25, 10),
            new Guerrero("Varian Wrynn, rey de Ventormenta", 30, 15),
            new Guerrero("Alleria Brisaveloz la Capitana Forestal", 25, 15),
            new Guerrero("Vindicador Maraad, Martillo de la Luz", 15, 30)
        };
        //Array con los personajes miembros del bando de la Horda
        Personaje[] horda = {
            new Mago("Gul'Dan el Destructor de Sueños", 25, 10),
            new Mago("Ner'Zhul el Viejo Chamán", 30, 10),
            new Guerrero("Baine Pezuña de Sangre", 15, 25),
            new Guerrero("Gazlowe, líder del Cártel Pantoque", 35, 5)
        };
        Personaje[] faccionJugador = alianza; //Facción elegida del jugador, por defecto será la Alianza
        Personaje[] faccionOrdenador = horda; //Facción del ordenador, por defecto será la horda
        Personaje personajeOrdenador; //Personaje actual del jugador con el cual está luchando
        Personaje personajeJugador; //Personaje actual del ordendor con el cual está luchando
        final String NOMBREALIANZA = "Alianza de Lordaeron";
        final String NOMBREHORDA = "Horda de Hierro";
        String bandoJugador = NOMBREALIANZA; //Nombre del bando elegido por el jugador
        String bandoOrdenador = NOMBREHORDA; //Nombre del bando del ordenador

        res = elegirFaccion(alianza, horda); //Se llama al método para que el usuario elija una facción
        if (res == 2) { //En caso de que el usuario elija la facción 2
            bandoJugador = NOMBREHORDA;
            bandoOrdenador = NOMBREALIANZA;
            faccionJugador = horda;
            faccionOrdenador = alianza;
        }

        res = elegirPersonaje(faccionJugador, "personaje"); //Se pide al usuario elegir un personaje con el que comenzar
        pjSeleccionadoJugador = res - 1; //Se ajusta la respuesta para que coincida con el indice del array
        personajeJugador = faccionJugador[pjSeleccionadoJugador]; //Se establece al personaje
        pjSeleccionadoOrdenador = (int) (Math.random() * 4); //Se genera un indice aleatorio para el ordenador
        personajeOrdenador = faccionOrdenador[pjSeleccionadoOrdenador]; //Se elige el personaje aleatorio del ordenador

        //Inicio del juego
        do {
            do {
                try {
                        // Turno del jugador
                        System.out.println();
                        System.out.println(personajeOrdenador.getNombre() + " | HP: " + personajeOrdenador.getHp());
                        System.out.println("         _  _  ___ \n"
                                        + "        ( \\/ )/ __)\n"
                                        + "         \\  / \\__ \\\n"
                                        + "          \\/  (___/");
                        System.out.println();
                        System.out.println(personajeJugador.getNombre() + " | HP: " + personajeJugador.getHp() + " <- Tú");
                        System.out.println("1. Atacar (daño: "+personajeJugador.getAtk()/2 + " -> "+ personajeJugador.getAtk() +")");
                        System.out.println("2. Defender (defensa: "+personajeJugador.getDef()/2 + " -> "+ personajeJugador.getDef() +")");

                        if (personajeJugador instanceof Guerrero) {
                            System.out.println("3. Golpe Crítico (15% de x2 de daño máximo e ignora defensas)");
                        } else if (personajeJugador instanceof Mago) {
                            System.out.println("3. Hechizo Perfeccionado (25% de daño máximo e ignora defensas)");
                            System.out.println("4. Curar (30% de +10 de vida, máximo de vida: 100)");
                        }
                        System.out.print("Qué quieres hacer: ");
                        res = input.nextInt();
                        System.out.println("------------------------------TÚ ACCIÓN---------------------------------");
                        correcto = true;
                        if(res == 4 && personajeJugador instanceof Mago){
                            puntosJugador = accion(res, personajeJugador);
                        }else if(res == 4 && personajeJugador instanceof Guerrero){
                            res = 5;
                            throw new OpcionNoValidaException("Esa opción no está permitida");
                        }else{
                            puntosJugador = accion(res, personajeJugador);
                        }
                } catch (OpcionNoValidaException er) {
                    // Captura excepción de opción no válida y muestra mensaje de error
                    System.out.println(er.getMessage());
                } catch (InputMismatchException im3) {
                    // Captura excepción de entrada incorrecta y muestra mensaje de error
                    System.out.println("\nValor no permitido");
                    res = 5; // Forzar repetición del ciclo
                    input.next(); // Limpiar buffer de entrada
                }
            } while (res > 4);

            // Turno del ordenador
            // Mensaje para indicar que es el turno del enemigo
            System.out.println("---------------------------ACCIÓN ENEMIGA-------------------------------");
            do {
                correcto = true;
                resOrdenador = (int) (Math.random() * 4 + 1); //Accion aleatoria del ordenador
                if(resOrdenador == 4 && personajeOrdenador instanceof Mago){
                    puntosOrdenador = accion(resOrdenador, personajeOrdenador);
                }else if(resOrdenador == 4 && personajeOrdenador instanceof Guerrero){
                    correcto = false;
                }else{
                    puntosOrdenador = accion(resOrdenador, personajeOrdenador);
                }
            } while (!correcto);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("                               RESUMEN                                  ");
            // Manejo de los resultados de los ataques
            if ((resOrdenador == 1) && (res == 2)) { //Si el ordenador ataca y el usuario defiende...
                if ((puntosOrdenador - puntosJugador) > 0) {
                    puntosOrdenador = puntosOrdenador - puntosJugador;
                } else { //Defensa > ataque
                    puntosOrdenador = 0;
                }
                personajeJugador.setHp(personajeJugador.getHp() - puntosOrdenador);
                System.out.println("            Tras defenderte has recibido "+ puntosOrdenador +" puntos de daño.");
            } else if ((resOrdenador == 2) && (res == 1)) { //Si el ordenador defiende y el jugador ataca...
                if ((puntosJugador - puntosOrdenador) > 0) {
                    puntosJugador = puntosJugador - puntosOrdenador;
                } else { //Defensa > ataque
                    puntosJugador = 0;
                }
                personajeOrdenador.setHp(personajeOrdenador.getHp() - puntosJugador);
                System.out.println("        Después de su defensa has realizado "+ puntosJugador +" puntos de daño.");
            }else if ((resOrdenador == 2) && (res == 2)) { //Si ambos defienden...
                System.out.println("                 Ambos personajes han intentado bloquear");
            
            }else if ((resOrdenador == 3) && (res == 2) && (puntosOrdenador > 0)) { //Si el ordenador realiza la habilidad y el jugador defiende...
                personajeJugador.setHp(personajeJugador.getHp() - puntosOrdenador);
                System.out.println("           No has conseguido bloquear los "+ puntosOrdenador +" puntos de daño.");
            }else if ((resOrdenador == 2) && (res == 3) && (puntosJugador > 0)) { //Si el jugador realiza la habilidad y el ordenador defiende...
                personajeOrdenador.setHp(personajeOrdenador.getHp() - puntosJugador);
                System.out.println("       El enemigo no ha conseguido bloquear los "+ puntosJugador +" puntos de daño.");
            } else if( ((resOrdenador == 1 || resOrdenador == 3) && (res == 1 || res == 3))) { //Si ambos atacan o realizan la habilidad
                personajeJugador.setHp(personajeJugador.getHp() - puntosOrdenador);
                personajeOrdenador.setHp(personajeOrdenador.getHp() - puntosJugador);
                if(puntosJugador > 0){
                    System.out.println("                    Has realizado "+ puntosJugador +" puntos de daño");
                }
                if(puntosOrdenador > 0){
                    System.out.println("                  El enemigo te hace "+ puntosOrdenador +" puntos de daño");
                }
            }else{ //Cuando alguno de los dos trate de curarse
                if(res == 4){ //Si el jugador se intenta curar
                    System.out.println("                 Intentaste recuperar 10 puntos de vida");
                }else if((res == 1 || res == 3) && puntosJugador > 0){
                    System.out.println("                    Has realizado "+ puntosJugador +" puntos de daño");
                }
                
                if(resOrdenador == 4){ //Si el ordenador se intenta curar
                    System.out.println("             El enemigo intenttó recuperar 10 puntos de vida");
                }else if((resOrdenador == 1 || resOrdenador == 3) && puntosOrdenador > 0){
                    System.out.println("                  El enemigo te hace "+ puntosOrdenador +" puntos de daño");
                }
            
            }
            puntosJugador = puntosOrdenador = 0; //Reestablece los valores a 0
            // Comprobación de muertes y selección de nuevos personajes
            if (personajeJugador.getHp() <= 0) { //Muerte de un personaje del jugador
                System.out.println("  .-\"\"\"-.\n" +
                                    " / _   _ \\\n" +
                                    " ](_' `_)[   "+personajeJugador.getNombre() + " ha muerto\n" +
                                    " `-. ¨ ,-' \n" +
                                    "   |   |\n" +
                                    "   `---'");
                faccionJugador[pjSeleccionadoJugador] = personajeJugador; //Se guarda en el array el personaje con 0 de vida
                contMuertesJugador++; //Se aumenta el contador de personajes muertos
                if (contMuertesJugador == 4) { //Si el contador llega a 4...
                    ganador = false;
                    fin = true;
                } else {
                    res = elegirPersonaje(faccionJugador, "nuevo personaje"); //Se le pide al jugador elegir un nuevo personaje
                    pjSeleccionadoJugador = res - 1;
                    personajeJugador = faccionJugador[pjSeleccionadoJugador];
                }
            }
            if (personajeOrdenador.getHp() <= 0) { //Muerte de un personaje del ordenador
                System.out.println("  __\n" +
                                   "  ||\n" +
                                   "( || )\n" +
                                   "  ||\n" +
                                   "  ||  Has derrotado a "+personajeOrdenador.getNombre()+"\n" +
                                   "  ||\n" +
                                   "  ||\n" +
                                  "  \\/");
                faccionOrdenador[pjSeleccionadoOrdenador] = personajeOrdenador; //Se guarda en el array con 0 de vida
                contMuertesOrdenador++; //Aumenta el contador
                if (contMuertesOrdenador == 4) { //Si el contador llega a 4
                    ganador = true;
                    fin = true;
                } else {
                    do {
                        correcto = true;
                        resOrdenador = (int) (Math.random() * 4); //Genera un numero aleatorio para elegir personaje
                        if (faccionOrdenador[resOrdenador].getHp() <= 0) {
                            correcto = false; //Si elije un personaje con 0 de vida, se repite el bucle
                        } else {
                            personajeOrdenador = faccionOrdenador[resOrdenador];
                        }
                    } while (!correcto);
                    System.out.println(personajeOrdenador.getNombre() + " sale a luchar");
                }
            }
        } while (!fin);

        // Mensaje de resultado del juego
        fin(contMuertesJugador, contMuertesOrdenador, ganador, bandoJugador, bandoOrdenador);
    }
}
