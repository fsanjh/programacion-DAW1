package com.mycompany.pruebabds1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class PruebaBDs1{

    public static void main(String[] args){
        try{
            /*
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
            System.out.println("\nFilas insertadas: " + filasInsertadas);

            ResultSet result = stmt.executeQuery(select1);
            System.out.println("\nListado productos españoles: ");
            while(result.next()){
                System.out.println("-Producto: " + result.getString("nombre"));
            }
            String query4 = "UPDATE tienda.producto SET nombre = 'Ponche Segoviano' WHERE nombre = 'Cochinillo';";
            int filasActualizadas = 0;
            filasActualizadas = stmt.executeUpdate(query4);
            System.out.println("\nFilas actualizadas: " + filasActualizadas);
            String select2 = "SELECT * FROM tienda.producto;";
            result = stmt.executeQuery(select2);
            System.out.println("Listado cambiado: ");
            while(result.next()){
                System.out.println("-Producto: " + result.getString("nombre"));
            }
            String query5 = "DELETE FROM tienda.producto WHERE pais = 'Portugal';";
            int filasEliminadas = 0;
            filasEliminadas = stmt.executeUpdate(query5);
            System.out.println("\nFilas eliminadas: " + filasEliminadas);
            result = stmt.executeQuery(select2);
            System.out.println("Listado cambiado: ");
            while(result.next()){
                System.out.println("-Producto: " + result.getString("nombre"));
            }
             */
            
            
            
            String url = "jdbc:mariadb://localhost:3307/tienda";
            Connection conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet result;
            Scanner input = new Scanner(System.in);
            int nums;
            String cadena;
                do{
                    try{
                    System.out.println("Bienvenido a la tabla Producto de la BD Tienda");
                    System.out.println("    1- Mostrar la tabla");
                    System.out.println("    2- Insertar un producto");
                    System.out.println("    3- Modificar un producto");
                    System.out.println("    4- Elimnar un producto");
                    System.out.println("    5- Salir");
                    System.out.print("Respuesta: ");
                    nums = input.nextInt();
                    switch(nums){
                        case 1 -> {
                            result = stmt.executeQuery("SELECT * FROM tienda.producto;");
                            System.out.println("| id | nombre | descripcion | precio | pais |");
                            System.out.println("---------------------------------------------");
                            while(result.next()){
                                System.out.println("| " + result.getString(1) + " | " + result.getString(2) + " | " + result.getString(3) + " | " + result.getString(4) + " | " + result.getString(5));
                            }
                        }
                        case 2 -> {
                            String query = "INSERT INTO tienda.producto VALUES(";
                            result = stmt.executeQuery("SELECT * FROM tienda.producto;");
                            int id = 01;
                            while(result.next()){
                                if(Integer.parseInt(result.getString(1)) == id){
                                    id ++;
                                }
                            }
                            query += "'0" + id + "', ";

                            System.out.print("Introduzca un nombre: ");
                            cadena = input.next() + input.nextLine();
                            query += "'" + cadena + "', ";

                            System.out.print("Introduzca una descripción: ");
                            cadena = input.next() + input.nextLine();
                            query += "'" + cadena + "', ";

                            System.out.print("Introduzca un precio (número entero): ");
                            nums = input.nextInt();
                            query += "'" + nums + "', ";

                            System.out.print("Introduzca un pais: ");
                            cadena = input.next() + input.nextLine();
                            query += "'" + cadena + "'";

                            query += ");";
                            stmt.executeUpdate(query);
                        }
                        case 3 -> {
                            System.out.print("Introduzca el ID del producto que quiera modificar: ");
                            nums = input.nextInt();
                            result = stmt.executeQuery("SELECT * FROM tienda.producto WHERE id =" + nums + " ;");
                            if(result.next()){
                                do{
                                    System.out.println("Qué quiere modificar:");
                                    System.out.println("    1- Nombre (" + result.getString(2) + ")");
                                    System.out.println("    2- Descripción (" + result.getString(3) + ")");
                                    System.out.println("    3- Precio (" + result.getString(4) + ")");
                                    System.out.println("    4- Pais (" + result.getString(5) + ")");
                                    System.out.println("    5- Salir");
                                    System.out.print("Respuesta: ");
                                    nums = input.nextInt();

                                    if(nums <= 5){
                                        switch(nums){
                                            case 1 -> {
                                                System.out.print("Nuevo nombre: ");
                                                cadena = input.next() + input.nextLine();
                                                stmt.executeUpdate("UPDATE tienda.producto SET nombre = '" + cadena + "' WHERE id = '" + result.getString(1) + "';");
                                            }
                                            case 2 -> {
                                                System.out.print("Nueva descripción: ");
                                                cadena = input.next() + input.nextLine();
                                                stmt.executeUpdate("UPDATE tienda.producto SET nombre = '" + cadena + "' WHERE id = '" + result.getString(1) + "';");
                                            }
                                            case 3 -> {
                                                System.out.print("Nuevo precio: ");
                                                cadena = input.next() + input.nextLine();
                                                stmt.executeUpdate("UPDATE tienda.producto SET nombre = '" + cadena + "' WHERE id = '" + result.getString(1) + "';");
                                            }
                                            case 4 -> {
                                                System.out.print("Nuevo pais: ");
                                                cadena = input.next() + input.nextLine();
                                                stmt.executeUpdate("UPDATE tienda.producto SET nombre = '" + cadena + "' WHERE id = '" + result.getString(1) + "';");
                                            }
                                            case 5 -> {
                                                System.out.println("Fin de la modificación de producto");
                                            }
                                        }

                                    }else{
                                        System.out.println("Valor introducido no permitido");
                                    }
                                }while(nums != 5);
                            }
                            nums = 0;
                        }
                        case 4 -> {
                            System.out.print("Introduzca el ID del producto que quiera eliminar: ");
                            nums = input.nextInt();

                            result = stmt.executeQuery("SELECT * FROM tienda.producto WHERE id =" + nums + " ;");
                            if(result.next()){
                                stmt.executeUpdate("DELETE FROM tienda.producto WHERE id = " + nums + ";");
                                System.out.println("Producto eliminado satisfactoriamente");

                            }else{
                                System.out.println("No se ha encontrado ningún producto con ese ID");
                            }
                        }
                        case 5 -> {
                            System.out.println("Gracias por usar el programa, hasta pronto");
                        }
                        default -> {
                            System.out.println("Introduzca un valor válido");
                        }
                    }
                    
                    }catch(InputMismatchException ime1){
                        System.out.println("ERROR - Tipo de dato no válido");
                        nums = 0;
                        input.next();
                    }
                }while(nums != 5);
            stmt.close();
            conn.close();
        }catch(SQLException sqle1){
            System.out.println("SQLException: " + sqle1.getMessage());

        }

    }
}
