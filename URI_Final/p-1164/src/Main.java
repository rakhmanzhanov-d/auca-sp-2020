import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = n; i > 0; i--) {
            int x = inp.nextInt();
            if (isPerfect(x)) {
                System.out.println(x + " eh perfeito");
            } else {
                System.out.println(x + " nao eh perfeito");
            }
        }
    }

    public static boolean isPerfect(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i * 1f == 0) {
                sum += i;
            }
        }
        if (sum == x) {
            return true;
        } else {
            return false;
        }
    }
}
