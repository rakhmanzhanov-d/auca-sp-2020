import processing.core.*;

public class Problem05 extends PApplet {
    final float MIN_CIRCLE_SIZE = 20;
    final int numOfCircles = 20;

    public void settings() {
        fullScreen();
    }
    public void setup() {
        frameRate(5);
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < 700; i += 35){
            fill(i, 0, 0);
            ellipse(width / 2f, height / 2f, 700 - i, 700 - i);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Problem05");
    }

}