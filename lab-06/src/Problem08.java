import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();;
        displayPattern(n);
    }
    public static void displayPattern(int n){
        int iteration = 1;
        int decIteration = n;
        for(int i = 1; i <= n; i++){
            for (int t = decIteration; t > 1; t--){
                System.out.print("  ");
            }
            for(int k = 1; k <= iteration; k++){
                System.out.print(iteration - k + 1 + " ");
            }
            System.out.println();
            iteration++;
            decIteration--;
        }
    }
}
