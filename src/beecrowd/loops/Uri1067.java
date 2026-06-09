package beecrowd.loops;

import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);
        }

        scanner.close();
    }
}
