package sorrawich.week10.warmup;

public class Square implements Geometryable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double findArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String getType() {
        return "Square";
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
            "side=" + side +
            '}';
    }
}
