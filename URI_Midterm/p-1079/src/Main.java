import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = n; i > 0; i--){
            float a = inp.nextFloat();
            float b = inp.nextFloat();
            float c = inp.nextFloat();
            float averageWeighted = (a*2 + b*3 + c*5) / 10;
            System.out.printf("%.1f\n", averageWeighted);
        }
    }
}
