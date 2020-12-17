import java.util.Scanner;

public class Main {
    public static int[] arr = new int[20];
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 20; i++){
            int x = inp.nextInt();
            arr[i] = x;
        }
        reverse(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println("N[" + i + "] = " + arr[i]);
        }
    }
    public static int[] reverse(int[] a){
        for (int i = 0, t = arr.length - 1; i < 10; i++, t--){
            int temp = arr[i];
            arr[i] = arr[t];
            arr[t] = temp;
        }
        return arr;
    }
}
