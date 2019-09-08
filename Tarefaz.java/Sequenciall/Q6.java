
package sequenciall;

import java.util.Scanner;

/**
 *
 * @authorDaniel Victor 
 */
public class Q6 {
    
    public static double calcularPercentual(double total, double variante){
        return((variante / total )*100);
    }
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o total de eleitores do municipio");
        int total = tc.nextInt();
        System.out.println("Digite o número de votos válidos");
        int validos = tc.nextInt();
        System.out.println("Digite o número de votos brancos");
        int brancos = tc.nextInt();
        System.out.println("Digite o número de votos nulos");
        int nulos = tc.nextInt();
        
        System.out.println("Houve " + calcularPercentual(total, validos) + "% de votos válidos");
        System.out.println(calcularPercentual(total, brancos) + "% de votos brancos");
        System.out.println("E " + calcularPercentual(total, nulos) + "% de nulos");
        
        
    }
    
}
