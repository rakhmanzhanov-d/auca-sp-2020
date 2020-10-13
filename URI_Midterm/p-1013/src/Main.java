import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         int A = inp.nextInt();
         int B = inp.nextInt();
         int C = inp.nextInt();

// wrong answer
         int AB = ( A + B + Math.abs(A - B)) / 2;
         int ABC = (AB + C + Math.abs(AB - C)) / 2;

         System.out.println(ABC + " eh o maior");
    }
}
