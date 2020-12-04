import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int z;
        int iteration = 0;
        int sum = 0;
        int finalIteration = 0;

        while((z = inp.nextInt()) <= x){
            sum = 0;
        }
        if(z > x){
            for(int i = x; i < z; i++){
                if(sum >= z){
                    iteration--;
                }
                sum += i;
                iteration++;
            }
            System.out.println(iteration);
        }

    }
}
