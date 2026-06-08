package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial, horaFinal, duracaoJogo;
        horaInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();

        if (horaInicial < horaFinal){
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo = 24 - horaInicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracaoJogo + " HORA(S)");

        scanner.close();
    }
}
