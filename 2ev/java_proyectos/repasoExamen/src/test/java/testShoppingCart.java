
import com.mycompany.repasoexamen.Product;
import com.mycompany.repasoexamen.ShoppingCart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 *
 * @author fsanj
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class testShoppingCart{
    Product p1 = new Product("a", 5);
    Product p2 = new Product("b", 27.35);
    
    @Test
    @Order(1)
    public void testEmpty(){
        ShoppingCart carrito = new ShoppingCart();
        carrito.addItem(p1);
        carrito.addItem(p2);
        carrito.empty();
        assertTrue(carrito.isEmpty());
        System.out.println("El carrito está vacio");
    }
    
    @Test
    @Order(2)
    public void testGetBalance(){
        ShoppingCart carrito = new ShoppingCart();
        carrito.addItem(p2);
        assertEquals(27.35, carrito.getBalance());
        System.out.println("El balance es 27.35");
    }
    
    @Test
    @Order(3)
    public void testGetItemCount(){
        ShoppingCart carrito = new ShoppingCart();
        carrito.addItem(p1);
        carrito.addItem(p2);
        assertEquals(2, carrito.getItemCount());
        System.out.println("Hay 2 productos");
    }
    
    @Test
    @Order(4)
    public void testNotNull(){
        ShoppingCart carrito = new ShoppingCart();
        assertNotNull(carrito);
        System.out.println("No es NULL");
    }
    
    @Test
    @Order(5)
    public void testCarritoNoVacio(){
        ShoppingCart carrito = new ShoppingCart();
        carrito.addItem(p1);
        assertFalse(carrito.isEmpty());
        System.out.println("No está vacío");
    }
    
    
    
    
   
}
