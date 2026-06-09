package beecrowd.loops;

import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int menorNumero = Math.min(x, y);
        int maiorNumero = Math.max(x, y);
        int soma = 0;
        int impares = 0;

        for (int i = menorNumero + 1; i < maiorNumero ; i++) {
            if(i % 2 != 0){

                soma = soma + i;
            }
        }
        System.out.println(soma);
        scanner.close();
    }
}
