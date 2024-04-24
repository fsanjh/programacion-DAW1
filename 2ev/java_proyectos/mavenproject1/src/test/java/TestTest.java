/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mavenproject1.Factorial;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Nocturno
 */
public class TestTest {
    
    public TestTest() {
    }
    
    @Disabled
    @Test
    void testFactorial(){
        int factorial = 120;
        Factorial fact1 = new Factorial(5);
        assertEquals(factorial, fact1.calcular());
    }
    
    @Test
    @Timeout(value=1, unit=TimeUnit.MICROSECONDS)
    public void testFactorialTimeout(){
        System.out.println("factorial con timeout");
        int num = 120;
        Factorial instance = new Factorial(5);
        assertEquals(num, instance.calcular());
    
    
    }
    
    
    
}
