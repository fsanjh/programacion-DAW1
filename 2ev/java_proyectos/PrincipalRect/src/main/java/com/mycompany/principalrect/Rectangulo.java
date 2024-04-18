package com.mycompany.principalrect;

/**
 *
 * @author fsanj
 */
public class Rectangulo{
    private int ancho;
    private int alto;

    //CONSTRUCTOR
    public Rectangulo(int _ancho, int _alto) throws NumeroNegativo{
        if(_ancho < 0){
            throw new NumeroNegativo("No se permiten números negativos");
        }else if(_alto < 0){
            throw new NumeroNegativo("No se permiten números negativos");
        }else{
            this.ancho = _ancho;
            this.alto = _alto;
        }
    }

    //MOSTRAR DATOS DEL RECTANGULO
    public void mostrarDatos(){
        System.out.println("Ancho del rectángulo: " + this.ancho + "\nAlto del rectángulo: " + this.alto);
    }

    //VISUALIZAR RECTANGULO
    public void visualizar(){
        for(int i = 0; i < alto; i ++){
            for(int j = 0; j < ancho; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //CALCULAR AREA
    public int calcularArea(){
        return this.ancho * this.alto;
    }

    //VISUALIZAR CON OFFSET
    public void visualizar(int offset){
        for(int i = 0; i < alto; i ++){
            for(int k = 0; k < offset; k ++){
                System.out.print(" ");
            }
            for(int j = 0; j < ancho; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //GETTER & SETTER
    public int getAncho(){
        return ancho;
    }

    public void setAncho(int _ancho)throws NumeroNegativo{
        if(_ancho < 0){
            throw new NumeroNegativo("No se permiten números negativos");
        }else{
            this.ancho = _ancho;
        }
    }

    public int getAlto(){
        return alto;
    }

    public void setAlto(int _alto)throws NumeroNegativo{
        if(_alto < 0){
            throw new NumeroNegativo("No se permiten números negativos");
        }else{
            this.ancho = _alto;
        }
    }

}
