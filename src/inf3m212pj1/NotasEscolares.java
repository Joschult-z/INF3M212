/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3m212pj1;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author 182120023
 */
public class NotasEscolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mesma area para definir as variaveis locais.
        float nota1, nota2, nota3, nota4, media;
        Scanner leia = new Scanner(System.in);

        System.err.println("Notas Escolares");
        System.out.print("Informe a 1ª nota: ");
        nota1 = leia.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        nota2 = leia.nextFloat();
        System.out.print("Informe a 3ª nota: ");
        nota3 = leia.nextFloat();
        System.out.print("Informe a 4ª nota: ");
        nota4 = leia.nextFloat();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua Média foi de: " + media);
        System.out.printf("Sua Média foi de: |.2f", media);
        if (media >= 7) {
            System.out.println("\nVocê foi Aprovado, Filho do Einstein!");
        } else {
            System.out.println("\nReprovado, Burro do kralho.");
        }
    }
}
