
package repeticao;
import java.util.Scanner;
/**
 *
 * @authorDaniel Victor 
 */
public class Q28 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um valor");
        int num = tc.nextInt();
        
        while(num < 0 || num > 10){
            System.out.println("Só são aceitos números entre 1 e 10, digite de novo");
            num = tc.nextInt();
        }
        
        for(int i = 1; i < 11; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
    
}
