package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal;

        horaInicial = scanner.nextInt();
        minutoInicial = scanner.nextInt();
        horaFinal = scanner.nextInt();
        minutoFinal = scanner.nextInt();


        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;

        if (fim <= inicio) {
            fim += 24 * 60;
        }

        int duracao = fim - inicio;
        int horas = duracao / 60;
        int minutos = duracao % 60;
        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
        scanner.close();
    }
}
