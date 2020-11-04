public class Problem10 {
    public static void main(String[] args) {
        int randomCard = (int) Math.round(Math.random()*13) + 1;
        int randomSuit = (int) Math.round(Math.random()*4) + 1;
        String res = "";
        String suit = "";
        System.out.println(randomCard);
        System.out.println(randomSuit);
        switch (randomCard){
            case 1: res = "Ace"; break;
            case 2: res = "2"; break;
            case 3: res = "3";break;
            case 4: res = "4";break;
            case 5: res = "5";break;
            case 6: res = "6";break;
            case 7: res = "7";break;
            case 8: res = "8";break;
            case 9: res = "9";break;
            case 10: res = "10";break;
            case 11: res = "Jack";break;
            case 12: res = "Queen";break;
            case 13: res = "King";break;
        }
        switch(randomSuit){
            case 1: suit = "Clubs";break;
            case 2: suit = "Diamonds";break;
            case 3: suit = "Hearts";break;
            case 4: suit = "Spades";break;
        }
        System.out.println("The card you picked is "+ res + " of " + suit);

    }
}
