package BT6;

public class MoveableCircle {
    private int radius;
    private MovablePoint center;

    public MoveableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return center.toString() + String.format(",radius=%d", radius);
    }
}
