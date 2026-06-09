package beecrowd.loops;

import java.util.Scanner;

public class Uri1074 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String tipo = "", sinal = "";
        for (int i = 0; i < n; i++) {
            int valor = scanner.nextInt();
            if (valor == 0) {
                System.out.println("NULL");
                continue;
            }
            if (valor % 2 == 0) {
               tipo = "EVEN";
            } else {
                tipo = "ODD";
            }
            if (valor > 0) {
                sinal = "POSITIVE";
            } else {
                sinal = "NEGATIVE";
            }
            System.out.println(tipo + " " + sinal);

        }
    }
}