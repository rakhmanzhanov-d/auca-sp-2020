import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0;
        int sumTrue = 0;
        int sumFalse = 0;
        
        System.out.print("Number of tests? ");
        int numOfTests = inp.nextInt();

        for(int i = numOfTests; i > 0; i--){
            int max = 20;
            Random random = new Random();
            int rand1 = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
            int rand2 = random.nextInt(max) * (random .nextBoolean() ? -1 : 1);
            sum = rand1 + rand2;
            System.out.print(rand1 + " + " + rand2 + " = " );
            int res = inp.nextInt();

            if (res == sum){
                sumTrue += 1;
            }else{
                sumFalse += 1;
            }

            System.out.println("Number of correct answers: " + sumTrue);
            System.out.println("Number of incorrect answers: " + sumFalse);
        }
    }
}
