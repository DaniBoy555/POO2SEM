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
public class Q2{
    public static int somarVetor (int[]n) {
     
       int somar = 0;
       
        for (int i = 0; i < n.length; i++) {
            
          somar += n [i];  
            
       
        }
        return somar;
      
        
    }
    public static void main(String[] args) {
        
        int n [] = new int [5];
        
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite 5 numeros");
        
        for (int i = 0; i < n.length; i++) {
            n [i] = ler.nextInt();
            
            
            System.out.println("a Soma dos numeros:");
            System.out.println(somarVetor(n));
            
        }
      
       
    }
    
}
