import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double num = inp.nextDouble();
        if(num >= 0 && num <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        }else if(num >= 25.00001 && num <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        }else if(num >= 50.00000001 && num <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        }else if(num >= 75.00000001 && num <= 100.0000000000) {
            System.out.println("Intervalo (75,100]");
        } else if (num < 0 || num  >= 100.00000000001){
            System.out.println("Fora de intervalo");
        }
    }
}
