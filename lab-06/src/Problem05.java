import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        sumDigits(n);
    }
    public static int sumDigits(int n){
        int sum = 0;

        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
        return sum;
    }
}
