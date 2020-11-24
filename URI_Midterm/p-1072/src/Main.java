import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N = inp.nextInt(); // N - num of read integers
        int in = 0;
        int out = 0;
        if(N < 10000){
            for(int i = N; i > 0; i --){
                int X = inp.nextInt();
                if(X > -10000000 && X < 10000000){
                    if (X >= 10 && X <= 20){
                        in += 1;
                    }else {
                        out += 1;
                    }
                }
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}