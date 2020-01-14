package Exercise10.task1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Alan
 * @create: 2020-01-14 21:26
 * @function:
 * @version:
 * @important value:
 */
public class MyPointTest {
    MyPoint point = new MyPoint(1,6);
    MyPoint point2 = new MyPoint(1,8);
    MyPoint point3 = new MyPoint(3,6);
    MyPoint point4 = new MyPoint(4,10);
    MyPoint point5 = new MyPoint(6,6);
/*
    @Test
    public void testGetX() {
    }

    @Test
    public void testSetX() {
    }

    @Test
    public void testGetY() {
    }

    @Test
    public void testSetY() {
    }

    @Test
    public void testSetXY() {
    }
*/
    @Test
    public void testToString() {
        assertEquals("(6,6)",point5.toString());
    }

    @Test
    public void testDistance() {
        assertEquals(0,point.distance(1,6),0.001);
    }

    @Test
    public void testDistance1() {
        assertEquals(0,point.getX()-point2.getX(),0.001);
        assertEquals(0,point.getY()-point3.getY(),0.001);
        assertEquals(-3.0,point.getX()-point4.getX(),0.001);
        assertEquals(-4.0,point.getY()-point4.getY(),0.001);
    }
}