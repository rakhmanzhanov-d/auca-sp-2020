import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = n; i > 0; i--) {
            int x = inp.nextInt();
            if(isPrime(x)){
                System.out.println(x + " eh primo");
            }else{
                System.out.println(x + " nao eh primo");
            }
        }
    }

    public static boolean isPrime(int x) {
        int iteration = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i * 1f == 0) {
                iteration++;
            }
        }
        if (iteration == 2) {
            return true;
        } else {
            return false;
        }
    }
}
