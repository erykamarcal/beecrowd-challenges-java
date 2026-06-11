package beecrowd.loops;

import java.util.Scanner;

public class Uri1133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int maior = Math.max(x, y);
        int menor = Math.min(x, y);

        for (int i = menor + 1; i < maior; i++) {
            if (i % 5 == 2 || i % 5 == 3){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}