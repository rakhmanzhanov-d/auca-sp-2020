import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float g1 = inp.nextFloat();
        float g2 = inp.nextFloat();
        float g3 = inp.nextFloat();
        float g4 = inp.nextFloat();

        float aver = (g1*2 + g2*3 + g3*4 + g4*1) / 10;

        if(aver >= 7.0){
            System.out.printf("Media: %.1f\n", aver);
            System.out.println("Aluno aprovado.");
        }else if(aver >= 5 && aver <= 6.9){
            float g5 = inp.nextFloat();
            System.out.printf("Media: %.1f\n", aver);
            System.out.println("Aluno em exame.");
            System.out.println("Nota do exame: " + g5);
            float finalRes = (g5 + aver) / 2;
            if (finalRes >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if(finalRes <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", finalRes);
        }else if(aver <= 4.9){
            System.out.printf("Media: %.1f\n", aver);
            System.out.println("Aluno reprovado.");
        }
    }
}