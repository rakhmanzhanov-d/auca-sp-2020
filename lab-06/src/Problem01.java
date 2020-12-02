import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int userX = inp.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int cor1 = inp.nextInt();

        System.out.print("Coordinate of 2nd point: ");
        int cor2 = inp.nextInt();

        int d1 = abs(cor1 - userX);
        int d2 = abs(cor2 - userX);

        if(d1 > d2){
            System.out.println("First point is closer. Distance is " + d1);
        }else if( d2 > d1){
            System.out.println("Second point is closer. Distance is " + d2);
        }else{
            System.out.println("Distances are the same and equal to " + d1);
        }
        }
        static int abs(int n){
            int r = n;
            if(r < 0){
                r = -r;
            }
            return r;
        }
}
