import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] allNums = new int[10];
        int multiply = 1;

        int n = inp.nextInt();

        for(int i = 0; i < 10; i++){
            allNums[i] = n * multiply;
            n *= 2;
        }

        for (int t = 0; t < 10; t++){
            System.out.println("N[" + t + "] = " + allNums[t]);
        }
    }
}
