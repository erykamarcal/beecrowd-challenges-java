package beecrowd.loops;

import java.util.Scanner;

public class Uri1142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int numero = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(numero + " " + (numero + 1) + " " + (numero + 2) + " PUM");
            numero += 4;
        }
        scanner.close();
    }
}


