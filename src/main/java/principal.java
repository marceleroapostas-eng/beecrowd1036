
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double A, B, C;
        double delta, R1, R2;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        delta = B * B - 4 * A * C;

        if (A == 0) {
            System.out.println("Impossivel calcular");
        } else if (delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);

            R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f%n", R1);

            System.out.printf("R2 = %.5f%n", R2);

        }

    }
}
