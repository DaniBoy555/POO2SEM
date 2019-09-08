
package decisao;
import java.util.Scanner;
/**
 *
 * @author Daniel Victor 
 */
public class Q20 {
     public static double calcularSalario(double salarioFixo, double totalVendas){
         double comissao = 0;
         if(totalVendas > 1500){
             comissao = ((totalVendas - 1500)* 0.05) + 1500 * 0.03;
         }else{
             comissao = totalVendas * 0.03;
         }
         double salarioFinal = salarioFixo + comissao;
         return(salarioFinal);
     }
     public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
         System.out.println("Digite o salário fixo do funcionário e o seu total de vendas");
         double sf = tc.nextDouble();
         double tv = tc.nextDouble();
         
         System.out.println("Salário final: " + calcularSalario(sf, tv));
    }
    
}
