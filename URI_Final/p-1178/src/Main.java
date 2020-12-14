import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] arr = new double[100];

        double x = inp.nextDouble();
        for(int i = 0; i < 100; i++){
            arr[i] = x;
            x = x / 2d;
            System.out.printf("N[" + i + "] = %.4f\n", arr[i]);
        }

    }
}
