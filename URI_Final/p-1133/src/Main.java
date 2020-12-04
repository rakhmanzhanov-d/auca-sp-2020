import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int y = inp.nextInt();

        if(x > y){
            for(int i = y + 1; i < x; i++){
                if(i % 5f == 2 || i % 5f == 3){
                    System.out.println(i);
                }
            }
        }else if(x < y){
            for(int i = x + 1; i < y; i++){
                if(i % 5f == 2 || i % 5f == 3){
                    System.out.println(i);
                }
            }
        }
    }
}