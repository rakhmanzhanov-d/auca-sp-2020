import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month = inp.nextInt();
        String season = "";
        if(month > 2 && month < 6){
            season = "spring";
        }else if(month > 5 && month < 9){
            season = "summer";
        }else if(month > 8 && month < 12){
            season = "autumn";
        }else if(month == 12 || month >= 1 && month < 3){
            season = "winter";
        }
        System.out.println(season);
    }
}
