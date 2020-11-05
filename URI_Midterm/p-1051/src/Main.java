import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float salary = inp.nextFloat();
        float tax1, tax2, tax3, taxFin = 0;
        if(salary <= 2000.00 && salary >= 0){
            String res = "Isento";
            System.out.println(res);
        }else if(salary >= 2000.01 && salary <= 3000.00){
            tax1 = salary - 2000;
            taxFin = (tax1 * 8) / 100;
            System.out.printf("R$ %.2f",taxFin);
        }else if(salary >= 3000.01 && salary <= 4500.00){
            tax1 = salary - 2000;
            tax2 = tax1 - 1000;
            tax1 -= tax2;
            taxFin = ((tax1 * 8) / 100) + ((tax2 * 18) / 100);
            System.out.printf("R$ %.2f",taxFin);
        }else if(salary > 4500.00){
            tax1 = salary - 2000;
            tax2 = tax1 - 1000;
            tax3 = tax2 - 1500;
            tax1 -= tax2;
            tax2 -= tax3;
            taxFin = (tax1 * 8) / 100 + (tax2 * 18) / 100 + (tax3*28) / 100;
            System.out.printf("R$ %.2f",taxFin);
        }

    }
}
