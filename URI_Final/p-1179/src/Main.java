import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int evenIterate = 0;
        int oddIterate = 0;

        for(int i = 0; i < 15; i++){
            if (evenIterate == 5){
                for(int k = 0; k < 5; k++){
                    System.out.println("par[" + k + "] = " + par[k]);
                }
                evenIterate = 0;
            }else if(oddIterate == 5){
                for(int k = 0; k < 5; k++){
                    System.out.println("impar[" + k + "] = " + impar[k]);
                }
                oddIterate = 0;
            }

            int x = inp.nextInt();
            if(x % 2f == 0){
                par[evenIterate] = x;
                evenIterate++;
            }else if(x % 2f != 0){
                impar[oddIterate] = x;
                oddIterate++;
            }
        }
        for(int i = 0; i < oddIterate; i++){
            System.out.println("impar[" + i + "] = " + impar[i]);
        }

        for(int i = 0; i < evenIterate; i++){
            System.out.println("par[" + i + "] = " + par[i]);
        }
    }
}
