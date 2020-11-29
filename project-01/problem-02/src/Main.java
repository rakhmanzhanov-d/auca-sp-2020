import processing.core.*;

public class Main extends PApplet {
    float MAX_SZ = 120;
    float MIN_SZ = 30;
    float sz = 31;
    float ds = 1;
    float sz1 = 119;
    float ds1 = 1;
    float ds2 = 1;
    public void settings() {
        fullScreen();
    }

    public void setup() {

    }

    public void draw() {
        background(0);
        textSize(sz);
        fill(0, 255, 0);
        textAlign(CENTER, CENTER);
        text("Wonderful", width / 2f, height / 2f);

        if(sz == MAX_SZ || sz == MIN_SZ){
            ds = -ds;
        }
        sz += ds;

        ///
        textSize(sz1);
        fill(255, 0, 0);
        textAlign(CENTER, CENTER);
        text("Hello", width / 2f, 120);

        textSize(sz1);
        fill(0, 0, 255);
        textAlign(CENTER, CENTER);
        text("World of Java", width / 2f, height - 120);
        if(sz1 == MAX_SZ || sz1 == MIN_SZ){
            ds1 = -ds1;
        }
        sz1 += ds1;


    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

}

