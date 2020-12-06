import processing.core.*;

public class Problem03 extends PApplet {

    public void settings() {
        fullScreen();
    }

    public void setup() {
    }

    public void draw() {
        background(0, 0, 0);
//        float x = width / 2f;
//        float y = height / 2f;
        drawStar(150, width / 2f, height / 2f, 255, 0 , 0);
        drawStar(80, width / 4f, height / 4f, 255, 255, 0);
        drawStar(80, width / (4f / 3), height / 4f, 255, 255, 0);
        drawStar(80, width / (4f / 3), height / (4f / 3), 255, 255, 0);
        drawStar(80, width / 4f, height / (4f / 3), 255, 255, 0);

//        drawStar(150, width / 2f, height / 2f, 255, 0 , 0);
        drawStar(80, width / 4f, height / 4f, 255, 255, 0);
        drawStar(80, width / (4f / 3), height / 4f, 255, 255, 0);
        drawStar(80, width / (4f / 3), height / (4f / 3), 255, 255, 0);
        drawStar(80, width / 4f, height / (4f / 3), 255, 255, 0);


    }

    private void drawStar(float rad, float x,float y, int red, int green, int blue) {
        float x1 = x - rad;
        float y1 = y;

        float x2 = x + rad;
        float y2 = y;

        float x3 = x;
        float y3 = y - rad;

        float x4 = x;
        float y4 = y + rad;

        float x6 = x + rad / 3f;
        float y6 = y + rad / 3f;

        float x5 = x - rad / 3f;
        float y5 = y - rad / 3f;

        float x7 = x + rad / 3f;
        float y7 = y - rad / 3f;

        float x8 = x - rad / 3f;
        float y8 = y + rad / 3f;

        float x9 = x1;
        float y9 = y1;

        float x10 = x5;
        float y10 = y5;

        float x11 = x5;
        float y11 = y5;

        float x12 = x3;
        float y12 = y3;

        float x13 = x3;
        float y13 = y3;

        float x14 = x7;
        float y14 = y7;

        float x16 = x2;
        float y16 = y2;

        float y15 = y7;
        float x15 = x7;

        float x17 = x2;
        float y17 = y2;

        float y18 = y6;
        float x18 = x6;

        float x19 = x6;
        float y19 = y6;

        float y20 = y4;
        float x20 = x4;

        float x21 = x4;
        float y21 = y4;

        float y22 = y8;
        float x22 = x8;

        float x23 = x8;
        float y23 = y8;

        float y24 = y1;
        float x24 = x1;

        stroke(red, green, blue);
        line(x1, y1, x2, y2);
        line(x3, y3, x4, y4);

        line(x5, y5, x6, y6);
        line(x7, y7, x8, y8);

        line(x9, y9, x10, y10);
        line(x11, y11, x12, y12);

        line(x13, y13, x14, y14);
        line(x15, y15, x16, y16);

        line(x17, y17, x18, y18);
        line(x19, y19, x20, y20);

        line(x21, y21, x22, y22);
        line(x23, y23, x24, y24);
    }

    public static void main(String[] args) {
        PApplet.main("Problem03");
    }

}