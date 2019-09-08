
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q9 {
    public static double calcularSalario(double sf, double cf, double valven, int qt){
       double salarioFinal = sf + cf * qt;
       salarioFinal = salarioFinal + salarioFinal * qt;
       salarioFinal = salarioFinal + valven * 0.05;
       
       return(salarioFinal);
    }
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o salário fixo do funcionário");
        double sf = tc.nextDouble();
        System.out.println("Digite a comissão por venda");
        double cf = tc.nextDouble();
        System.out.println("Digite o valor total das vendas feitas pelo funcionário");
        double valven = tc.nextDouble();
        System.out.println("Digite a quantidade de vendas feitas pelo funcionário");
        int qt = tc.nextInt();
        
        System.out.println("O salário final do funcionário é:");
        System.out.println(calcularSalario(sf, cf, valven, qt));
    }
}
