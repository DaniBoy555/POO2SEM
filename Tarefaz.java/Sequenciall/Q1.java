
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q1 {
    
    public static void main(String[] args) {
        System.out.println("Digite três notas");
        Scanner teclado = new Scanner(System.in);
        double nota1 = teclado.nextDouble();
        double nota2 = teclado.nextDouble();
        double nota3 = teclado.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média é " + media);
    }
    
}
