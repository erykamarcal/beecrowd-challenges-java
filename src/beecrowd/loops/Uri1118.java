package beecrowd.loops;

import java.util.Scanner;

public class Uri1118 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int opcao = 1;

    while (opcao == 1) {

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

        System.out.printf("media = %.2f%n", soma / 2);

        do {
            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = scanner.nextInt();

        } while (opcao != 1 && opcao != 2);
    }

    scanner.close();
}
}
