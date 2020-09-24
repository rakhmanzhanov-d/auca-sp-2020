import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // reference type
        Scanner inp = new Scanner(System.in);
        // primitive pypes
        double A = inp.nextDouble();
        double B = inp.nextDouble();

        double res = ((A*3.5 + B*7.5) / (3.5 + 7.5));
        String med = String.format("MEDIA = %.5f",res);
        System.out.println(med);

    }
}
