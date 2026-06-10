package beecrowd.loops;

import java.util.Scanner;

public class Uri1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int totalCobaias = 0;
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < n; i++) {
            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);
            totalCobaias = totalCobaias + quantidade;

            if (tipo == 'C'){
                coelhos += quantidade;
            } else if (tipo == 'R') {
                ratos += quantidade;
            } else if (tipo == 'S'){
                sapos += quantidade;
            }
        }

        double percentualCoelhos = (coelhos * 100.0)/totalCobaias;
        double percentualRatos = (ratos * 100.0) / totalCobaias;
        double percentualSapos = (sapos * 100.0) / totalCobaias;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

    scanner.close();
    }
}
