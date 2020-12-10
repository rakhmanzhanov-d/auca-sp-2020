import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = inp.nextLine();

        // Index of the first character in the string
        int firstIndex = 0;
        int lastIndex = word.length() - 1;

        boolean isPalindrome = true;
        while(firstIndex < lastIndex){
            if(word.charAt(firstIndex) != word.charAt(lastIndex)){
                isPalindrome = false;
                break;
            }
            firstIndex++;
            lastIndex--;

        }
        if(isPalindrome){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
}
}
