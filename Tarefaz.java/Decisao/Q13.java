
package decisao;
import java.util.Scanner;
/**
 *
 * @authorDaniel Victor 
 */
public class Q13 {
    public static double precoMacas(int qt){
        double preco = 0;
        
        if(qt < 12){
           preco = qt * 1.30;
        }else{
           preco = qt *1 ;
        }
        return(preco);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite quantas maçãs você quer");
        int qt = tc.nextInt();
        
        System.out.println("Vai custar " + precoMacas(qt));
    }
}
