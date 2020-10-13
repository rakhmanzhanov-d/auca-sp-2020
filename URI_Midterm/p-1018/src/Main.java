import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int money = inp.nextInt();
        int b100 = (money - (money % 100)) / 100;
        int b50 = (money - (b100 * 100) -(money % 50)) / 50;
        int b20 = (money - (b100 * 100) - (b50 * 50)) / 20;
        int b10 = (money - (b100 * 100) - (b50 * 50) - (b20 * 20)) / 10;
        int b5 = (money - (b100 * 100) - (b50 * 50) - (b20 * 20) - (b10 * 10)) / 5;
        int b2 = (money - (b100 * 100) - (b50 * 50) - (b20 * 20) - (b10 * 10) - (b5 * 5)) / 2;
        int b1 = money - (b100 * 100) - (b50 * 50) - (b20 * 20) - (b10 * 10) - (b5 * 5) - (b2 * 2);



        System.out.println(money);
        System.out.printf(b100 + " nota(s) de R$ 100,00\n");
        System.out.printf(b50 + " nota(s) de R$ 50,00\n");
        System.out.printf(b20 + " nota(s) de R$ 20,00\n");
        System.out.printf(b10 + " nota(s) de R$ 10,00\n");
        System.out.printf(b5 + " nota(s) de R$ 5,00\n");
        System.out.printf(b2 + " nota(s) de R$ 2,00\n");
        System.out.printf(b1 + " nota(s) de R$ 1,00\n");



    }
}
