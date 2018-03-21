package sorrawich.week6.models;

public class Circle2 extends Circle {

    public Circle2(double radius) {
        super(radius);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }
}
