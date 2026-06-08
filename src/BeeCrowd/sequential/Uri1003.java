package BeeCrowd.sequential;

import java.util.Scanner;

public class Uri1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;
        A = scanner.nextInt();
        B = scanner.nextInt();
        int soma = A+B;
        System.out.println("SOMA = " + soma);

        scanner.close();
    }
}
