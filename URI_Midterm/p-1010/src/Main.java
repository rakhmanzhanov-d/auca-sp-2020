import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int code1 = inp.nextInt();
        int unit1 = inp.nextInt();
        double price1 = inp.nextDouble();

        int code2 = inp.nextInt();
        int unit2 = inp.nextInt();
        double price2 = inp.nextDouble();

        double toPay = (price1 * unit1) + (price2 * unit2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",toPay);

    }
}
