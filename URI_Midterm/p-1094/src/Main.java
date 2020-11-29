import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int frogs = 0;
        int rats = 0;
        int rabbits = 0;
        int total = 0;
        String res = "";
        for(int i = n; i > 0; i--){
            int amount = inp.nextInt();
            String type = inp.nextLine();

            // C rabbit
            // R rat
            // S frog
            if(type.contains("C")){
                rabbits += amount;
            }else if (type.contains("R")){
                rats += amount;
            }else if(type.contains("S")){
                frogs += amount;
            }
            total += amount;
        }
        System.out.println("Total: " + total+" cobaias");
        System.out.println("Total de coelhos: " + rabbits);
        System.out.println("Total de ratos: " + rats);
        System.out.println("Total de sapos: " + frogs);
        System.out.printf("Percentual de coelhos: %.2f " , (float)(rabbits * 100) / total);
        System.out.println("%");
        System.out.printf("Percentual de ratos: %.2f " , (float)(rats * 100) / total);
        System.out.println("%");
        System.out.printf("Percentual de sapos: %.2f " , (float)(frogs * 100) / total);
        System.out.println("%");
    }
}
