import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1st number");
        int a = inp.nextInt();

        System.out.println("2nd number");
        int b = inp.nextInt();

        System.out.println("3rd number");
        int c = inp.nextInt();

        System.out.println("4th number");
        int d = inp.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        System.out.printf("The value %d is the greatest one\n", max);

    }
}
