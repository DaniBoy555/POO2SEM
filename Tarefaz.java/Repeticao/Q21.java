
package repeticao;
import java.util.Scanner;
/**
 *
 * @author Daniel Victor
 */
public class Q21 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite dois valores");
        int v1 = tc.nextInt();
        int v2 = tc.nextInt();
        
        while(v2 == 0){
            System.out.println("O segundo valor não pode ser 0. Digite-o de novo");
            v2 = tc.nextInt();
        }
    }
}
