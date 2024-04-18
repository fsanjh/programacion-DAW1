
package com.mycompany.ejempresa;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author fsanj
 */
public class EjEmpresa {
    public static void main(String[] args) {
        System.out.println("        PRUEBAS TRABAJO PINTURA        ");
        Date fecha1 = new Date(2023, 02, 28);
        Servicio s1 = new TrabajoPintura("Pedro", fecha1, "Juan", 30, 25);
        System.out.println(s1.detalleServicio());
        System.out.println("---------------------------------------");
        Date fecha2 = new Date(2023, 02, 28);
        Servicio s2 = new TrabajoPintura("Alberto", fecha2, "Marta", 80, 15);
        System.out.println(s2.detalleServicio());
        
        System.out.println("        PRUEBAS REVISIÓN ALARMA        ");
        Date fecha3 = new Date(2023, 02, 28);
        Servicio s3 = new RevisionAlarma(fecha3, "Bonifacio", 4);
        System.out.println(s3.detalleServicio());
        System.out.println("---------------------------------------");
        Date fecha4 = new Date(2023, 02, 28);
        Servicio s4 = new RevisionAlarma(fecha4, "Mark", 20);
        System.out.println(s4.detalleServicio());
        
        System.out.println("               ARRAYLIST               ");
        ArrayList<Servicio> lista = new ArrayList();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        lista.add(s4);
        double costesTotales = 0;
        double sueldosTotales = 0;
        for(Servicio s : lista){
            costesTotales = costesTotales + s.costeTotal();
            sueldosTotales = sueldosTotales + s.costeManoObra();
        }
        System.out.println("El coste total de todos los trabajos es: "+ String.format("%.2f", costesTotales) +"€");
        System.out.println("Total de los sueldos recaudados: "+ String.format("%.2f", sueldosTotales) +"€");
        
        
        
        
        
        
        
        
        
    }
}
