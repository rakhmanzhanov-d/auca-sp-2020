import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sec = inp.nextInt();

        int hours = (sec - sec % 3600) / 3600;
        int mins = (sec - hours * 3600) / 60;
        int secs = sec - hours * 3600 - mins * 60;

        System.out.println(hours + ":" + mins + ":" + secs);
    }
}
