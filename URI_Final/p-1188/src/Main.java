import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[][] arr = new double[12][12];
        double res = 0;
        char O = inp.next().toUpperCase().charAt(0);


        for (int i = 0; i < 12; i++){
            for (int t = 0; t < 12; t++){
                arr[i][t] = inp.nextDouble();
            }
        }

        int start = 5;
        int end = 6;
        for(int i = 7; i < 12; i++){
            for (int t = start; t <= end; t++){
                res += arr[i][t];
            }
            start--;
            end++;
        }

        if (O == 'M') {
            res = res / 30;
        };

        System.out.printf("%.1f\n" , res);
    }
}