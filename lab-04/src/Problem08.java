import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double weight = inp.nextDouble();
        double cost = 0;
        if(weight > 0 && weight < 2){
            cost = 3.5;
        }else if(weight > 1 && weight < 4){
            cost = 5.5;
        }else if(weight > 3 && weight < 11){
            cost = 8.5;
        }else if(weight > 10 && weight < 21){
            cost = 10.5;
        }else if(weight > 50){
            String res = "The package can not be snipped";
            System.out.println(res);
        }
        System.out.println(cost);
    }
}
