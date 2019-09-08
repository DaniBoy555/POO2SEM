
package repeticao;
import java.util.Scanner;
/**
 *
 * @authorDaniel victor
public class Q22 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite dois valores");
        int v1 = tc.nextInt();
        int v2 = tc.nextInt();
        
        while(v2 == 0){
            System.out.println("VALOR INVÁLIDO");
            v2 = tc.nextInt();
        }
    }
    
}
