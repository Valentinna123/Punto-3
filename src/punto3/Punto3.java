
package punto3;

import javax.swing.JOptionPane;


public class Punto3 {
    Conversiones c1,c2,c3;
    
    
    public static void main(String[] args) {
       Punto3 ob= new Punto3();
       ob.metodo();
        
    }
    public void metodo(){
        c1=new Fa();
        c2=new Ce();
        c3=new CENT();
        
        float grados;
        
        grados=Integer.parseInt(JOptionPane.showInputDialog("Digite los grados celsius"));
        JOptionPane.showMessageDialog(null," Los grados celsius en Fahrenheit son " + c1.conversiones(grados));
        grados=Integer.parseInt(JOptionPane.showInputDialog("Digite los grados Fahrenheit"));
        JOptionPane.showMessageDialog(null," Los grados Fahrenheit a Centigradso son " + c2.conversiones(grados));
        grados=Integer.parseInt(JOptionPane.showInputDialog("Digite los Fahrenheit celsius"));
        JOptionPane.showMessageDialog(null," Los grados Fahrenheit a Celsius son  " + c3.conversiones(grados));
    }
    
}
