package com.mycompany.bdequiposfutbol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class BDequiposFutbol{

    public static boolean existeEquipo(Statement stmt, ResultSet result, String cod){ //Comprueba si existe un equipo con el Codigo pasado
        try{
            result = stmt.executeQuery("SELECT codigo FROM futbol.equipos WHERE codigo = '" + cod + "';");
            return result.next();
        }catch(SQLException sql2){
            System.out.println(sql2.getMessage());
        }
        return true;
    }

    public static boolean existeJugador(Statement stmt, ResultSet result, int cod){ //Comprueba si existe un jugador con el Codigo pasado
        try{
            result = stmt.executeQuery("SELECT codigo FROM futbol.jugadores WHERE codigo = '" + cod + "';");
            return result.next();
        }catch(SQLException sql2){
            System.out.println(sql2.getMessage());
        }
        return true;
    }

    public static ArrayList actualizarEquipos(Statement stmt, ResultSet result){ //Añade al ArrayList los equipos que se encuentran en la base de datos
        ArrayList<Equipo> equiposFinal = new ArrayList<>();
        try{
            result = stmt.executeQuery("SELECT * FROM futbol.equipos;");
            while(result.next()){
                Equipo e1 = new Equipo(result.getString(1), result.getString(2), result.getString(3), result.getString(4), Integer.parseInt(result.getString(5)));
                equiposFinal.add(e1);
            }
        }catch(SQLException sql3){
            System.out.println(sql3.getMessage());
        }
        return equiposFinal;
    }

    public static ArrayList actualizarJugadores(Statement stmt, ResultSet result){ //Añade al ArrayList los jugadores que se encuentran en la base de datos
        ArrayList<Jugador> jugadoresFinal = new ArrayList<>();
        try{
            result = stmt.executeQuery("SELECT * FROM futbol.jugadores;");
            while(result.next()){
                Jugador j1 = new Jugador(Integer.parseInt(result.getString(1)), result.getString(2), result.getString(3), result.getString(4), result.getString(5));
                jugadoresFinal.add(j1);
            }
        }catch(SQLException sql3){
            System.out.println(sql3.getMessage());
        }
        return jugadoresFinal;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Queue<String> colaQueries = new LinkedList<>();
        int nums;
        String res;
        boolean correcto = true;
        try{
            String url = "jdbc:mariadb://localhost:3307/futbol";
            Connection conn = DriverManager.getConnection(url, "root", "root");
            Statement stmt = (Statement) conn.createStatement();
            ResultSet result = null;
            ArrayList<Equipo> equipos = actualizarEquipos(stmt, result);
            ArrayList<Jugador> jugadores = actualizarJugadores(stmt, result);

            do{
                System.out.println("\nCon qué quieres trabajar:");
                System.out.println("    1- Equipos");
                System.out.println("    2- Jugadores");
                System.out.println("    3- Guardar");
                System.out.println("    4- Salir");
                System.out.print("Respuesta: ");
                nums = input.nextInt();

                switch(nums){
                    case 1 -> {
                        do{
                            System.out.println("\nQué quieres hacer: ");
                            System.out.println("    a- Mostrar equipos");
                            System.out.println("    b- Añadir equipo");
                            System.out.println("    c- Modificar equipo");
                            System.out.println("    d- Elminar equipo");
                            System.out.println("    e- Atras");
                            System.out.print("Respuesta: ");
                            res = input.next().toLowerCase();

                            switch(res){
                                case "a" -> {
                                    if(equipos.isEmpty()){
                                        System.out.println("No hay equipos");
                                    }else{
                                        for(int i = 0; i < equipos.size(); i ++){
                                            equipos.get(i).mostrarEquipo();
                                        }
                                    }

                                }
                                case "b" -> {
                                    Equipo equipoNuevo = new Equipo();
                                    String codNuevo = equipoNuevo.crearEquipo();

                                    if(existeEquipo(stmt, result, codNuevo)){
                                        System.out.println("ERROR - Ya existe un equipo con ese código");
                                    }else{
                                        equipos.add(equipoNuevo);
                                        colaQueries.add("INSERT INTO futbol.equipos VALUES('" + equipoNuevo.getCodigo() + "', '" + equipoNuevo.getNombre() + "', '" + equipoNuevo.getEstadio() + "',"
                                                + " '" + equipoNuevo.getCiudad() + "', '" + equipoNuevo.getSocios() + "');");
                                    }
                                }
                                case "c" -> {
                                    if(equipos.isEmpty()){
                                        System.out.println("No hay equipos");
                                    }else{
                                        System.out.print("Introduzca el código del equipo que quiera modificar: ");
                                        res = input.next();
                                        result = stmt.executeQuery("SELECT * FROM futbol.equipos WHERE codigo = '" + res + "' ;");
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
                                                    correcto = true;
                                                    switch(nums){
                                                        case 1 -> {
                                                            campo = "codigo";
                                                            System.out.print("Nuevo codigo: ");
                                                            res = input.next().toUpperCase();
                                                            if(res.length() != 3){
                                                                System.out.println("Por favor, escriba correctamente el código del equipo");
                                                                correcto = false;
                                                            }else{
                                                                if(existeEquipo(stmt, result, res)){
                                                                    System.out.println("Código repetido, no se realizarán cambios");
                                                                    correcto = false;
                                                                }
                                                            }

                                                        }
                                                        case 2 -> {
                                                            campo = "nombre";
                                                            System.out.print("Nuevo nombre: ");
                                                            res = input.next() + input.nextLine();
                                                        }
                                                        case 3 -> {
                                                            campo = "estadio";
                                                            System.out.print("Nuevo estadio: ");
                                                            res = input.next() + input.nextLine();
                                                        }
                                                        case 4 -> {
                                                            campo = "ciudad";
                                                            System.out.print("Nueva ciudad: ");
                                                            res = input.next() + input.nextLine();
                                                        }
                                                        case 5 -> {
                                                            campo = "socios";
                                                            System.out.print("Cantidad de Socios: ");
                                                            try{
                                                                int socios = input.nextInt();
                                                                res = String.valueOf(socios);
                                                            }catch(InputMismatchException ime2){
                                                                System.out.println("Tipo de dato no permitido, no se realizaran cambios");
                                                                input.next();
                                                                correcto = false;
                                                            }
                                                        }
                                                    }
                                                    if(correcto){
                                                        colaQueries.add("UPDATE futbol.equipos SET " + campo + "  = '" + res + "' WHERE codigo = '" + result.getString(1) + "';");
                                                        System.out.println("Éxito, los cambios se aplicarán en la base de datos al guardar");
                                                    }

                                                }else if(nums == 6){
                                                    System.out.println("Fin de la modificación");
                                                }else{
                                                    System.out.println("Valor introducido no permitido");
                                                }
                                            }while(nums != 6);
                                        }
                                        nums = 0;

                                    }

                                }
                                case "d" -> {
                                    if(equipos.isEmpty()){
                                        System.out.println("No hay equipos");
                                    }else{
                                        System.out.print("Introduzca el codigo del equipo que quiera eliminar: ");
                                        res = input.next().toUpperCase();
                                        if(res.length() == 3){
                                            if(existeEquipo(stmt, result, res)){
                                                colaQueries.add("DELETE FROM equipos WHERE codigo = '" + res + "';");
                                                for(int i = 0; i < equipos.size(); i ++){
                                                    if(equipos.get(i).getCodigo().equals(res)){
                                                        equipos.remove(i);
                                                    }
                                                }
                                                System.out.println("Los cambios se aplicarán en la base de datos al guardar");
                                            }else{
                                                System.out.println("No se ha encontrado ningún equipo con ese código");
                                            }
                                        }
                                    }

                                }
                                case "e" -> {
                                    System.out.println("Volviendo...");
                                }
                                default -> {
                                    System.out.println("Opción no válida");
                                }
                            }
                        }while( ! res.equals("e"));
                    }
                    case 2 -> {
                        do{
                            System.out.println("\nQué quiere hacer: ");
                            System.out.println("    a- Mostrar jugadores");
                            System.out.println("    b- Mostrar jugadores de un equipo");
                            System.out.println("    c- Buscar jugador por nombre");
                            System.out.println("    d- Añadir jugadores");
                            System.out.println("    e- Modificar jugador");
                            System.out.println("    f- Eliminar jugador");
                            System.out.println("    g- Atras");
                            System.out.print("Respuesta: ");
                            res = input.next().toLowerCase();

                            switch(res){
                                case "a" -> {
                                    if(jugadores.isEmpty()){
                                        System.out.println("No hay jugadores");
                                    }else{
                                        for(int i = 0; i < jugadores.size(); i ++){
                                            jugadores.get(i).mostrarJugador();
                                        }
                                    }
                                }
                                case "b" -> {
                                    if(jugadores.isEmpty()){
                                        System.out.println("No hay jugadores");
                                    }else{
                                        System.out.print("Escriba el código del equipo: ");
                                        res = input.next().toUpperCase();
                                        if(existeEquipo(stmt, result, res)){
                                            for(int i = 0; i < jugadores.size(); i ++){
                                                if(res.equals(jugadores.get(i).getCodigoEquipo())){
                                                    jugadores.get(i).mostrarJugador();
                                                }
                                            }
                                        }else{
                                            System.out.println("No existe el equipo");
                                        }
                                    }
                                }
                                case "c" -> {
                                    if(jugadores.isEmpty()){
                                        System.out.println("No hay jugadores");
                                    }else{
                                        System.out.print("Escriba el nombre del jugador, sin apellidos: ");
                                        res = input.next();
                                        for(int i = 0; i < jugadores.size(); i ++){
                                            if(jugadores.get(i).getNombre().equals(res)){
                                                jugadores.get(i).mostrarJugador();
                                            }
                                        }
                                    }
                                }
                                case "d" -> {
                                    Jugador jugadorNuevo = new Jugador();
                                    jugadorNuevo.crearJugador();

                                    jugadores.add(jugadorNuevo);
                                    int codNuevo = 1;
                                    do{
                                        codNuevo++;
                                    }while(existeJugador(stmt, result, codNuevo));
                                    jugadorNuevo.setCodigo(codNuevo);
                                    colaQueries.add("INSERT INTO futbol.jugadores VALUES('" + jugadorNuevo.getCodigo() + "', '" + jugadorNuevo.getNombre() + "', '" + jugadorNuevo.getApellidos() + "',"
                                            + " '" + jugadorNuevo.getFechaNac() + "', '" + jugadorNuevo.getCodigoEquipo() + "');");
                                }
                                case "e" -> {
                                    if(jugadores.isEmpty()){
                                        System.out.println("No hay jugadores");
                                    }else{
                                        System.out.print("Introduzca el código del jugador que quiera modificar: ");
                                        nums = input.nextInt();
                                        result = stmt.executeQuery("SELECT * FROM futbol.jugadores WHERE codigo = '" + nums + "' ;");
                                        if(result.next()){
                                            do{
                                                System.out.println("Qué quiere modificar:");
                                                System.out.println("    1- Nombre (" + result.getString(2) + ")");
                                                System.out.println("    2- Apellidos (" + result.getString(3) + ")");
                                                System.out.println("    3- Fecha Nacimiento (" + result.getString(4) + ")");
                                                System.out.println("    4- Codigo del Equipo (" + result.getString(5) + ")");
                                                System.out.println("    5- Salir");
                                                System.out.print("Respuesta: ");
                                                nums = input.nextInt();

                                                if(nums > 0 && nums < 5){
                                                    String campo = "";
                                                    correcto = true;
                                                    switch(nums){
                                                        case 1 -> {
                                                            campo = "nombre";
                                                            System.out.print("Nuevo nombre: ");
                                                            res = input.next() + input.nextLine();
                                                        }
                                                        case 2 -> {
                                                            campo = "apellido";
                                                            System.out.print("Nuevos apellidos: ");
                                                            res = input.next() + input.nextLine();
                                                        }
                                                        case 3 -> {
                                                            campo = "fecha_nac";
                                                            System.out.print("Nueva fecha de nacimiento: ");
                                                            res = input.next();
                                                        }
                                                        case 4 -> {
                                                            campo = "equipo";
                                                            System.out.print("Código del nuevo equipo: ");
                                                            res = input.next().toUpperCase();

                                                            if(res.length() != 3){
                                                                System.out.println("Por favor, escriba correctamente el código del equipo");
                                                                correcto = false;
                                                            }else{
                                                                if( ! existeEquipo(stmt, result, res)){
                                                                    System.out.println("El equipo no existe");
                                                                    correcto = false;
                                                                }else if(result.getString(5) != res){
                                                                    System.out.println("Ya es miembro de ese equipo");
                                                                    correcto = false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    if(correcto){
                                                        colaQueries.add("UPDATE futbol.equipos SET " + campo + "  = '" + res + "' WHERE codigo = '" + result.getString(1) + "';");
                                                        System.out.println("Éxito, los cambios se aplicarán en la base de datos al guardar");
                                                    }

                                                }else if(nums == 6){
                                                    System.out.println("Fin de la modificación");
                                                }else{
                                                    System.out.println("Valor introducido no permitido");
                                                }
                                            }while(nums != 6);
                                        }
                                        nums = 0;
                                    }
                                }
                                case "f" -> {

                                    if(jugadores.isEmpty()){
                                        System.out.println("No hay jugadores");
                                    }else{
                                        System.out.print("Introduzca el codigo del jugador que quiera eliminar: ");
                                        nums = input.nextInt();
                                        if(existeJugador(stmt, result, nums)){
                                            colaQueries.add("DELETE FROM jugadores WHERE codigo = '" + nums + "';");
                                            for(int i = 0; i < jugadores.size(); i ++){
                                                if(jugadores.get(i).getCodigo() == nums){
                                                    jugadores.remove(i);
                                                }
                                            }
                                            System.out.println("Los cambios se aplicarán en la base de datos al guardar");
                                        }else{
                                            System.out.println("No se ha encontrado ningún equipo con ese código");
                                        }
                                    }
                                }
                                case "g" -> {
                                    System.out.println("Volviendo...");
                                }
                                default -> {
                                    System.out.println("Opción no válida");
                                }
                            }
                        }while( ! res.equals("g"));

                    }
                    case 3 -> {
                        for(int i = 0; i < colaQueries.size(); i ++){
                            stmt.executeUpdate(colaQueries.poll());
                        }
                        equipos = actualizarEquipos(stmt, result);
                        jugadores = actualizarJugadores(stmt, result);
                        System.out.println("La base de datos ha sido actualizada");
                    }
                    case 4 -> {
                        System.out.println("Gracias por usar el programa, hasta otra.");
                    }
                    default -> {
                        System.out.println("Opción no válida");
                    }
                }
            }while(nums != 4);

        }catch(SQLException sql1){
            System.out.println(sql1.getMessage());

        }

    }
}
