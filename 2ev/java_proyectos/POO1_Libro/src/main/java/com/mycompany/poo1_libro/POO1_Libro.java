/**
 *
 * @author fsanj
 */

package com.mycompany.poo1_libro;

public class POO1_Libro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
            libro1.setAutor("Félix");
            libro1.setISBN(4567845);
            libro1.setNpags(24);
            libro1.setTitulo("Pegarle a la lejía");
            
        Libro libro2 = new Libro(7777777, "Cómo hablar con tu perro acerca de homosexualidad, comunismo y otros temas variados", "Juan Polaco", 149);
        
        System.out.println("El libro "+ libro1.getTitulo() +" con ISBN "+ libro1.getISBN() +" creado por el autor "+ libro1.getAutor() +" tiene "+ libro1.getNpags() +" páginas");
        System.out.println(libro2.toString());
        System.out.println();
        
        libro1.setNpags(150);
        if(libro1.getNpags() > libro2.getNpags()){
            System.out.println(libro1.getTitulo() +" tiene más páginas");
        }else{
            System.out.println(libro2.getTitulo() +" tiene más páginas");
        }
        
    }
}
