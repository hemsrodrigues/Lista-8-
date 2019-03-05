
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício3 {
    
    public static void main(String[] args) {

        String dado;
        int[] arrayInt = new int[10];

        for (int i = 0; i < 10; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);
        }

        for (int i = 9; i >=0; i--) {
            System.out.println(arrayInt[i]);
        }

    }
}
