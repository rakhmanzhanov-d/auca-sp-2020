import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         int A = inp.nextInt();
         int B = inp.nextInt();
         int C = inp.nextInt();


         if(A > B && A > C) {
             System.out.println(A + " eh o maior");
         }else if(B > A && B > C){
             System.out.println(B + " eh o maior");
         }else if(C > A && C > B){
             System.out.println(C + " eh o maior");
         }
    }
}
