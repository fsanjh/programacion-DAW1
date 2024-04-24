package com.mycompany.ejpassword;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class Password{
    //ATRIBUTOS
    private String nombre = "";
    private final int LONGITUD = 8;

    //CONSTRUCTORES
    public Password(){ //Constructor sin valores que genera una contraseña con los caracteres por defecto
        this.nombre = generaContrasenya(LONGITUD);
    }
    public Password(int _longitud){ //Constructor que genera una contraseña de los valores introducidos por el usuario
        this.nombre = generaContrasenya(_longitud);
    }

    //MÉTODOS
    public String generaContrasenya(int longitud){ //Genera la contraseña
        String pass = "";
        for(int i = 0; i < longitud; i ++){
            boolean rnd = Math.random() < 0.5; //Devuelve true o false de manera aleatoria
            if(rnd){ //Si es verdadero, introduce un numero aleatorio de 0 a 9, incluidos
                pass = pass + (int) (Math.random() * 10);
            }else{ //En caso de ser falso introduce una letra
                rnd = Math.random() < 0.5; //Igual que antes
                if(rnd){ //En caso de ser verdadero, introduce una letra mayúscula aleatoria
                    pass = pass + (char) ('A' + Math.random() * 26);
                }else{ //Letras minúsculas
                    pass = pass + (char) ('a' + Math.random() * 26);
                }
            }
        }
        return pass; //Devuelve la contraseña
    }

    public boolean esFuerte(){ //Comprueba si la contraseña es fuerte
        int num, min, mayus;
        num = min = mayus = 0;
        for(int i = 0; i < this.nombre.length(); i ++){
            char caracter = this.nombre.charAt(i);
            if(Character.isDigit(caracter)){ //Si el caracter es número
                num ++;
            }else if(Character.isUpperCase(caracter)){ //Si el caracter es mayuscula
                mayus ++;
            }else if(Character.isLowerCase(caracter)){ //Si el caracter es minuscula
                min ++;
            }
        }
        return num > 4 && min > 0 && mayus > 1; //Si se cumplen todas las condiciones devuelve verdadero, si no se cumplen devuelve false
    }

    public boolean modificaContrasenya(){ //Modifica la contraseña actual del usuario
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        boolean correcto;

        System.out.print("Introduzca la nueva contraseña: ");
        String nuevaPass = input.next();
        if(this.nombre.equals(nuevaPass)){ //Si las contraseñas son iguales se omite el resto
            System.out.println("La contraseña introducida es igual que la actual, omitiendo cambio");
            correcto = false;
        }else{
            //Crea un objeto con la contraseña introducida
            Password cambioPass = new Password(nuevaPass.length()); 
            cambioPass.setNombre(nuevaPass);
            if(!cambioPass.esFuerte()){ //Si la contraseña es débil no se realiza
                System.out.println("El cambio de contraseña no se pudo realizar, contraseña débil");
                correcto = false;
            }else{
                this.nombre = nuevaPass; //Si la contraseña es fuerte, hace el cambio
                System.out.println("El cambio de contraseña se realizó correctamente");
                correcto = true;
            }
        }
        return correcto;
    }

    //GETTER & SETTER
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
