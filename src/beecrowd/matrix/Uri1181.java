package beecrowd.matrix;

import java.util.Scanner;

public class Uri1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhaDaMatriz = scanner.nextInt();
        char operacao = scanner.next().charAt(0);

        double [][] matriz = new double[12][12];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        double somaDalinha = 0;

        for (int j = 0; j < matriz.length; j++) {
            somaDalinha += matriz[linhaDaMatriz][j];
        }

        if (operacao == 'S') {
            System.out.printf("%.1f%n", somaDalinha);
        } else {
            System.out.printf("%.1f%n", somaDalinha / 12);
        }

        scanner.close();
    }
}
