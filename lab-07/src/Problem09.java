import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextDouble();
        }

        System.out.println("index: " + indexOfSmallestElement(arr));
    }

    public static int indexOfSmallestElement(double[] a) {
        int index = 0;
        double small = a[0];
        for (int i = 0; i < a.length; i++) {
            if (small > a[i]) {
                index = i;
                small = a[i];
            }
        }
        return index;
    }
}
