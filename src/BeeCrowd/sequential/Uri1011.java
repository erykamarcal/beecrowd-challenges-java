package BeeCrowd.sequential;

import java.util.Scanner;

public class Uri1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double volume = (4.0/3) * 3.14159 * Math.pow(R,3);
        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }
}
