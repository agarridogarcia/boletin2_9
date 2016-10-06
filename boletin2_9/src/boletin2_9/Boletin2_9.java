
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author agarridogarcia
 */
public class Boletin2_9 {

    public static void main(String[] args) {
        long cant100; //cantidad de billetes de 100€
        long cant20; //cantidad de billetes de 20€
        long cant5; //cantidad billetes de 5€
        long cant1; //cantidad de monedas de 1€
        double total; 
        cant100=Long.parseLong(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 100€"));
        cant20=Long.parseLong(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 20€"));
        cant5=Long.parseLong(JOptionPane.showInputDialog("Introduzca la cantidad de billetes de 5€"));
        cant1=Long.parseLong(JOptionPane.showInputDialog("Introduzca la cantidad de monedas de 1€"));
                total=cant100*100+cant20*20+cant5*5+cant1*1;
                JOptionPane.showMessageDialog(null, "El total de eros son=" +total);
                        
        
        
    }
    
}
