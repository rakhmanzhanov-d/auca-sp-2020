import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] n = new int[1000];
        int index = 0;
        int t = inp.nextInt();
        for (int i = 0; i < 1000; i++) {
            n[i] = i;
            for (int k = 0; k < t; k++) {
                if (index > 999) {
                    System.exit(0);
                }
                System.out.println("N[" + index + "] = " + k);
                index++;
            }
        }
    }
}
