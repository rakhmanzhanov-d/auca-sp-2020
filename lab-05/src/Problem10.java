public class Problem10 {
    public static void main(String[] args) {
        int iteration = 6;

        System.out.println("The first 50 prime numbers are: ");
        System.out.print("2 3 5 7 11 13 ");
        for(int i = 3; i <= 229; i++){
            String space = " ";

            if(iteration == 10){
                iteration = 0;
            }

            int test = 0;
            int test2 = 0;


            if(i % 2f != 0){
                test++;
            }
            for(float t = 3; t <= 13f; t++){
                if(i % t != 0){
                    test2++;
                }
                if(test2 >= 11){
                    test++;
                }
            }
            if (test >= 2){
                iteration++;
                if(iteration >= 10){
                    space = "\n";
                }
                System.out.print(i + space);
            }
        }
    }
}
