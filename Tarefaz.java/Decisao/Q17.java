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
public class Q17 {
    
    public static void main(String[] args) {
        
         int a, b, c;
        int maior = 0, meio = 0, menor = 0;
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite três números");
        a = tc.nextInt();
        b = tc.nextInt();
        c = tc.nextInt();
        
        if(a > b && b > c){
            maior = a;
            meio = b;
            menor = c;
        }else if(a > b && b < c){
            maior = a;
            meio = c;
            menor = b;
        }else{
            maior = c;
            meio = b;
            menor = a;
        } 
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
    
}
