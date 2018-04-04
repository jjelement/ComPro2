package sorrawich.week10.warmup;

public class Circle implements Geometryable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String getType() {
        return "Circle";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
            "radius=" + radius +
            '}';
    }
}
