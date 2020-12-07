import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    float rectHeight = 500;
    float rectWidth = 300;
    float paddingRightLeft = 100;
    float positionX, positionY;

    String position;


    int value = 0;

    public void mouseDragged()
    {
        if(mouseX <= positionX + 20 && mouseX >= positionX - 20 && mouseY <= positionY + 20 && mouseY >= positionY - 20){
            positionY = mouseY;
            positionX = mouseX;
        }
        if(positionX >= paddingRightLeft && positionX <= paddingRightLeft + rectWidth && positionY >= paddingRightLeft && positionY <= paddingRightLeft + rectHeight){
            position = "The center of the rectangle is in the left rectangle";
        }else if(positionX >= width - rectWidth - paddingRightLeft && positionX <= width - paddingRightLeft && positionY >= paddingRightLeft && positionY <= paddingRightLeft + rectHeight){
            position = "The center of the rectangle is in the right rectangle";
        }else{
            position = "The center of the circle is outside of both rectangles";
        }
    }
    public void settings() {
        fullScreen();
    }

    public void setup() {
        positionX = paddingRightLeft + rectWidth/2f;
        positionY = height / 2f;
        position = "The center of the rectangle is in the left rectangle";
    }

    public void draw() {
        background(0, 0, 0);

        //Drawing first rectangle
        stroke(255);
        fill(0);
        rect(paddingRightLeft, paddingRightLeft, rectWidth, rectHeight);

        //Drawing second rectangle
        stroke(255);
        fill(0);
        rect(width - paddingRightLeft - rectWidth, paddingRightLeft, rectWidth, rectHeight);


        //Drawing circle;
        fill(255, 0, 0);
        circle(positionX, positionY, 40);

        // Texting
        fill(255);
        textSize(25);
        textAlign(CENTER, CENTER);
        text(position, width / 2f, 40);
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }

}