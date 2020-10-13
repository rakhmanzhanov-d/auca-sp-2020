import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // Selection test
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int cd = c + d;
        int ab = a + b;

        if( b > c && d > a && cd > ab && c > 0 && d > 0 && (a % 2) == 0){
            System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");

    }
}
