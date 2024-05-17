package Modelos;

import java.util.Objects;

/**
 *
 * @author fsanj
 */
public class Cuenta{
    private String nombre;
    private String email;
    private String pass;

    public Cuenta(String nombre, String email, String pass){
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }

    @Override
    public int hashCode(){
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        if( ! Objects.equals(this.nombre, other.nombre)){
            return false;
        }
        if( ! Objects.equals(this.email, other.email)){
            return false;
        }
        return Objects.equals(this.pass, other.pass);
    }
    
    
    
    
    
}
