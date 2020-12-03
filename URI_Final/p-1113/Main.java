import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner inp = new Scanner(System.in);
        while ((a = inp.nextInt()) != (b = inp.nextInt())) {{
            String res = "";
            if(a > b){
                res = "Decrescente";
            }else{
                res = "Crescente";
            }
            System.out.println(res);
        }

        }
    }
}