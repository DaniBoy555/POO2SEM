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
public class Q14 {
    
    public static void main(String[] args) {
        

        Scanner tc = new Scanner (System.in);
        
        System.out.println("Digite suas 3 notas");
        double n1 = tc.nextDouble();
        double n2 = tc.nextDouble();
        double n3 = tc.nextDouble();
        
        double media = (n1 + n2 + n3)/3;
        System.out.println("Média: " + media);
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media < 4){
            System.out.println("Reprovado direto");
        }else{
            System.out.println("Recuperação");
        }
    }
    
}
