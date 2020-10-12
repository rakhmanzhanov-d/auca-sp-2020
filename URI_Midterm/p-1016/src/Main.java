import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int distance = inp.nextInt();
        // y car drives 1.5 faster then x car which
        // means y can be further per 1 km every 2 min
        int min = distance * 2;

        System.out.println(min + " minutos");
    }
}
