import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float a = inp.nextFloat();
        float b = inp.nextFloat();
        float c = inp.nextFloat();
        float d = inp.nextFloat();
        float e = inp.nextFloat();
        float f = inp.nextFloat();

        float positiveNums = 0;
        float sumPositive = 0;
        float aver = 0;

        if(a>0){
            positiveNums += 1;
            sumPositive += a;
        }
        if(b>0){
            positiveNums += 1;
            sumPositive += b;
        }
        if(c>0){
            positiveNums += 1;
            sumPositive += c;
        }
        if(d>0){
            positiveNums += 1;
            sumPositive += d;
        }
        if(e>0){
            positiveNums += 1;
            sumPositive += e;
        }
        if(f>0){
            positiveNums += 1;
            sumPositive += f;
        }

        aver = sumPositive / positiveNums;

        System.out.printf("%.0f valores positivos\n",positiveNums);
        System.out.printf("%.1f\n",aver);

    }
}
