import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x2 = inp.nextDouble();
        double y2 = inp.nextDouble();
        String result = "";

        double distance = Math.pow(x2*x2 + y2*y2, 0.5);
        if(distance <= 10){
            result = " is in the circle";
        }else if(distance > 10){
            result = " is not in the circle";
        }
        System.out.println("Point (" + x2 + ", " + y2 + ")" + result);
    }
}
