package Modulos;

/**
 *
 * @author fsanj
 */
public class Suma{
    private double a;
    private double b;

    public Suma(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }

    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b = b;
    }
    
    public double sumar(){
        return a + b;
    }
    
}
