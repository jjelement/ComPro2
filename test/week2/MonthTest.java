package week2;

import sorrawich.week2.Month;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonthTest {

    private Month month;

    public MonthTest() {
        month = new Month();
    }

    @Test
    public void find31DaysOfMonth() {
        int expected = 31;
        int actual = month.findDaysOfMonth(1);
        assertEquals(expected, actual);
    }
    
    @Test
    public void find30DaysOfMonth() {
        int expected = 30;
        int actual = month.findDaysOfMonth(4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void find28DaysOfMonth() {
        int expected = 28;
        int actual = month.findDaysOfMonth(2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void findDayInZeroMonth() {
        int expected = -1;
        int actual = month.findDaysOfMonth(0);
        assertEquals(expected, actual);
    }
    
    @Test
    public void findDayInThirteenMonth() {
        int expected = -1;
        int actual = month.findDaysOfMonth(13);
        assertEquals(expected, actual);
    }
    
    @Test
    public void findNameOfInvalidMonth() {
        String expected = null;
        String actual = month.findNameOfMonth(13);
        assertEquals(expected, actual);
    }

    @Test
    public void findNameOfFirstMonth() {
        String expected = "Jan";
        String actual = month.findNameOfMonth(1);
        assertEquals(expected, actual);
    }

    @Test
    public void findNameOfSixthMonth() {
        String expected = "Jun";
        String actual = month.findNameOfMonth(6);
        assertEquals(expected, actual);
    }
}
