
package sequenciall;

import java.util.Scanner;

/**
 *
 * @authorDaniel Victor 
 */
public class Q7 {
    public static double calcReajuste(double sma, double pr){
        pr = pr/100;
        double novoSalario = sma + (sma * pr);
        return(novoSalario);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o salário mensal atual do funcionário");
        double sma = tc.nextDouble();
        System.out.println("Digite o percentual de reajuste");
        double pr = tc.nextDouble();
        
        System.out.println("O novo salário é " + calcReajuste(sma, pr));
    }
    
}
