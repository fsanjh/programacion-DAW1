/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poo2_circulo.Circulo;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Nocturno
 */
public class circuloTest {
    
    public circuloTest() {
    }
    
    @Test
    public void testVolumen(){
        int res= 392;
        Circulo cir1 = new Circulo(5);
        assertEquals(res, cir1.volumen());
    }
    
    @Test
    public void testDiametro(){
        int d= 25;
        Circulo cir1 = new Circulo(5);
        assertEquals(d, cir1.diametro());
    }
    
    @Test
    public void testArea(){
        int a= 78;
        Circulo cir1 = new Circulo(5);
        assertEquals(a, cir1.area());
    }
    
    @Test
    @Timeout(value=10, unit=TimeUnit.MICROSECONDS)
    public void testFactRadio(){
        int fact= 125;
        Circulo cir1 = new Circulo(5);
        assertEquals(fact, cir1.factRadio());
    }
    
    
    
    
    
}
