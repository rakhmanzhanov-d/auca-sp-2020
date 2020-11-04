import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int comp = (int) (Math.round(Math.random()*(800) + 1) + 100);
        int user = inp.nextInt();
        int win = 0;
        int c = user % 10;
        int b = ((user - c)/10) % 10;
        int a = (((user - c)/10) - b)/10;

        int c1 = comp % 10;
        int b1 = ((comp - c)/10) % 10;
        int a1 = (((comp - c)/10) - b)/10;


        if(user == comp){
            win = 10000;
        }else if(c1 == c || b1 == b || a1 == a){
            win = 1000;
        }else if(c1 == c1 && b1 == b && a1 == a){
            win = 3000;
        }
        System.out.println(comp);
        System.out.printf("%,d", win);
    }
}
