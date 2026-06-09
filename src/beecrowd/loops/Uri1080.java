package beecrowd.loops;

import java.util.Scanner;

public class Uri1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorValor = scanner.nextInt();
        int posicao = 1;

        for (int i = 2; i <= 100; i++) {
            int valor = scanner.nextInt();

            if (valor > maiorValor) {
                maiorValor = valor;
                posicao = i; }

        }
        System.out.println(maiorValor);
        System.out.println(posicao );


        scanner.close();
    }
}
