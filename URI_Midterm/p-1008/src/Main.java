import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double number = inp.nextDouble();
        double hoursPerMonth = inp.nextDouble();
        double paymentPerHour = inp.nextDouble();
        double salary = hoursPerMonth * paymentPerHour;

        System.out.printf("NUMBER = %.0f\n",number);
        System.out.printf("SALARY = U$ %.2f\n",salary);
    }
}
