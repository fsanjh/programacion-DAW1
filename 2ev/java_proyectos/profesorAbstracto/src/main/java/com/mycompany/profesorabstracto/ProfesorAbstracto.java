
package com.mycompany.profesorabstracto;

import java.util.Calendar;

/**
 *
 * @author Nocturno
 */
public class ProfesorAbstracto {

    public static void main(String[] args) {
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, 02, 05);
        
        ProfesorTitular pt1 = new ProfesorTitular("Illidan", "Tempestira", 270, "1DH");
        ProfesorTitular pt2 = new ProfesorTitular("Arthas", "Menethil", 19, "LKICC");
        
        ProfesorInterino pi1 = new ProfesorInterino("Thrall,", "hijo de Durotan", 500, "LdH", fecha1);
        ProfesorInterino pi2 = new ProfesorInterino("Anduin", "Wrynn", 17, "LdA", fecha1);
        
        ListaProfesores lista = new ListaProfesores();
        lista.addProf(pt1);
        lista.addProf(pt2);
        lista.addProf(pi1);
        lista.addProf(pi2);
        lista.mostrarProfs();
        System.out.println("-----------------------------------------------");
        lista.deleteProf(pi2);
        lista.mostrarProfs();
        System.out.println("Nomina total: "+lista.nominaTotal());
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
