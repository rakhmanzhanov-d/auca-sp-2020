import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n;
        while ((inp.hasNextInt())){
            n = inp.nextInt();
            if(n >= 5 && n <= 101 && n % 2f != 0){
                drawArray(n);
            }
        }
    }
    public static void drawArray(int n){
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){

            // 0. filling all items with 0
            for (int t = 0; t < arr.length; t++){
                arr[i][t] = 0;
            }

            // 1. putting 2 and 3 into diagonals
            for (int s = 0, t = arr.length - 1; s < arr.length; s++, t--){
                arr[s][s] = 2;
                arr[s][t] = 3;
            }


            // 2. putting 1 into array
            for (int k = arr.length / 3; k < arr.length - arr.length / 3; k++){
                for (int j = arr.length / 3; j < arr.length - arr.length / 3; j++){
                    arr[k][j] = 1;
                }
            }

            // 3. Putting for in the center
            int center = n / 2;
            arr[center][center] = 4;

        }


        // Displaying
        for (int x= 0; x < arr.length; x++) {
            for (int t = 0; t < arr.length; t++) {
                String space = "";
                if (t == arr.length - 1){
                    space = "\n";
                }
                System.out.print(arr[x][t] + space);
            }
        }
        System.out.println();
    }
}

