package com.mycompany.bdequiposfutbol;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class Equipo{
    Scanner input = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private String estadio;
    private String ciudad;
    private int socios;

    public Equipo(String codigo, String nombre, String estadio, String ciudad, int socios){
        this.codigo = codigo;
        this.nombre = nombre;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.socios = socios;
    }
    
    public Equipo(String codigo){
        this.codigo = codigo;
    }
    public Equipo(){}
    
    
    public String crearEquipo(){
        System.out.print("Escriba el nombre del equipo: ");
        this.nombre = input.next() + input.nextLine();
        do{
            System.out.print("Escriba el código del equipo, deben ser 3 letras (FC Barcelona = FCB, Real Madrid = RMA): ");
            this.codigo = input.next().toUpperCase();
            if(this.codigo.length() != 3){
                System.out.println("Por favor, escriba correctamente el código del equipo");
            }
        }while(this.codigo.length() != 3);
        System.out.print("Escriba el nombre de su estadio o 0 en caso de no tenerlo: ");
        this.estadio = input.next() + input.nextLine();
        System.out.print("Escriba el nombre de su ciudad: ");
        this.ciudad = input.next() + input.nextLine();
        try{
            do{
                System.out.print("Escriba el número de socios: ");
                this.socios = input.nextInt();
                if(this.socios < 0){
                    System.out.println("La cantidad de socios no puede ser negativa");
                }
            }while(this.socios < 0);
        }catch(InputMismatchException ime1){
            System.out.println("Tipo de dato introducido no válido");
            this.socios = 0;
            input.next();
        }
        return this.codigo;
    }
    
    public void mostrarEquipo(){
        
        System.out.print("\nCódigo: "+ this.codigo +" || ");
        System.out.print("Nombre: "+ this.nombre +" || ");
        System.out.print("Estadio: "+ this.estadio +" || ");
        System.out.print("Ciudad: "+ this.ciudad +" || ");
        System.out.print("Socios: "+ this.socios);
    }

    public Scanner getInput(){
        return input;
    }
    public void setInput(Scanner input){
        this.input = input;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEstadio(){
        return estadio;
    }
    public void setEstadio(String estadio){
        this.estadio = estadio;
    }

    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public int getSocios(){
        return socios;
    }
    public void setSocios(int socios){
        this.socios = socios;
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
