package beecrowd.arrays;

import java.util.Scanner;

public class Uri1175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int [] n = new int[20];

        for (int i = 0; i < n.length; i++) {
           valor = scanner.nextInt();
           n[i] = valor;
        }
        for (int i = 0; i < n.length/2; i++) {
            int temp = n[i];
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = temp;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }

        scanner.close();
    }
}
