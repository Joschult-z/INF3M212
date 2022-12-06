/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj1;

import java.util.Scanner;

/**
 *
 * @author 182120023
 */
public class DiasVividos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade, diasV;
        String nome;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("-- Calculadora De Dias Vividos --");
        System.out.print("Informe seu Nome: ");
        nome = leia.next();
        System.out.print("Informe Sua Idade: ");
        idade = leia.nextInt();
        diasV = idade*365;
        System.out.println(nome + " Você ja viveu em torno de: "+ diasV);
        
        
        
        
    }
    
}
