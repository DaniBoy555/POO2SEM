
package sequenciall;

import java.util.Scanner;
/**
 *
 * @author Daniel Victor 
 */
public class Q8 {
    public static double calcCustoFinal(double custoFab){
        double perDist = 0.28;
        double imposto = 0.45;
        
        double custoFinal = custoFab + ((custoFab + (custoFab * perDist))* imposto);
        
        return(custoFinal);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o custo de fábrica");
        double custo = tc.nextDouble();
        
        System.out.println("Preço total:");
        System.out.println(calcCustoFinal(custo));
    }
    
}
