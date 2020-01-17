package Exercise10.task2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Alan
 * @create: 2020-01-15 19:19
 * @function:
 * @version:
 * @important value:
 */
public class DateTest {

    Date date = new Date(2020,1,32);
    Date date2 = new Date(2020,2,28);
    Date date3 = new Date(2020,1,13);

    // For task 3
    Date d = new Date(2050,2,15);

    @Test
    public void testGetDay() {
        assertEquals(1,date.getDay());
    }

    @Test
    public void testGetMonth() {
        assertEquals(2,date.getMonth());
    }

    @Test
    public void testGetYear() {
    }

    @Test
    public void testDaysInMonth() {
    }

    @Test
    public void testDayOfWeek() {
    }

    @Test
    public void testIsLeapYear() {
    }

    @Test
    public void testAddDays() {
        date3.addDays(100);
        assertEquals(22,date3.getDay());
        assertEquals(4,date3.getMonth());
        assertEquals(2020,date3.getYear());
    }

    @Test
    public void testNextDay() {
        date2.nextDay();
        assertEquals(29,date2.getDay());
        assertEquals(2,date2.getMonth());
        assertEquals(2020,date2.getYear());
    }

    @Test
    public void test1() {
        d.addDays(4);
        assertEquals(2050,d.getYear());
        assertEquals(2,d.getMonth());
        assertEquals(19,d.getDay());
    }

    @Test
    public void test2() {
        d.addDays(14);
        assertEquals(2050,d.getYear());
        assertEquals(3,d.getMonth());
        assertEquals(1,d.getDay());
    }
}