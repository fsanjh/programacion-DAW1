
import com.mycompany.ejahorcado.Ahorcado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author fsanj
 */
public class testAhorcado{
     private Ahorcado ahorcado;

    @BeforeAll
    public void setUp() {
        ahorcado = new Ahorcado();
    }

    @Test
    public void testObtenerPalabraSecretaLongitudCorrecta() {
        String palabra = ahorcado.obtenerPalabraSecreta();
        assertTrue(palabra.length() >= 5); // Asumiendo que todas las palabras tienen al menos 5 letras
    }

    @Test
    public void testGenerarEspaciosCorrectamente() {
        String palabraSecreta = "test";
        String[] espacios = ahorcado.generarEspacios(palabraSecreta);
        assertEquals(4, espacios.length);
        for (String espacio : espacios) {
            assertEquals("_", espacio);
        }
    }

    @Test
    public void testVerificarEspaciosConEspaciosVacios() {
        String[] espacios = {"_", "_", "_", "_"};
        assertTrue(ahorcado.verificarEspacios(espacios));
    }

    @Test
    public void testVerificarEspaciosSinEspaciosVacios() {
        String[] espacios = {"t", "e", "s", "t"};
        assertFalse(ahorcado.verificarEspacios(espacios));
    }

    // Repetimos el test para distintas palabras, asegurando que la lógica de selección aleatoria funciona correctamente
    @Test
    public void testObtenerPalabraSecretaEsUnaDeLasOpciones() {
        boolean match = false;
        for (int i = 0; i < 100; i++) { // Realizamos múltiples pruebas para asegurarnos
            String palabra = ahorcado.obtenerPalabraSecreta();
            for (String opcion : new String[]{"informatica", "programacion", "encapsulacion", "codigo",
                    "programa", "software", "moliner", "abstraccion", 
                    "polimorfismo", "herencia", "sobrecarga", "interfaces"}) {
                if (palabra.equals(opcion)) {
                    match = true;
                    break;
                }
            }
            if (match) break;
        }
        assertTrue(match);
    }
    
    
}
