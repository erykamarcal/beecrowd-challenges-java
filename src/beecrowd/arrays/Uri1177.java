package beecrowd.arrays;

import java.util.Scanner;

public class Uri1177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int [] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i % t;
            System.out.println("N[" + i + "] = " + vetor[i]);
            }

        scanner.close();
    }
}
