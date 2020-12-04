import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();
        int sum = 0;

        if(y > x){
            for(int i = x; i <= y; i++){
                if( i % 13f != 0){
                    sum += i;
                }
            }
        }else if(y < x){
            for(int i = y; i <= x; i++){
                if( i % 13f != 0){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
