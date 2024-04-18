package com.mycompany.diaslluvia;

import java.util.ArrayList;

/**
 *
 * @author Nocturno
 */
public class DiasLluviosos{
    private int dia;
    private boolean lluvia;
    private ArrayList<DiasLluviosos> dias = new ArrayList();
    
    public DiasLluviosos(){}
    
    public DiasLluviosos(int dia, boolean llovio){
        this.dia = dia;
        this.lluvia = llovio;
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public boolean isLluvia(){
        return lluvia;
    }
    public void setLluvia(boolean lluvia){
        this.lluvia = lluvia;
    }

    @Override
    public String toString(){
        return "Dia: "+ dia +" || ¿Llovio?: "+ lluvia;
    }
    
    public void mostrarDias(){
        for(DiasLluviosos d : dias){
            System.out.println(d);
        }
    }
    
    public void registarQueLlovioElDia(int dia, boolean llovio){
        DiasLluviosos d1 = new DiasLluviosos(dia, llovio);
        dias.add(d1);
    }
    
    public boolean consultarSiLlovioElDia(int _dia){
        boolean llovio = false;
        for(DiasLluviosos d : dias){
            if((d.getDia() == _dia) && (d.isLluvia()) ){
                
                llovio = true;
            }
        }
        return llovio;
    }
    
    public int contarDiasLluviosos(){
        int cont = 0;
        for(DiasLluviosos d : dias){
            if(d.isLluvia()){
                cont++;
            }
        }
        return cont;
    }
    
    public int consultarCuatrimestreMasLluvioso(){
        int uno, dos, tres;
        uno = dos = tres = 0;
        for(int i = 0; i < dias.size(); i++){
            if(i < 123 && dias.get(i).isLluvia()){
                uno++;
            }else if(i >= 122 && i < 244 && dias.get(i).isLluvia()){
                dos++;
            }else if(i >= 244 && i <= 366 && dias.get(i).isLluvia()){
                tres++;
            }
        }
        System.out.println("----------------------");
        System.out.println("    1º cuatri:"+ uno);
        System.out.println("    2º cuatri:"+ dos);
        System.out.println("    3º cuatri:"+ tres);
        System.out.println("----------------------");
        
        if(uno > dos && uno > tres){
            return 1;
        }else if (dos > tres){
            return 2;
        }else{
            return 3;
        }
    }
    
    public int consultarPrimerDiaConLluvia(){
        int diaQueLlovio = 0;
        for(DiasLluviosos d : dias){
            if(d.isLluvia()){
                diaQueLlovio = d.getDia();
                break;
            }
        }
        return diaQueLlovio;
    }
    
    
    
    
}
