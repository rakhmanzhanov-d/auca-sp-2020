import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String class1 = inp.nextLine();
        String class2 = inp.nextLine();
        String class3 = inp.nextLine();
        String result = "";

        switch(class1){
            case "vertebrado":
                switch(class2){
                    case "ave":
                        switch(class3){
                            case "carnivoro": result = "aguia";
                            break;
                            case "onivoro": result = "pomba";
                            break;
                        }
                        break;
                    case "mamifero":
                        switch(class3){
                            case "onivoro" : result = "homem";
                            break;
                            case "herbivoro" : result = "vaca";
                            break;
                        }break;
                }
            case "invertebrado":
                switch(class2){
                    case "inseto":
                        switch(class3){
                            case "hematofago": result = "pulga";
                            break;
                            case "herbivoro": result = "lagarta";
                            break;
                        }break;
                    case "anelideo":
                        switch(class3){
                            case "hematofago": result = "sanguessuga";
                            break;
                            case "onivoro": result = "minhoca";
                            break;
                        }
                }
                System.out.println(result);
        }
    }
}
