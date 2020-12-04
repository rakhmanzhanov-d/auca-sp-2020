import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for(int i = 0; i < n; i++){
            float res = 0;
            int x = inp.nextInt();
            int y = inp.nextInt();

            if(y != 0){
            res = (float) x*1f / y;
            System.out.println(res);
            }else if(y == 0){
                System.out.println("divisao impossivel");
            }
        }
    }
}
