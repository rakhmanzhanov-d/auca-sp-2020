import java.util.Random;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("N: ");
        int n = inp.nextInt();

        int[] counters = new int[11];

        for(int i = 0; i < n; i++){
            int d1 = 1 + rnd.nextInt(6);
            int d2 = 1 + rnd.nextInt(6);
            int s = d1 + d2;
            counters[s - 2]++;
        }

        for(int i = 0; i < counters.length; i++){
            System.out.println((i + 2) + ": " + counters[i]);
        }
    }
}
