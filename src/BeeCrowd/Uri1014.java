package BeeCrowd;

import java.util.Scanner;

public class Uri1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida;
        double combustivelGasto;

        distanciaPercorrida = scanner.nextInt();
        combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida/combustivelGasto;
        System.out.printf("%.3f km/l%n", consumoMedio);


        scanner.close();
    }
}
