
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q10 {
    public static void main(String[] args) {
        System.out.println("Digite a base e a altura do retangulo");
        Scanner tc = new Scanner(System.in);
        int base = tc.nextInt();
        int altura = tc.nextInt();
        
        System.out.println("A área do retangulo é " + base * altura);
    }
    
}
