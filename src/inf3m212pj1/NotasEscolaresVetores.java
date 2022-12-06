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
public class NotasEscolaresVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];//vetor de posições

        System.out.println("Notas Escolares");
        for (int i = 0; i < 4; i++) {
            do {
                System.out.print("Informe a " + (i + 1) + "ª nota: ");
                notas[i] = leiaFloat();
                if (validaNota(notas[i])) {
                    System.out.println("Nota Inválida tente novamente!");
                }
            } while (validaNota(notas[i]));//significa ou
            notas[4] += notas[i];
        }// fim do for
        notas[4] = notas[4] / 4;//faz a média
        System.out.println("Sua média foi de: " + notas[4]);
        if (notas[4] >= 7) {
            System.out.println("nerd, foi aprovado");
        } else {
            System.out.println("burro, foi reprovado");
        }//fim if
    }//fim main

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;
            
    }
    public static float leiaFloat(){
        Scanner leia = new Scanner(System.in);
        try{
            return leia.nextFloat();
        }catch (Exception e) {
            System.out.print("Valor não é núm, tente novamente: ");
            return leiaFloat();
        }
    }//fim float leia

}//finish
