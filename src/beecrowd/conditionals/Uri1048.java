package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double percentualReajuste;

        if (salario > 0 && salario <= 400.00) {
            percentualReajuste = 0.15;
        } else if (salario <= 800.00) {
            percentualReajuste = 0.12;
        } else if (salario <= 1200.00) {
            percentualReajuste = 0.10;
        } else if (salario <= 2000.00) {
            percentualReajuste = 0.07;
        } else {
            percentualReajuste = 0.04;
        }
        double novoSalario = salario + (salario * percentualReajuste);

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", novoSalario - salario);
        System.out.printf("Em percentual: %.0f %%\n", percentualReajuste * 100);

        scanner.close();
    }
}

