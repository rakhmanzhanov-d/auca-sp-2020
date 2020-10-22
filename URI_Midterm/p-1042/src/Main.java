import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int A = inp.nextInt();
        int B = inp.nextInt();
        int C = inp.nextInt();

        int middle = 0;
        int AB = (A + B + Math.abs(A - B)) / 2;
        int ABC = (AB + C + Math.abs(AB - C)) / 2;
        int ABmin = (A + B - Math.abs(A - B)) / 2;
        int ABCmin = (ABmin + C - Math.abs(ABmin - C)) / 2;

        if(A != ABC && A != ABCmin){
            middle = A;
        }else if(B != ABC && B != ABCmin){
            middle = B;
        }else if(C != ABC && C != ABCmin){
            middle = C;
        }

        System.out.println(ABCmin);
        System.out.println(middle);
        System.out.println(ABC);

        System.out.println("");

        System.out.println(ABC);
        System.out.println(middle);
        System.out.println(ABCmin);

    }
}
