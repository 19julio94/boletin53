

package boletin53;

/**
 *
 * @author jpatriciodasilva
 */
public class Circulo {
    private double radio;
    private final double PI = 3.14;
    //public Circulo
    public Circulo(){}
    public Circulo (double rad){
        radio=rad;
    }
      public void setRadio(double rad){
        radio=rad;
    }
    public double getRadio(){
        return radio;
    }
    public double calcularArea(){
        return PI * Math.pow(radio,2);
    }
    public double calcularLongitud(){
        return 2 * PI * radio;
    }
    
    
}
