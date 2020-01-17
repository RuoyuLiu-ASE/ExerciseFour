package Exercise10.task4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: Alan
 * @create: 2020-01-15 19:40
 * @function:
 * @version:
 * @important value:
 */
public class LineTest {

    Line line1 = new Line(2,2,6,2);
    Line line2 = new Line(2,2,3,2.5);
    Line line3 = new Line(2,2,3,6);
    Line line4 = new Line(2,2,3,-6);

    Line line5 = new Line(2,2,2,2);
    double x6 = 2;
    double y6 = 2;
    double X6 = 2;
    double Y6 = 6;
    Line line6 = new Line(x6,y6,X6,Y6);
    Line line7 = new Line(2,2,3,6);
    Line line8 = new Line(2,2,3,-6);

    Line line9 = new Line(2,2,6,2);
    Line line10 = new Line(2,2,6,2);
    Line line11 = new Line(2,2,2,6);
    Line line12 = new Line(1,2,1,-6);

    Line line13 = new Line(2,2,3,6);
    Line line14 = new Line(1,2,2,6);

    Line line15 = new Line(2,2,3,6);
    Line line16 = new Line(1,2,3,6);

    @Test
    public void testGetSlope() {
        assertEquals(0,line1.getSlope(),0.001);
        assertEquals(true,line2.getSlope()<1.0);
        assertEquals(true,line3.getSlope()>1.0);
        assertEquals(true,line4.getSlope()<0);
    }

    @Test
    public void testGetDistance() {
        assertEquals(0,line5.getDistance(),0.001);
//        assertEquals(Y6-y6,line6.getDistance());
    }

    @Test
    public void testParallelTo() {
        assertEquals(true, line9.parallelTo(line10));
        assertEquals(true,line11.parallelTo(line12));
        assertEquals(true,line13.parallelTo(line14));
        assertEquals(false,line15.parallelTo(line16));
    }
}