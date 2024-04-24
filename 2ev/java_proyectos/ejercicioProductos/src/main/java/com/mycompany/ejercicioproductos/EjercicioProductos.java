package com.mycompany.ejercicioproductos;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class EjercicioProductos {
      public static ArrayList<Producto> QuitarCongelados(ArrayList<Producto> listaProd, ArrayList<Congelado> listaCong){
        ArrayList<Producto> listaEliminar = new ArrayList<Producto>();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("ELIMINA LOS CONGELADOS:");
        for(Producto list : listaProd){
            for(Congelado list2 : listaCong){
                if(list.getNombre() == list2.getNombre()){
                    listaEliminar.add(list);
                }
            }
        }
        listaProd.removeAll(listaEliminar);
        return listaProd;
    }
    
    public static ArrayList<Producto> prodsFrancia(ArrayList<Fresco> listaFres){
        ArrayList<Producto> listaProdFR = new ArrayList<Producto>();
        for(Fresco list : listaFres){
            if(list.getPais() == "Francia"){
                listaProdFR.add(list);
            }
        }
        return listaProdFR;
    }
    
    
    

    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
       /*
        Producto pro1 = new Producto("12/3/2024", 4565);
        Fresco pro2 = new Fresco("12/3/2024", 4565, "10/10/2010", "Turkmenistan");
        Refrigerado pro3 = new Refrigerado("12/3/2024", 4565, 050);
        Congelado pro4 = new Congelado("12/3/2024", 4565, -2.5);
        
        System.out.println(pro1.getClass().getSimpleName() + pro1);
        System.out.println(pro2);
        System.out.println(pro3);
        System.out.println(pro4);
        
        System.out.println("--------------------------------------------------------------------");
        //ArrayList
        ArrayList<Producto> productos = new ArrayList();
        Producto prod1 = new Producto("15/5/2025", 333);
        productos.add(prod1);
        Producto prod2 = new Producto("1/6/2015", 313);
        productos.add(prod2);
        Producto prod3 = new Producto("5/9/2005", 33);
        productos.add(prod3);
        
        System.out.println("ArrayList de frescos");
        for(int i = 0; i < productos.size(); i++){
            System.out.println(productos.get(i));
        }
        
        
        ArrayList<Fresco> frescos = new ArrayList();
        Fresco fres1 = new Fresco("15/5/2025", 333, "4/6/2023", "Portugal");
        frescos.add(fres1);
        Fresco fres2 = new Fresco("1/6/2015", 313, "7/7/2023", "Alemania");
        frescos.add(fres2);
        Fresco fres3 = new Fresco("5/9/2005", 33, "1/6/2020", "Suiza");
        frescos.add(fres3);
        
        System.out.println("ArrayList de frescos");
        for(int i = 0; i < frescos.size(); i++){
            System.out.println(frescos.get(i));
        }
        
        
        ArrayList<Refrigerado> refrigerados = new ArrayList();
        Refrigerado refri1 = new Refrigerado("15/5/2025", 333, 6);
        refrigerados.add(refri1);
        Refrigerado refri2 = new Refrigerado("1/6/2015", 313, 8);
        refrigerados.add(refri2);
        Refrigerado refri3 = new Refrigerado("5/9/2005", 33, 4);
        refrigerados.add(refri3);
        
        System.out.println("ArrayList de refrigerados");
        for(int i = 0; i < frescos.size(); i++){
            System.out.println(refrigerados.get(i));
        }
        
        
        ArrayList<Congelado> congelados = new ArrayList();
        Congelado con1 = new Congelado("15/5/2025", 333, -6);
        congelados.add(con1);
        Congelado con2 = new Congelado("1/6/2015", 313, 0);
        congelados.add(con2);
        Congelado con3 = new Congelado("5/9/2005", 33, -4.5);
        congelados.add(con3);
        
        System.out.println("ArrayList de congelados");
        for(int i = 0; i < frescos.size(); i++){
            System.out.println(congelados.get(i));
        }
    */
       
       ArrayList<Congelado> listaCong = new ArrayList<Congelado>();
       Congelado cong1 = new Congelado("pescado","29/01/2024", 43310, -5);
       listaCong.add(cong1);
       Congelado cong2 = new Congelado("coliflor","09/10/2027", 8975, -18);
       listaCong.add(cong2);
       Congelado cong3 = new Congelado("judias","02/01/2024", 11210, -20);
       listaCong.add(cong3);
       Congelado cong4 = new Congelado("helado","25/04/2024", 313, -15);
       listaCong.add(cong4);

       ArrayList<Fresco> listaFres = new ArrayList<Fresco>();
       Fresco fres1 = new Fresco("tomates","03/04/2024", 777, "29/01/2024", "Francia");
       listaFres.add(fres1);
       Fresco fres2 = new Fresco("patatas","26/08/2026", 333, "20/01/2024", "España");
       listaFres.add(fres2);
       Fresco fres3 = new Fresco("pimientos","22/04/2034", 54321, "02/02/2024", "España");
       listaFres.add(fres3);
       Fresco fres4 = new Fresco("naranjas","01/01/2044", 909899, "09/01/2023", "Portugal");
       listaFres.add(fres4);
       
       ArrayList<Producto> listaProd = new ArrayList<Producto>();
       Producto prod1 = new Producto(cong1.getNombre(), cong1.getFechaCaducidad(), cong1.getNumLote());
       listaProd.add(prod1);
       Producto prod2 = new Producto(cong2.getNombre(), cong2.getFechaCaducidad(), cong2.getNumLote());
       listaProd.add(prod2);
       Producto prod3 = new Producto(cong3.getNombre(), cong3.getFechaCaducidad(), cong3.getNumLote());
       listaProd.add(prod3);
       Producto prod4 = new Producto(cong4.getNombre(), cong4.getFechaCaducidad(), cong4.getNumLote());
       listaProd.add(prod4);
       Producto prod5 = new Producto(fres1.getNombre(), fres1.getFechaCaducidad(), fres1.getNumLote());
       listaProd.add(prod5);
       Producto prod6 = new Producto(fres2.getNombre(), fres2.getFechaCaducidad(), fres2.getNumLote());
       listaProd.add(prod6);
       Producto prod7 = new Producto(fres3.getNombre(), fres3.getFechaCaducidad(), fres3.getNumLote());
       listaProd.add(prod7);
       Producto prod8 = new Producto(fres4.getNombre(), fres4.getFechaCaducidad(), fres4.getNumLote());
       listaProd.add(prod8);
       
       System.out.println("PRODUCTOS:");
       for(Producto list : listaProd){
             System.out.println(list);
       }
       
       System.out.println("----------------------------------------------------------------------");
       System.out.println("DE LOS CUALES SON CONGELADOS A MENOS DE -18:");
       for(Congelado list : listaCong){
           if(list.gettCongelacion() < -18){
             System.out.println(list);
           }
       }
       System.out.println("----------------------------------------------------------------------");
       System.out.println("DE LOS CUALES SON FRESCOS DE ESPAÑA:");
       for(Fresco list : listaFres){
           if(list.getPais() == "España"){
            System.out.println(list);
           }
       }
       
       listaProd = QuitarCongelados(listaProd, listaCong);
       for(Producto list : listaProd){
           System.out.println(list);
       }
       
        System.out.println("----------------------PRODUCTOS FRANCESES----------------------");
        ArrayList<Producto> listaProdFR = prodsFrancia(listaFres);
        for(Producto list : listaProdFR){
            System.out.println(list);
        }
        
       
       
    }
}
