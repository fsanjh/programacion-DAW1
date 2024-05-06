package com.mycompany.bdequiposfutbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class BDequiposFutbol{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nums;
        String res;
        try{
            String url = "jdbc:mariadb://localhost:3307/futbol";
            Connection conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet result;

            ArrayList<Equipo> equipos = new ArrayList<>();
            result = stmt.executeQuery("SELECT * FROM futbol.equipos;");
            int contEquiposExistentes = 0;
            while(result.next()){
                String codigo = result.getString(1);
                String nombre = result.getString(2);
                String estadio = result.getString(3);
                String ciudad = result.getString(4);
                String socios = result.getString(5);
                Equipo e1 = new Equipo(codigo, nombre, estadio, ciudad, Integer.parseInt(socios));
                equipos.add(e1);
                contEquiposExistentes ++;
            }

            ArrayList<Jugador> jugadores = new ArrayList<>();
            result = stmt.executeQuery("SELECT * FROM futbol.jugadores;");
            int contJugadoresExistentes = 0;
            while(result.next()){
                String codigo = result.getString(1);
                String nombre = result.getString(2);
                String apellido = result.getString(3);
                String fechaNac = result.getString(4);
                String codigoEquipo = result.getString(5);
                Jugador j1 = new Jugador(Integer.parseInt(codigo), nombre, apellido, fechaNac, codigoEquipo);
                jugadores.add(j1);
                contJugadoresExistentes ++;
            }
            do{
                System.out.println("Con qué quieres trabajar:");
                System.out.println("    1- Equipos");
                System.out.println("    2- Jugadores");
                System.out.println("    3- Salir");
                System.out.println("    4- Guardar y salir");
                System.out.print("Respuesta: ");
                nums = input.nextInt();

                switch(nums){
                    case 1 -> {
                        System.out.println("Qué quiere hacer: ");
                        System.out.println("    a- Mostrar equipos");
                        System.out.println("    b- Añadir equipo");
                        System.out.println("    c- Modificar equipo");
                        System.out.println("    d- Elminar equipo");
                        System.out.println("    e- Atras");
                        System.out.print("Respuesta: ");
                        res = input.next();

                        switch(res){
                            case "a" -> {
                                for(int i = 0; i < equipos.size(); i ++){
                                    equipos.get(i).mostrarEquipo();
                                }
                            }
                            case "b" -> {
                                Equipo equipoNuevo = new Equipo();
                                equipoNuevo.crearEquipo();
                                equipos.add(equipoNuevo);
                            }
                            case "c" -> {
                                System.out.print("Introduzca el codigo del equipo que quiera modificar: ");
                                res = input.next();
                                result = stmt.executeQuery("SELECT * FROM futbol.equipos WHERE codigo =" + res + " ;");
                                if(result.next()){
                                    do{
                                        System.out.println("Qué quiere modificar:");
                                        System.out.println("    1- Codigo (" + result.getString(1) + ")");
                                        System.out.println("    2- Nombre (" + result.getString(2) + ")");
                                        System.out.println("    3- Estadio (" + result.getString(3) + ")");
                                        System.out.println("    4- Ciudad (" + result.getString(4) + ")");
                                        System.out.println("    5- Socios(" + result.getString(5) + ")");
                                        System.out.println("    6- Salir");
                                        System.out.print("Respuesta: ");
                                        nums = input.nextInt();

                                        if(nums > 0 && nums < 6){
                                            String campo = "";
                                            switch(nums){
                                                case 1 -> {
                                                    campo = "codigo";
                                                    System.out.print("Nuevo codigo: ");
                                                }
                                                case 2 -> {
                                                    campo = "nombre";
                                                    System.out.print("Nueva nombre: ");
                                                }
                                                case 3 -> {
                                                    campo = "estadio";
                                                    System.out.print("Nuevo estadio: ");
                                                }
                                                case 4 -> {
                                                    campo = "ciudad";
                                                    System.out.print("Nuevo ciudad: ");
                                                }
                                            }
                                            res = input.next() + input.nextLine();
                                            stmt.executeUpdate("UPDATE tienda.producto SET " + campo + "  = '" + res + "' WHERE id = '" + result.getString(1) + "';");
                                            System.out.println("Los cambios se mostrarán al final la modificación");
                                        }else if(nums == 6){
                                            System.out.println("Fin de la modificación");
                                        }else{
                                            System.out.println("Valor introducido no permitido");
                                        }
                                    }while(nums != 6);
                                }
                                nums = 0;

                            }
                            case "d" -> {

                            }
                        }
                    }
                    case 2 -> {

                    }
                    case 3 -> {

                    }
                    case 4 -> {
                        int n = 0;
                        for(Equipo equipo : equipos){
                            if(n < contEquiposExistentes){
                                n ++;
                            }else{
                                String queryEquipos = "INSERT INTO equipos VALUES('" + equipo.getCodigo() + "', '" + equipo.getNombre() + "', '" + equipo.getEstadio() + "', '" + equipo.getCiudad() + "', '" + equipo.getSocios() + "');";
                                stmt.executeQuery(queryEquipos);
                            }
                        }
                    }
                }
            }while(nums < 2);

        }catch(SQLException sql1){
            System.out.println(sql1.getMessage());

        }

    }
}
