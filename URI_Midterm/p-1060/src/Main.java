import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        double d = inp.nextDouble();
        double e = inp.nextDouble();
        double f = inp.nextDouble();
        int positiveNums = 0;

        if(a>0){
            positiveNums += 1;
        }
        if(b>0){
            positiveNums += 1;
        }
        if(c>0){
            positiveNums += 1;
        }
        if(d>0){
            positiveNums += 1;
        }
        if(e>0){
            positiveNums += 1;
        }
        if(f>0){
            positiveNums += 1;
        }
        System.out.println(positiveNums + " valores positivos");
    }
}
