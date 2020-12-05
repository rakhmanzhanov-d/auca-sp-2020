import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a1 = 0;
        int a2 = 1;
        int next = 0;
        int iteration = 0;
        String space = " ";

        if(n > 0 && n < 46){
            for(int i = 0; i < n; i++){
                iteration++;

                if(iteration >= n){
                    space = "\n";
                }
                if(n == 1){
                    System.out.println(0);
                }else {
                    System.out.print(a1 + space);
                }

                next = a1 + a2;
                a1 = a2;
                a2 = next;
        }
        }

    }
}
