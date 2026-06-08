package beecrowd.sequential;

import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String emplooyeName;
        double fixedSalary, totalSales;


        emplooyeName = scanner.nextLine();
        fixedSalary = scanner.nextDouble();
        totalSales = scanner.nextDouble();

        double totalToReceive = fixedSalary + (totalSales * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", totalToReceive);

        scanner.close();

    }
}