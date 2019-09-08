
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q2 {
    
    public static double calcularArea(double base, double altura){
        return((base * altura)/2);
    }
    
    public static void main(String[] args) {
        System.out.println("Digite a base do triângulo");
        Scanner tc = new Scanner(System.in);
        double base = tc.nextDouble();
        
        System.out.println("Digite a altura do triângulo");
        double altura = tc.nextDouble();
        
        System.out.println("A área do triângulo é " + calcularArea(base, altura));
    }
    
}
