import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        double n;
        double[] numbers = new double[99];
        int index = 0;

        // Setting input numbers into array with its position
        while ((n = inp.nextDouble()) != 0) {
            System.out.println(n);
            numbers[index] = n;
            index++;
        }


        for (int t = 0; t < numbers.length; t++) {
            double curNum = numbers[t];
            if (curNum == 0) {
                continue;
            }
            int iteration = 1;

            // checking if there are such numbers after its position
            for(int i = t + 1; i < numbers.length; i++){
                if(numbers[t] == numbers[i]){
                    iteration++;
                    numbers[i] = 0;
                }
            }

            if(iteration == 1){
            System.out.printf("%.0f occurs %d time\n", numbers[t], iteration);
            }else{
                System.out.printf("%.0f occurs %d times\n", numbers[t], iteration);
            }
        }


    }
}

