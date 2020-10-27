import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        // Leap years
        Scanner inp = new Scanner(System.in);
        System.out.print("Year?");
        int year = inp.nextInt();
        boolean leap = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap = true;
                }else{
                    leap = false;
                }
            } else {
                leap = true;
            }
        }else {
            leap = false;
        }
        if(leap){
            System.out.printf("%d is a leap year.\n", year);
        }else {
            System.out.printf("%d is not a leap year.", year);
        }
    }
}
