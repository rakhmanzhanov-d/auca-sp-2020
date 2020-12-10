import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double[] list = {2, 9, 5, 4, 8, 1, 6};
        for (int i = 0; i < list.length; i++) {
            int currentIndex = i;
            double currentMinItem = list[i];

            for(int j = i + 1; j < list.length; j++){
                if(currentMinItem > list[j]){
                    currentMinItem = list[j];
                    currentIndex = j;
                }
            }

                if(currentIndex != i){
                    list[currentIndex] = list[i];
                    list[i] = currentMinItem;
                }

            System.out.println(list[i]);
        }
    }
}
