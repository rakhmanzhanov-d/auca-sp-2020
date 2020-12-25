import processing.core.*;

import javax.swing.*;
import java.util.Random;

public class Main extends PApplet {
    float[][] arrMain;
    float[][] arrForEachBall;
    int numOfSequences, lengthOfSequences;
    float diameter = 40;
    Random rnd = new Random();

    public void settings() {
        fullScreen();
    }

    public void setup() {
        numOfSequences = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequences"));
        lengthOfSequences = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of sequences"));
        arrForEachBall = new float[lengthOfSequences][2];
        arrMain = new float[numOfSequences][7];
        for (int i = 0; i < numOfSequences; i++) {
            float sign = rnd.nextBoolean() ? 1 : -1;
            arrMain[i][0] = random(0, width);    // x
            arrMain[i][1] = random(0, height);   // y
            arrMain[i][2] = sign * 20f * sqrt(2);                     // dx
            arrMain[i][3] = sign * 20f * sqrt(2);                     // dy
            arrMain[i][4] = random(0, 255); // red
            arrMain[i][5] = random(0, 255); // green
            arrMain[i][6] = random(0, 255); // blue
        }
        frameRate(10);
    }

    public void draw() {
        fill(0, 255f / (numOfSequences + lengthOfSequences) * 5);
        rect(0, 0, width, height);
        for (int i = 0; i < numOfSequences; i++) {
            drawStar(arrMain[i][0], arrMain[i][1], arrMain[i][4], arrMain[i][6], arrMain[i][6]);
            if (arrMain[i][0] + 20f * sqrt(2) >= width || arrMain[i][0] < 20f * sqrt(2)) {
                arrMain[i][2] = -arrMain[i][2];
            }
            if (arrMain[i][1] + 20f * sqrt(2) >= height || arrMain[i][1] < 20f * sqrt(2)) {
                arrMain[i][3] = -arrMain[i][3];
            }

            arrMain[i][0] += arrMain[i][2];
            arrMain[i][1] += arrMain[i][3];
        }
    }

    public void drawStar(float x, float y, float red, float green, float blue) {
        fill(red, green, blue);
        circle(x, y, diameter);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}