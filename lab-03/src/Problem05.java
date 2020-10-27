import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // GRADES
        String grade = "Is not in the permitted range";
        System.out.print("Number of points?");
        int numGrade = inp.nextInt();
        if(numGrade >= 90 && numGrade <= 100){
            grade = "A";
        }else if(numGrade >= 80 && numGrade <= 90){
            grade = "B";
        }else if (numGrade >= 70 && numGrade <= 80){
            grade = "C";
        }else if (numGrade >= 60 && numGrade <= 70){
            grade = "D";
        }else if (numGrade >= 0 && numGrade <= 60){
            grade = "F";
        }
        System.out.println("Grade: " + grade);
    }
}
