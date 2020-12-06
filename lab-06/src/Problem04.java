import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("A = ");
        float a = inp.nextFloat();

        System.out.print("B = ");
        float b = inp.nextFloat();
        int sumA = 0;
        int sumB = 0;
        int common = 0;

        float c = 0;
        if(a > b){
            c = a;
        }else {
            c = b;
        }

        for(float i = 1; i <= c; i++){
            if(a % i == 0){
                sumA = (int) i;
            }
            if(b % i == 0){
                sumB = (int) i;
            }
            if(sumA == sumB){
                common = sumA;
            }
        }
        if(a == 0 || b == 0){
            System.out.printf("GDE (%.0f, %.0f) = is not defined", a, b);

        }else{
        System.out.printf("GDE (%.0f, %.0f) = %d", a, b, common);
        }
    }
}
