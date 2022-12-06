package projeto;

import java.util.Scanner;

public class NotasEscMatriz {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("-Notas Escolares Matriz-");
        System.out.print("Número de alunos: ");
        int nAlunos = (int) leiaFloat();
        System.out.print("Quantas notas ? ");
        int nNotas = (int) leiaFloat();

        String alunos[] = new String[nAlunos];
        float notas[][] = new float[nAlunos][nNotas + 1];

        for (int i = 0; i < nAlunos; i++) {
            System.out.print("Nome do aluno: ");
            alunos[i] = leia.next();
            for (int j = 0; j < nNotas; j++) {
                do {
                    System.out.print("Digite a " + (j + 1) + "ª nota: ");
                    notas[i][j] = leiaFloat();
                    if (validaNota(notas[i][j])) {
                        System.out.println("Nota Inválida, por favor, tente novamente!");
                    }
                } while (validaNota(notas[i][j]));
                notas[i][nNotas] += notas[i][j];
            } // For nota
            notas[i][nNotas] = notas[i][nNotas] / nNotas;
        } // For aluno
        leia.close();
    }// Static

    public static boolean validaNota(float nota) {
        return nota < 0 || nota > 10;

    }// Boolean

    public static float leiaFloat() {
        Scanner leia = new Scanner(System.in);
        try {
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.print("Valor não é um número, tente novamente: ");
            return leiaFloat();
        }
    }// Float

}// Class
