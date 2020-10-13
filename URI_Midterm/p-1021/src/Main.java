import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float money = inp.nextFloat();

        //True answer
        int d100 = (int) (money/100);
        int d50 = (int) (money - d100 * 100) / 50;
        int d20 = (int) (money - d100 * 100 - d50 * 50) / 20;
        int d10 = (int) (money - d100 * 100 - d50 * 50 - d20 * 20) / 10;
        int d5 = (int) (money - d100 * 100 - d50 * 50 - d20 * 20 - d10 * 10) / 5;
        int d2 = (int) (money - d100 * 100 - d50 * 50 - d20 * 20 - d10 * 10 - d5 * 5) / 2;
        int d1 = (int) (money - d100 * 100 - d50 * 50 - d20 * 20 - d10 * 10 - d5 * 5 - d2 * 2) / 1;

        int afterDec =(int) (money * 100) % 100;
        int dec50 = afterDec / 50;
        int dec25 = (afterDec - dec50 * 50) / 25;
        int dec10 = (afterDec - dec50 * 50 - dec25 * 25) / 10;
        int dec5 = (afterDec  - dec50 * 50 - dec25 * 25 - dec10 * 10) / 5;
        int dec1 = (afterDec  - dec50 * 50 - dec25 * 25 - dec10 * 10 - dec5 * 5) / 1;

        System.out.println("NOTAS:");
        System.out.println(d100 + " nota(s) de R$ 100.00");
        System.out.println(d50 + " nota(s) de R$ 50.00");
        System.out.println(d20 + " nota(s) de R$ 20.00");
        System.out.println(d10 + " nota(s) de R$ 10.00");
        System.out.println(d5 + " nota(s) de R$ 5.00");
        System.out.println(d2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(d1 + " moeda(s) de R$ 1.00");
        System.out.println(dec50 + " moeda(s) de R$ 0.50");
        System.out.println(dec25 + " moeda(s) de R$ 0.25");
        System.out.println(dec10 + " moeda(s) de R$ 0.10");
        System.out.println(dec5 + " moeda(s) de R$ 0.05");
        System.out.println(dec1 + " moeda(s) de R$ 0.01");
    }
}
