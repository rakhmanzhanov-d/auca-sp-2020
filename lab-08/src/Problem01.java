import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int sum = 0;
        System.out.println("Enter 3 rows and 4 columns");
        for (int i = 0; i < 3; i++){
            for (int t = 0; t < 4; t++){
                arr[i][t] = inp.nextInt();
                sum += arr[i][t];
            }
        }

        System.out.println("Sum of all elements is " + sum);
    }
}
