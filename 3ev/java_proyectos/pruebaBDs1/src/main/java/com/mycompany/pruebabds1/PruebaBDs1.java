
package com.mycompany.pruebabds1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fsanj
 */
public class PruebaBDs1 {

    public static void main(String[] args) {
        try{
            String url = "jdbc:mariadb://localhost:3307/tienda";
            Connection conn = DriverManager.getConnection(url, "root", "root");   
            Statement stmt = (Statement) conn.createStatement();
            String select1 = "SELECT * FROM producto WHERE pais = 'Espana';";
            String query1 = "INSERT INTO tienda.producto VALUES ('01', 'Cochinillo', 'Tipico de Segovia', '45', 'Espana');";
            String query2 = "INSERT INTO tienda.producto VALUES ('02', 'Torreznos', 'Sanísimos', '15', 'Espana');";
            String query3 = "INSERT INTO tienda.producto VALUES ('03', 'Calamar', 'Calamardo', '10', 'Portugal');";
            int filasInsertadas = 0;
            //filasInsertadas = stmt.executeUpdate(query1);
            //filasInsertadas = stmt.executeUpdate(query2);
            //filasInsertadas = stmt.executeUpdate(query3);
            System.out.println("\nFilas insertadas: "+ filasInsertadas);
            
            ResultSet result = stmt.executeQuery(select1);
            System.out.println("\nListado productos españoles: ");
            while(result.next()){
                System.out.println("-Producto: "+ result.getString("nombre"));
            }
            
            String query4 = "UPDATE tienda.producto SET nombre = 'Ponche Segoviano' WHERE nombre = 'Cochinillo';";
            int filasActualizadas = 0;
            filasActualizadas = stmt.executeUpdate(query4);
            System.out.println("\nFilas actualizadas: "+ filasActualizadas);
            String select2 = "SELECT * FROM tienda.producto;";
            result = stmt.executeQuery(select2);
            System.out.println("Listado cambiado: ");
            while(result.next()){
                System.out.println("-Producto: "+ result.getString("nombre"));
            }
            
            String query5 = "DELETE FROM tienda.producto WHERE pais = 'Portugal';";
            int filasEliminadas = 0;
            filasEliminadas = stmt.executeUpdate(query5);
            System.out.println("\nFilas eliminadas: "+ filasEliminadas);
            result = stmt.executeQuery(select2);
            System.out.println("Listado cambiado: ");
            while(result.next()){
                System.out.println("-Producto: "+ result.getString("nombre"));
            }
            
            
            
            
            stmt.close();
            conn.close();
        }catch(SQLException sqle1){
            System.out.println("SQLException: "+ sqle1.getMessage());
        
        }
        
        
        
    }
}
