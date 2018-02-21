package sorrawich.week6;

public class Triangle2 extends Triangle implements Comparable<Triangle2> {
    @Override
    public double getPerimeter() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public int compareTo(Triangle2 o) {
        return getShapeId().compareTo(o.getShapeId());
    }
}
