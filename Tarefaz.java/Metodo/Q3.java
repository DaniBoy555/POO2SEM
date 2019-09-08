
package metodo;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q3 {
    public static void dividirTempo(int segundos){
        int minutos = segundos/60;
        int seconds = segundos - (minutos * 60);
        int horas = minutos/60;
        minutos = minutos - (horas * 60);
        
        System.out.println(horas + "horas, " + minutos + "minutos e " + seconds + " segundos");
    }
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o tempo da fabrica em segundos");
        int segundos = tc.nextInt();
        
        dividirTempo(segundos);
    }
}
