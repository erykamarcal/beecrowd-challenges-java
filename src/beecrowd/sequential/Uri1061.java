package beecrowd.sequential;

import java.util.Scanner;

public class Uri1061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaInicial, horaInicial, minutoInicial, segundoInicial;
        int diaFinal, horaFinal, minutoFinal, segundoFinal;

        scanner.next();
        diaInicial = scanner.nextInt();

        horaInicial = scanner.nextInt();
        scanner.next();
        minutoInicial = scanner.nextInt();
        scanner.next();
        segundoInicial = scanner.nextInt();

        scanner.next();
        diaFinal = scanner.nextInt();
        horaFinal = scanner.nextInt();
        scanner.next();
        minutoFinal = scanner.nextInt();
        scanner.next();
        segundoFinal = scanner.nextInt();

        diaInicial = diaInicial * 86400;
        horaInicial = horaInicial * 3600;
        minutoInicial = minutoInicial * 60;

        diaFinal = diaFinal * 86400;
        horaFinal = horaFinal * 3600;
        minutoFinal = minutoFinal * 60;

        int totalDeSegundosInicio = diaInicial + horaInicial + minutoInicial + segundoInicial;
        int totalDeSegundosFim = diaFinal + horaFinal + minutoFinal + segundoFinal;

        int totalDeSegundos = totalDeSegundosFim - totalDeSegundosInicio;

        int dias = totalDeSegundos / 86400;
        totalDeSegundos %= 86400;

        int horas = totalDeSegundos / 3600;
        totalDeSegundos %= 3600;

        int minutos = totalDeSegundos / 60;
        totalDeSegundos %= 60;

        int segundos = totalDeSegundos;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        scanner.close();
    }
}
