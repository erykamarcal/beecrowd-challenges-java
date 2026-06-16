package beecrowd.arrays;

import java.util.Scanner;

public class Uri1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];
        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 15; i++) {
            int numeroDigitado = scanner.nextInt();
            if (numeroDigitado % 2 == 0) {
                vetorPar[contadorPar] = numeroDigitado;
                contadorPar++;
            } else {
                vetorImpar[contadorImpar] = numeroDigitado;
                contadorImpar++;
            }
            if (contadorPar == 5) {
                for (int j = 0; j < vetorPar.length; j++) {
                    System.out.println("par[" + j + "] = " + vetorPar[j]);
                }
                contadorPar = 0;

            }
            if (contadorImpar == 5) {
                for (int j = 0; j < vetorImpar.length; j++) {
                    System.out.println("impar[" + j + "] = " + vetorImpar[j]);
                }
                contadorImpar = 0;
            }
        }
        for (int j = 0; j < contadorImpar; j++) {
            System.out.println("impar[" + j + "] = " + vetorImpar[j]);
        }
        for (int j = 0; j < contadorPar; j++) {
            System.out.println("par[" + j + "] = " + vetorPar[j]);
        }
        scanner.close();
    }
}
