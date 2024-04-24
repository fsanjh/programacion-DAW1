/**
 *
 * @author fsanj
 */

package com.mycompany.poo14_figurassuperheroes;

import java.util.ArrayList;

public class Coleccion {
    private String nombreColeccion;
    private Figura[] listaFiguras = new Figura[0];
    
    public Coleccion(String _nombreColeccion){
        this.nombreColeccion = _nombreColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public Figura[] getListaFiguras() {
        return listaFiguras;
    }
    public void setListaFiguras(Figura[] listaFiguras) {
        this.listaFiguras = listaFiguras;
    }
    
    public void añadirFigura(Figura fig) {
        Figura[] nuevoArray = new Figura[listaFiguras.length + 1]; //Creo un array del tamaño del array original + 1
        boolean repetido = false;

        for (int i = 0; i < listaFiguras.length; i++) {
            if (fig.getCodigo() == this.listaFiguras[i].getCodigo()) {
                repetido = true;
                break; // Salir del al encontrar una figura repetida
            }
        }
        if (repetido) {
            System.out.println("Ya existe una figura con el código: "+ fig.getCodigo());
        } else {
            System.out.println("Figura añadida: "+ fig.getCodigo());
            // Copiar elementos de listaFiguras a nuevoArray
            for (int i = 0; i < listaFiguras.length; i++) {
                nuevoArray[i] = listaFiguras[i];
            }
            // Agregar la nueva figura al final de nuevoArray
            nuevoArray[nuevoArray.length - 1] = fig;
            // Actualizar listaFiguras con el nuevoArray, asi listaFiguras tiene de tamaño + 1 al original
            this.listaFiguras = nuevoArray;
        }
    }
    
    public void subirPrecio(double cant, String id){
        for(int i = 0; i < this.listaFiguras.length; i++){
            if(this.listaFiguras[i].getCodigo() == id){
                this.listaFiguras[i].subirPrecio(cant);
            }
        }
    }

    @Override
    public String toString() {
        String cadena = "Colección "+nombreColeccion+"\n---------------\n";
        
        for(int i = 0; i < listaFiguras.length; i++){
            cadena += listaFiguras[i] +"\n\n";
        }
        return cadena;
    }
    
    public void conCapa(){
        System.out.println("Figuras con capa: ");
        for(int i = 0; i < listaFiguras.length; i++){
            if(listaFiguras[i].getSuperh().isCapa()){
                System.out.print(listaFiguras[i].getSuperh().getNombre() +"|");
            }
        }
        System.out.println();
    }
    
    public double masValioso(){
        Figura mayor = null;
        for(int i = 0; i < listaFiguras.length-1; i++){
            mayor = listaFiguras[i];
            if(mayor.getPrecio() < listaFiguras[i+1].getPrecio()){
                mayor = listaFiguras[i+1];
            }
        }
        System.out.println("La figura de mayor valor es: "+ mayor.getSuperh().getNombre());
        return mayor.getPrecio();
    }
    
    public void getValorColeccion(){
        double total = 0;
        for(int i = 0; i < listaFiguras.length; i++){
            total += listaFiguras[i].getPrecio();
        }
        System.out.println("Valor total de la coleccion: "+ total);
    }
    
    public void getVolumenColeccion(){
        double volTotal = 0;
        for(int i = 0; i < listaFiguras.length; i++){
            volTotal += listaFiguras[i].getDimen().getVolumen(listaFiguras[i].getDimen().getAlto(), listaFiguras[i].getDimen().getAncho(), listaFiguras[i].getDimen().getProfundidad());
        }
        System.out.println("El volumen total de la colección es: "+ (volTotal+200));
    }
    
    
    /*Con ArrayList*/
    private ArrayList<Figura> listaFiguras2 = new ArrayList<Figura>();

    public ArrayList<Figura> getListaFiguras2() {
        return listaFiguras2;
    }
    public void setListaFiguras2(ArrayList<Figura> listaFiguras2) {
        this.listaFiguras2 = listaFiguras2;
    } 
    
    public void añadirFigura2(Figura fig) {
        boolean repetido = false;
        for (int i = 0; i < listaFiguras2.size(); i++) {
            if (fig.getCodigo() == this.listaFiguras2.get(i).getCodigo()) {
                repetido = true;
                break; // Salir al encontrar una figura repetida
            }
        }
        if (repetido) {
            System.out.println("Ya existe una figura con el código: "+ fig.getCodigo());
        } else {
            this.listaFiguras2.add(fig);
            System.out.println("Figura añadida: "+ fig.getCodigo());
        }
    }
    public void subirPrecio2(double cant, String id){
        for(int i = 0; i < this.listaFiguras2.size(); i++){
            if(this.listaFiguras2.get(i).getCodigo() == id){
                this.listaFiguras[i].subirPrecio(cant);
            }
        }
    }

    public String toString2() {
        String cadena = "Colección "+nombreColeccion+"\n---------------\n";
        
        for(int i = 0; i < listaFiguras2.size(); i++){
            cadena += listaFiguras2.get(i) +"\n\n";
        }
        return cadena;
    }
    
    public void conCapa2(){
        System.out.println("Figuras con capa");
        for(int i = 0; i < listaFiguras2.size(); i++){
            if(listaFiguras2.get(i).getSuperh().isCapa()){
                System.out.print(listaFiguras2.get(i).getSuperh().getNombre() +"|");
            }
        }
        System.out.println();
    }
    
    public void masValioso2(){
        Figura mayor = null;
        for(int i = 0; i < listaFiguras2.size()-1; i++){
            mayor = listaFiguras2.get(i);
            if(mayor.getPrecio() < listaFiguras2.get(i+1).getPrecio()){
                mayor = listaFiguras2.get(i+1);
            }
        }
        System.out.println("La figura de mayor valor es: "+ mayor.getSuperh().getNombre());
    }
    
    public void getValorColeccion2(){
        double total = 0;
        for(int i = 0; i < listaFiguras2.size(); i++){
            total += listaFiguras2.get(i).getPrecio();
        }
        System.out.println("Valor total de la coleccion: "+ total);
    }
    
    public void getVolumenColeccion2(){
        double volTotal = 0;
        for(int i = 0; i < listaFiguras2.size(); i++){
            volTotal += listaFiguras2.get(i).getDimen().getVolumen(listaFiguras2.get(i).getDimen().getAlto(), listaFiguras2.get(i).getDimen().getAncho(), listaFiguras2.get(i).getDimen().getProfundidad());
        }
        System.out.println("El volumen total de la colección es: "+ (volTotal+200));
    }
}
