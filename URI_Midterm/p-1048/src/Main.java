import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double salary = inp.nextDouble();
        double percent = 0;
        if(salary >=0 && salary <= 400){
            percent = 15;
        }else if(salary >= 400.01 && salary <= 800.00){
            percent = 12;
        }else if(salary >= 800.01 && salary <= 1200.00){
            percent = 10;
        }else if(salary >= 1200.01 && salary <= 2000.00){
            percent = 7;
        }else if(salary >= 2000.01){
            percent = 4;
        }
        double finalSalary = salary + (percent / 100)*salary;

        System.out.printf("Novo salario: %.2f\n" , finalSalary);
        System.out.printf("Reajuste ganho: %.2f\n", (percent / 100)*salary);
        System.out.printf("Em percentual: %.0f",  percent);
        System.out.println(" %");
    }
}
