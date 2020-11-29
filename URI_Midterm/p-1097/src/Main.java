import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 10; i += 2){
                System.out.println("I="+(i + 1)+ " J="+(7 + i));
                System.out.println("I="+(i + 1)+ " J="+(6 + i));
                System.out.println("I="+(i + 1)+ " J="+(5 + i));
        }
    }
}
