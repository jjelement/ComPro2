package sorrawich.week10.warmup;

public class TestGeo {
    public static void main(String[] args) {
        Geometryable[] geometryables = new Geometryable[5];
        geometryables[0] = new Circle(5);
        geometryables[1] = new Square(20);
        geometryables[2] = new Triangle(54, 100);
        geometryables[3] = new Square(6);
        geometryables[4] = new Circle(10);

        for(Geometryable geometryable : geometryables) {
            System.out.println(geometryable.getType() + " " + geometryable.findArea());
        }
    }
}
