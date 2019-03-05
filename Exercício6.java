
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício6 {
    
    public static void main(String[] args) {

        String dado;
        int soma = 0;
        int[] arrayInt = new int[10];

        for (int i = 0; i < 10; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);

            soma = soma + arrayInt[i];

        }
        
         System.out.println(soma);
        }
         
    }

