/**
 *
 * @author fsanj
 */
package com.mycompany.poo15_cuentav2;


public class Cuenta {
    private int cuenta;
    private double dinero;
   
    public Cuenta(int _cuenta, double _dinero){
        this.cuenta = _cuenta;
        this.dinero = _dinero;
    }
    public Cuenta(){
        this.cuenta = (int) (Math.random() * 900000 + 1);
        this.dinero = 0;
    }

    //GETTER & SETTER
    public int getCuenta() {
        return cuenta;
    }
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public double getDinero() {
        return dinero;
    }
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    //Ingresar dinero
    public boolean ingreso(double cantidad){
        if(cantidad <= 0){
            //No se puede ingresar una cantidad negativa
            return false;
        }else{
            this.dinero += cantidad;
            //Ingreso correcto
            return true;
        }
    }
    //Retirar dinero
    public boolean reintegro(double cantidad){
        cantidad = Math.abs(cantidad); //En caso de que se introduzca una cantidad negativa
        if((this.dinero - cantidad) < 0){
            //No puede retirar más de lo que hay
            return false;
        }else{
            //Retirada correcta
            this.dinero -= cantidad;
            return true;
        }
    }
    //Transferencia entre cuentas
    public boolean transferencia(Cuenta cuentaDestino, double cantidad){
        if(cuentaDestino.getCuenta() == this.cuenta){ //Transferencia de una cuenta hacia si misma
            return false;
        }else{
            if((this.dinero - cantidad) < 0){ //Si la cantidad es mayor al total de la cuentaOrigen
                return false;
            }else{ //Transferencia correcta
                this.dinero -= cantidad;
                cuentaDestino.setDinero(cuentaDestino.getDinero()+cantidad);
                return true;
            }
        }
    }
    
    
    
    
    
}
