package beecrowd.arrays;

import java.util.Scanner;

public class Uri1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] x = new int[10];
        x [0] = n;
        for (int i = 1 ; i < x.length; i++) {
                x[i] = x[i - 1] * 2;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("N[" + i + "] = " + x[i]);
        }
        scanner.close();
    }
}
