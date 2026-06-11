package beecrowd.loops;

import java.util.Scanner;

public class Uri1119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (contador < 2) {

            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / 2;

        System.out.printf("media = %.2f%n", media);

        scanner.close();
    }
}

