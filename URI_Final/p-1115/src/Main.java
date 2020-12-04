import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, y = 0;

        while((x = inp.nextInt()) != 0 && (y = inp.nextInt()) != 0){
            String res = "";
            if(x > 0 && y > 0){
                res = "primeiro";
                System.out.println(res);
            }else if(x > 0 && y < 0){
                res = "quarto";
                System.out.println(res);
            }else if(x < 0 && y < 0){
                res = "terceiro";
                System.out.println(res);
            }else{
                res = "segundo";
                System.out.println(res);
            }
        }
    }
}
