package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fsanj
 */
public class BD{

    public boolean insertar(Cuenta cuenta){
        String url = "jdbc:mariadb://localhost:3307/pruebaJavaFX";
        boolean res = true;
        try{
            Connection conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet result;
            
            result = stmt.executeQuery("SELECT nombre, email, pass FROM cuentas;");
            Cuenta cuentaExistente;
            boolean existe = false;
            while(result.next()){
                cuentaExistente = new Cuenta(result.getNString(1), result.getNString(2), result.getNString(3));
                existe = cuenta.equals(cuentaExistente);
                if(existe){
                    break;
                }
            }
            if(!existe){
                stmt.executeUpdate("INSERT INTO cuentas (nombre, email, pass) VALUES('"+cuenta.getNombre().trim()+"', '"+cuenta.getEmail().trim()+"', '"+cuenta.getPass().trim()+"');");
                res = true;
            }else{
                res = false;
            }
        }catch(SQLException sql1){
            System.out.println(sql1.getMessage());
        }
        return res;
    }
    
    
    
    

}
