package beecrowd.conditionals;

import java.util.Scanner;

public class Uri1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipoDeAnimal, classe, alimentacao;

        tipoDeAnimal = scanner.nextLine();
        classe = scanner.nextLine();
        alimentacao = scanner.nextLine();

        if (tipoDeAnimal.equalsIgnoreCase("vertebrado")) {
            if (classe.equalsIgnoreCase("ave")) {
                if (alimentacao.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else if (classe.equalsIgnoreCase("mamifero")) {
                if (alimentacao.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else if (tipoDeAnimal.equalsIgnoreCase("invertebrado")){
            if (classe.equalsIgnoreCase("inseto")){
                if (alimentacao.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else if (classe.equalsIgnoreCase("anelideo")){
                if (alimentacao.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
        scanner.close();
    }
}
