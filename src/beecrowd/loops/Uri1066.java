package beecrowd.loops;
import java.util.Scanner;
public class Uri1066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;


        for (int i = 0; i < 5; i++) {
            int valorDigitado = scanner.nextInt();
            if (valorDigitado > 0){
                quantidadePositivos++;
            } else if (valorDigitado < 0){
                quantidadeNegativos++;
            }
            if (valorDigitado % 2 == 0){
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println(quantidadePares + " valor(es) par(es)");
        System.out.println(quantidadeImpares + " valor(es) impar(es)");
        System.out.println(quantidadePositivos + " valor(es) positivo(s)");
        System.out.println(quantidadeNegativos + " valor(es) negativo(s)");

        scanner.close();
    }
}
