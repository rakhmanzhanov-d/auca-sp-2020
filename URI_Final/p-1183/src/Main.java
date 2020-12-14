import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float[][] arr = new float[12][12];
        float res = 0;
        char operation = inp.next().charAt(0);


        for (int i = 0; i < 12; i++){
            for (int t = 0; t < 12; t++){
                arr[t][i] = inp.nextFloat();
            }
        }

        int iteration = 1;
        for(int i = 0; i < 12; i++){
            for(int t = iteration; t < 12; t++){
                res += arr[i][t];
            }
            iteration++;
        }

        if (operation == 'M') {
            res = res / 66;
        };

        System.out.printf("%.1f\n" , res);
    }
}
