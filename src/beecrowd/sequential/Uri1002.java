package beecrowd.sequential;

import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double raio = scanner.nextDouble();
    double area = 3.14159 * Math.pow(raio,2);
        System.out.printf("A=%.4f%n", area);



     scanner.close();
    }
}
