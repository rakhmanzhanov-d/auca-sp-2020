import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ageInDays = inp.nextInt();

        int years = (ageInDays - (ageInDays % 365)) / 365;
        int months = ((ageInDays - years * 365)) / 30;
        int days = ageInDays - years * 365 - months * 30;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

    }
}
