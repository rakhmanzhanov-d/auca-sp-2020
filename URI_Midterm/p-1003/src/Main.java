import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A,B;
        Scanner inp = new Scanner(System.in);

         A = inp.nextDouble();
         B = inp.nextDouble();

        double sum = A+B;
        System.out.printf("SOMA = %.0f%n", sum);
    }
}

