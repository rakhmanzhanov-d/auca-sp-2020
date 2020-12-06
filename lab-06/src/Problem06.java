import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(reverse(n));
        isPalindrome(n);
    }
    public static int reverse(int n){
        int reverse = 0;
        while (n != 0){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

//        System.out.println(reverse);
        return reverse;
    }

    public static boolean isPalindrome(int n){
        if(n == reverse(n)){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }
        }
    }

