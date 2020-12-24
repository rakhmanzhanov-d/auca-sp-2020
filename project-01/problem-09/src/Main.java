import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {
    float bigSquaresSize = 400;
    float numOfSquares, squareSize, angle, dangle, dx, dy, x , y;


    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Enter the square size [2, 8]");
        numOfSquares = Integer.parseInt(str);
        if (numOfSquares > 8 || numOfSquares < 1) {
            JOptionPane.showMessageDialog(null, "Incorrect number inserted");
            System.exit(1);
        }
        squareSize = bigSquaresSize / numOfSquares;
        System.out.println(numOfSquares);
        dangle = 0.03f;
        x = 0;
        y = 0;
        dx = 3f;
        dy = 3f;
    }

    public void draw() {
        // Making opacities
        fill(0, 0, 0, 60);
        rect(0, 0, width, height);

        // Drawing Rectangles
        translate(0.8f * squareSize / 2f, 0.8f * squareSize / 2f);
        for (int i = 0; i < numOfSquares; i++) {
            for (int t = 0; t < numOfSquares; t++) {
                pushMatrix();
                translate(x + squareSize * i, y + squareSize * t);
                rotate(angle);
                drawSquare(squareSize);
                popMatrix();
            }
        }
        if (x + bigSquaresSize >= width){
            dx = -dx;
        }
        if (x < 0){
            dx = -dx;
        }
        if(y + bigSquaresSize >= height){
            dy = -dy;
        }
        if (y < 0){
            dy = -dy;
        }

        angle += dangle;
        x += dx;
        y += dy;
    }

    //
    public void drawSquare(float squareSize) {
        fill(255);
        square(-0.8f * squareSize / 2, -0.8f * squareSize / 2, 0.8f * squareSize);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}