import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] allNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            allNumbers[i] = inp.nextInt();
            if (allNumbers[i] == 0 || allNumbers[i] < 0) {
                allNumbers[i] = 1;
            }
        }
        for (int t = 0; t < 10; t++){
            System.out.println("X[" + t + "] = " + allNumbers[t]);
        }
    }
}
