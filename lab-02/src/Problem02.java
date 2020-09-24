import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1st value?");
        int a = inp.nextInt();
        System.out.print("2nd value?");
        int b = inp.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("Before swaping: a = %d; b = %d%n", b,a);
        System.out.printf("After swaping: a = %d; b = %d%n", a,b);    }
}
