/**
 *
 * @author fsanj
 */

package com.mycompany.poo1_libro;

public class Libro {
  //VARIABLES
    private int ISBN;
    private String titulo;
    private String autor;
    private int npags;
    
  //CONSTRUCTORES
    public Libro(){}
    
    public Libro(int _ISBN, String _titulo, String _autor, int _npags) {
        ISBN = _ISBN;
        titulo = _titulo;
        autor = _autor;
        npags = _npags;
    }
        
  //MÉTODOS
    /*ISBN*/
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    /*Titulo*/
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /*Autor*/
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    /*Páginas*/
    public int getNpags() {
        return npags;
    }
    public void setNpags(int npags) {
        this.npags = npags;
    }
    
    /*toString*/
    public String toString() {
        return "El libro "+ titulo +" con ISBN "+ ISBN +" creado por el autor "+ autor +" tiene "+ npags +" páginas";
    }
    
    
    
    
}
