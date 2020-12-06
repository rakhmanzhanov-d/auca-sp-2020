import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
            System.out.println("           Multiplication Table           ");
            System.out.println("        1  2  3  4  5  6  7  8  9 ");
            System.out.println("___________________________________________");
            for(int i = 1; i <=9; i++){
                System.out.print(i + " |     ");
                for(int t = 1; t <= 9; t++){
                    String space = " ";
                    if(t * i < 10){
                        space = "  ";
                    }
                    if(t == 9){
                        space = "\n";
                    }
                    System.out.print(t * i + space);
                }
            }

    }
}
