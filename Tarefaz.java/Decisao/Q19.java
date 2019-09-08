
package decisao;
import java.util.Scanner;
/**
 *
 * @author Daniel Victor 
 */
public class Q19 {
    public static double calcularSaldo(double saldo, double debito, double credito){
        double saldoAtual = saldo + credito - debito;
        return(saldoAtual);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o número da sua conta, o seu saldo, o seu débito e o seu crédito");
        String numConta = tc.next();
        double saldo = tc.nextDouble();
        double debito = tc.nextDouble();
        double credito = tc.nextDouble();
        
        double saldoAtual = calcularSaldo(saldo, debito, credito);
        
        System.out.println("Seu saldo atual é: " + saldoAtual);
        if(saldoAtual > 0){
            System.out.println("Seu saldo é positivo");
        }else if(saldoAtual < 0){
            System.out.println("Seu saldo é negativo");
        }
        
    }
}
