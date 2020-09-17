import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double radius = inp.nextDouble();

        double area = 3.14159 * radius * radius;

        System.out.printf("A=%.4f%n",area);
    }
}
