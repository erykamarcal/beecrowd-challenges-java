package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;

        x = scanner.nextDouble();
        y = scanner.nextDouble();
        if (x == 0 && y == 0) {
            System.out.println("Origem");
            return;
        }
        if (x == 0) {
            System.out.println("Eixo Y");
            return;
        }
        if (y == 0) {
            System.out.println("Eixo X");
            return;
        }
        if (x > 0 && y > 0) {
            System.out.println("Q1");
            return;
        }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
            return;
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
            return;
        }
        System.out.println("Q4");

        scanner.close();
    }
}
