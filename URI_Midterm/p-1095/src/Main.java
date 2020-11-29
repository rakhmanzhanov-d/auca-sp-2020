import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = 0;
        int step = 1;
        for (int i = 60; i >= 0; i-= 5){
            if(t == 0){
                step = step;
            }else if(t > 0){
                step = 3;
            }
            t += step;
            System.out.println("I="+ t + " J=" + i);
        }
    }
}
