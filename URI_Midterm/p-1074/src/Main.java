import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String odd = "ODD POSITIVE";
        String oddNegative = "ODD NEGATIVE";
        String even = "EVEN POSITIVE";
        String evenNegative = "EVEN NEGATIVE";
        String nul = "NULL";
        String res = "";

        int N = inp.nextInt();
        if(N < 10000){
            for (int i = N; i > 0; i--){
                int X = inp.nextInt();
                if(X > -10000000 && X < 10000000){
                    if(X == 0){
                        res = nul;
                    }else if(X % 2 == 0){
                        if(X > 0){
                            res = even;
                        }else{
                            res = evenNegative;
                        }
                    }else{
                        if(X > 0){
                            res = odd;
                        }else{
                            res = oddNegative;
                        }
                    }
                    System.out.println(res);
                }
            }
        }
    }
}
