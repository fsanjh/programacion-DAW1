package com.mycompany.bdequiposfutbol;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class Jugador{
    Scanner input = new Scanner(System.in);
    int codigo;
    String nombre; 
    String apellidos;
    Date fechaNac; 
    String codigoEquipo;
    
    public Jugador(int codigo, String nombre, String apellidos, String fechaNac, String codigoEquipo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = Date.valueOf(fechaNac);
        this.codigoEquipo = codigoEquipo;
    }
    
    public int generarCodigo(Jugador[] jugadores){
        int codigoNuevo = 0;
        for(int i = 0; i < jugadores.length; i++){
            codigoNuevo = (int) (Math.random() * 99999999);
            if(codigoNuevo != jugadores[i].getCodigo()){
                break;
            }
        }
        return codigoNuevo;
    }
    
    public void crearJugador(){
        System.out.print("Escriba el nombre del jugador: ");
        this.nombre = input.next() + input.nextLine();
        System.out.print("Escriba el apellido del jugador: ");
        this.apellidos = input.next() + input.nextLine();
        do{
            System.out.print("Escriba el código del equipo al que pertenece, debe estar compuesto por 3 letras que lo identifiquen (FC Barcelona = FCB, Real Madrid = RMA)");
            this.codigoEquipo = input.next();
            if(this.codigoEquipo.length() != 3){
                System.out.println("Por favor, escriba correctamente el código del equipo");
            }
        }while(this.codigoEquipo.length() != 3);
        
        System.out.print("Escriba la fecha de nacimiento (YYYY-MM-DD): ");
        this.fechaNac = Date.valueOf(input.next());
        
        System.out.println("Jugador creado con éxito");
    }
    
    public void mostrarJugador(Jugador jugador){
        System.out.println("Código: "+ this.codigo +" || ");
        System.out.print("Nombre: "+ this.nombre +" || ");
        System.out.print("Apellidos: "+ this.apellidos +" || ");
        System.out.print("Fecha de nacimiento: "+ this.fechaNac.toString() +" || ");
        System.out.print("Codigo del equipo: "+ this.codigoEquipo);
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public Date getFechaNac(){
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac){
        this.fechaNac = fechaNac;
    }

    public String getCodigoEquipo(){
        return codigoEquipo;
    }
    public void setCodigoEquipo(String codigoEquipo){
        this.codigoEquipo = codigoEquipo;
    }
    
    
    
    
    
    
    
    
    
}
