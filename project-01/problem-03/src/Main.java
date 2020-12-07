import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    String firstWord = JOptionPane.showInputDialog("First word");
    String secondWord = JOptionPane.showInputDialog("Second word");

    float speedX, speedY;
    float position1, position2, length1, length2;


    public void settings() {
        fullScreen();
        size(1000, 1000);
    }

    public void setup() {
        length1 = firstWord.length();
        length2 = secondWord.length();

        position1 = width / 2f;
        position2 = width / 2f;

        speedX = (width / 50 - length1) / 4;
        speedY = (width / 50 - length2) / 4;
        speedY = -speedY;
    }

    public void draw() {
        background(0);
        textSize(100);
        fill(255, 0, 0);
        textAlign(CENTER, CENTER);
        text(firstWord, position1, 200);

        textSize(100);
        fill(0, 255, 0);
        textAlign(CENTER, CENTER);
        text(secondWord, position2, height - 200);

        if(position1 >= width - (length1 / 2) * 50 || position1 <= (length1 / 2) * 50){
            speedX = -speedX;
        }
        if(position2 >= width - (length2 / 2) * 50 || position2 <= (length2 / 2) * 50){
            speedY = -speedY;
        }

        position1 += speedX;
        position2 += speedY;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}