/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisao;

import java.util.Scanner;

/**
 *
 * @author Daniel Victor 
public class Q11 {
    
    public static void main(String[] args) {
        
         Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int numero = tc.nextInt();
        
        if(numero > 10){
            System.out.println("É MAIOR QUE 10");
        }else if(numero < 10){
            System.out.println("É MENOR QUE 10");
        }
    }
    
}
