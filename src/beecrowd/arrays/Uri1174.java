package beecrowd.arrays;

import java.util.Scanner;

public class Uri1174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double [] A = new double[100];
        double valor;

        for (int i = 0; i < A.length; i++) {
            valor = scanner.nextDouble();
            A[i] = valor;
            if (valor <= 10){
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
        scanner.close();
    }
}
