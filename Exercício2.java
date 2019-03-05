
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício2 {
  
    public static void main(String[] args) {

        String dado;
        int[] arrayInt = new int[10];

        for (int i = 0; i < 10; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);

            if (arrayInt[i] < 10) {
                System.out.println(arrayInt[i]);
            }

        }

    }
}
