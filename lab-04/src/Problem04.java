import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int level = inp.nextInt();;
        String gamer = "";
        if(level >= 4 && level <= 5){
            gamer = "pro gamer";
        }else if(level >= 2 && level <= 3){
            gamer = "experienced gamer";
        }else if(level == 1){
            gamer = "beginner";
        }else if(level == 0){
            gamer = "total newbie";
        }
        System.out.println(gamer);
    }
}
