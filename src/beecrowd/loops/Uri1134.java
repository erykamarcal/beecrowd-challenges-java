package beecrowd.loops;

import java.util.Scanner;

public class Uri1134 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        do {
            codigo = scanner.nextInt();

            switch (codigo) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
            }
        } while (codigo != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    scanner.close();
    }
}
