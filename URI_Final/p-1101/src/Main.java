import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int X, Y;
        Scanner input =new Scanner(System.in);

        while (((X = input.nextInt()) > 0 )&&((Y = input.nextInt()) > 0 )) {
            int sum = 0;
            if (X > Y) {
                for (int i = Y; i <= X; i++) {
                    sum+=i;
                    System.out.print(i+" ");
                }
                System.out.print("Sum="+sum+"\n");
            }else {
                for (int i = X; i <= Y; i++) {
                    sum+=i;
                    System.out.print(i+" ");
                }
                System.out.print("Sum="+sum+"\n");
            }
        }

    }

}
