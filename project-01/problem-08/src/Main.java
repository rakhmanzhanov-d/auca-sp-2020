import processing.core.*;

import javax.swing.*;
import java.nio.channels.FileLock;

public class Main extends PApplet {
    float angle;
    float dangle = 0.03f;
    int stars;
    float angleBetweenStars, r0, rs;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        String str = JOptionPane.showInputDialog("Enter the number of stars [2 8]");
        stars = Integer.parseInt(str);
        if (stars > 8 || stars < 2) {
            JOptionPane.showMessageDialog(null, "Incorrect number inserted");
            System.exit(1);
        }
        System.out.println(stars);
        angle = 0;
        angleBetweenStars = 2 * 3.14f / stars;
    }

    public void draw() {
        background(0, 0, 0);
        translate(width / 2f, height / 2f);
        rotate(angle);
        drawStar(150, 0, 0, 255, 0, 0);

        for (int i = 0; i < stars; i++) {
            pushMatrix();
            rotate((i+1)*angleBetweenStars);
            translate(0,250);
            rotate(-3 * angle);
            drawStar(50, 0, 0, 0, 0, 255);
            popMatrix();
        }

        angle += dangle;
    }

    public void drawStar(float r, float x, float y, float red, float green, float blue) {
        float centerX = x;
        float centerY = y;

        float xTop = centerX;
        float yTop = centerY - r;

        float xBottom = centerX;
        float yBottom = centerY + r;

        float xRight = centerX + r;
        float yRight = centerY;

        float xLeft = centerX - r;
        float yLeft = centerY;

        float xTopRight = centerX + r / 3;
        float yTopRight = centerY - r / 3;

        float xBottomRight = centerX + r / 3;
        float yBottomRight = centerY + r / 3;

        float xTopLeft = centerX - r / 3;
        float yTopLeft = centerY - r / 3;

        float xBottomLeft = centerX - r / 3;
        float yBottomLeft = centerY + r / 3;

        stroke(red, green, blue);
        line(centerX, centerY, xTop, yTop);
        line(centerX, centerY, xBottom, yBottom);
        line(centerX, centerY, xRight, yRight);
        line(centerX, centerY, xLeft, yLeft);
        line(centerX, centerY, xTopRight, yTopRight);
        line(centerX, centerY, xBottomRight, yBottomRight);
        line(centerX, centerY, xTopLeft, yTopLeft);
        line(centerX, centerY, xBottomLeft, yBottomLeft);
        line(centerX, yTop, xTopRight, yTopRight);
        line(xTopRight, yTopRight, xRight, yRight);
        line(xRight, yRight, xBottomRight, yBottomRight);
        line(xBottomRight, yBottomRight, xBottom, yBottom);
        line(xBottom, yBottom, xBottomLeft, yBottomLeft);
        line(xBottomLeft, yBottomLeft, xLeft, yLeft);
        line(xLeft, yLeft, xTopLeft, yTopLeft);
        line(xTopLeft, yTopLeft, xTop, yTop);

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}