import com.mycompany.worldofwarcraft.Guerrero;
import com.mycompany.worldofwarcraft.Mago;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author fsanj
 */

/**
 * Clase de prueba JUnit para las clases Mago y Guerrero.
 * 
 * Se prueban los constructores, los métodos de ataque, defensa, habilidad y curación.
 * 
 */
public class testPersonaje {
    private Mago pMago; // Objeto de tipo Mago
    private Guerrero pGuerrero; // Objeto de tipo Guerrero
    
    /**
     * Configuración previa a cada prueba.
     * Se inicializan los objetos Mago y Guerrero.
     */
    @BeforeEach
    public void configuración() {
        pMago = new Mago("Mago", 25, 10);
        pGuerrero = new Guerrero("Guerrero", 15, 20);
    }

    /**
     * Prueba para verificar que se construye correctamente un objeto Mago.
     */
    @Test
    public void testConstructorMago() {
        assertNotNull(pMago);
    }
    
    /**
     * Prueba para verificar que se construye correctamente un objeto Guerrero.
     */
    @Test
    public void testConstructorGuerrero() {
        assertNotNull(pGuerrero);
    }

    /**
     * Prueba para verificar que el método atacar de un Mago devuelve un valor mayor que cero.
     */
    @Test
    public void testAtacarMago() {
        int ataque = pMago.atacar();
        assertTrue(ataque > 0);
    }
    
    /**
     * Prueba para verificar que el método defender de un Guerrero devuelve un valor mayor que cero.
     */
    @Test
    public void testDefenderGuerrero() {
        int defensa = pGuerrero.defender();
        assertTrue(defensa > 0);
    }
    
    /**
     * Prueba para verificar que el método habilidad de un Mago no devuelve null.
     */
    @Test
    public void testHabilidadMago() {
        int habilidad = pMago.habilidad();
        assertNotNull(habilidad);
    }
    
    /**
     * Prueba para verificar que el método habilidad de un Guerrero no devuelve null.
     */
    @Test
    public void testHabilidadGuerrero() {
        int habilidad = pGuerrero.habilidad();
        assertNotNull(habilidad);
    }
    
    /**
     * Prueba para verificar que el método curar de un Mago aumenta la salud a 100 si está por debajo.
     */
    @Test
    public void testCurarMago() {
        pMago.setHp(90); // Establece la salud del Mago en 90
        while(pMago.getHp() == 90){ // Mientras la salud sea 90 (para garantizar que cura)
            pMago.curar(); // Curar al Mago
        }
        assertEquals(100, pMago.getHp()); // Comprueba si la salud se ha restablecido a 100
    }
}
