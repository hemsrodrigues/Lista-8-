
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício8 {
    
    public static void main(String[] args) {

        String dado;
        int soma = 0;
        int[] arrayInt = new int[5];
        int i = 0;
        
        dado = JOptionPane.showInputDialog(null, "Digite um valor");
        arrayInt[i] = Integer.parseInt(dado);
        int maior = arrayInt[0];

            for (i = 0; i < 5; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);

            if(arrayInt[i]>maior){
              maior = arrayInt[i];
            }

        }
        
         System.out.println(maior);
        }
}
