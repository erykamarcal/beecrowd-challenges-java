package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3;
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        valor3 = scanner.nextInt();

        int originalValor1 = valor1;
        int originalValor2 = valor2;
        int originalValor3 = valor3;

        if (valor1 > valor2) {
            int temporaria = valor1;
            valor1 = valor2;
            valor2 = temporaria;
        }
        if (valor1 > valor3) {
            int temporaria = valor1;
            valor1 = valor3;
            valor3 = temporaria;
        }
        if (valor2 > valor3){
            int temporario = valor2;
            valor2 =valor3;
            valor3 = temporario;
        }
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println();
        System.out.println(originalValor1);
        System.out.println(originalValor2);
        System.out.println(originalValor3);

        scanner.close();
    }
}
