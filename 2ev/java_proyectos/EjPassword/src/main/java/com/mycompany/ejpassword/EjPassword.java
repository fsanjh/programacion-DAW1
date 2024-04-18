package com.mycompany.ejpassword;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjPassword{
    
    public static char modificarPass(char res, Scanner input, Password pass){
        //Pregunta al usuario si quiere modificarla
        if(res != 's'){
            do{
                System.out.print("¿Quiere modificarla? [S/n]: ");
                res = input.next().toLowerCase().charAt(0);
                if(res != 's' && res != 'n'){
                    System.out.println("Introduzca una respuesta válida [S/n]: ");
                }
            }while(res != 's' && res != 'n');
        }
        //Muestra al usuario su nueva contraseña si se cambio correctamente y termina el programa
        if(res == 's'){
            if(pass.modificaContrasenya()){
                System.out.println("Aquí tiene su nueva contraseña: " + pass.getNombre());
            }
        }
        return res;
    }

    public static void main(String[] args){
        /*
        System.out.println("CONTRASEÑA 1");
        Password p1 = new Password();
        System.out.println(p1.getNombre() +" // ¿Es una contraseña fuerte? "+ p1.esFuerte());
        System.out.println("CONTRASEÑA 2");
        Password p2 = new Password(10);
        System.out.println(p2.getNombre() +" // ¿Es una contraseña fuerte? "+ p2.esFuerte());
        System.out.println("Se pudo cambiar: "+ p2.modificaContrasenya());
        System.out.println(p2.getNombre() +" // ¿Es una contraseña fuerte? "+ p2.esFuerte());
         */

        Scanner input = new Scanner(System.in);
        char res;
        //Pregunta al usuario si quiere generar una contraseña
        System.out.println("Bienvenido al programa de generación de contraseñas");
        System.out.print("¿Quiere generar una contraseña? [S/n]: ");
        do{
            res = input.next().toLowerCase().charAt(0);
            if(res != 's' && res != 'n'){
                System.out.print("Introduzca una respuesta válida [S/n]: ");
            }
        }while(res != 's' && res != 'n');
        //El usuario elige si quiere una contraseña de 8 caracteres o de los caracteres que él indique
        if(res == 's'){
            do{
                System.out.println("Escoja una opción:");
                System.out.println("    (1) - Contraseña de longitud 8");
                System.out.println("    (2) - Contraseña de longitud personalizada");
                System.out.print("Respuesta: ");
                res = input.next().charAt(0);
                if(res != '1' && res != '2'){
                    System.out.println("Introduzca una respuesta válida");
                }
            }while(res != '1' && res != '2');
            //Se genera una contraseña de 8 caracteres
            if(res == '1'){
                Password pass = new Password(); //Crea la clase con el constructor por defecto
                System.out.println("Aquí tiene su contraseña generada aleatoriamente: " + pass.getNombre()); //Se muestra al usuario
                //Le muestra si es segura
                String segura = (pass.esFuerte()) ? "" : "no ";
                System.out.println("La contraseña generada " + segura + "es segura");
                do{
                    res = modificarPass(res, input, pass);
                    if (res != 'n'){
                        System.out.print("¿Quiere repetir? [S/n]: ");
                        res = input.next().toLowerCase().charAt(0);
                    }
                }while(res == 's');
                System.out.println("Su contraseña final: " + pass.getNombre());
            //Contraseña de X caracteres
            }else if(res == '2'){
                int longitud = 0;
                boolean correcto;
                do{
                    try{ //Pide al usuario un numero entero, en caso de error se repite
                        correcto = true;
                        System.out.print("Escriba la longitud de la contraseña, debe ser un número entero: ");
                        longitud = Math.abs(input.nextInt());
                    }catch(InputMismatchException er){
                        correcto = false;
                        input.next();
                        System.out.println("Ha introducido carácteres no permitidos, vuelva a intentarlo");
                    }
                }while( ! correcto);
                Password pass = new Password(longitud); //Se genera la contraseña
                System.out.println("Aquí tiene su contraseña generada aleatoriamente: " + pass.getNombre()); //La muestra al usuario
                String segura = (pass.esFuerte()) ? "" : "no ";
                System.out.println("La contraseña generada " + segura + "es segura");
                do{
                    res = modificarPass(res, input, pass);
                    if (res != 'n'){
                        System.out.print("¿Quiere repetir? [S/n]: ");
                        res = input.next().toLowerCase().charAt(0);
                    }
                }while(res == 's');
                System.out.println("Su contraseña final: " + pass.getNombre());
            }
        }
        System.out.println();
        System.out.println("Gracias, hasta pronto.");

        
        
    }
}
