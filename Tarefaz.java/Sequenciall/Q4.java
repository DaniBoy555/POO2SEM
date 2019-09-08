
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q4 {
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = tc.nextInt();
        
        System.out.println("Antecessor: " + (num -1));
        System.out.println("Sucessor: " + (num +1));
    }
    
}
