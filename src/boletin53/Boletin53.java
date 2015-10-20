package boletin53;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin53 {

    public static void main(String[] args) {
        String radio = JOptionPane.showInputDialog("Introduce el radio:");
        Circulo circulo1 = new Circulo(Double.parseDouble(radio));
        JOptionPane.showMessageDialog(null, "El área  es " + circulo1.calcularArea() + "\n"
                + "La longitud es " + circulo1.calcularLongitud());
       
    }
    
}
