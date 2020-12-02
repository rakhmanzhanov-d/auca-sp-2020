import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Year: ");
        int year = inp.nextInt();
        System.out.print("Month: ");
        int month = inp.nextInt();

        if(month < 1 || 12 < month) {
            System.out.println(month + " is not a correct num o month");
        }

        System.out.println(getNumberOfDaysInMonth(year, month));
    }
    static int getNumberOfDaysInMonth(int year, int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;

        }
        return 0;
    }
    static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
