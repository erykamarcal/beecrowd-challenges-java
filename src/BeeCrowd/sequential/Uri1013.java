package BeeCrowd.sequential;

import java.util.Scanner;

public class Uri1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor1, valor2, valor3;

        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();
        valor3 = scanner.nextInt();


        int maiorAB = (valor1 + valor2 + Math.abs(valor1-valor2))/2;
        int maior = (maiorAB + valor3 + Math.abs(maiorAB-valor3))/2;


        System.out.println(maior + " eh o maior");


        scanner.close();
    }
}
