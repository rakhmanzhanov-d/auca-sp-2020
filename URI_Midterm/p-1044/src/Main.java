import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        String result = "";
        if(a > b){
            if((a % b) == 0){
                result = "Sao Multiplos";
            }else {
                result = "Nao sao Multiplos";
            }
        }else if(b > a){
            if((b % a) == 0){
                result = "Sao Multiplos";
            }else {
                result = "Nao sao Multiplos";
            }
        }
        System.out.println(result);
    }
}
