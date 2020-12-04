import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int x;

            while((x = inp.nextInt()) > 0){
                if (x == 1) {
                    alcohol += 1;
                } else if (x == 2) {
                    gasoline += 1;
                } else if (x == 3) {
                    diesel += 1;
                } else if (x == 4) {
                    System.out.println("MUITO OBRIGADO");
                    System.out.println("Alcool: " + alcohol);
                    System.out.println("Gasolina: " + gasoline);
                    System.out.println("Diesel: " + diesel);
                    System.exit(0);
                }
            }

    }
}
