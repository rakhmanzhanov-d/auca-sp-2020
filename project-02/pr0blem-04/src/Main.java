import processing.core.*;

import javax.swing.*;
import java.util.Random;

public class Main extends PApplet {
    float[][] arrMain;
    float[][][] arrForEachBall;
    int numOfSequences, lengthOfSequences;
    float diameter = 40, sign;
    Random rnd = new Random();

    public void settings() {
        fullScreen();
    }

    public void setup() {
        numOfSequences = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequences"));
        lengthOfSequences = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of sequences"));
        arrMain = new float[numOfSequences][5];
        arrForEachBall = new float[numOfSequences][lengthOfSequences][4];
        for (int i = 0; i < numOfSequences; i++) {
            sign = rnd.nextBoolean() ? 1 : -1;
            arrMain[i][0] = random(0, width);
            arrMain[i][1] = random(0, height);
            arrMain[i][2] = random(0, 255);
            arrMain[i][3] = random(0, 255);
            arrMain[i][4] = random(0, 255);

            for (int t = 0; t < lengthOfSequences; t++) {
                arrForEachBall[i][t][0] = arrMain[i][0];
                arrForEachBall[i][t][1] = arrMain[i][1];
                arrForEachBall[i][t][2] = 2f;
                arrForEachBall[i][t][3] = 2f;

                System.out.println(arrForEachBall[i][t][0] + "     " + arrForEachBall[i][t][1] + "     " + arrForEachBall[i][t][2] + "     " + arrForEachBall[i][t][3] + "     " );
            }
        }
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < numOfSequences; i++){
            for (int t = 0; t < lengthOfSequences; t++){
                drawCircle(arrForEachBall[i][t][0] + t * sign * 20f * sqrt(2), arrForEachBall[i][t][1] + t * sign * 20f * sqrt(2), arrMain[i][2], arrMain[i][3], arrMain[i][4], t);
                if (arrForEachBall[i][t][0] + t * sign * 20f * sqrt(2) < 0 || arrForEachBall[i][t][0] + t * sign * 20f * sqrt(2) >= width){
                    arrForEachBall[i][t][2] = -arrForEachBall[i][t][2];
                }
                if (arrForEachBall[i][t][1] + t * sign * 20f * sqrt(2) < 0 || arrForEachBall[i][t][1] + t * sign * 20f * sqrt(2) >= height){
                    arrForEachBall[i][t][3] = -arrForEachBall[i][t][3];
                }
                arrForEachBall[i][t][0] += arrForEachBall[i][t][2];
                arrForEachBall[i][t][1] += arrForEachBall[i][t][3];
            }
        }
    }
    public void drawCircle(float x, float y, float red, float green, float blue, float opacity){
        fill(opacity * (red / numOfSequences), opacity * (green / numOfSequences), opacity * (blue / numOfSequences));
        circle(x, y, diameter);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}