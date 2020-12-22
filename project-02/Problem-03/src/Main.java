import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    String c = JOptionPane.showInputDialog("Enter the number of circles [1 20]");
    int circles = Integer.parseInt(c);
    float x, y;
    float dx, dy, r = 40, speed = 20;
    float[][] arr;

    public void settings() {
        fullScreen();
        System.out.println(circles);
    }

    public void setup() {
        arr = new float[circles][4];
        x = 0;
        y = 0;
        dx = 5;
        dy = 5;
        for (int i = 0; i < circles; i++) {
            arr[i][0] = x + (i * 20 * sqrt(2));
            arr[i][1] = y + (i * 20 * sqrt(2));
            arr[i][2] = 5;
            arr[i][3] = 5;
        }

    }

    public void draw() {
        background(0, 0, 0);

        for (int i = 0; i < circles; i++) {
            fill((255f / circles) * (i + 1), 0, 0);
            circle(arr[i][0], arr[i][1], r);

            if (arr[i][0] >= width || arr[i][0] < 0) {
                arr[i][2] = -arr[i][2];
                if (arr[i][0] >= width) {
                    arr[i][0] = width;
                } else if (arr[i][0] < 0) {
                    arr[i][0] = 0;
                }
            }
            if (arr[i][1] >= height || arr[i][1] < 0) {
                arr[i][3] = -arr[i][3];
                if (arr[i][1] >= height) {
                    arr[i][1] = height;
                } else if (arr[i][1] < 0) {
                    arr[i][1] = 0;
                }
            }
            arr[i][0] += arr[i][2];
            arr[i][1] += arr[i][3];
        }

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}