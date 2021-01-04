import processing.core.PApplet;

public class BallMovement extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 600;
    public static final int Y_SCALE = HEIGHT / 5;
    public static final int SPEED_FACTOR1 = 1;
    public static final int SPEED_FACTOR2 = 2;
    public static final int SPEED_FACTOR3 = 3;
    public static final int SPEED_FACTOR4 = 4;

    Ball ball1 = null;
    Ball ball2 = null;
    Ball ball3 = null;
    Ball ball4 = null;

    public static void main(String[] args) {
        PApplet.main("BallMovement", args);

    }

    @Override
    public void setup() {

        ball1 = new Ball(0, Y_SCALE * SPEED_FACTOR1, SPEED_FACTOR1);
        ball2 = new Ball(0, Y_SCALE * SPEED_FACTOR2, SPEED_FACTOR2);
        ball3 = new Ball(0, Y_SCALE * SPEED_FACTOR3, SPEED_FACTOR3);
        ball4 = new Ball(0, Y_SCALE * SPEED_FACTOR4, SPEED_FACTOR4);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        showMovingBalls(ball1);
        showMovingBalls(ball2);
        showMovingBalls(ball3);
        showMovingBalls(ball4);
    }

    private void showMovingBalls(Ball ball) {
        ellipse(ball.getPositionX(),ball.getPositionY(), Ball.DIAMETER, Ball.DIAMETER);

    }
}
