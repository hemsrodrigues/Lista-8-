
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício7 {
    
    public static void main(String[] args) {

        String dado;
        float media = 0;
        float soma = 0;
        float[] arrayInt = new float[10];

        for (int i = 0; i < 10; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);

            soma = soma + arrayInt[i];
            media = soma/i;

        }
        
         System.out.println(media);
        }
}
