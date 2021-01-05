package  twu.task.processing;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.List;

public class BallMovement extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 600;
    public static final int Y_SCALE = HEIGHT / 5;
    public static final int INITIAL_X = 0;
    public static final int CAPACITY = 4;

    List<Ball> balls = new ArrayList<>(CAPACITY);

    public static void main(String[] args) {

        PApplet.main("twu.task.processing.BallMovement", args);

    }

    @Override
    public void setup() {

        for (int i = 1; i <= CAPACITY; i++) {
            balls.add(new Ball(INITIAL_X, Y_SCALE, i));
        }
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        for (Ball ball : balls) {
            showMovingBalls(ball);
        }
    }

    private void showMovingBalls(Ball ball) {
        ellipse(ball.getPositionX(), ball.getPositionY(), Ball.DIAMETER, Ball.DIAMETER);
    }
}
