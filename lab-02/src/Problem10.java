import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year = inp.nextInt();
        double birth = (365*24*60*60) / 7;
        double death = (365*24*60*60) / 13;
        double mig = (365*24*60*60) / 45;
        double population = 312032486;
        double years = year;
        while(year > 0) {
            double temp = population + birth + mig - death;
            population = temp;
            year = year - 1;
        }
        System.out.println(population);
        System.out.println("The population in " + Math.round(years) + " years is " + Math.round(population));
    }
}
