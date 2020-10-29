import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int max = 0, mid = 0, min = 0;

        if(a < b && a < c){
            min = a;
            if(b > c){
                max = b;
                mid = c;
            }else {
                max = c;
                mid = b;
            }
        }else if(b < a && b < c){
            min = b;
            if(a > c){
                max = a;
                mid = c;
            }else {
                max = c;
                mid = a;
            }
        }else if(c < a && c < b){
            min = c;
            if(a > b){
                max = a;
                mid = b;
            }else {
                max = b;
                mid = a;
            }
        }
        if(a == b && b < c){
            min = a;
            mid = b;
            max = c;
        }else if(a == b && b > c){
            min = c;
            mid = b;
            max = a;
        }else if(b == c && c < a){
            min = c;
            mid = b;
            max = a;
        }else if(b == c && c > a){
            min = a;
            mid = b;
            max = c;
        }else if(b == a &&  b == c){
            min = a;
            mid = b;
            max = c;
        }

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
