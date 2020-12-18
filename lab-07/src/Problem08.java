import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        double n;
        double[] numbers = new double[99];
        int index = 0;
        float divide = 1;

        // Setting input numbers into array with its position
        while ((n = inp.nextDouble()) > 0) {
            System.out.println(n);
            numbers[index] = n;
            index++;
            divide++;
        }

        // Average
        int sum = 0;
        float average = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        average = sum / divide;


        // How many scores are >= average || below the average
        int above = 0;
        int below = 0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] >= average){
                above++;
            }else if(numbers[i] != 0){
                below++;
            }
        }

        System.out.println("Above: " + above);
        System.out.println("Below: " + below);

    }
}
