import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int team1 = 0, team2 = 0, numOfGames = 0, draw = 0, teamSum1 = 0, teamSum2 = 0, gameIteration;
        String wins = "";

        team1 = inp.nextInt();
        team2 = inp.nextInt();

        if(team1 > team2){
            teamSum1++;
        }else if(team1 < team2){
            teamSum2++;
        }else if(team1 == team2){
            draw++;
        }
        numOfGames++;

        System.out.println("Novo grenal (1-sim 2-nao)");
        while((gameIteration = inp.nextInt()) == 1){
            System.out.println("Novo grenal (1-sim 2-nao)");
            team1 = inp.nextInt();
            team2 = inp.nextInt();

            if(team1 > team2){
                teamSum1++;
            }else if(team1 < team2){
                teamSum2++;
            }
            numOfGames++;
        }
        if(teamSum1 > teamSum2){
            wins = "Inter venceu mais";
        }else if(teamSum2 > teamSum1){
            wins = "Gremio venceu mais";
        }else {
            wins = "Não houve vencedor";
        }

        System.out.println(numOfGames + " grenais");
        System.out.println("Inter:"+teamSum1);
        System.out.println("Gremio:"+teamSum2);
        System.out.println("Empates:"+draw);
        System.out.println(wins);
    }
}
