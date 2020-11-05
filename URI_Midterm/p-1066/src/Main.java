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
        int allOdds = 0;
        int allPositive = 0;
        int allNegative = 0;

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


        if(a % 2 == 1){
            allOdds += 1;
        }
        if(b % 2 == 1){
            allOdds += 1;
        }
        if(c % 2 == 1){
            allOdds += 1;
        }
        if(d % 2 == 1){
            allOdds += 1;
        }
        if(e % 2 == 1){
            allOdds += 1;
        }


        if(a > 0){
            allPositive += 1;
        }
        if(b > 0){
            allPositive += 1;
        }
        if(c > 0){
            allPositive += 1;
        }
        if(d > 0){
            allPositive += 1;
        }
        if(e > 0){
            allPositive += 1;
        }


        if(a < 0){
            allNegative += 1;
        }
        if(b < 0){
            allNegative += 1;
        }
        if(c < 0){
            allNegative += 1;
        }
        if(d < 0){
            allNegative += 1;
        }
        if(e < 0){
            allNegative += 1;
        }

        System.out.println(allEvenNums+ " valor(es) par(es)");
        System.out.println(allOdds + " valor(es) impar(es)");
        System.out.println(allPositive + " valor(es) positivo(s)");
        System.out.println(allNegative + " valor(es) negativo(s)");
    }
}
