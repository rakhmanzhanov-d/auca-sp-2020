import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        eliminateDuplicates(arr);

        for (int i = 0; i < arr.length; i++) {
            String space = " ";
            if (arr[i] != 0){
                if (i == arr.length - 1){
                    space = "\n";
                }
                System.out.print(arr[i] + space);
            }
        }
    }

    public static void eliminateDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int t = i + 1; t < arr.length; t++) {
                if (arr[i] == arr[t]) {
                    arr[t] = 0;
                }
            }
        }
    }
}
