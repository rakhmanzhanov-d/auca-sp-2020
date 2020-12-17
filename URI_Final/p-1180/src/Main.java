import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            int x = inp.nextInt();
            arr[i] = x;
        }
        getIndexOfMin(arr);
    }
    public static void getIndexOfMin(int[] a){
        int minNumber = a[0];
        int minIndex = 0;
        for (int i = 0; i < a.length; i++){
            if (minNumber > a[i]){
                minIndex = i;
                minNumber = a[i];
            }
        }
        System.out.println("Menor valor: " + minNumber);
        System.out.println("Posicao: " + minIndex);
    }
}
