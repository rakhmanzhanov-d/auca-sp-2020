import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        System.out.print("Integer? ");
        int num = inp.nextInt();
        while(num % 10 > 0){
            sum += num % 10;
            num = (num - num % 10) / 10;
        }
        System.out.println(sum);

    }
}
