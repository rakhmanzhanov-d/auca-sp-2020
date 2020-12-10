import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        while (n < 20) {
            n++;
            if(n == 10 || n == 11)
                continue;
            sum += n;
        }

        System.out.println("The sum is: " + sum);
    }
}
