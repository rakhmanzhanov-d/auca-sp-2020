import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();

        if((a + b) <= c && c > a && c > b){
            float area = ((a+b) / 2) * c;
            System.out.println("Area = "+area);
        }else if((a + c) <= b && b > a && b > c){
            float area = ((a+b) / 2) * c;
            System.out.println("Area = "+area);
        }else if((b + c) <= a && a > b && a > c){
            float area = ((a+b) / 2) * c;
            System.out.println("Area = "+area);
        }else {
            float perimeter = a + b + c;
            System.out.println("Perimetro = "+perimeter);
        }
    }
}
