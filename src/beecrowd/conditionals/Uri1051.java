package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 2000.00){
            System.out.println("Isento");
            return;
        }
        if ((salario <= 3000.00)){
            imposto = 0.08 * (salario - 2000.00);
            System.out.printf("R$ %.2f%n", imposto);
            return;
        }
        if (salario <= 4500.00){
            imposto = 0.18 * (salario - 3000.00) + 80.00;
            System.out.printf("R$ %.2f%n", imposto);
            return;
        }
        imposto = 0.28 * (salario - 4500.00) + 350.00;
        System.out.printf("R$ %.2f%n", imposto);

        scanner.close();
    }
}
