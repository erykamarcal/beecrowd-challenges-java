package beecrowd.matrix;

import java.util.Scanner;

public class Uri1182 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int colunaDaMatriz = scanner.nextInt();
        char operacao = scanner.next().charAt(0);

        double[][] matriz = new double[12][12];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        double somaDaColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaDaColuna += matriz[i][colunaDaMatriz];
        }

        if (operacao == 'S') {
            System.out.printf("%.1f%n", somaDaColuna);
        } else {
            System.out.printf("%.1f%n", somaDaColuna / 12);
        }

        scanner.close();
    }
}
