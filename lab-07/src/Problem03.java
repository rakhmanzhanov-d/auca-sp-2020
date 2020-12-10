import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter %d element: ", i);
            a[i] = inp.nextInt();
        }


        printArray("Before reversing: ", a);
        reverse(a);
        printArray("After reversing: ", a);
    }

    static void printArray(String msg,int[] a) {
        // for each
        System.out.println(msg);
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    static void reverse(int[] a) {
        for(int i = 0, j = a.length - 1; i < j; i++, j--){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
