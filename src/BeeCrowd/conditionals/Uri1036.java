package BeeCrowd.conditionals;

import java.util.Scanner;

public class Uri1036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A,B,C;

        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double delta = B*B - (4 * A * C);

        if (A == 0 || delta < 0) {

            System.out.println("Impossivel calcular");
            return;
        }

        double x1 = (-B + Math.sqrt(delta))/(2*A);
        double x2 = (-B - Math.sqrt(delta))/(2*A);

            System.out.printf("R1 = %.5f%n", x1);
            System.out.printf("R2 = %.5f%n", x2);



        scanner.close();
    }
}
