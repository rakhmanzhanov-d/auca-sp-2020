import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        final double PI = 3.14159;

        double r = inp.nextDouble();
        double volume = (4.0/3) * PI * r * r * r;

        System.out.printf("VOLUME = %.3f\n",volume);
    }
}
