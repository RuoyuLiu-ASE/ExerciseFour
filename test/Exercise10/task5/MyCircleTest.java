package Exercise10.task5;

import Exercise10.task1.MyPoint;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Alan
 * @create: 2020-01-16 14:37
 * @function:
 * @version:
 * @important value:
 */
public class MyCircleTest {

    MyCircle circle = new MyCircle(1,1,6);
    MyCircle circle2 = new MyCircle(1,1,0);
    MyCircle circle3 = new MyCircle(3,3,3);
    MyCircle circle4 = new MyCircle(4,4,4);
    MyCircle circle5 = new MyCircle(5,5,5);

    MyPoint point = new MyPoint(6,6);
    MyPoint point2 = new MyPoint();

    @Test
    public void testSetCenter() {
        circle3.setCenter(point);
        circle4.setCenter(point2);   // Exception is not being thrown out

        assertEquals(point,circle3.getCenter());
        assertEquals(point2,circle4.getCenter());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI*6*6,circle.getArea(),0.1);
        assertEquals(0,circle2.getArea(),0.001);
    }

    @Test
    public void testToString() {
        assertEquals("Circle @ (5,5) radius=5",circle5.toString());
    }
}