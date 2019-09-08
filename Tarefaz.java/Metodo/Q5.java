/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
 */
public class Q5 {
    
    public static void comparaVet(int val []) {
        
       int maior = 0;
       int menor = val [25];
        for (int i = 0; i < val.length ; i++) {
            if ( val [i] > maior) {
                maior = val [i];
                
                
            }if (val[i] < menor ) {
                
                menor = val [i];
                
            }
            
        }
         System.out.println("maior:"+maior+"menor"+menor);   
        }
       
       
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        int val[] = new int [50];
        
        System.out.println("digite 50 numros");
        for (int i = 0; i < val.length; i++) {
            val [i] = ler.nextInt();
            
            
        }
        comparaVet(val);
        
    }
}
