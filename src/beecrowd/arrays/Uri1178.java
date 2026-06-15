package beecrowd.arrays;

import java.util.Scanner;

public class Uri1178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double[] vetor = new double[100];
        vetor[0] = x;

        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] / 2;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("N[%d] = %.4f%n", i, vetor[i]);
        }

        scanner.close();
    }
}
