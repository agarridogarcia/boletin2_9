
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Boletin2_9 {

    public static void main(String[] args) {
        float cant100; //cantidad de billetes de 100€
        float cant20; //cantidad de billetes de 20€
        float cant5; //cantidad billetes de 5€
        float cant1; //cantidad de monedas de 1€
        float total; 
        cant100=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 100€"));
        cant20=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 20€"));
        cant5=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 5€"));
        cant1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la cantidad de monedas de 1€"));
                total=cant100*100+cant20*20+cant5*5+cant1*1;
                JOptionPane.showMessageDialog(null, "El total de eros son=" +total);
                        
        
        
    }
    
}
