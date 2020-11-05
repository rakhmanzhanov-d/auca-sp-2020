import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int start = 0;
        if(x> 0 && x < 1001){
            if(x % 2 == 1){
                for (int i = 1; i <= x; i+=2){
                    System.out.println(i);
                }
            }else{
                for(int i = 1; i < x; i+=2){
                    System.out.println(i);
                }
            }
        }
    }
}
