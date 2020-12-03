import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sumOdd = 0;
        for(int i = 0; i < n; i++){
            int a = inp.nextInt();
            int b = inp.nextInt();
            if(Math.abs(a - b) > 1){
                if(a > b){
                    if(b * 1f % 2 == 0){
                        for (int t = b + 1; t < a; t += 2){
                            sumOdd += t;
                        }
                    }else if(b * 1f % 2 != 0){
                        for (int t = b + 2; t < a; t += 2){
                            sumOdd += t;
                        }
                    }
                }else if(a < b){
                    if(a * 1f % 2 == 0){
                        for (int t = a + 1; t < b; t += 2){
                            sumOdd += t;
                        }
                    }else if(a * 1f % 2 != 0){
                        for (int t = a + 2; t < b; t += 2){
                            sumOdd += t;
                        }
                    }
                }
            }
            System.out.println(sumOdd);
            sumOdd = 0;
        }
    }
}
