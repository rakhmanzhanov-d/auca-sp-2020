import processing.core.*;

public class Main extends PApplet {
    float x, dx, y, dy;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(20);

        // Initial Conditions
        x = width / 2f;
        dx = 20;

        y= height / 2f;
        dy = 20;
    }

    public void draw() {
        background(0, 0, 0);
//        for(int i = 0; i >= 3; i += ){
//
//        }
        ellipse(x, y, 40, 40);
        x += dx;
        y += dy;
        if(x >= width){
            dx = -dx;
            x = width - 1;
        }
        if(x <= 0){
            dx = -dx;
            x = 0;
        }
        if(y >= height){
            dy = -dy;
            y = height - 1;
        }
        if(y <= 0){
            dy = -dy;
            y = 0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}