import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x1 = inp.nextDouble();
        double y1 = inp.nextDouble();
        double x2 = inp.nextDouble();
        double y2 = inp.nextDouble();

        double res = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        System.out.printf("%.4f", res);
    }
}
