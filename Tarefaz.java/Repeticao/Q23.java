
package repeticao;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q23 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite as duas notas");
        double n1 = tc.nextDouble();
        double n2 = tc.nextDouble();
        
        while((n1 <0 || n2 < 0) || (n1 > 10 || n2 > 10)){
            System.out.println("Só são aceitas notas entre 0 e 10, por favor digite de novo");
            n1 = tc.nextDouble();
            n2 = tc.nextDouble();
        }
    }
    
}
