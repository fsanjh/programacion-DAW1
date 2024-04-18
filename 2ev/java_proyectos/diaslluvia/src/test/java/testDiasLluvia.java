
import com.mycompany.diaslluvia.DiasLluviosos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nocturno
 */
public class testDiasLluvia{
    
    public testDiasLluvia(){
    }

    @Test
    public void testConsultarSiLlovio(){
        DiasLluviosos d = new DiasLluviosos();
        d.registarQueLlovioElDia(1, true);
        
        assertTrue(d.consultarSiLlovioElDia(1));
    }
    
    @Test
    public void testContarDiasLluviosos(){
        DiasLluviosos d = new DiasLluviosos();
        d.registarQueLlovioElDia(1, true);
        d.registarQueLlovioElDia(2, false);
        d.registarQueLlovioElDia(3, true);
        d.registarQueLlovioElDia(4, false);
        d.registarQueLlovioElDia(5, true);
        d.registarQueLlovioElDia(6, false);
        d.registarQueLlovioElDia(7, false);
        d.registarQueLlovioElDia(8, true);
        d.registarQueLlovioElDia(9, true);
        d.registarQueLlovioElDia(10, false);
        
        assertEquals(5, d.contarDiasLluviosos());
    }
    
    @Test
    public void testConsultarCuatri(){
        DiasLluviosos d = new DiasLluviosos();
        for(int i = 1; i < 367; i++){
            d.registarQueLlovioElDia(i, (boolean)(Math.random() < 0.5));
        }
        assertEquals(1, d.consultarCuatrimestreMasLluvioso());
    }
    
    @Test
    public void testPrimerDia(){
        DiasLluviosos d = new DiasLluviosos();
        d.registarQueLlovioElDia(1, false);
        d.registarQueLlovioElDia(2, false);
        d.registarQueLlovioElDia(3, true);
        d.registarQueLlovioElDia(4, false);
        d.registarQueLlovioElDia(5, true);
        d.registarQueLlovioElDia(6, false);
        d.registarQueLlovioElDia(7, false);
        d.registarQueLlovioElDia(8, true);
        d.registarQueLlovioElDia(9, true);
        d.registarQueLlovioElDia(10, false);
        assertEquals(3, d.consultarPrimerDiaConLluvia());
    }
    
    
    
}
