import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int start = 0;

        for(int i = 1; i <= n; i++){
            System.out.println((start + i) + " " + (start + i + 1) + " " + (start + i + 2) + " PUM");
            start += 3;
        }

    }
}
