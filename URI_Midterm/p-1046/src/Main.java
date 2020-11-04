import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int start = inp.nextInt();
        int finish = inp.nextInt();
        int last = ((24 - start) + finish) % 24;
        if(last == 0){last = 24;}
        System.out.println("O JOGO DUROU " + last + " HORA(S)");
    }
}
