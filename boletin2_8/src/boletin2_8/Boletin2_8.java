
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Boletin2_8 {

    public static void main(String[] args) {
        double Gc;//grados centígrados
        double Gf; //grados fahrenheit
        double Gk; //grados kelvin
        
        Gc=Double.parseDouble(JOptionPane.showInputDialog("Introduzca los grados centígrados"));
        Gf=Gc*1.8+32;
        Gk=Gc+273.15;
        JOptionPane.showMessageDialog(null, "Los grados fahrenheit son " + Gf + "y los grados kelvin son"+Gk);
    }
    
}
