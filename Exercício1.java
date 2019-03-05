
package ldp10Arrays;

public class Exercício1 {
    public static void main(String[] args) {
        
        int[] arrayInt= new int [10];
        
        for (int i = 0; i < 10; i++){
            arrayInt[i] = i*10; 
        }
        
        for (int i = 0; i < 10; i++){
            arrayInt[i] = i*10; 
            
            System.out.print("\tPosição i: " +i+ "\tValor: " +arrayInt[i]);
    }
  }     
}
