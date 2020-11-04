import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        if(a < b + c && b < a + c && c < b + a){
            double p = a + b + c;
            System.out.println("perimeter: " + p);
        }else{
            System.out.println("Invalid input");
        }
    }
}
