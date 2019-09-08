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
public class Q1 {
        public static int somarMedia(int n1, int n2 ,int n3) {
            int somar;
            return somar = (n1 + n2 + n3)/3;
        
    }
    
    
    public static void main(String[] args) {
        
         Scanner ler = new Scanner (System.in);
         System.out.println("digite sua 1º nota");
         int n1 = ler.nextInt();
         System.out.println("digite sua 2º nota");
         int n2 = ler.nextInt();
          System.out.println("digite sua 3º nota");
         int n3 = ler.nextInt();
         
         System.out.println ("a sua media é = " + somarMedia(n1,n2,n3));
    }
    
}
