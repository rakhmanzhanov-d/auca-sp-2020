import processing.core.*;
import javax.swing.*;

public class Main extends PApplet {
    String strDiamter = JOptionPane.showInputDialog("Enter Diameter");
    final float D = Integer.parseInt(strDiamter);
    float x;
    float y;
    float dx;
    float dy;
    String direcion = "RIGHT";

    public void settings() {
        fullScreen();
        size(1000, 1000);
    }

    public void setup() {
        x = D / 2f;
        y = D / 2f;

        dx = D;
        dy = 0;
        frameRate(20);
    }

    public void draw() {
        fill(0, 0, 0, 30);
        rect(0, 0, width - 1, height - 1);
        fill(255, 0, 0);
        circle(x, y, D);

        for(float i = 0; i < height - 1; i += D){
            line(0, i, width - 1, i);
            stroke(3, 123, 252);
        }
        for(float i = 0; i < width - 1; i += D){
            line(i, 0, i, height - 1);
            stroke(3, 123, 252);
        }

        if(key == CODED){
            if (keyCode == UP){
                dx = 0;
                dy = -D;
                direcion = "UP";
            }else if(keyCode == RIGHT){
                dx = D;
                dy = 0;
                direcion = "RIGHT";
            }else if(keyCode == DOWN){
                dx = 0;
                dy = D;
                direcion = "DOWN";
            }else if(keyCode == LEFT){
                dx = -D;
                dy = 0;
                direcion = "LEFT";
            }

        }
        x += dx;
        y += dy;
        fill(255, 0, 0);
        textSize(30);
        textAlign(CENTER, CENTER);
        text("You pressed button "+ direcion, width / 2f, 20);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}