
package sequenciall;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q5 {
    public static int contarDias(int aa, int mm, int dd){
        return((aa * 365) + (mm * 30) + dd);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite sua idade em anos, meses e dias.");
        System.out.println("Quantos anos você tem:");
        int ano = tc.nextInt();
        System.out.println("Quantos meses desde que completou ano:");
        int mes = tc.nextInt();
        System.out.println("Quantos dias desde que completou o último mês:");
        int dia = tc.nextInt();
        
        System.out.println("Você viveu " + contarDias(ano, mes, dia) + " dias");
    }
    
}
