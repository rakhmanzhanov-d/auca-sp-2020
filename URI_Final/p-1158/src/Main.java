import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++){
            int a = inp.nextInt();
            int b = inp.nextInt();
            if(a % 2f == 0){
                a = a + 1;
            }
            for(int t = 1; t <= b; t++){
                sum += a;
                a = a + 2;
            }
            System.out.println(sum);
            sum = 0;
        }

    }
}
