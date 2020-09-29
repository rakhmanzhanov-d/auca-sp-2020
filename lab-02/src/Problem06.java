import java.util.Formatter;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        double C = inp.nextDouble();
        double F = (9.0/5) * C + 32;
        Formatter formatter = new Formatter();
        formatter.format("%.0f",C);

        System.out.printf(formatter + " Celsius is " + F + " Fahrenheit\n");
    }
}
