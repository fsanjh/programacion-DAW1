
/**
 *
 * @author fsanj
 */

package com.mycompany.poo14_figurassuperheroes;

public class POO14_figurasSuperheroes {

    public static void main(String[] args) {
    /*
        //Comprobaciones de la clase superheroe
        System.out.println("-----------SUPERHEROE-----------");
        //Creo el objeto Superheroe con el nombre Mondongo
        Superheroe heroe1 = new Superheroe ("Mondongo");
        //Veo si el superheroe tiene capa
        System.out.println("Capa: "+ heroe1.isCapa());
        //Le pongo capa
        heroe1.setCapa(true);
        //Veo todas las propiedades del superheroe
        System.out.println(heroe1.toString());
        System.out.println();
        //Le asigno una descripción
        heroe1.setDesc("Maéstro pokemon tercero del mundo");
        //Vuelvo a ver las propiedades del superheroe
        System.out.println(heroe1.toString());
        
        System.out.println();
        //Creo otro objeto superheroe
        Superheroe heroe2 = new Superheroe ("Spiderman");
        heroe2.setDesc("El hombre araña");
        System.out.println(heroe2.toString());
        //Más...
        System.out.println();
        Superheroe heroe3 = new Superheroe ("Iron-man");
        heroe3.setDesc("El multimillonario Tony Stark");
        System.out.println(heroe3.toString());
        
        System.out.println();
        Superheroe heroe4 = new Superheroe ("Capitan America");
        heroe4.setDesc("El supersoldado Steve Rogers");
        System.out.println(heroe4.toString());
        
        System.out.println();
        Superheroe heroe5 = new Superheroe ("Dr. Strange");
        heroe5.setCapa(true);
        heroe5.setDesc("Un hechicero");
        System.out.println(heroe5.toString());
        //Comprobaciones de la clase dimension
        System.out.println("-----------DIMENSION-----------");
        //Creo el objeto con las dimensiones
        Dimension dim1 = new Dimension();
        System.out.println(dim1.toString());
        dim1.setAlto(25);
        dim1.setAncho(5);
        dim1.setProfundidad(5);
        System.out.println();
        System.out.println(dim1.toString());
        //Creo una segunda dimension
        Dimension dim2 = new Dimension();
        System.out.println(dim2.toString());
        dim2.setAlto(20);
        dim2.setAncho(8);
        dim2.setProfundidad(10);
        //Comprobaciones de la clase figura
        System.out.println("-----------FIGURA-----------");
        //Creo las figuras con un codigo unico, un precio y los objetos de dimensiones y de superheroe
        Figura fig1 = new Figura("AA22", 25.5, dim1, heroe1);
        Figura fig2 = new Figura("BB11", 20.5, dim2, heroe2);
        Figura fig3 = new Figura("CC33", 5, dim2, heroe3);
        Figura fig4 = new Figura("DD44", 50.5, dim1, heroe4);
        Figura fig5 = new Figura("AA22", 5.5, dim2, heroe5);
        //Muestro las propìedades de la fig1
        System.out.println(fig1.toString());
        //Subo su precio en 5
        fig1.subirPrecio(5);
        System.out.println();
        System.out.println(fig1.toString());
        //Comprobaciones de la clase Coleccion
        System.out.println("-----------COLECCION-----------");
        Coleccion col1 = new Coleccion("Marvel"); //Creo la coleccion 
        //Añado las figuras a la coleccion, la figura 5 no la añadira por tener un codigo repetido
        col1.añadirFigura(fig1);
        col1.añadirFigura(fig2);
        col1.añadirFigura(fig3);
        col1.añadirFigura(fig4);
        col1.añadirFigura(fig5);
        System.out.println();
        //Muestro la coleccion
        System.out.println(col1.toString());
        //Muestro la figura mas valiosa de la coleccion
        col1.subirPrecio(60, "CC33");
        col1.masValioso();
        //Veo el valor de toda la coleccion
        col1.getValorColeccion();
        //Veo el volumen total de la coleccion
        col1.getVolumenColeccion();
        
        
        //ArrayList
        col1.añadirFigura2(fig1);
        col1.añadirFigura2(fig2);
        col1.añadirFigura2(fig3);
        col1.añadirFigura2(fig4);
        col1.añadirFigura2(fig5);
        System.out.println();
        //Muestro la coleccion
        System.out.println(col1.toString2());
        //Muestro la figura mas valiosa de la coleccion
        col1.subirPrecio2(60, "CC33");
        col1.masValioso2();
        //Veo el valor de toda la coleccion
        col1.getValorColeccion2();
        //Veo el volumen total de la coleccion
        col1.getVolumenColeccion2();
    */
    
        
        Coleccion col1 = new Coleccion("Marvel");
        //FIGURA 1
        Superheroe heroe1 = new Superheroe ("Mondongo");
        heroe1.setCapa(true);
        heroe1.setDesc("Maéstro pokemon tercero del mundo");
        Dimension dim1 = new Dimension();
        dim1.setAlto(25);
        dim1.setAncho(5);
        dim1.setProfundidad(5);
        Figura fig1 = new Figura("AA22", 25.5, dim1, heroe1);
        col1.añadirFigura(fig1);
        //FIGURA 2
        Superheroe heroe2 = new Superheroe ("Torrente");
        heroe2.setDesc("La mano tonta y gorda de la ley");
        Dimension dim2 = new Dimension();
        dim2.setAlto(20);
        dim2.setAncho(10);
        dim2.setProfundidad(10);
        Figura fig2 = new Figura("BB22", 35.5, dim2, heroe2);
        fig2.subirPrecio(5);
        col1.añadirFigura(fig2);
        //FIGURA 3
        Superheroe heroe3 = new Superheroe ("Cálico Electrónico");
        heroe3.setCapa(true);
        heroe3.setDesc("El gordo con traje");
        Dimension dim3 = new Dimension();
        dim3.setAlto(10);
        dim3.setAncho(7);
        dim3.setProfundidad(7);
        Figura fig3 = new Figura("FF22", 20.5, dim3, heroe3);
        col1.añadirFigura(fig3);
        col1.añadirFigura(fig3);
        col1.subirPrecio(2, "FF22");
        //MUESTRO LA COLECCION CON ARRAY NORMAL
        System.out.println(col1.toString());
        col1.conCapa();
        col1.masValioso();
        col1.getValorColeccion();
        col1.getVolumenColeccion();
        
        
        Coleccion col2 = new Coleccion("DC Comics");
        Figura fig4 = new Figura("FF22", 700, dim3, heroe3);
        col2.añadirFigura(fig4);
        Figura fig5 = new Figura("FS22", 700, dim3, heroe3);
        col2.añadirFigura(fig5);
        
        if(col1.masValioso() > col2.masValioso()){
            System.out.println("La colección 1 es más valiosa");
        }else{
            System.out.println("La colección 2 es más valiosa");
        }
        
        
        //ArrayList
        /*
        System.out.println("--------ARRAYLIST--------");
        col1.añadirFigura2(fig1);
        col1.añadirFigura2(fig2);
        col1.añadirFigura2(fig3);
        System.out.println(col1.toString2());
        col1.conCapa2();
        col1.masValioso2();
        col1.getValorColeccion2();
        col1.getVolumenColeccion2();
        */
        
        
    }
}
