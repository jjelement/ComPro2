package myproject.week1;

import myproject.week1.Point;

public class PointDistance {
    public static void main(String[] args) {
        Point point1 = new Point(1, -2);
        Point point2 = new Point(10, 20);

        System.out.println(point1.getDistanceCalculate(point2));
    }
}