import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        while ((a = inp.nextInt()) != 2002){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}