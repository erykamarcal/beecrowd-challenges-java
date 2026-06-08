package beecrowd.loops;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positivos = 0;
        double somaMedia = 0;

        for (int i = 0; i < 6; i++) {
            double numeroDigitado = scanner.nextDouble();
            if (numeroDigitado > 0) {
                positivos++;
                somaMedia = somaMedia + numeroDigitado;
            }
        }
        System.out.println(positivos + " valores positivos");
        double media = somaMedia / positivos;
        System.out.printf("%.1f%n",media);

    scanner.close();
    }
}
