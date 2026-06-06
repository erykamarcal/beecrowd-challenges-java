package BeeCrowd;

import java.util.Scanner;

public class Uri1004 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B;
        int PROD;
        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = A*B;
        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}
