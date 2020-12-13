import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        long[] fibonacci = new long[61];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int t = 2; t <= 60; t++){
            long curNumber = fibonacci[t - 1] + fibonacci[t - 2];
            fibonacci[t] = curNumber;
        }

        for(int i = 0; i < n; i++){
            int index = inp.nextInt();
            if (index > 60 || index < 0){
                continue;
            }
            System.out.println("Fib(" + index + ") = " + fibonacci[index]);
        }
    }
}
