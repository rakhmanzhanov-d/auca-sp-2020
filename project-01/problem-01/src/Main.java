import processing.core.*;

public class Main extends PApplet {
    float d = 40;
    float dx1 = 5;
    float dy1 = 5;
    float dx2 = 5;
    float dy2 = 5;
    float dx3 = 5;
    float dy3 = 5;

    /////////////
    float circleX1 = width / 2f;
    float circleY1 = height / 2f;

    float circleX2 = (width / 2f) - d;
    float circleY2 = (height / 2f) - d;

    float circleX3 = (width / 2f) + d;
    float circleY3 = (height / 2f) + d;

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
        // circle #1 (middle)
        fill(0, 255, 0);
        circle(circleX1, circleY1, d);

        // circle #2 (top)
        fill(0, 0, 255);
        circle(circleX2, circleY2, d);

        // circle #3 (bottom)
        fill(255, 0 , 0);
        circle(circleX3, circleY3, d);

        if(circleX1 >= width || circleX1 <= 0){
            dx1 = -dx1;
        }
        if(circleY1 >= height || circleY1 <= 0){
            dy1 = -dy1;
        }
        if(circleX2 >= width || circleX2 <= 0){
            dx2 = -dx2;
        }
        if(circleY2 >= height || circleY2 <= 0){
            dy2 = -dy2;
        }
        if(circleX3 >= width || circleX3 <= 0){
            dx3 = -dx3;
        }
        if(circleY3 >= height || circleY3 <= 0){
            dy3 = -dy3;
        }

        circleX1 += dx1;
        circleY1 += dy1;

        circleX2 += dx2;
        circleY2 += dy2;

        circleX3 += dx3;
        circleY3 += dy3;

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}