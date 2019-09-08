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
public class Q7 {
    public static boolean verificarPositivo(int n) {
        
        boolean verific = false;
        
        if (n >= 0) {
            verific = true;
            
            
            
        } else {
            verific = false;
            
            
        }
        return verific;
        
    }
    
    
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int v = 0;
        System.out.println("digite um numero");
        v = ler.nextInt();
        
        System.out.println(verificarPositivo(v));
        
    }
    
}
