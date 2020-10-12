import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double time = inp.nextDouble();
        double speed = inp.nextDouble();

        double liters = (time * speed) / 12;

        System.out.printf("%.3f\n", liters);
    }
}
