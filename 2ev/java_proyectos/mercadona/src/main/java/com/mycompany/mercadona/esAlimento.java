package com.mycompany.mercadona;

import java.time.LocalDate;

/**
 *
 * @author Nocturno
 */
public interface esAlimento{
    public void setCaducidad(LocalDate fc);
    public LocalDate getCaducidad();
    public int getCalorias(); 
    
}
