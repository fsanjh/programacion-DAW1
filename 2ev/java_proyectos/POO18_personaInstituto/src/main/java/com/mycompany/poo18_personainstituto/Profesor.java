/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_personainstituto;

public class Profesor extends Trabajador {
    private String departamento;

    public Profesor(String nombre, String dni, int nrp, String departamento) {
        super(nombre, dni, nrp);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() +", y profesor del departamento de "+ departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
