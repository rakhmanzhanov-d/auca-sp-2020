import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double price;
        int productCode = inp.nextInt();
        int amount = inp.nextInt();

        if(productCode == 1){
            price = 4.00;
            System.out.printf("Total: R$ %.2f\n", price * amount);
        }else if(productCode == 2){
            price = 4.50;
            System.out.printf("Total: R$ %.2f\n", price * amount);
        }else if(productCode == 3){
            price = 5.00;
            System.out.printf("Total: R$ %.2f\n", price * amount);
        }else if(productCode == 4){
            price = 2.00;
            System.out.printf("Total: R$ %.2f\n", price * amount);
        }else if(productCode == 5){
            price = 1.50;
            System.out.printf("Total: R$ %.2f\n", price * amount);
        }
    }
}
