package beecrowd.arrays;

import java.util.Scanner;

public class Uri1180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        int menorValor = vetor[0];
        int posicaoMenorValor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenorValor = i;
            }
        }
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenorValor);
    }
}
