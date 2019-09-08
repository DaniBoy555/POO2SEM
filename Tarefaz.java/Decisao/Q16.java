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
 */
public class Q16 {
    
    public static void main(String[] args) {
        
         Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite dois números");
        int num1 = tc.nextInt();
        int num2 = tc.nextInt();
        
        if(num1 > num2){
            System.out.println("O maior é " + num1);
        }else{
            System.out.println("O maior é " + num2);
        }
    }
    
    
}
