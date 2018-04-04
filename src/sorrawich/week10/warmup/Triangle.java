package sorrawich.week10.warmup;

public class Triangle implements Geometryable {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double findArea() {
        return (height*base)/2;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
            "height=" + height +
            ", base=" + base +
            '}';
    }
}
