import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double pound = inp.nextDouble();
        double kl = pound * 0.454;

        System.out.printf(pound + " pounds is " + kl + " kilograms");
    }
}
