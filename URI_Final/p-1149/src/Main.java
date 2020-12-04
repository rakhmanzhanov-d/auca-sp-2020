import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int n;
        int sum = 0;
        int iteration = 0;

        while(iteration < 1){
            if((n = inp.nextInt()) > 0){
                for(int i = a; i < a + n; i++){
                    sum += i;
                    iteration++;
                }
            }
        }
        System.out.println(sum);


    }
}
