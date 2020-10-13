import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        double r1 = (( -b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)) ;
        double r2 = (( -b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)) ;

        if(a != 0 && (Math.sqrt(b*b - 4 * a * c)) > 0){
            System.out.printf("R1 = %.5f\n" , r2);
            System.out.printf("R2 = %.5f\n" , r1);
        } else System.out.println("Impossivel calcular");

    }

}
