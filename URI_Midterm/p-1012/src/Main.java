import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        final double PI = 3.14159;
        double triangle = (a*c) / 2;
        double circle = PI * c * c;
        double trapezium = ((a + b) / 2) * c;
        double square = b * b;
        double rectangle = b * a;

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);
    }
}
