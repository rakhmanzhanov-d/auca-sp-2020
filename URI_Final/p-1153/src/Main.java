import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int next = 1;
        for(int i = 1; i <= n; i++){
            next = next * i;
        }
        System.out.println(next);
    }
}
