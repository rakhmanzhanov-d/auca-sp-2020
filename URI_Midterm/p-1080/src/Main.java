import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int max = 0;
        int position = 0;
        int positionMax = 0;
        for(int i = 100; i > 0; i--){
            int read = inp.nextInt();
            position += 1;
            if(read > max){
                max = read;
                positionMax = position;
            }

        }
        System.out.println(max);
        System.out.println(positionMax);
    }
}
