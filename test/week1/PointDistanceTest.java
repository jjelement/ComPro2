package week1;

import sorrawich.week1.model.Point;
import org.junit.Test;
import static org.junit.Assert.*;


public class PointDistanceTest {
    
    private Point source;
    private Point target;
    
    public PointDistanceTest() {
        source = new Point();
        target = new Point();
    }
    
    @Test
    public void distanceTest() {
        double expected = 1.4142135623730951;
        
        source.setX(5);
        source.setY(2);
        target.setX(4);
        target.setY(5);
        
        double actual = source.getDistanceCalculate(target);
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void distanceTest2() {
        double expected = 0;
        
        source.setX(0);
        source.setY(0);
        target.setX(0);
        target.setY(0);
        
        double actual = source.getDistanceCalculate(target);
        assertEquals(expected, actual, 0.1);
    }
}
