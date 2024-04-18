package com.mycompany.ejercicioproductos;

/**
 *
 * @author Nocturno
 */
public class Fresco extends Producto{
    private String fechaEnvasado;
    private String pais;
    
    public Fresco(String _nombre, String _fecha, int _cod, String _fecha2, String _pais){
        super( _nombre, _fecha, _cod);
        this.fechaEnvasado = _fecha2;
        this.pais = _pais;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
    
    @Override
    public String toString(){
        return super.toString() + ", fecha envasado: "+ fechaEnvasado +", pais: "+ pais;
    }
    
}
