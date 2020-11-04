import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        double d = 0.1;
        double dd = d + d + d + d + d + d + d + d + d + d;
        String res = "";
        if(dd == 1.0){
            res = "Equal";
        }else {
            res = "Not equal";
        }
        System.out.println(res);
    }
}
