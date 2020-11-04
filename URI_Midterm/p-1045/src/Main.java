import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();
        String result = "";

        double min = 0,mid = 0,max = 0;
        if(a > b && a > c){
            if(b > c){
                max = a;
                min = c;
                mid = b;
            }else{
                max = a;
                mid = c;
                min = b;
            }
        }else if(b > a && b > c){
            if(a > c){
                max = b;
                min = c;
                mid = a;
            }else{
                max = b;
                mid = c;
                min = a;
            }
        }else if(c > a && c > b){
            if(a > b){
                max = c;
                min = b;
                mid = a;
            }else{
                max = c;
                mid = b;
                min = a;
            }
        }
        if(a == b && b < c){
            max = c;
            mid = a;
            min = b;
        }else if(a == b && b > c){
            max = a;
            mid = b;
            min = c;
        }else if(a == c && c < b){
            max = b;
            mid = a;
            min = c;
        }else if(a == c && c > b){
            max = a;
            mid = c;
            min = b;
        }else if(b == c && c < a){
            max = a;
            mid = b;
            min = c;
        }else if(b == c && c > a){
            max = b;
            mid = c;
            min = a;
        }else if(b == a && a == c){
            max = a;
            mid = b;
            min = c;
        }

//        System.out.println("min" + min);
//        System.out.println("mid" + mid);
//        System.out.println("max" + max);

        if(max >= min + mid){
            result = "NAO FORMA TRIANGULO";
            System.out.println(result);
        }else if(max*max == (mid*mid + min*min)){
            result = "TRIANGULO RETANGULO";
            System.out.println(result);
        }else if(max*max > (min*min + mid*mid)){
            result = "TRIANGULO OBTUSANGULO";
            System.out.println(result);
        }else if(max*max < (min*min + mid*mid)){
            result = "TRIANGULO ACUTANGULO";
            System.out.println(result);
        }
        if(max == min && min == mid){
            result = "TRIANGULO EQUILATERO";
            System.out.println(result);
        }else if(min == mid || max == min || mid == max){
            result = "TRIANGULO ISOSCELES";
            System.out.println(result);
        }

//        System.out.println("min" + min);
//        System.out.println("mid" + mid);
//        System.out.println("max" + max);

    }
}
