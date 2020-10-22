import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        double pointX = inp.nextDouble();
        double pointY = inp.nextDouble();
        String area = "";
        if(pointX > 0 && pointY > 0){
            area = "Q1";
        }else if(pointX < 0 && pointY > 0){
            area = "Q2";
        }else if(pointX < 0 && pointY < 0){
            area = "Q3";
        }else if(pointX > 0 && pointY < 0){
            area = "Q4";
        }else if(pointX == 0 && pointY == 0){
            area = "Origem";
        }else if(pointX == 0 && pointY > 0 || pointX == 0 && pointY < 0){
            area = "Eixo Y";
        }else if(pointY == 0 && pointX > 0 || pointY == 0 && pointX < 0){
            area = "Eixo X";
        }
        System.out.println(area);
    }
}
