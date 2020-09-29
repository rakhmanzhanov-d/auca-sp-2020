import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        double min = inp.nextDouble();
        double minutes = Math.floor(min);
        double years = Math.floor(minutes / (365*24*60));
        double days = Math.floor(((minutes / (365*24*60))-years)*365);

        System.out.println(Math.round(minutes) + " minutes is approximately " + Math.round(years) + " years and " + Math.round(days) + " days");
    }
}
