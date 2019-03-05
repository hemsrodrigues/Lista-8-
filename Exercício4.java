
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício4 {
    
    public static void main(String[] args) {
                
        String [] palavra = new String [5];

        for (int i = 0; i < 5; i++) {
            palavra [i] = JOptionPane.showInputDialog(null, "Digite uma palavra");
            }

        for (int i = 0; i < 5; i++) {
            System.out.println(palavra[i]);
        }

    }
}    
