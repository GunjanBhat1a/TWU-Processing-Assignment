import processing.core.PApplet;

public class BallsMovement extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 600;
    public static final int Y_SCALE = HEIGHT / 5;
    public static final int DIAMETER = 10;
    int x = 0;

    public static void main(String[] args) {
        PApplet.main("BallsMovement", args);

    }

    @Override
    public void setup() {
       draw();
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        for(int ballSpeed = 1; ballSpeed <= 4; ballSpeed++)
        {
            drawCircle(getPositionX(ballSpeed, x), getPositionY(ballSpeed, Y_SCALE));
        }

        x++;

    }

    private int getPositionX(int ballSpeed, int x) {
        return ballSpeed * x;
    }

    private int getPositionY(int ballSpeed, int yScale) {
        return yScale * ballSpeed;
    }

    private void drawCircle(int positionX, int positionY) {

        ellipse(positionX, positionY, DIAMETER, DIAMETER);
    }


}


