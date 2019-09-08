/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

import java.util.Scanner;


public class Q6 {
    
      
    public static boolean verificarPar(int n) {
        
        boolean verific = false;
        
        if (n % 2 == 0 ) {
            verific = true;
            
        } else {
            verific = false;
        }
        
    return verific;
    
}
   
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int v = 0;
        
        System.out.println("digite numero");
        v = ler.nextInt();
        
        System.out.println(verificarPar(v));
     
        
    }
}
   
