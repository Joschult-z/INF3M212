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
public class CalIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float altura1, peso, imc;
        Scanner leia = new Scanner(System.in);

        System.out.println("-- Bem-Vindo a Calc.IMC --");
        System.out.print("Informe sua altura: ");
        altura1 = leia.nextFloat();
        System.out.print("Informe o peso: ");
        peso = leia.nextFloat();
        imc = peso / (altura1 * altura1);
        System.out.println("Seu IMC é de: " + imc);
        if (imc <= 18) {
            System.out.println("Seu IMC está abaixo do peso");
        }else if(imc<=24.9){
		          System.out.println("");
        }
    }
}
