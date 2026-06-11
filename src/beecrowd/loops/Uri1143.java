package beecrowd.loops;

import java.util.Scanner;

public class Uri1143 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int numero = 1; numero <= n; numero++) {
            System.out.println(numero + " " + numero*numero + " " + numero*numero*numero);
        }

        scanner.close();
    }
}
