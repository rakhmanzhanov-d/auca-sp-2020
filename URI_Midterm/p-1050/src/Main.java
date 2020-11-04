import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ddd = inp.nextInt();
        String destination = "";
        if(ddd == 61){
            destination = "Brasilia";
        }else if(ddd == 71){
            destination = "Salvador";
        }else if(ddd == 11){
            destination = "Sao Paulo";
        }else if(ddd == 21){
            destination = "Rio de Janeiro";
        }else if(ddd == 32){
            destination = "Juiz de Fora";
        }else if(ddd == 19){
            destination = "Campinas";
        }else if(ddd == 27){
            destination = "Vitoria";
        }else if(ddd == 31){
            destination = "Belo Horizonte";
        }else{
            destination = "DDD nao cadastrado";
        }
        System.out.println(destination);

    }
}
