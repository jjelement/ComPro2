package myproject.week1;

public class Point {
    private int x;
    private int y;

    public Point() {
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double getDistanceCalculate(int targetX, int targetY) {
        return Math.sqrt(Math.pow(targetX-x, 2) + Math.pow(targetY-y, 2));
    }
    
    public double getDistanceCalculate(Point target) {
        return this.getDistanceCalculate(target.getX(), target.getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
