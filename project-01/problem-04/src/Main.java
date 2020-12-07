import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    String strRectSz = JOptionPane.showInputDialog("Enter the field size [20, 40] ");
    float D = Integer.parseInt(strRectSz);
    float paddingX = 300, paddingY = 60;
    float x;
    float y;
    float dx;
    float dy;
    String direction;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String direction = "RIGHT";
        x = paddingX + D / 2f;
        y = paddingY + D / 2f;

        dx = 0;
        dy = 0;


        frameRate(20);
    }

    public void draw() {
        if(D >= 40 || D <= 20){
            JOptionPane.showInputDialog("Wrong number");
            System.exit(0);
        }
        background(0, 0, 0);
        //Drawing circle
        fill(255, 0, 0);
        circle(x, y, D);

        // Drawing rectangles
        for(float i = paddingX; i < width - paddingX; i += D){
            line(i, paddingY,i, height - paddingY);
            stroke(3, 123, 252);
        }
        for(float i = paddingY; i < height - paddingY; i += D){
            line(paddingX, i, width - paddingX, i);
            stroke(3, 123, 252);
        }

        // keypress event  handling
        if(key == CODED){
            if (keyCode == UP){
                direction = "UP";
                dx = 0;
                dy = -D;
                if (y <= paddingY + D / 2f){
                    dx = 0;
                    dy = 0;
                }
            }else if(keyCode == RIGHT){
                direction = "RIGHT";
                dy = 0;
                dx = D;
                if (x >= width - paddingX - D / 2f){
                    dx = 0;
                    dy = 0;
                }
            }else if(keyCode == DOWN){
                direction = "DOWN";
                dx = 0;
                dy = D;
                if (y >= height - paddingY - D/2f){
                    dx = 0;
                    dy = 0;
                }
            }else if(keyCode == LEFT){
                direction = "LEFT";
                dy = 0;
                dx = -D;
                if (x <= paddingX + D / 2f){
                    dx = 0;
                    dy = 0;
                }
            }
        }



        // Calling all results
        x += dx;
        y += dy;
        fill(255, 0, 0);
        textSize(30);
        textAlign(CENTER, CENTER);
        text("You pressed button "+ direction, width / 2f, 20);

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}