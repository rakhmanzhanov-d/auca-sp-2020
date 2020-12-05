import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float sum = 0;
        int n = 100;
        for(int i = 1; i <= n; i++){
            sum += 1f / i;
        }
        System.out.printf("%.2f\n" , sum);
    }
}
