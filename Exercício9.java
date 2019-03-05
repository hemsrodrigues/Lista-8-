
package ldp10Arrays;

import javax.swing.JOptionPane;

public class Exercício9 {
    public static void main(String[] args) {

        String dado;
        int[] arrayInt = new int[10];
        int i = 0;
        int maior = 0;
        int menor = 0;
        
        dado = JOptionPane.showInputDialog(null, "Digite um valor");
        arrayInt[i] = Integer.parseInt(dado);
        

            for (i = 0; i < 10; i++) {
        dado = JOptionPane.showInputDialog(null, "Digite um valor");
        arrayInt[i] = Integer.parseInt(dado);
        maior = arrayInt[0];
        menor = arrayInt[0];
            
            if(arrayInt[i]>maior){
              maior = arrayInt[i];
            }
            if(arrayInt[i]<menor){
              menor = arrayInt[i];
            }

        }
        
         System.out.println(maior);
         System.out.println(menor);
        }
    
}
