
package com.mycompany.pruebadate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author fsanj
 */
public class PruebaDate {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println("---------------------------");
        
        long ms = System.currentTimeMillis();
        Date date2 = new Date(ms);
        System.out.println(date2);
        System.out.println("---------------------------");
        
        
        Date date3 = new Date(10);
        Date date4 = new Date();
        
        System.out.println("Date3: "+ date3);
        System.out.println("Date4: "+ date4);
        System.out.println("Es date3 antes de date4: "+ date3.before(date4));
        System.out.println("Es date3 despues de date4: "+ date3.after(date4));
        System.out.println("---------------------------");
        
        
        System.out.println("Es el año 2024 bisiesto: "+ Year.isLeap(2024) );
        System.out.println("---------------------------");
        
        
        LocalDate fecha1 = LocalDate.parse("2003-06-03");
        LocalDate fecha2   = LocalDate.parse("2024-04-03");
        long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
        System.out.println(dias +" días");
        System.out.println("---------------------------");
        
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(1990, 12, 20));
        DateFormat formatter = new SimpleDateFormat("EEEE");
        String dayOfWeekString = formatter.format(cal.getTime());

        System.out.println("Dia de la semana: " + dayOfWeekString);
        System.out.println("---------------------------");
        
        
        Date d1 = new Date();
        Date d2 = new Date();
        d1.setHours(10); d1.setMinutes(15);
        d2.setHours(12);d2.setMinutes(30);
        long seconds = (d2.getTime()-d1.getTime())/1000;
        System.out.println(seconds +" segundos de diferencia");
        System.out.println("---------------------------");
        
        
        Date fechaNac = new Date(2003, 06, 03);
        Date fechaAct = new Date(2024, 04, 03);
        System.out.println(((fechaAct.getTime()-fechaNac.getTime())/1000) +" segundos de vida");
        System.out.println("---------------------------");
        
        
        
        
        
        
        
    }
}
