import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Number of points ? ");
        double points = inp.nextDouble();

        if (points >= 40) {
            System.out.println("You passed \"Structured Programming\"!!!");
            System.out.println("You should take \"OOP\" next semester!!!");
        } else {
            System.out.println("You failed \"Structured Programming\"!!!");
            System.out.println("You can take it next year");
        }

    }
}