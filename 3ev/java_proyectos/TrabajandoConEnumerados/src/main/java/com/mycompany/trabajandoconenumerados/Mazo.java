package com.mycompany.trabajandoconenumerados;

/**
 *
 * @author fsanj
 */
public class Mazo{
    Carta[] mazo = new Carta[40]; //Array mazo donde iran las 40 cartas de la baraja

    public Mazo(){ //Constructor encargado de meter todas las cartas de la baraja española en el array
        Carta.Palo[] palos = Carta.Palo.values(); //Array con los valores del enum de los Palos
        int index = 0; //Indice
        for(Carta.Palo palo : palos){ //Bucle for para rellenar cada hueco del mazo con cada palo
            for(int i = 1; i <= 7; i ++){ //Cartas del 1 al 7 del palo de la iteración actual
                mazo[index ++] = new Carta(i, palo);
            }
            for(int i = 10; i <= 12; i ++){ //Cartas del 10 al 12 del palo actual
                mazo[index ++] = new Carta(i, palo);
            }
        }
    }

    public void imprimirMazo(){ //Muestra todas las cartas del mazo
        for(int i = 0; i < this.mazo.length; i ++){
            System.out.println(this.mazo[i].getNumCarta() + " de " + this.mazo[i].getPaloCarta().name());
            if((i + 1) % 10 == 0){
                System.out.println("-------------");
            }
        }
    }

    public int sacarCarta(){ //Saca cartas del mazo y devuelve puntos dependiendo de la carta
        int puntos = 0;
        int indexRand = 0;
        int intentos = 0;
        do{ //Bucle para sacar siempre una carta aleatoria, en caso de no quedar cartas muestra un mensaje
            indexRand = (int) (Math.random() * 40);
            if(mazo[indexRand] == null){
                intentos ++;
            }
            if(intentos == 39){
                System.out.println("No quedan más cartas");
                break;
            }
        }while(mazo[indexRand] == null);
        if(intentos != 39){ //Si se ha conseguido sacar una carta
            Carta cartaAleatoria = mazo[indexRand];
            System.out.println("La carta sacada es el " + cartaAleatoria.getNumCarta() + " de " + cartaAleatoria.getPaloCarta().name());
            mazo[indexRand] = null;

            if(cartaAleatoria.getPaloCarta() == Carta.Palo.OROS){
                System.out.println("Ganas 4 puntos");
                puntos = 4;
            }else if(cartaAleatoria.getPaloCarta() == Carta.Palo.COPAS){
                System.out.println("Ganas 3 puntos");
                puntos = 3;
            }else if(cartaAleatoria.getPaloCarta() == Carta.Palo.ESPADAS){
                System.out.println("Ganas 2 puntos");
                puntos = 2;
            }else{
                System.out.println("Ganas 1 puntos");
                puntos = 1;
            }
        }

        return puntos;
    }

}
