package Modulos;

/**
 *
 * @author fsanj
 */
public class Division{
    private double a;
    private double b;

    public Division(double a, double b){
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
    
    public double dividir(){
        return a / b;
    }
}
