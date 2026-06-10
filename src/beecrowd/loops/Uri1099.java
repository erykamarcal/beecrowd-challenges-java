package beecrowd.loops;

import java.util.Scanner;

public class Uri1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x, y;

        for (int i = 0; i < n; i++) {

            x = scanner.nextInt();
            y = scanner.nextInt();

            int maior = Math.max(x, y);
            int menor = Math.min(x, y);
            int soma = 0;

            for (int numero = menor + 1; numero < maior; numero++) {
                if (numero % 2 != 0) {
                    soma += numero;
                }
            }
            System.out.println(soma);
        }
        scanner.close();
    }
}
