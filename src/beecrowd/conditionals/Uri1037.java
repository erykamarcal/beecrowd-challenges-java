package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorDigitado;

        valorDigitado = scanner.nextDouble();


        if (valorDigitado < 0 || valorDigitado > 100){
            System.out.println("Fora de intervalo");
            return;
        }
        if (valorDigitado <= 25){
            System.out.println("Intervalo [0,25]");
            return;
        }
        if (valorDigitado <= 50){
            System.out.println("Intervalo (25,50]");
            return;
        }
        if (valorDigitado <= 75){
            System.out.println("Intervalo (50,75]");
            return;
        }
        System.out.println("Intervalo (75,100]");

        scanner.close();
    }
}
