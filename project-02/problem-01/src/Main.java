import processing.core.*;

import javax.swing.*;

public class Main extends PApplet {
    final float MIN_RADIUS = 10;
    final float MAX_RADIUS = 30;
    final float MIN_SPEED = 1;

    int n;
    float[] x;
    float[] y;
    float[] dx;
    float[] dy;
    float[] r;
    float[] red;
    float[] green;
    float[] blue;
    float[] a;
    float[] da;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("Number of stars "));
            if (n < 0 || n > 1000) {
                JOptionPane.showMessageDialog(null, "Incorrect integer: ");
                System.exit(1);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Incorrect integer: ");
            System.exit(1);
        }
        r = new float[n];
        x = new float[n];
        y = new float[n];
        dx = new float[n];
        dy = new float[n];
        red = new float[n];
        green = new float[n];
        blue = new float[n];
        a = new float[n];
        da = new float[n];

        for (int i = 0; i < n; i++) {
            r[i] = random(MIN_RADIUS, MAX_RADIUS);
            x[i] = random(width);
            y[i] = random(height);
            dx[i] = random(MIN_SPEED, r[i] / 4);
            dy[i] = random(MIN_SPEED, r[i] / 4);

            red[i] = random(255);
            green[i] = random(255);
            blue[i] = random(255);
            da[i] = random(0.05f, 0.2f);

            if (random(2) > 1) {
                dx[i] = -dx[i];
            }
            if (random(2) > 1) {
                dy[i] = -dy[i];
            }
        }
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < n; i++) {
            stroke(red[i], green[i], blue[i]);
            strokeWeight(4);

            drawStars(x[i], y[i], r[i], a[i]);
            if (x[i] >= width - r[i]) {
                dx[i] = -dx[i];
                x[i] = width - 1 - r[i];
                da[i] = -da[i];
            } else if (x[i] <= 0 + r[i]) {
                dx[i] = -dx[i];
                x[i] = 0 + r[i];
                da[i] = -da[i];
            }
            if (y[i] >= height - r[i]) {
                dy[i] = -dy[i];
                y[i] = height - 1 - r[i];
                da[i] = -da[i];
            } else if (y[i] <= 0 + r[i]) {
                dy[i] = -dy[i];
                y[i] = 0 + r[i];
                da[i] = -da[i];
            }


            x[i] += dx[i];
            y[i] += dy[i];
            a[i] += da[i];
        }
    }

    void drawStars(float x, float y, float r, float a) {
        pushMatrix();
        translate(x, y);
        rotate(a);
        for(int i = 0; i < 10; i++){
            rotate(2 * PI / 10);
            line(0, -r, 0, r);
        }
        popMatrix();
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}