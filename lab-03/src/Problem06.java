import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double discr = b*b  - 4*a*c;
        double x1 = (-b + Math.pow(discr, 0.5)) /(2 * a);
        double x2 = (-b - Math.pow(discr, 0.5)) /(2 * a);

        if(discr > 0){
            System.out.println("The equation has two roots " + x1 + " and " + x2);
        }else if (x1 == x2 && discr == 0){
            System.out.println("The equation has one root " + x1);
        }else if(discr < 0) {
            System.out.println("The equation has no real roots");
        }
    }
}
