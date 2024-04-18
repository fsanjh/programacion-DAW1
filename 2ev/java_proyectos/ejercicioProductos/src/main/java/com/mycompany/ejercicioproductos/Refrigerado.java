package com.mycompany.ejercicioproductos;

/**
 *
 * @author Nocturno
 */
public class Refrigerado extends Producto{
    private int codSupervision;

    public Refrigerado(String  _nombre, String _fecha, int _num, int codSupervision) {
        super( _nombre, _fecha, _num);
        this.codSupervision = codSupervision;
    }

    public int getCodSupervision() {
        return codSupervision;
    }
    public void setCodSupervision(int codSupervision) {
        this.codSupervision = codSupervision;
    }
    
    

    @Override
    public String toString() {
        return super.toString() + ", codigo supervision: "+ codSupervision;
    }
    
    
    
    
    
}
