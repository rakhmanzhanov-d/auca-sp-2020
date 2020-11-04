import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = inp.nextDouble();
        double y = inp.nextDouble();
        String res = "";
        if(x > 5 && y > 5.0/2){
            System.out.printf("point (%.1f, %.1f) is not in the rectangle", x, y);
        }else{
            System.out.printf("point (%.1f, %.1f) is in the rectangle", x, y);
        }
    }
}
