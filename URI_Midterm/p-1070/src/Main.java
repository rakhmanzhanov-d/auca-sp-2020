import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        if(x % 2 == 0){
            for(int i = x + 1; i <= (x + 11); i+=2){
                System.out.println(i);
            }
        }else{
            for(int i = x; i <= x + 10; i+=2){
                System.out.println(i);
            }
        }
    }
}
