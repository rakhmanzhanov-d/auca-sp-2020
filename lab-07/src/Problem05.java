import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] grades = {"A", "B", "C", "D", "F"};
        String res = "";

        System.out.print("Enter the number of students: ");
        int n = inp.nextInt();

        // Initialize the cards
        int[] students = new int[n];

        System.out.print("Enter " + n + " scores: ");
        int best = 0;
        for(int i = 0; i < n; i++){
            students[i] = inp.nextInt();
            if(best < students[i]){
                best = students[i];
            }
        }

        for(int t = 0; t < n; t++){
            if(students[t] >= best - 10){
                res = grades[0];
            }else if(students[t] >= best - 20){
                res = grades[1];
            }else if(students[t] >= best - 30){
                res = grades[2];
            }else if(students[t] >= best - 40){
                res = grades[3];
            }else {
                res = grades[4];
            }
            System.out.println("Student " + t + " score is " + students[t] + " and grade is " + res);
        }
    }
}
