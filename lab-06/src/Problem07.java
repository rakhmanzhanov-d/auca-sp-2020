import java.util.Scanner;

//Euclid's GDC
public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        while(a != 0 && b != 0){
            if(a > b){
                a = a % b;
            }else{
                b = b % a;
            }
        }
        System.out.println(a + b);
    }
}
