/**
 *
 * @author fsanj
 */

package com.mycompany.poo14_figurassuperheroes;

public class Superheroe {
    private String nombre;
    private String desc;
    private boolean capa;
    
    public Superheroe(String _nombre){
        this.nombre = _nombre;
        this.desc = "";
        this.capa = false;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isCapa() {
        return capa;
    }
    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        String capaS = "";
        if (capa){
            capaS = "Sí";
        }else{
            capaS = "No";
        }
        return "Figura de: "+ nombre +"\nDescripción: "+ desc +"\n¿Tiene capa? "+ capaS;
    }
    
    
    
    
}
