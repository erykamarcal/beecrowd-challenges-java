package beecrowd.loops;

import java.util.Scanner;

public class Uri1131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        int totalGrenais = 0;


        int novoGregal = 1;

        while (novoGregal == 1) {
            int golsInter = scanner.nextInt();
            int golsGremio = scanner.nextInt();
            totalGrenais++;


            if (golsInter > golsGremio) {
                vitoriasInter++;
            } else if (golsGremio > golsInter) {
                vitoriasGremio++;
            } else {
                empates++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGregal = scanner.nextInt();

        }
        System.out.println(totalGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);

        if (vitoriasInter > vitoriasGremio) {
            System.out.println("Inter venceu mais");
        } else if (vitoriasGremio > vitoriasInter) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Nao houve vencedor");
        }

        scanner.close();
    }
}