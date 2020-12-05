import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age;
        int sum = 0;
        int iteration = 0;
        while ((age = inp.nextInt()) > 0){
            iteration++;
            sum += age;
        }
        System.out.printf("%.2f\n", sum * 1f / iteration);
    }
}
