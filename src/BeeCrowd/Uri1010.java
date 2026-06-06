package BeeCrowd;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDaPeca1, qtdPecas1, numeroDaPeca2, qtdPecas2;
        double valorUnitarioPeca1, valorUnitarioPeca2;

        numeroDaPeca1 = scanner.nextInt();
        qtdPecas1 = scanner.nextInt();
        valorUnitarioPeca1 = scanner.nextDouble();
        numeroDaPeca2 = scanner.nextInt();
        qtdPecas2 = scanner.nextInt();
        valorUnitarioPeca2 = scanner.nextDouble();


        double totalDaCompra = qtdPecas1 * valorUnitarioPeca1 + qtdPecas2 * valorUnitarioPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalDaCompra);


        scanner.close();
    }
}
