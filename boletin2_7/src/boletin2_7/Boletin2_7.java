 
package boletin2_7;

import javax.swing.JOptionPane;

public class Boletin2_7 {

    
    public static void main(String[] args) {
       float renta_mensual, nominal, interes_anual, tiempo;
       
       renta_mensual=Float.parseFloat(JOptionPane.showInputDialog("Introduzca renta mensual"));
       nominal=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el nominal"));
       interes_anual=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el interés anual"));
       tiempo=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el nº de años"));
       tiempo=tiempo * 12;
       interes_anual=interes_anual/1200;
       double auxiliar=Math.pow((1+interes_anual),tiempo);
       renta_mensual=(float)( nominal*auxiliar*interes_anual/(auxiliar+1)); //el (float) es para pasar los double
       
             JOptionPane.showMessageDialog(null, "Renta Mensual="+renta_mensual);
                       
        
    }
    
}
