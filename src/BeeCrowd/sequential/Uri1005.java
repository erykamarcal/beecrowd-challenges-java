package BeeCrowd.sequential;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A, B;
        A = scanner.nextDouble();
        B = scanner.nextDouble();

        double media = ((A*3.5) + (B*7.5))/11;
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
