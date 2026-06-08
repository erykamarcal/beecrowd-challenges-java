package beecrowd.loops;

import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valoresPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double valorDigitado = scanner.nextDouble();
            if (valorDigitado > 0){

                valoresPositivos++;
            }
        }
        System.out.println(valoresPositivos + " valores positivos");
        scanner.close();
    }
}
