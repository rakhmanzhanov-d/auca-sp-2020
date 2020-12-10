import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Year: ");
            if (!inp.hasNext()) {
                break;
            }
            int year = inp.nextInt();

            System.out.print("Month: ");
            if (!inp.hasNext()) {
                break;
            }
            int month = inp.nextInt();

            try {
                System.out.println(getNumberOfDaysInMonth(year, month));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Incorrect number of month " + month);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static int getNumberOfDaysInMonth(int year, int month) {
        if (year < 1) {
            throw new IllegalArgumentException("Incorrect year: " + year);
        }
        int result = days[month - 1];
        if (isLeapYear(year) && month == 2) {
            result++;
        }
        return result;
    }

    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}