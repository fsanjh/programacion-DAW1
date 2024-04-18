package com.mycompany.ejparking;

/**
 *
 * @author fsanj
 */
public class Parking{
    private String [] matriculas;
    private String nombre;

    public Parking(String _nombre, int nPlazas){
        this.nombre = _nombre;
        this.matriculas = new String[nPlazas];
        for(int i = 0; i < nPlazas; i++){
            this.matriculas[i] = null;
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void entrada(String matricula, int plaza){
        try{
            if (matricula == null || matricula.length() < 4){
                throw new Exception("Matrícula incorrecta");
            }else if(matriculas[plaza] != null){
                throw new Exception("Plaza ocupada");
            }else{
                for(int i = 0; i < matriculas.length; i++){
                    if(matriculas[i] == matricula){
                        throw new Exception("Matricula repetida");
                    }
                }
                matriculas[plaza] = matricula;
            }
        }catch(Exception ex1){
            System.out.println("Ha ocurrido un problema: "+ ex1.getMessage());
        }
    }
    
    public int salida(String matricula){
        try{
            for(int i = 0; i < matriculas.length; i++){
                if(matriculas[i] == matricula){
                    matriculas[i] = null;
                    return i;
                }
            }
            throw new Exception("Matrícula no existente");
        }catch(Exception ex2){
            System.out.println("Ha ocurrido un problema: "+ ex2.getMessage());
        }
        return -1;
    }
    
    public int getPlazasTotales(){
        return matriculas.length;
    }
    
    public int getPlazasOcupadas(){
        int ocupadas = 0;
        for(int i = 0; i < matriculas.length; i++){
            if(matriculas[i] != null){
                ocupadas++;
            }
        }
        return ocupadas;
    }
    
    public int getPlazasLibres(){
        return matriculas.length - getPlazasOcupadas();
    }
    
    @Override
    public String toString(){
        String parking;
        parking = "Parking "+ this.nombre +"\n"
                + "----------------\n";
        for(int i = 0; i < matriculas.length; i++){
            parking = parking + "Plaza "+ i +": "+ ((matriculas[i] == null)? "(vacía)": matriculas[i]) +"\n";
        }
        return parking;
    }
    
    
    
    
    
    
}
