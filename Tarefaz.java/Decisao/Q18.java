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
public class Q18 {
    
    
        public static double calcularHoraExtra(double horaN, int qtHoras){
        double horaE = 0;
        if(qtHoras > 40){
            horaE = qtHoras - 40;
            horaE = horaE * (horaN + (horaN * 0.5));
        }
        double salario = qtHoras * horaN + horaE;
        return(salario);
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite o valor da hora trabalhada");
        double horaN = tc.nextDouble();
        System.out.println("Digite quantas horas foram trabalhadas");
        int qtHoras = tc.nextInt();
        
        System.out.println("Salário: " + calcularHoraExtra(horaN, qtHoras));
    }
    
}
