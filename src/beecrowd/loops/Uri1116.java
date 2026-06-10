package beecrowd.loops;

import java.util.Scanner;

public class Uri1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            int primeiro = scanner.nextInt();
            int segundo = scanner.nextInt();

            if (segundo == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) primeiro / segundo;
                System.out.printf("%.1f%n", divisao);
            }
        }
        scanner.close();
    }
}
