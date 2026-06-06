package BeeCrowd;
import java.util.Scanner;
public class Uri1006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double A,B,C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        double media = ((A*2) + (B*3) + (C*5))/10;
        System.out.printf("MEDIA = %.1f%n", media);

    scanner.close();
    }
}
