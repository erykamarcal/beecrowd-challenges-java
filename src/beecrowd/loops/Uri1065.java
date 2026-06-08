package beecrowd.loops;

import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosPares = 0;

        for (int i = 0; i < 5; i++) {
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado % 2 == 0) {
                numerosPares++;
            }
        }

        System.out.println(numerosPares + " valores pares");
        scanner.close();
    }
}
