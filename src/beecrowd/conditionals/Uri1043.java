package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A, B, C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        if ((A<B+C) && (B<A+C) && C<A+B){
            double perimetro = A+B+C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((A+B)*C)/2;
            System.out.printf("Area = %.1f%n", area);
        }

        scanner.close();
    }
}
