package BeeCrowd.sequential;

import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double salarioPorHoraTrabalhada;

        numeroFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        salarioPorHoraTrabalhada = scanner.nextDouble();
        double salary = horasTrabalhadas*salarioPorHoraTrabalhada;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        scanner.close();
    }
}
