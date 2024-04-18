
package com.mycompany.poo16_cocheherencia;

/**
 *
 * @author Nocturno
 */
public class Familiar extends Coche {
    private boolean esFamiliar;
    
    public Familiar(String _matricula, String _marca, String _modelo, String _color, int _ruedas, int _puertas, boolean _esFamiliar){
        super (_matricula, _marca, _modelo, _color, _ruedas, _puertas);
        this.esFamiliar = _esFamiliar;
        
    }
    
    public void info(){
        super.info();
        if(this.esFamiliar){
            System.out.print(" y es un coche familiar");
        }else{
            System.out.print(" y no es un coche familiar");
        }
    }
    
    
    
    
    
    
}
