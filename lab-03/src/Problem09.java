import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("scissor(0) rock(1) paper(2): ");
        int userNumber = inp.nextInt();
        int compNumber =(int) (Math.random() * 3);
        String gameUser = "";
        String gameComp = "";
        String result = "";

        if (userNumber == 0){
            gameUser = "scissor";
        }else if (userNumber == 1){
            gameUser = "rock";
        }else if (userNumber == 2){
            gameUser = "paper";
        }

        if (compNumber == 0){
            gameComp = "scissor";
        }else if (compNumber == 1){
            gameComp = "rock";
        }else if (compNumber == 2){
            gameComp = "paper";
        }

        // WHEN THE USER LOSES
        if(userNumber == compNumber){
            result = " too. It is a draw";
        }else if (userNumber == 0 && compNumber == 1){
            result = ". You lose";
        }else if (userNumber == 1 && compNumber == 2){
            result = ". You lose";
        }else if (userNumber == 2 && compNumber == 0){
            result = ". You lose";
        }

        //When the USER WINS
        if(userNumber == 0 && compNumber == 2){
            result = ". You win";
        }else if(userNumber == 1 && compNumber == 0){
            result = ". You win";
        }else if(userNumber == 2 && compNumber == 1){
            result = ". You win";
        }

        System.out.println("The computer is " + gameComp + ". You are " + gameUser + result);

    }
}
