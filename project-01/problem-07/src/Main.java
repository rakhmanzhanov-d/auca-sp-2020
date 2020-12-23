import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    String c = JOptionPane.showInputDialog("Enter the number of circles [4 12]");
    float numOfSquares = Integer.parseInt(c);
    float bigSquareSides = 700;
    float squareSize = bigSquareSides / numOfSquares;
    float paddingTop;
    float paddingRight;
    float startX, startY;
    String color;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        paddingRight = (width - bigSquareSides) / 2;
        paddingTop = (height - bigSquareSides) / 4;
        startX = paddingRight + squareSize;
        startY = paddingTop + squareSize;
        System.out.println(paddingRight + "       " + paddingTop);
        System.out.println(width + "       " + height);
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 1; i <= numOfSquares; i++) {
            for (int t = 1; t <= numOfSquares; t++) {
                if (i % 2 == 0) {
                    if (t % 2 == 0) {
                        fill(20);
                        color = "Black;";
                    } else {
                        fill(255);
                        color = "White;";
                    }
                } else {
                    if (t % 2 == 0) {
                        fill(255);
                        color = "White;";
                    } else {
                        fill(20);
                        color = "Black;";
                    }
                }
                if (mouseX > startX && mouseX < startX + squareSize && mouseY > startY && mouseY < startY + squareSize) {
                    stroke(255, 0, 0);
                    strokeWeight(5);
                } else {
                    noStroke();
                }


                square(startX, startY, squareSize);
                ////////////////////////////////////
                if (mouseX > startX && mouseX < startX + squareSize && mouseY > startY && mouseY < startY + squareSize) {
                    textSize(25);
                    fill(255, 255, 0);
                    textAlign(CENTER);
                    text("Row: " + i + "; Column: " + t + "; Color: " + color + "; ", width / 2f, height / 18f);
                } else {
                    noStroke();
                }
                startY += squareSize;
                if (t == numOfSquares) {
                    startY = paddingTop + squareSize / 2;
                }
            }
            startX += squareSize;
            if (i == numOfSquares) {
                startX = paddingRight + squareSize / 2;
            }
        }


    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}