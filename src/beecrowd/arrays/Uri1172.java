package beecrowd.arrays;

import java.util.Scanner;

public class Uri1172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int [] X = new int[10];

        for (int i = 0; i < X.length; i++) {
            int numero = scanner.nextInt();
            if (numero <= 0){
                numero = 1;
            }
            X[i] = numero;
        }

        for (int i = 0; i < X.length; i++) {
            System.out.println("X[" + i + "] = " + X[i]);
        }
        scanner.close();
    }
}
