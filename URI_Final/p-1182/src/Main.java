import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float[][] arr = new float[12][12];
        float res = 0;

        int index = inp.nextInt();
        char operation = inp.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = inp.nextFloat();
            }
        }

        for (int i = 0; i < 12; i++){
            res += arr[i][index];
        }

        if (operation == 'M') {
            res = res / 12;
        }

        System.out.printf("%.1f\n", res);
    }
}