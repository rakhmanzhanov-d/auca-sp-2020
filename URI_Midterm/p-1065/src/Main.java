import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int d = inp.nextInt();
        int e = inp.nextInt();
        int allEvenNums = 0;

        if(a % 2 == 0){
            allEvenNums += 1;
        }
        if(b % 2 == 0){
            allEvenNums += 1;
        }
        if(c % 2 == 0){
            allEvenNums += 1;
        }
        if(d % 2 == 0){
            allEvenNums += 1;
        }
        if(e % 2 == 0){
            allEvenNums += 1;
        }
        System.out.println(allEvenNums + " valores pares");

    }
}
