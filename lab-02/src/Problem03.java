import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("A four-digit integer?");
        int num = inp.nextInt();
        int sum = 0;
        int lastNum = 0;

        if(num < 1000){
            System.out.print("Run program again and choose 4 digit number");
            System.exit(0);
        }

        while(num > 0){
            lastNum = num % 10;
            sum = sum + lastNum;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
