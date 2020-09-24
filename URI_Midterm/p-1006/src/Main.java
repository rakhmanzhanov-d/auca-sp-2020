import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // reference type
        Scanner inp = new Scanner(System.in);
        // primitive pypes
        double A = inp.nextDouble();
        double B = inp.nextDouble();
        double C = inp.nextDouble();

        double res = ((A*2 + B*3 + C*5) / (2 + 3 + 5));
        String med = String.format("MEDIA = %.1f",res);
        System.out.println(med);

    }
}
