import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String name = inp.next();
        double fixedSalary = inp.nextDouble();
        double allSales = inp.nextDouble();
        double finalSalary = fixedSalary + (allSales * 0.15);
        System.out.printf("TOTAL = R$ %.2f\n",finalSalary);
    }
}
