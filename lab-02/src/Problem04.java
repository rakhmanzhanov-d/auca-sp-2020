import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Length in inches?");
        int inch = inp.nextInt();
        double cen = inch * 2.54;

        System.out.printf(inch + "in. = " + cen + " cm");
    }
}
