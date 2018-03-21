package sorrawich.week6.models;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(String shapeId, double side) {
        super(shapeId);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
