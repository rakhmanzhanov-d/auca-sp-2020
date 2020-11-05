import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();

        if(num % 2 == 1){
            for(int i = 2; i < num; i += 2){
                System.out.println(i+"^2 = "+i*i);
            }
        }else{
            for(int i = 2; i <= num; i += 2){
                System.out.println(i+"^2 = "+i*i);
            }
        }
    }
}

