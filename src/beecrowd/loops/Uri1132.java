package beecrowd.loops;

import java.util.Scanner;

public class Uri1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int somaDosMultiplosDeTreze = 0;


        int maior = Math.max(x,y);
        int menor = Math.min(x,y);

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0){
                somaDosMultiplosDeTreze += i;
            }
        }
        System.out.println(somaDosMultiplosDeTreze);


        scanner.close();
    }
}
