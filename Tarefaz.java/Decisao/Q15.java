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
public class Q15 {
    
    public static void main(String[] args) {
        
        
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite seu ano de nascimento");
        int anoN = tc.nextInt();
        System.out.println("Digite o ano atual");
        int anoA = tc.nextInt();
        
        if((anoA - anoN) < 16){
            System.out.println("Não pode votar");
        }else{
            System.out.println("Pode votar");
        }
    }
}
