import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();
        int PROD = x * y;

        System.out.println("PROD = "+PROD);
    }
}
