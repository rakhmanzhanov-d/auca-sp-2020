import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        System.out.print("Temperature in degrees Fahrenheit?");
        Scanner inp = new Scanner(System.in);
        double F = inp.nextDouble();
        double C = (F - 32 ) * 5/9;

        System.out.printf("The temperature in degrees Celsius is %.2f\n",C);
    }
}
