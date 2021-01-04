public class Ball {

    public static final int DIAMETER = 10;

    private int positionX;
    private float positionY;
    private int speed;


    public Ball(int positionX, float positionY, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.speed = speed;
    }

    public int getPositionX() {
        return positionX += speed;
    }


    public float getPositionY() {
        return positionY;
    }


}
