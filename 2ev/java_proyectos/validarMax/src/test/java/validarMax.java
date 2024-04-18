/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nocturno
 */
public class validarMax{

    public validarMax(){
    }

    public boolean valMax(int maximo){
        boolean max = false;
        for(int i = 0; i < maximo; i ++){
            if(i == 3){
                max = true;
            }
        }
        return max;
    }

    @Test
    public void testValidarMax(){
        assertFalse(valMax(3), "no es false");
    }

    @Test
    public void testValidarMax2(){
        assertTrue(valMax(4), "no es true");
    }

    @Test
    public void testAssertNotNull(){
        List<String> nombres = new ArrayList<String>();

        assertNotNull(nombres, "está null");
        System.out.println("assertnotnull");
        for(int i = 0; i < 3; i ++){
            if(i == 2){
                nombres = null;
            }
        }
        assertNull(nombres, "está null");
        System.out.println("assertnull");
    }

    @Test
    public void notSame(){
        boolean esMax = valMax(4);
        boolean noEsMax = valMax(3);

        assertNotSame(esMax, noEsMax, "son iguale");
        assertSame(esMax, noEsMax, "no son iguale");

    }

}
