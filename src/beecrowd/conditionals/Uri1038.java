package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoProduto, quantidadeDesejada;
        double valorUnitario, valorTotal;

        codigoProduto = scanner.nextInt();
        quantidadeDesejada = scanner.nextInt();

        switch (codigoProduto){
            case 1 -> valorUnitario = 4.00;
            case 2 -> valorUnitario = 4.50;
            case 3 -> valorUnitario = 5.00;
            case 4 -> valorUnitario = 2.00;
            case 5 -> valorUnitario = 1.50;
            default -> valorUnitario = 0.00;

        }
        valorTotal = valorUnitario * quantidadeDesejada;
        System.out.printf("Total: R$ %.2f%n", valorTotal);

        scanner.close();

    }
}
