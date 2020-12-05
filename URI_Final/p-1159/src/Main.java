import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp = new Scanner(System.in);
        while((n = inp.nextInt()) != 0){
            int sum = 0;
            if(n % 2f > 0){
                n++;
            }
            for(int i = 1; i <= 5; i++){
                sum += n;
                n = n + 2;
            }
            System.out.println(sum);
        }
    }
}
