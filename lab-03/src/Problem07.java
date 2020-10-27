import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String dayOfWeekFuture = "";
        String dayOfWeekNow = "";
        System.out.print("Enter today's day: ");
        int today = inp.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int future = inp.nextInt();

        int numOfDayInWeek = (today + future) % 7;

        // Checking for day in the future
        if(numOfDayInWeek == 0){
            dayOfWeekFuture = "Sunday";
        }else if(numOfDayInWeek == 1){
            dayOfWeekFuture = "Monday";
        }else if (numOfDayInWeek == 2){
            dayOfWeekFuture = "Tuesday";
        }else if (numOfDayInWeek == 3){
            dayOfWeekFuture = "Wednesday";
        }else if (numOfDayInWeek == 4){
            dayOfWeekFuture = "Thursday";
        }else if (numOfDayInWeek == 5){
            dayOfWeekFuture = "Friday";
        }else if (numOfDayInWeek == 6){
            dayOfWeekFuture = "Saturday";
        }

        // Checking for present day
        if(today == 0){
            dayOfWeekNow = "Sunday";
        }else if(today == 1){
            dayOfWeekNow = "Monday";
        }else if (today == 2){
            dayOfWeekNow = "Tuesday";
        }else if (today == 3){
            dayOfWeekNow = "Wednesday";
        }else if (today == 4){
            dayOfWeekNow = "Thursday";
        }else if (today == 5){
            dayOfWeekNow = "Friday";
        }else if (today == 6){
            dayOfWeekNow = "Saturday";
        }

        System.out.println("Today is " + dayOfWeekNow + " and the future day is " + dayOfWeekFuture);

    }
}
