import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int A = inp.nextInt();
        int B = inp.nextInt();
        int C = inp.nextInt();
        int D = inp.nextInt();

        int Diferenca = (A*B) - (D*C);

        System.out.println("DIFERENCA = " + Diferenca);
    }
}
