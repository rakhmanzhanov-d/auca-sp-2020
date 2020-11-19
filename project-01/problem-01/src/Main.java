import processing.core.*;

public class Main extends PApplet {
    float x, dx;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20);

        // Initial Conditions
        x = width / 2f;
        dx = 20;
    }

    public void draw() {
        background(0, 0, 0);
        ellipse(x, height / 2f, 40, 40);
        x += dx;
        if(x >= width){
            dx = -dx;
            x = width - 1;
        }
        if(x <= 0){
            dx = -dx;
            x = 0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}