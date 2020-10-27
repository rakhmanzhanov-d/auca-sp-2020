import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int B = inp.nextInt();
        int C = inp.nextInt();
        int middle = 0;

        int maxAB = Math.max(A , B);
        int maxABC = Math.max(maxAB, C);
        int minAB = Math.min(A , B);
        int minABC = Math.min(minAB, C);


        if(A != minABC && A != maxABC){
            middle = A;
        }else if(B != minABC && B != maxABC){
            middle = B;
        }else if(C != minABC && C != maxABC){
            middle = C;

            //Checking if A = B or B = C condition
        }else if(B == A && (B == maxABC || B == minABC)){
            middle = A;
        }else if(C == A && (C == maxABC || C == minABC)){
            middle = A;
        }else if(B == C && (B == maxABC || B == minABC)){
            middle = B;
        }
        System.out.println(maxABC);
        System.out.println(middle);
        System.out.println(minABC);
    }
}
