package beecrowd.loops;

public class Uri1098 {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i+=2) {

            for (int j = 1; j <= 3; j++) {

                double valorI = i / 10.0;
                double valorJ = valorI + j;
                if (i % 10 == 0) {
                    System.out.printf("I=%.0f J=%.0f%n", valorI, valorJ);
                } else {
                    System.out.printf("I=%.1f J=%.1f%n", valorI, valorJ);
                }
            }
        }
    }
}