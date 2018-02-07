package sorrawich.week1;

import sorrawich.week1.model.Point;

public class PointDistance {
    public static void main(String[] args) {
        Point point1 = new Point(1, -2);
        Point point2 = new Point(10, 20);

        System.out.println(point1.getDistanceCalculate(point2));
    }
}