import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float firstScore, media = 0, total = 0, total2 = 0;
        Scanner inp = new Scanner(System.in);


        while(total2 != 2){
            firstScore = inp.nextFloat();
            if(firstScore >= 0 && firstScore <= 10){
                total += firstScore;
                total2++;
            }else{
                System.out.println("nota invalida");
            }
        }
        media = total / 2;

        System.out.printf("media = %.2f\n", media);
    }
}
