package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DDD = scanner.nextInt();
        String cidade;

        switch (DDD){
            case 61 -> cidade = "Brasilia";
            case 71 -> cidade = "Salvador";
            case 11 -> cidade = "Sao Paulo";
            case 21 -> cidade = "Rio de Janeiro";
            case 32 -> cidade = "Juiz de Fora";
            case 19 -> cidade = "Campinas";
            case 27 -> cidade = "Vitoria";
            case 31 -> cidade = "Belo Horizonte";
            default -> cidade = "DDD nao cadastrado";
        }
        System.out.println(cidade);
        scanner.close();
    }
}
