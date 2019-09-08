
package repeticao;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q30 {
    public static void main(String[] args) {
       Scanner tc = new Scanner(System.in);
    
    int soma = 0;
    
    for(int i = 0; i < 10; i++){
    int num = tc.nextInt();
    if(num > 40){
        soma = soma + num;
    }
}
        System.out.println(soma);
    }
    
    
    
}
    

