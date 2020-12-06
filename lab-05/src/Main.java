import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Enter an integer (Input ends if n = 0) : ");
        while((n = inp.nextInt()) != 0){
            System.out.print("Enter an integer (Input ends if n = 0) : ");
            sum += n;
        }
        System.out.println("The sum is " + sum);
    }
}
